package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowCounterclockwise32: ImageVector
  get() {
    if (_arrowCounterclockwise32 != null) {
      return _arrowCounterclockwise32!!
    }
    _arrowCounterclockwise32 = fluentIcon(name = "Filled.ArrowCounterclockwise32", 32f) {
      materialPath {
          moveTo(26.5F, 16.0F)
          curveToRelative(0.0F, -5.799F, -4.701F, -10.5F, -10.5F, -10.5F)
          curveToRelative(-2.594F, 0.0F, -4.968F, 0.94F, -6.801F, 2.5F)
          horizontalLineToRelative(2.051F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveToRelative(-0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineToRelative(-5.0F)
          curveTo(5.56F, 10.5F, 5.0F, 9.94F, 5.0F, 9.25F)
          verticalLineToRelative(-5.0F)
          curveTo(5.0F, 3.56F, 5.56F, 3.0F, 6.25F, 3.0F)
          reflectiveCurveTo(7.5F, 3.56F, 7.5F, 4.25F)
          verticalLineToRelative(1.914F)
          curveTo(9.778F, 4.194F, 12.75F, 3.0F, 16.0F, 3.0F)
          curveToRelative(7.18F, 0.0F, 13.0F, 5.82F, 13.0F, 13.0F)
          reflectiveCurveToRelative(-5.82F, 13.0F, -13.0F, 13.0F)
          reflectiveCurveTo(3.0F, 23.18F, 3.0F, 16.0F)
          curveToRelative(0.0F, -0.279F, 0.009F, -0.556F, 0.026F, -0.831F)
          curveToRelative(0.044F, -0.69F, 0.638F, -1.212F, 1.327F, -1.169F)
          curveToRelative(0.689F, 0.044F, 1.212F, 0.637F, 1.168F, 1.326F)
          curveTo(5.507F, 15.55F, 5.5F, 15.774F, 5.5F, 16.0F)
          curveToRelative(0.0F, 5.799F, 4.701F, 10.5F, 10.5F, 10.5F)
          reflectiveCurveTo(26.5F, 21.799F, 26.5F, 16.0F)
          close()        
      }
    }
    return _arrowCounterclockwise32!!
  }

private var _arrowCounterclockwise32: ImageVector? = null
