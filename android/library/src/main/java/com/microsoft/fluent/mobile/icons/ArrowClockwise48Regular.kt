package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowClockwise48: ImageVector
  get() {
    if (_arrowClockwise48 != null) {
      return _arrowClockwise48!!
    }
    _arrowClockwise48 = fluentIcon(name = "Regular.ArrowClockwise48", 48f) {
      materialPath {
          moveTo(8.5F, 24.0F)
          curveToRelative(0.0F, -8.56F, 6.94F, -15.5F, 15.5F, -15.5F)
          curveToRelative(4.509F, 0.0F, 8.568F, 1.924F, 11.402F, 5.0F)
          horizontalLineTo(31.25F)
          curveToRelative(-0.69F, 0.0F, -1.25F, 0.56F, -1.25F, 1.25F)
          reflectiveCurveTo(30.56F, 16.0F, 31.25F, 16.0F)
          horizontalLineToRelative(6.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-6.5F)
          curveTo(39.0F, 7.56F, 38.44F, 7.0F, 37.75F, 7.0F)
          reflectiveCurveTo(36.5F, 7.56F, 36.5F, 8.25F)
          verticalLineToRelative(2.798F)
          curveTo(33.263F, 7.924F, 28.856F, 6.0F, 24.0F, 6.0F)
          curveTo(14.059F, 6.0F, 6.0F, 14.059F, 6.0F, 24.0F)
          reflectiveCurveToRelative(8.059F, 18.0F, 18.0F, 18.0F)
          reflectiveCurveToRelative(18.0F, -8.059F, 18.0F, -18.0F)
          curveToRelative(0.0F, -1.003F, -0.082F, -1.989F, -0.24F, -2.95F)
          curveToRelative(-0.113F, -0.68F, -0.756F, -1.141F, -1.437F, -1.03F)
          curveToRelative(-0.681F, 0.113F, -1.143F, 0.756F, -1.03F, 1.438F)
          curveTo(39.429F, 22.284F, 39.5F, 23.133F, 39.5F, 24.0F)
          curveToRelative(0.0F, 8.56F, -6.94F, 15.5F, -15.5F, 15.5F)
          curveToRelative(-8.56F, 0.0F, -15.5F, -6.94F, -15.5F, -15.5F)
          close()        
      }
    }
    return _arrowClockwise48!!
  }

private var _arrowClockwise48: ImageVector? = null
