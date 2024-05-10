package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowClockwise24: ImageVector
  get() {
    if (_arrowClockwise24 != null) {
      return _arrowClockwise24!!
    }
    _arrowClockwise24 = fluentIcon(name = "Filled.ArrowClockwise24", 24f) {
      materialPath {
          moveTo(5.0F, 12.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          curveToRelative(1.32F, 0.0F, 2.554F, 0.365F, 3.608F, 1.0F)
          horizontalLineTo(15.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(0.516F)
          curveTo(15.57F, 3.559F, 13.85F, 3.0F, 12.0F, 3.0F)
          curveToRelative(-4.97F, 0.0F, -9.0F, 4.03F, -9.0F, 9.0F)
          reflectiveCurveToRelative(4.03F, 9.0F, 9.0F, 9.0F)
          reflectiveCurveToRelative(9.0F, -4.03F, 9.0F, -9.0F)
          curveToRelative(0.0F, -0.38F, -0.024F, -0.755F, -0.07F, -1.124F)
          curveToRelative(-0.068F, -0.548F, -0.568F, -0.937F, -1.116F, -0.868F)
          curveToRelative(-0.548F, 0.068F, -0.936F, 0.568F, -0.868F, 1.116F)
          curveTo(18.98F, 11.41F, 19.0F, 11.703F, 19.0F, 12.0F)
          curveToRelative(0.0F, 3.866F, -3.134F, 7.0F, -7.0F, 7.0F)
          reflectiveCurveToRelative(-7.0F, -3.134F, -7.0F, -7.0F)
          close()        
      }
    }
    return _arrowClockwise24!!
  }

private var _arrowClockwise24: ImageVector? = null
