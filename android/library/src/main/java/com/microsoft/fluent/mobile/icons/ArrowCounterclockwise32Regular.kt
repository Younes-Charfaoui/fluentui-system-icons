package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowCounterclockwise32: ImageVector
  get() {
    if (_arrowCounterclockwise32 != null) {
      return _arrowCounterclockwise32!!
    }
    _arrowCounterclockwise32 = fluentIcon(name = "Regular.ArrowCounterclockwise32", 32f) {
      materialPath {
          moveTo(27.0F, 16.0F)
          curveToRelative(0.0F, -6.075F, -4.925F, -11.0F, -11.0F, -11.0F)
          curveToRelative(-2.923F, 0.0F, -5.58F, 1.14F, -7.55F, 3.0F)
          horizontalLineTo(11.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(2.62F)
          curveTo(9.335F, 4.378F, 12.507F, 3.0F, 16.0F, 3.0F)
          curveToRelative(7.18F, 0.0F, 13.0F, 5.82F, 13.0F, 13.0F)
          reflectiveCurveToRelative(-5.82F, 13.0F, -13.0F, 13.0F)
          reflectiveCurveTo(3.0F, 23.18F, 3.0F, 16.0F)
          curveToRelative(0.0F, -0.364F, 0.015F, -0.725F, 0.045F, -1.082F)
          curveToRelative(0.045F, -0.55F, 0.528F, -0.96F, 1.078F, -0.915F)
          curveToRelative(0.55F, 0.046F, 0.96F, 0.529F, 0.915F, 1.08F)
          curveTo(5.013F, 15.384F, 5.0F, 15.69F, 5.0F, 16.0F)
          curveToRelative(0.0F, 6.075F, 4.925F, 11.0F, 11.0F, 11.0F)
          reflectiveCurveToRelative(11.0F, -4.925F, 11.0F, -11.0F)
          close()        
      }
    }
    return _arrowCounterclockwise32!!
  }

private var _arrowCounterclockwise32: ImageVector? = null
