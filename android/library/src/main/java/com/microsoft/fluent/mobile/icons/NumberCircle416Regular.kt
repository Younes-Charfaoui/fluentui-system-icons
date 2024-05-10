package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle416: ImageVector
  get() {
    if (_numberCircle416 != null) {
      return _numberCircle416!!
    }
    _numberCircle416 = fluentIcon(name = "Regular.NumberCircle416", 416f) {
      materialPath {
          moveTo(2.0F, 8.0F)
          curveToRelative(0.0F, -3.314F, 2.686F, -6.0F, 6.0F, -6.0F)
          reflectiveCurveToRelative(6.0F, 2.686F, 6.0F, 6.0F)
          reflectiveCurveToRelative(-2.686F, 6.0F, -6.0F, 6.0F)
          reflectiveCurveToRelative(-6.0F, -2.686F, -6.0F, -6.0F)
          close()
          moveToRelative(6.0F, -7.0F)
          curveTo(4.134F, 1.0F, 1.0F, 4.134F, 1.0F, 8.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          reflectiveCurveToRelative(7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          close()
          moveToRelative(1.0F, 4.378F)
          curveTo(9.0F, 4.623F, 8.01F, 4.34F, 7.613F, 4.982F)
          lineTo(5.07F, 9.085F)
          curveTo(4.822F, 9.484F, 5.11F, 10.0F, 5.58F, 10.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          curveToRelative(0.277F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-1.0F)
          horizontalLineToRelative(0.5F)
          curveTo(9.776F, 10.0F, 10.0F, 9.776F, 10.0F, 9.5F)
          reflectiveCurveTo(9.776F, 9.0F, 9.5F, 9.0F)
          horizontalLineTo(9.0F)
          verticalLineTo(5.378F)
          close()
          moveTo(8.0F, 6.255F)
          verticalLineTo(9.0F)
          horizontalLineTo(6.3F)
          lineTo(8.0F, 6.255F)
          close()        
      }
    }
    return _numberCircle416!!
  }

private var _numberCircle416: ImageVector? = null
