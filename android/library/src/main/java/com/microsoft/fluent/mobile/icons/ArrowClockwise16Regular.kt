package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowClockwise16: ImageVector
  get() {
    if (_arrowClockwise16 != null) {
      return _arrowClockwise16!!
    }
    _arrowClockwise16 = fluentIcon(name = "Regular.ArrowClockwise16", 16f) {
      materialPath {
          moveTo(3.0F, 8.0F)
          curveToRelative(0.0F, -2.761F, 2.239F, -5.0F, 5.0F, -5.0F)
          curveToRelative(1.635F, 0.0F, 3.088F, 0.785F, 4.0F, 2.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(9.724F, 5.0F, 9.5F, 5.224F, 9.5F, 5.5F)
          reflectiveCurveTo(9.724F, 6.0F, 10.0F, 6.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveTo(13.5F, 2.224F, 13.276F, 2.0F, 13.0F, 2.0F)
          reflectiveCurveToRelative(-0.5F, 0.224F, -0.5F, 0.5F)
          verticalLineToRelative(1.531F)
          curveTo(11.4F, 2.786F, 9.793F, 2.0F, 8.0F, 2.0F)
          curveTo(4.686F, 2.0F, 2.0F, 4.686F, 2.0F, 8.0F)
          reflectiveCurveToRelative(2.686F, 6.0F, 6.0F, 6.0F)
          curveToRelative(3.13F, 0.0F, 5.7F, -2.396F, 5.976F, -5.455F)
          curveTo(14.0F, 8.27F, 13.797F, 8.027F, 13.522F, 8.002F)
          curveToRelative(-0.275F, -0.025F, -0.518F, 0.178F, -0.542F, 0.453F)
          curveTo(12.75F, 11.003F, 10.608F, 13.0F, 8.0F, 13.0F)
          curveToRelative(-2.761F, 0.0F, -5.0F, -2.239F, -5.0F, -5.0F)
          close()        
      }
    }
    return _arrowClockwise16!!
  }

private var _arrowClockwise16: ImageVector? = null
