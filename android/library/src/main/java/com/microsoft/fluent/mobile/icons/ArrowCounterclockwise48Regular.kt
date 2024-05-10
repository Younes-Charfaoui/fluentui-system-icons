package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowCounterclockwise48: ImageVector
  get() {
    if (_arrowCounterclockwise48 != null) {
      return _arrowCounterclockwise48!!
    }
    _arrowCounterclockwise48 = fluentIcon(name = "Regular.ArrowCounterclockwise48", 48f) {
      materialPath {
          moveTo(39.5F, 24.0F)
          curveToRelative(0.0F, -8.56F, -6.94F, -15.5F, -15.5F, -15.5F)
          curveToRelative(-4.509F, 0.0F, -8.568F, 1.924F, -11.402F, 5.0F)
          horizontalLineToRelative(4.152F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveTo(17.44F, 16.0F, 16.75F, 16.0F)
          horizontalLineToRelative(-6.5F)
          curveTo(9.56F, 16.0F, 9.0F, 15.44F, 9.0F, 14.75F)
          verticalLineToRelative(-6.5F)
          curveTo(9.0F, 7.56F, 9.56F, 7.0F, 10.25F, 7.0F)
          reflectiveCurveToRelative(1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineToRelative(2.798F)
          curveTo(14.737F, 7.924F, 19.144F, 6.0F, 24.0F, 6.0F)
          curveToRelative(9.941F, 0.0F, 18.0F, 8.059F, 18.0F, 18.0F)
          reflectiveCurveToRelative(-8.059F, 18.0F, -18.0F, 18.0F)
          reflectiveCurveTo(6.0F, 33.941F, 6.0F, 24.0F)
          curveToRelative(0.0F, -1.003F, 0.082F, -1.989F, 0.24F, -2.95F)
          curveToRelative(0.113F, -0.68F, 0.756F, -1.141F, 1.437F, -1.03F)
          curveToRelative(0.681F, 0.113F, 1.143F, 0.756F, 1.03F, 1.438F)
          curveTo(8.571F, 22.284F, 8.5F, 23.133F, 8.5F, 24.0F)
          curveToRelative(0.0F, 8.56F, 6.94F, 15.5F, 15.5F, 15.5F)
          curveToRelative(8.56F, 0.0F, 15.5F, -6.94F, 15.5F, -15.5F)
          close()        
      }
    }
    return _arrowCounterclockwise48!!
  }

private var _arrowCounterclockwise48: ImageVector? = null
