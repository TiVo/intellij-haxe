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

import com.intellij.plugins.haxe.model.HaxeTypesModel;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SpecificTypeReference {
  final protected PsiElement context;

  public SpecificTypeReference(@NotNull PsiElement context) {
    this.context = context;
  }

  static public SpecificTypeReference createArray(@NotNull ResultHolder elementType) {
    return SpecificHaxeClassReference
      .withGenerics(new HaxeClassReference("Array", elementType.getElementContext()), new ResultHolder[]{elementType}, null);
  }

  public SpecificTypeReference withRangeConstraint(HaxeRange range) {
    return this;
  }

  static public SpecificHaxeClassReference getString(@NotNull PsiElement context) {
    return primitive("String", context);
  }

  static public SpecificHaxeClassReference getClass(@NotNull PsiElement context) {
    return primitive("Class", context);
  }

  static public SpecificHaxeClassReference getUnknown(@NotNull PsiElement context) {
    return primitive("Unknown", context);
  }

  static public SpecificHaxeClassReference getInvalid(@NotNull PsiElement context) {
    return primitive("@@Invalid", context);
  }

  static public SpecificHaxeClassReference getIterator(SpecificHaxeClassReference type) {
    return SpecificHaxeClassReference.withGenerics(new HaxeClassReference("Iterator", type.getElementContext()),
                                                   new ResultHolder[]{type.createHolder()});
  }

  static public SpecificHaxeClassReference primitive(String name, @NotNull PsiElement context) {
    return SpecificHaxeClassReference.withoutGenerics(new HaxeClassReference(name, context));
  }

  static public SpecificHaxeClassReference primitive(String name, @NotNull PsiElement context, Object constant) {
    return SpecificHaxeClassReference.withoutGenerics(new HaxeClassReference(name, context), constant);
  }

  final public boolean isUnknown() {
    return this.toStringWithoutConstant().equals("Unknown");
  }

  final public boolean isDynamic() {
    return this.toStringWithoutConstant().equals("Dynamic");
  }

  final public boolean isInvalid() {
    return this.toStringWithoutConstant().equals("@@Invalid");
  }

  final public boolean isVoid() {
    return this.toStringWithoutConstant().equals("Void");
  }

  final public boolean isInt() {
    return this.toStringWithoutConstant().equals("Int");
  }

  final public boolean isNumeric() {
    return isInt() || isFloat();
  }

  final public boolean isBool() {
    return this.toStringWithoutConstant().equals("Bool");
  }

  final public boolean isFloat() {
    return this.toStringWithoutConstant().equals("Float");
  }

  final public boolean isString() {
    return this.toStringWithoutConstant().equals("String");
  }

  final public boolean isArray() {
    if (this instanceof SpecificHaxeClassReference) {
      final SpecificHaxeClassReference reference = (SpecificHaxeClassReference)this;
      return reference.clazz.getName().equals("Array");
    }
    return false;
  }

  final public boolean isClass() {
    if (this instanceof SpecificHaxeClassReference) {
      final SpecificHaxeClassReference reference = (SpecificHaxeClassReference)this;
      return reference.clazz.getName().equals("Class");
    }
    return false;
  }

  final public ResultHolder getArrayElementType() {
    if (isArray()) {
      final ResultHolder[] specifics = ((SpecificHaxeClassReference)this).specifics;
      if (specifics.length >= 1) return specifics[0];
    }
    return getUnknown(context).createHolder();
  }

  abstract public SpecificTypeReference withConstantValue(Object constantValue);

  //public void mutateConstantValue(Object constantValue) {
//
  //}
  final public SpecificTypeReference withoutConstantValue() {
    return withConstantValue(null);
  }

  public boolean isConstant() {
    return this.getConstant() != null;
  }

  public HaxeRange getRangeConstraint() {
    return null;
  }

  public Object getConstant() {
    return null;
  }

  final public boolean getConstantAsBool() {
    return HaxeTypeUtils.getBoolValue(getConstant());
  }

  final public double getConstantAsDouble() {
    return HaxeTypeUtils.getDoubleValue(getConstant());
  }

  final public int getConstantAsInt() {
    return HaxeTypeUtils.getIntValue(getConstant());
  }

  @NotNull
  final public PsiElement getElementContext() {
    return context;
  }

  abstract public String toString();

  abstract public String toStringWithoutConstant();

  public String toStringWithConstant() {
    return toString();
  }

  @Nullable
  final public ResultHolder access(String name, PsiElement accessElement, HaxeExpressionEvaluatorContext context) {
    return access(name, accessElement, context, false);
  }

  @Nullable
  public ResultHolder access(String name, @Nullable PsiElement accessElement, HaxeExpressionEvaluatorContext context, boolean isStatic) {
    return null;
  }

  final public boolean canAssign(SpecificTypeReference type2) {
    return HaxeTypeCompatible.canAssignToFrom(this, type2);
  }

  final public boolean canAssign(ResultHolder type2) {
    return HaxeTypeCompatible.canAssignToFrom(this, type2);
  }

  public ResultHolder createHolder() {
    return new ResultHolder(this);
  }

  @NotNull
  final public ResultHolder getIterableElementType(@NotNull HaxeExpressionEvaluatorContext context) {
    final ResultHolder iterator = this.access("iterator", null, context);
    if (iterator != null) {
      final SpecificFunctionReference iteratorFunc = iterator.getFunctionType();
      if (iteratorFunc != null) {
        final ResultHolder iteratorReturnType = iteratorFunc.getReturnType();
        return iteratorReturnType.getType().getIterableElementType(context);
      }
    }
    final ResultHolder iteratorNextType = access("next", null, context);
    if (iteratorNextType != null) {
      final SpecificFunctionReference type = iteratorNextType.getFunctionType();
      if (type != null) {
        final ResultHolder returnType = type.getReturnType();
        return returnType;
      }
    }
    return context.types.DYNAMIC.createHolder();
  }

  @NotNull
  final public boolean isIterable(@NotNull HaxeExpressionEvaluatorContext context) {
    if (this.access("iterator", null, context) != null) return true;
    if ((this.access("next", null, context) != null) && (this.access("hasNext", null, context) != null)) return true;
    return false;
  }

  public void applyGenerics(HaxeGenericResolver generic) {

  }

  public abstract SpecificTypeReference duplicate();
}
