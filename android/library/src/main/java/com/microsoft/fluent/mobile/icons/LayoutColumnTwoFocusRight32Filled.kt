package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoFocusRight32: ImageVector
  get() {
    if (_layoutColumnTwoFocusRight32 != null) {
      return _layoutColumnTwoFocusRight32!!
    }
    _layoutColumnTwoFocusRight32 = fluentIcon(name = "Filled.LayoutColumnTwoFocusRight32", 32f) {
      materialPath {
          moveTo(29.0F, 7.5F)
          curveTo(29.0F, 5.015F, 26.985F, 3.0F, 24.5F, 3.0F)
          horizontalLineToRelative(-17.0F)
          curveTo(5.015F, 3.0F, 3.0F, 5.015F, 3.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveTo(3.0F, 26.985F, 5.015F, 29.0F, 7.5F, 29.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-17.0F)
          close()
          moveTo(16.0F, 5.0F)
          verticalLineToRelative(22.0F)
          horizontalLineTo(7.5F)
          curveTo(6.12F, 27.0F, 5.0F, 25.88F, 5.0F, 24.5F)
          verticalLineToRelative(-17.0F)
          curveTo(5.0F, 6.12F, 6.12F, 5.0F, 7.5F, 5.0F)
          horizontalLineTo(16.0F)
          close()        
      }
    }
    return _layoutColumnTwoFocusRight32!!
  }

private var _layoutColumnTwoFocusRight32: ImageVector? = null
