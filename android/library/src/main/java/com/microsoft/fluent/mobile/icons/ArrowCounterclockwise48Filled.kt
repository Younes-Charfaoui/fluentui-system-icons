package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowCounterclockwise48: ImageVector
  get() {
    if (_arrowCounterclockwise48 != null) {
      return _arrowCounterclockwise48!!
    }
    _arrowCounterclockwise48 = fluentIcon(name = "Filled.ArrowCounterclockwise48", 48f) {
      materialPath {
          moveTo(39.0F, 24.0F)
          curveToRelative(0.0F, -8.284F, -6.716F, -15.0F, -15.0F, -15.0F)
          curveToRelative(-3.938F, 0.0F, -7.52F, 1.516F, -10.198F, 4.0F)
          horizontalLineTo(17.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveTo(18.328F, 16.0F, 17.5F, 16.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(9.672F, 16.0F, 9.0F, 15.328F, 9.0F, 14.5F)
          verticalLineToRelative(-7.0F)
          curveTo(9.0F, 6.672F, 9.672F, 6.0F, 10.5F, 6.0F)
          reflectiveCurveTo(12.0F, 6.672F, 12.0F, 7.5F)
          verticalLineToRelative(3.084F)
          curveTo(15.184F, 7.734F, 19.39F, 6.0F, 24.0F, 6.0F)
          curveToRelative(9.941F, 0.0F, 18.0F, 8.059F, 18.0F, 18.0F)
          reflectiveCurveToRelative(-8.059F, 18.0F, -18.0F, 18.0F)
          reflectiveCurveTo(6.0F, 33.941F, 6.0F, 24.0F)
          curveToRelative(0.0F, -0.926F, 0.07F, -1.836F, 0.205F, -2.725F)
          curveToRelative(0.125F, -0.82F, 0.89F, -1.383F, 1.709F, -1.258F)
          curveToRelative(0.819F, 0.125F, 1.382F, 0.89F, 1.257F, 1.708F)
          curveTo(9.06F, 22.466F, 9.0F, 23.225F, 9.0F, 24.0F)
          curveToRelative(0.0F, 8.284F, 6.716F, 15.0F, 15.0F, 15.0F)
          curveToRelative(8.284F, 0.0F, 15.0F, -6.716F, 15.0F, -15.0F)
          close()        
      }
    }
    return _arrowCounterclockwise48!!
  }

private var _arrowCounterclockwise48: ImageVector? = null
