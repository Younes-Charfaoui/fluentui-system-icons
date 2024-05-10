package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Important32: ImageVector
  get() {
    if (_important32 != null) {
      return _important32!!
    }
    _important32 = fluentIcon(name = "Regular.Important32", 32f) {
      materialPath {
          moveTo(12.0F, 8.0F)
          curveToRelative(0.0F, -2.21F, 1.79F, -4.0F, 4.0F, -4.0F)
          reflectiveCurveToRelative(4.0F, 1.79F, 4.0F, 4.0F)
          curveToRelative(0.0F, 1.45F, -0.421F, 3.348F, -1.046F, 5.315F)
          curveToRelative(-0.613F, 1.932F, -1.372F, 3.776F, -1.942F, 5.066F)
          curveTo(16.854F, 18.737F, 16.48F, 19.0F, 16.0F, 19.0F)
          reflectiveCurveToRelative(-0.854F, -0.263F, -1.012F, -0.62F)
          curveToRelative(-0.57F, -1.289F, -1.329F, -3.133F, -1.942F, -5.065F)
          curveTo(12.42F, 11.348F, 12.0F, 9.45F, 12.0F, 8.0F)
          close()
          moveToRelative(4.0F, -6.0F)
          curveToRelative(-3.314F, 0.0F, -6.0F, 2.686F, -6.0F, 6.0F)
          curveToRelative(0.0F, 3.523F, 1.986F, 8.536F, 3.16F, 11.19F)
          curveTo(13.654F, 20.31F, 14.773F, 21.0F, 16.0F, 21.0F)
          curveToRelative(1.226F, 0.0F, 2.345F, -0.69F, 2.84F, -1.81F)
          curveTo(20.015F, 16.535F, 22.0F, 11.522F, 22.0F, 8.0F)
          curveToRelative(0.0F, -3.314F, -2.686F, -6.0F, -6.0F, -6.0F)
          close()
          moveToRelative(1.5F, 24.5F)
          curveToRelative(0.0F, -0.828F, -0.672F, -1.5F, -1.5F, -1.5F)
          reflectiveCurveToRelative(-1.5F, 0.672F, -1.5F, 1.5F)
          reflectiveCurveTo(15.172F, 28.0F, 16.0F, 28.0F)
          reflectiveCurveToRelative(1.5F, -0.672F, 1.5F, -1.5F)
          close()
          moveToRelative(2.0F, 0.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          reflectiveCurveToRelative(-3.5F, -1.567F, -3.5F, -3.5F)
          reflectiveCurveTo(14.067F, 23.0F, 16.0F, 23.0F)
          reflectiveCurveToRelative(3.5F, 1.567F, 3.5F, 3.5F)
          close()        
      }
    }
    return _important32!!
  }

private var _important32: ImageVector? = null
