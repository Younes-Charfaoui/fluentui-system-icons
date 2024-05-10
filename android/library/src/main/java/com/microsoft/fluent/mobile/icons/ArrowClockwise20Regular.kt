package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowClockwise20: ImageVector
  get() {
    if (_arrowClockwise20 != null) {
      return _arrowClockwise20!!
    }
    _arrowClockwise20 = fluentIcon(name = "Regular.ArrowClockwise20", 20f) {
      materialPath {
          moveTo(4.0F, 10.0F)
          curveToRelative(0.0F, -3.314F, 2.686F, -6.0F, 6.0F, -6.0F)
          curveToRelative(1.777F, 0.0F, 3.373F, 0.772F, 4.472F, 2.0F)
          horizontalLineTo(12.5F)
          curveTo(12.224F, 6.0F, 12.0F, 6.224F, 12.0F, 6.5F)
          reflectiveCurveTo(12.224F, 7.0F, 12.5F, 7.0F)
          horizontalLineToRelative(3.0F)
          curveTo(15.776F, 7.0F, 16.0F, 6.776F, 16.0F, 6.5F)
          verticalLineToRelative(-3.0F)
          curveTo(16.0F, 3.224F, 15.776F, 3.0F, 15.5F, 3.0F)
          reflectiveCurveTo(15.0F, 3.224F, 15.0F, 3.5F)
          verticalLineToRelative(1.601F)
          curveTo(13.73F, 3.805F, 11.96F, 3.0F, 10.0F, 3.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          reflectiveCurveToRelative(7.0F, -3.134F, 7.0F, -7.0F)
          curveToRelative(0.0F, -0.18F, -0.007F, -0.36F, -0.02F, -0.538F)
          curveToRelative(-0.021F, -0.275F, -0.262F, -0.482F, -0.537F, -0.46F)
          curveToRelative(-0.275F, 0.02F, -0.482F, 0.26F, -0.46F, 0.536F)
          curveTo(15.993F, 9.69F, 16.0F, 9.844F, 16.0F, 10.0F)
          curveToRelative(0.0F, 3.314F, -2.686F, 6.0F, -6.0F, 6.0F)
          reflectiveCurveToRelative(-6.0F, -2.686F, -6.0F, -6.0F)
          close()        
      }
    }
    return _arrowClockwise20!!
  }

private var _arrowClockwise20: ImageVector? = null
