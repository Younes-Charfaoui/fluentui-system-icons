package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThree16: ImageVector
  get() {
    if (_layoutColumnThree16 != null) {
      return _layoutColumnThree16!!
    }
    _layoutColumnThree16 = fluentIcon(name = "Filled.LayoutColumnThree16", 16f) {
      materialPath {
          moveTo(11.0F, 14.0F)
          horizontalLineToRelative(0.5F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineTo(11.0F)
          verticalLineToRelative(12.0F)
          close()
          moveTo(10.0F, 2.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(12.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(2.0F)
          close()
          moveTo(4.5F, 2.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(12.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          close()        
      }
    }
    return _layoutColumnThree16!!
  }

private var _layoutColumnThree16: ImageVector? = null
