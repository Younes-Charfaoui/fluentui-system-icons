package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwo32: ImageVector
  get() {
    if (_layoutColumnTwo32 != null) {
      return _layoutColumnTwo32!!
    }
    _layoutColumnTwo32 = fluentIcon(name = "Filled.LayoutColumnTwo32", 32f) {
      materialPath {
          moveTo(15.0F, 3.0F)
          horizontalLineTo(7.5F)
          curveTo(5.015F, 3.0F, 3.0F, 5.015F, 3.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveTo(3.0F, 26.985F, 5.015F, 29.0F, 7.5F, 29.0F)
          horizontalLineTo(15.0F)
          verticalLineTo(3.0F)
          close()
          moveToRelative(2.0F, 26.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-17.0F)
          curveTo(29.0F, 5.015F, 26.985F, 3.0F, 24.5F, 3.0F)
          horizontalLineTo(17.0F)
          verticalLineToRelative(26.0F)
          close()        
      }
    }
    return _layoutColumnTwo32!!
  }

private var _layoutColumnTwo32: ImageVector? = null
