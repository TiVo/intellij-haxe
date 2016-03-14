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
package com.intellij.plugins.haxe.model.resolver;

import com.intellij.openapi.util.Key;
import com.intellij.plugins.haxe.model.type.ResultHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

abstract public class HaxeResolver2 {
  protected Map<Key, Object> infos = new HashMap<Key, Object>();

  public <T> HaxeResolver2 putInfo(Key<T> key, T value) {
    infos.put(key, value);
    return this;
  }

  public <T> boolean hasInfo(Key<T> key) {
    return getInfo(key) != null;
  }

  @Nullable
  public <T> T getInfo(Key<T> key) {
    T value = (T)infos.get(key);
    return value;
  }

  @Nullable
  abstract public ResultHolder get(String key);

  abstract public void addResults(@NotNull Map<String, ResultHolder> results);

  public boolean has(String key) {
    return get(key) != null;
  }

  abstract public boolean isInStaticContext();
}
