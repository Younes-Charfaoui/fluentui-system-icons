package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronCircleDown28: ImageVector
  get() {
    if (_chevronCircleDown28 != null) {
      return _chevronCircleDown28!!
    }
    _chevronCircleDown28 = fluentIcon(name = "Filled.ChevronCircleDown28", 28f) {
      materialPath {
          moveTo(2.0F, 14.0F)
          curveTo(2.0F, 7.373F, 7.373F, 2.0F, 14.0F, 2.0F)
          reflectiveCurveToRelative(12.0F, 5.373F, 12.0F, 12.0F)
          reflectiveCurveToRelative(-5.373F, 12.0F, -12.0F, 12.0F)
          reflectiveCurveTo(2.0F, 20.627F, 2.0F, 14.0F)
          close()
          moveToRelative(7.03F, -2.78F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(5.5F, 5.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(5.5F, -5.5F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineTo(14.0F, 16.19F)
          lineToRelative(-4.97F, -4.97F)
          close()        
      }
    }
    return _chevronCircleDown28!!
  }

private var _chevronCircleDown28: ImageVector? = null
