package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoFocusBottom16: ImageVector
  get() {
    if (_layoutRowTwoFocusBottom16 != null) {
      return _layoutRowTwoFocusBottom16!!
    }
    _layoutRowTwoFocusBottom16 = fluentIcon(name = "Filled.LayoutRowTwoFocusBottom16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(3.0F, 4.5F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.328F, 3.0F, 13.0F, 3.672F, 13.0F, 4.5F)
          verticalLineTo(8.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(4.5F)
          close()        
      }
    }
    return _layoutRowTwoFocusBottom16!!
  }

private var _layoutRowTwoFocusBottom16: ImageVector? = null
