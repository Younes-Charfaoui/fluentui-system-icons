package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowCounterclockwise16: ImageVector
  get() {
    if (_arrowCounterclockwise16 != null) {
      return _arrowCounterclockwise16!!
    }
    _arrowCounterclockwise16 = fluentIcon(name = "Regular.ArrowCounterclockwise16", 16f) {
      materialPath {
          moveTo(13.0F, 8.0F)
          curveToRelative(0.0F, -2.761F, -2.24F, -5.0F, -5.0F, -5.0F)
          curveToRelative(-1.637F, 0.0F, -3.09F, 0.785F, -4.002F, 2.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(6.275F, 6.0F, 6.0F, 6.0F)
          horizontalLineTo(3.0F)
          curveTo(2.723F, 6.0F, 2.5F, 5.776F, 2.5F, 5.5F)
          verticalLineToRelative(-3.0F)
          curveTo(2.5F, 2.224F, 2.723F, 2.0F, 3.0F, 2.0F)
          reflectiveCurveToRelative(0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineToRelative(1.531F)
          curveTo(4.6F, 2.786F, 6.207F, 2.0F, 8.0F, 2.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          reflectiveCurveToRelative(-2.686F, 6.0F, -6.0F, 6.0F)
          curveToRelative(-3.13F, 0.0F, -5.7F, -2.396F, -5.975F, -5.455F)
          curveTo(1.999F, 8.27F, 2.202F, 8.027F, 2.477F, 8.002F)
          curveTo(2.752F, 7.977F, 2.995F, 8.18F, 3.019F, 8.455F)
          curveTo(3.25F, 11.003F, 5.391F, 13.0F, 8.0F, 13.0F)
          curveToRelative(2.762F, 0.0F, 5.0F, -2.239F, 5.0F, -5.0F)
          close()        
      }
    }
    return _arrowCounterclockwise16!!
  }

private var _arrowCounterclockwise16: ImageVector? = null
