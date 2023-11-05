// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BalFileType extends LanguageFileType {

  public static final BalFileType INSTANCE = new BalFileType();

  private BalFileType() {
    super(BalLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Ballerina File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Ballerina language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "bal";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return SimpleIcons.FILE;
  }

}
