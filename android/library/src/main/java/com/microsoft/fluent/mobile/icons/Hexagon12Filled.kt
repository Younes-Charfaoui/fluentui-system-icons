package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon12: ImageVector
  get() {
    if (_hexagon12 != null) {
      return _hexagon12!!
    }
    _hexagon12 = fluentIcon(name = "Filled.Hexagon12", 12f) {
      materialPath {
          moveTo(4.415F, 2.0F)
          curveToRelative(-0.447F, 0.0F, -0.86F, 0.239F, -1.083F, 0.626F)
          lineToRelative(-1.586F, 2.75F)
          curveToRelative(-0.223F, 0.386F, -0.223F, 0.862F, 0.0F, 1.248F)
          lineToRelative(1.586F, 2.75F)
          curveTo(3.555F, 9.761F, 3.968F, 10.0F, 4.415F, 10.0F)
          horizontalLineToRelative(3.17F)
          curveToRelative(0.447F, 0.0F, 0.86F, -0.239F, 1.083F, -0.626F)
          lineToRelative(1.585F, -2.75F)
          curveToRelative(0.223F, -0.386F, 0.223F, -0.862F, 0.0F, -1.248F)
          lineToRelative(-1.585F, -2.75F)
          curveTo(8.445F, 2.239F, 8.032F, 2.0F, 7.585F, 2.0F)
          horizontalLineToRelative(-3.17F)
          close()        
      }
    }
    return _hexagon12!!
  }

private var _hexagon12: ImageVector? = null
