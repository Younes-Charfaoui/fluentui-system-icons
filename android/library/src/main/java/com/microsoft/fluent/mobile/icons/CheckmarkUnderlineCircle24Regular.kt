package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CheckmarkUnderlineCircle24: ImageVector
  get() {
    if (_checkmarkUnderlineCircle24 != null) {
      return _checkmarkUnderlineCircle24!!
    }
    _checkmarkUnderlineCircle24 = fluentIcon(name = "Regular.CheckmarkUnderlineCircle24", 24f) {
      materialPath {
          moveTo(10.75F, 11.44F)
          lineToRelative(4.47F, -4.47F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          curveToRelative(0.267F, 0.266F, 0.29F, 0.683F, 0.073F, 0.976F)
          lineTo(16.28F, 8.03F)
          lineToRelative(-5.0F, 5.0F)
          curveToRelative(-0.266F, 0.267F, -0.683F, 0.29F, -0.976F, 0.073F)
          lineTo(10.22F, 13.03F)
          lineToRelative(-2.5F, -2.5F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(0.266F, -0.267F, 0.683F, -0.29F, 0.976F, -0.073F)
          lineTo(8.78F, 9.47F)
          lineToRelative(1.97F, 1.97F)
          close()
          moveTo(8.5F, 15.0F)
          curveToRelative(-0.414F, 0.0F, -0.75F, 0.336F, -0.75F, 0.75F)
          reflectiveCurveTo(8.086F, 16.5F, 8.5F, 16.5F)
          horizontalLineToRelative(6.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(15.664F, 15.0F, 15.25F, 15.0F)
          horizontalLineTo(8.5F)
          close()
          moveTo(2.0F, 12.0F)
          curveTo(2.0F, 6.477F, 6.477F, 2.0F, 12.0F, 2.0F)
          reflectiveCurveToRelative(10.0F, 4.477F, 10.0F, 10.0F)
          reflectiveCurveToRelative(-4.477F, 10.0F, -10.0F, 10.0F)
          reflectiveCurveTo(2.0F, 17.523F, 2.0F, 12.0F)
          close()
          moveToRelative(10.0F, -8.5F)
          curveToRelative(-4.694F, 0.0F, -8.5F, 3.806F, -8.5F, 8.5F)
          reflectiveCurveToRelative(3.806F, 8.5F, 8.5F, 8.5F)
          reflectiveCurveToRelative(8.5F, -3.806F, 8.5F, -8.5F)
          reflectiveCurveToRelative(-3.806F, -8.5F, -8.5F, -8.5F)
          close()        
      }
    }
    return _checkmarkUnderlineCircle24!!
  }

private var _checkmarkUnderlineCircle24: ImageVector? = null
