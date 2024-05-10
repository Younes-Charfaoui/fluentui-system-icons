package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowCounterclockwise24: ImageVector
  get() {
    if (_arrowCounterclockwise24 != null) {
      return _arrowCounterclockwise24!!
    }
    _arrowCounterclockwise24 = fluentIcon(name = "Filled.ArrowCounterclockwise24", 24f) {
      materialPath {
          moveTo(19.0F, 12.0F)
          curveToRelative(0.0F, -3.866F, -3.134F, -7.0F, -7.0F, -7.0F)
          curveToRelative(-1.32F, 0.0F, -2.554F, 0.365F, -3.608F, 1.0F)
          horizontalLineTo(9.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveTo(9.552F, 8.0F, 9.0F, 8.0F)
          horizontalLineTo(6.0F)
          curveTo(5.448F, 8.0F, 5.0F, 7.552F, 5.0F, 7.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(0.516F)
          curveTo(8.43F, 3.559F, 10.15F, 3.0F, 12.0F, 3.0F)
          curveToRelative(4.97F, 0.0F, 9.0F, 4.03F, 9.0F, 9.0F)
          reflectiveCurveToRelative(-4.03F, 9.0F, -9.0F, 9.0F)
          reflectiveCurveToRelative(-9.0F, -4.03F, -9.0F, -9.0F)
          curveToRelative(0.0F, -0.38F, 0.024F, -0.755F, 0.07F, -1.124F)
          curveToRelative(0.068F, -0.548F, 0.568F, -0.937F, 1.116F, -0.868F)
          curveToRelative(0.548F, 0.068F, 0.937F, 0.568F, 0.868F, 1.116F)
          curveTo(5.02F, 11.41F, 5.0F, 11.703F, 5.0F, 12.0F)
          curveToRelative(0.0F, 3.866F, 3.134F, 7.0F, 7.0F, 7.0F)
          reflectiveCurveToRelative(7.0F, -3.134F, 7.0F, -7.0F)
          close()        
      }
    }
    return _arrowCounterclockwise24!!
  }

private var _arrowCounterclockwise24: ImageVector? = null
