package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwo16: ImageVector
  get() {
    if (_layoutColumnTwo16 != null) {
      return _layoutColumnTwo16!!
    }
    _layoutColumnTwo16 = fluentIcon(name = "Filled.LayoutColumnTwo16", 16f) {
      materialPath {
          moveTo(8.5F, 14.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-3.0F)
          verticalLineToRelative(12.0F)
          close()
          moveToRelative(-1.0F, -12.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(3.0F)
          verticalLineTo(2.0F)
          close()        
      }
    }
    return _layoutColumnTwo16!!
  }

private var _layoutColumnTwo16: ImageVector? = null
