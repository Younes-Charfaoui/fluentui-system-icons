package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowClockwise32: ImageVector
  get() {
    if (_arrowClockwise32 != null) {
      return _arrowClockwise32!!
    }
    _arrowClockwise32 = fluentIcon(name = "Filled.ArrowClockwise32", 32f) {
      materialPath {
          moveTo(5.5F, 16.0F)
          curveToRelative(0.0F, -5.799F, 4.701F, -10.5F, 10.5F, -10.5F)
          curveToRelative(2.594F, 0.0F, 4.968F, 0.94F, 6.801F, 2.5F)
          horizontalLineTo(20.75F)
          curveToRelative(-0.69F, 0.0F, -1.25F, 0.56F, -1.25F, 1.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-5.0F)
          curveTo(27.0F, 3.56F, 26.44F, 3.0F, 25.75F, 3.0F)
          reflectiveCurveTo(24.5F, 3.56F, 24.5F, 4.25F)
          verticalLineToRelative(1.914F)
          curveTo(22.222F, 4.194F, 19.25F, 3.0F, 16.0F, 3.0F)
          curveTo(8.82F, 3.0F, 3.0F, 8.82F, 3.0F, 16.0F)
          reflectiveCurveToRelative(5.82F, 13.0F, 13.0F, 13.0F)
          reflectiveCurveToRelative(13.0F, -5.82F, 13.0F, -13.0F)
          curveToRelative(0.0F, -0.279F, -0.009F, -0.556F, -0.026F, -0.831F)
          curveToRelative(-0.044F, -0.69F, -0.637F, -1.212F, -1.326F, -1.169F)
          curveToRelative(-0.69F, 0.044F, -1.213F, 0.637F, -1.17F, 1.326F)
          curveTo(26.494F, 15.55F, 26.5F, 15.774F, 26.5F, 16.0F)
          curveToRelative(0.0F, 5.799F, -4.701F, 10.5F, -10.5F, 10.5F)
          reflectiveCurveTo(5.5F, 21.799F, 5.5F, 16.0F)
          close()        
      }
    }
    return _arrowClockwise32!!
  }

private var _arrowClockwise32: ImageVector? = null
