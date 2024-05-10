package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnOneThirdLeft16: ImageVector
  get() {
    if (_layoutColumnOneThirdLeft16 != null) {
      return _layoutColumnOneThirdLeft16!!
    }
    _layoutColumnOneThirdLeft16 = fluentIcon(name = "Filled.LayoutColumnOneThirdLeft16", 16f) {
      materialPath {
          moveTo(6.0F, 14.0F)
          horizontalLineToRelative(5.5F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(12.0F)
          close()
          moveTo(5.0F, 2.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(2.0F)
          close()        
      }
    }
    return _layoutColumnOneThirdLeft16!!
  }

private var _layoutColumnOneThirdLeft16: ImageVector? = null
