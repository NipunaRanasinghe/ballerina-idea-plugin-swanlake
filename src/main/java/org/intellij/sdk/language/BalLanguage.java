// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class BalLanguage extends Language {

  public static final BalLanguage INSTANCE = new BalLanguage();

  private BalLanguage() {
    super("Ballerina Swan Lake");
  }

}
