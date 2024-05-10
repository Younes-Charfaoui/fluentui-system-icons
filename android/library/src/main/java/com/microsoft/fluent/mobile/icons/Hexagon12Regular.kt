package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon12: ImageVector
  get() {
    if (_hexagon12 != null) {
      return _hexagon12!!
    }
    _hexagon12 = fluentIcon(name = "Regular.Hexagon12", 12f) {
      materialPath {
          moveTo(3.332F, 2.626F)
          curveTo(3.555F, 2.239F, 3.968F, 2.0F, 4.415F, 2.0F)
          horizontalLineToRelative(3.17F)
          curveToRelative(0.447F, 0.0F, 0.86F, 0.239F, 1.083F, 0.626F)
          lineToRelative(1.585F, 2.75F)
          curveToRelative(0.223F, 0.386F, 0.223F, 0.862F, 0.0F, 1.248F)
          lineToRelative(-1.585F, 2.75F)
          curveTo(8.445F, 9.761F, 8.032F, 10.0F, 7.585F, 10.0F)
          horizontalLineToRelative(-3.17F)
          curveToRelative(-0.447F, 0.0F, -0.86F, -0.239F, -1.083F, -0.626F)
          lineToRelative(-1.586F, -2.75F)
          curveToRelative(-0.223F, -0.386F, -0.223F, -0.862F, 0.0F, -1.248F)
          lineToRelative(1.586F, -2.75F)
          close()
          moveTo(4.415F, 3.0F)
          curveToRelative(-0.09F, 0.0F, -0.172F, 0.048F, -0.217F, 0.125F)
          lineToRelative(-1.586F, 2.75F)
          curveToRelative(-0.044F, 0.077F, -0.044F, 0.173F, 0.0F, 0.25F)
          lineToRelative(1.586F, 2.75F)
          curveTo(4.243F, 8.952F, 4.325F, 9.0F, 4.415F, 9.0F)
          horizontalLineToRelative(3.17F)
          curveTo(7.675F, 9.0F, 7.757F, 8.952F, 7.8F, 8.875F)
          lineToRelative(1.586F, -2.75F)
          curveToRelative(0.045F, -0.077F, 0.045F, -0.173F, 0.0F, -0.25F)
          lineTo(7.8F, 3.125F)
          curveTo(7.757F, 3.048F, 7.674F, 3.0F, 7.585F, 3.0F)
          horizontalLineToRelative(-3.17F)
          close()        
      }
    }
    return _hexagon12!!
  }

private var _hexagon12: ImageVector? = null
