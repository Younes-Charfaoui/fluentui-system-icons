package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.History32: ImageVector
  get() {
    if (_history32 != null) {
      return _history32!!
    }
    _history32 = fluentIcon(name = "Regular.History32", 32f) {
      materialPath {
          moveTo(16.0F, 5.0F)
          curveToRelative(6.075F, 0.0F, 11.0F, 4.925F, 11.0F, 11.0F)
          reflectiveCurveToRelative(-4.925F, 11.0F, -11.0F, 11.0F)
          reflectiveCurveTo(5.0F, 22.075F, 5.0F, 16.0F)
          curveToRelative(0.0F, -0.31F, 0.013F, -0.615F, 0.038F, -0.918F)
          curveToRelative(0.045F, -0.55F, -0.364F, -1.033F, -0.915F, -1.079F)
          curveToRelative(-0.55F, -0.045F, -1.033F, 0.364F, -1.079F, 0.915F)
          curveTo(3.016F, 15.275F, 3.0F, 15.636F, 3.0F, 16.0F)
          curveToRelative(0.0F, 7.18F, 5.82F, 13.0F, 13.0F, 13.0F)
          reflectiveCurveToRelative(13.0F, -5.82F, 13.0F, -13.0F)
          reflectiveCurveTo(23.18F, 3.0F, 16.0F, 3.0F)
          curveToRelative(-3.493F, 0.0F, -6.665F, 1.379F, -9.0F, 3.62F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveTo(5.0F, 3.448F, 5.0F, 4.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(8.45F)
          curveToRelative(1.97F, -1.86F, 4.627F, -3.0F, 7.55F, -3.0F)
          close()
          moveToRelative(1.0F, 4.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineTo(9.0F)
          close()        
      }
    }
    return _history32!!
  }

private var _history32: ImageVector? = null
