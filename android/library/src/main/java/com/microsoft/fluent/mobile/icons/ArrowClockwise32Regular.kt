package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowClockwise32: ImageVector
  get() {
    if (_arrowClockwise32 != null) {
      return _arrowClockwise32!!
    }
    _arrowClockwise32 = fluentIcon(name = "Regular.ArrowClockwise32", 32f) {
      materialPath {
          moveTo(5.0F, 16.0F)
          curveTo(5.0F, 9.925F, 9.925F, 5.0F, 16.0F, 5.0F)
          curveToRelative(2.923F, 0.0F, 5.58F, 1.14F, 7.55F, 3.0F)
          horizontalLineTo(21.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(2.62F)
          curveTo(22.665F, 4.378F, 19.494F, 3.0F, 16.0F, 3.0F)
          curveTo(8.82F, 3.0F, 3.0F, 8.82F, 3.0F, 16.0F)
          reflectiveCurveToRelative(5.82F, 13.0F, 13.0F, 13.0F)
          reflectiveCurveToRelative(13.0F, -5.82F, 13.0F, -13.0F)
          curveToRelative(0.0F, -0.364F, -0.015F, -0.725F, -0.044F, -1.082F)
          curveToRelative(-0.046F, -0.55F, -0.529F, -0.96F, -1.08F, -0.915F)
          curveToRelative(-0.55F, 0.046F, -0.96F, 0.529F, -0.914F, 1.08F)
          curveTo(26.987F, 15.384F, 27.0F, 15.69F, 27.0F, 16.0F)
          curveToRelative(0.0F, 6.075F, -4.925F, 11.0F, -11.0F, 11.0F)
          reflectiveCurveTo(5.0F, 22.075F, 5.0F, 16.0F)
          close()        
      }
    }
    return _arrowClockwise32!!
  }

private var _arrowClockwise32: ImageVector? = null
