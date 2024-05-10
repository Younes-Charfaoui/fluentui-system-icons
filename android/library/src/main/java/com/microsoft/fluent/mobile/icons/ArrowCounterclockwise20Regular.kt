package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowCounterclockwise20: ImageVector
  get() {
    if (_arrowCounterclockwise20 != null) {
      return _arrowCounterclockwise20!!
    }
    _arrowCounterclockwise20 = fluentIcon(name = "Regular.ArrowCounterclockwise20", 20f) {
      materialPath {
          moveTo(16.0F, 10.0F)
          curveToRelative(0.0F, -3.314F, -2.686F, -6.0F, -6.0F, -6.0F)
          curveToRelative(-1.777F, 0.0F, -3.373F, 0.772F, -4.472F, 2.0F)
          horizontalLineTo(7.5F)
          curveTo(7.776F, 6.0F, 8.0F, 6.224F, 8.0F, 6.5F)
          reflectiveCurveTo(7.776F, 7.0F, 7.5F, 7.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(4.224F, 7.0F, 4.0F, 6.776F, 4.0F, 6.5F)
          verticalLineToRelative(-3.0F)
          curveTo(4.0F, 3.224F, 4.224F, 3.0F, 4.5F, 3.0F)
          reflectiveCurveTo(5.0F, 3.224F, 5.0F, 3.5F)
          verticalLineToRelative(1.601F)
          curveTo(6.27F, 3.805F, 8.04F, 3.0F, 10.0F, 3.0F)
          curveToRelative(3.866F, 0.0F, 7.0F, 3.134F, 7.0F, 7.0F)
          reflectiveCurveToRelative(-3.134F, 7.0F, -7.0F, 7.0F)
          reflectiveCurveToRelative(-7.0F, -3.134F, -7.0F, -7.0F)
          curveToRelative(0.0F, -0.18F, 0.007F, -0.36F, 0.02F, -0.538F)
          curveToRelative(0.021F, -0.275F, 0.261F, -0.482F, 0.537F, -0.46F)
          curveToRelative(0.275F, 0.02F, 0.481F, 0.26F, 0.46F, 0.536F)
          curveTo(4.006F, 9.69F, 4.0F, 9.844F, 4.0F, 10.0F)
          curveToRelative(0.0F, 3.314F, 2.686F, 6.0F, 6.0F, 6.0F)
          reflectiveCurveToRelative(6.0F, -2.686F, 6.0F, -6.0F)
          close()        
      }
    }
    return _arrowCounterclockwise20!!
  }

private var _arrowCounterclockwise20: ImageVector? = null
