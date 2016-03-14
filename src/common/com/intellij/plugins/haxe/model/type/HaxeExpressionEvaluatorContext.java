/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2015 AS3Boyan
 * Copyright 2014-2014 Elias Ku
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.plugins.haxe.model.type;

import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.impl.TextRangeInterval;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.TextRange;
import com.intellij.plugins.haxe.ide.highlight.HaxeSyntaxHighlighterColors;
import com.intellij.plugins.haxe.model.HaxeDocumentModel;
import com.intellij.plugins.haxe.model.HaxeProjectModel;
import com.intellij.plugins.haxe.model.HaxeTypesModel;
import com.intellij.plugins.haxe.model.fixer.HaxeFixer;
import com.intellij.plugins.haxe.model.resolver.HaxeResolver2;
import com.intellij.plugins.haxe.model.resolver.HaxeResolver2Locals;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HaxeExpressionEvaluatorContext {
  public ResultHolder result;
  private List<ResultHolder> returns = new ArrayList<ResultHolder>();
  private List<PsiElement> returnElements = new ArrayList<PsiElement>();

  @Nullable public final AnnotationHolder holder;
  @NotNull public final PsiElement root;
  public ResultHolder functionType;
  @NotNull public HaxeResolver2Locals resolver;
  @NotNull public final HaxeProjectModel project;
  @NotNull public final HaxeTypesModel types;

  public HaxeExpressionEvaluatorContext(@NotNull PsiElement body, @NotNull HaxeResolver2 resolver, @Nullable AnnotationHolder holder) {
    this.root = body;
    this.holder = holder;
    this.resolver = new HaxeResolver2Locals(resolver);
    this.project = HaxeProjectModel.fromElement(root);
    this.types = this.project.getTypes();
  }

  public HaxeExpressionEvaluatorContext createChild(PsiElement body) {
    HaxeExpressionEvaluatorContext that = new HaxeExpressionEvaluatorContext(body, this.resolver, this.holder);
    that.beginScope();
    return that;
  }

  public boolean isInStaticContext() {
    return resolver.isInStaticContext();
  }

  public void addReturnType(ResultHolder result, PsiElement element) {
    result.element = element;
    this.returns.add(result);
    this.returnElements.add(element);
  }

  public ResultHolder getReturnType() {
    if (returns.isEmpty()) return types.VOID.createHolder();
    return HaxeTypeUnifier.unify(ResultHolder.types(returns), root).createHolder();
  }

  public List<ResultHolder> getReturnValues() {
    return returns;
  }

  public List<PsiElement> getReturnElements() {
    return returnElements;
  }

  public HaxeDocumentModel getDocument() {
    return HaxeDocumentModel.fromElement(root);
  }

  public void beginScope() {
    resolver = resolver.createChild();
  }

  public void endScope() {
    resolver = (HaxeResolver2Locals)resolver.parent;
  }

  public void setLocal(String key, ResultHolder value) {
    this.resolver.put(key, value);
  }

  public boolean has(String key) {
    return this.resolver.has(key);
  }

  public ResultHolder get(String key) {
    return this.resolver.get(key);
  }

  public <T> T getInfo(Key<T> key) {
    return this.resolver.getInfo(key);
  }

  public <T> boolean hasInfo(Key<T> key) {
    return this.resolver.hasInfo(key);
  }

  public <T> HaxeExpressionEvaluatorContext putInfo(Key<T> key, T value) {
    this.resolver.putInfo(key, value);
    return this;
  }

  @NotNull
  public Annotation addError(@Nullable TextRange range, String error, HaxeFixer... fixers) {
    if (range == null || holder == null) return createDummyAnnotation();
    Annotation annotation = holder.createErrorAnnotation(range, error);
    for (HaxeFixer fixer : fixers) annotation.registerFix(fixer);
    return annotation;
  }

  @NotNull
  public Annotation addError(@Nullable PsiElement element, String error, HaxeFixer... fixers) {
    return addError((element != null) ? element.getTextRange() : null, error, fixers);
  }

  @NotNull
  public Annotation addUnresolvedError(@Nullable PsiElement element, String error, HaxeFixer... fixers) {
    if (element == null || holder == null) return createDummyAnnotation();
    Annotation annotation = holder.createInfoAnnotation(element, error);
    // @TODO: Put red color as java does
    annotation.setTextAttributes(HaxeSyntaxHighlighterColors.BAD_CHARACTER);
    for (HaxeFixer fixer : fixers) annotation.registerFix(fixer);
    return annotation;
  }

  @NotNull
  public Annotation addErrorAfter(@Nullable PsiElement element, String error, HaxeFixer... fixers) {
    TextRange range = element != null ? element.getTextRange() : null;
    // @TODO: this puts in the last character, but should be put in an empty cell for missing stuff
    return addError((range != null) ? new TextRange(range.getEndOffset() - 1, range.getEndOffset()) : null, error, fixers);
  }

  @NotNull
  public Annotation addWarning(PsiElement element, String error, HaxeFixer... fixers) {
    if (holder == null) return createDummyAnnotation();
    Annotation annotation = holder.createWarningAnnotation(element, error);
    for (HaxeFixer fixer : fixers) {
      annotation.registerFix(fixer);
    }
    return annotation;
  }

  private Annotation createDummyAnnotation() {
    return new Annotation(0, 0, HighlightSeverity.ERROR, "", "");
  }

  @NotNull
  public Annotation addUnreachable(PsiElement element) {
    if (holder == null) return createDummyAnnotation();
    Annotation annotation = holder.createInfoAnnotation(element, null);
    annotation.setTextAttributes(HaxeSyntaxHighlighterColors.LINE_COMMENT);
    return annotation;
  }

  final public List<HaxeExpressionEvaluatorContext> lambdas = new LinkedList<HaxeExpressionEvaluatorContext>();
  public void addLambda(HaxeExpressionEvaluatorContext child) {
    lambdas.add(child);
  }
}
