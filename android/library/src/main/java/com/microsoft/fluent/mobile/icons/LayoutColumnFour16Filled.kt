package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnFour16: ImageVector
  get() {
    if (_layoutColumnFour16 != null) {
      return _layoutColumnFour16!!
    }
    _layoutColumnFour16 = fluentIcon(name = "Filled.LayoutColumnFour16", 16f) {
      materialPath {
          moveTo(8.5F, 14.0F)
          horizontalLineTo(11.0F)
          verticalLineTo(2.0F)
          horizontalLineTo(8.5F)
          verticalLineToRelative(12.0F)
          close()
          moveToRelative(-1.0F, -12.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(12.0F)
          horizontalLineToRelative(2.5F)
          verticalLineTo(2.0F)
          close()
          moveToRelative(6.5F, 9.5F)
          curveToRelative(0.0F, 1.21F, -0.859F, 2.218F, -2.0F, 2.45F)
          verticalLineTo(2.05F)
          curveToRelative(1.141F, 0.232F, 2.0F, 1.24F, 2.0F, 2.45F)
          verticalLineToRelative(7.0F)
          close()
          moveTo(4.0F, 2.05F)
          curveTo(2.859F, 2.282F, 2.0F, 3.29F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.21F, 0.859F, 2.218F, 2.0F, 2.45F)
          verticalLineTo(2.05F)
          close()        
      }
    }
    return _layoutColumnFour16!!
  }

private var _layoutColumnFour16: ImageVector? = null
