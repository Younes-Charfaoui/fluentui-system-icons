package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle720: ImageVector
  get() {
    if (_numberCircle720 != null) {
      return _numberCircle720!!
    }
    _numberCircle720 = fluentIcon(name = "Regular.NumberCircle720", 720f) {
      materialPath {
          moveTo(3.0F, 10.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          reflectiveCurveToRelative(-3.134F, 7.0F, -7.0F, 7.0F)
          reflectiveCurveToRelative(-7.0F, -3.134F, -7.0F, -7.0F)
          close()
          moveToRelative(7.0F, -8.0F)
          curveToRelative(-4.418F, 0.0F, -8.0F, 3.582F, -8.0F, 8.0F)
          reflectiveCurveToRelative(3.582F, 8.0F, 8.0F, 8.0F)
          reflectiveCurveToRelative(8.0F, -3.582F, 8.0F, -8.0F)
          reflectiveCurveToRelative(-3.582F, -8.0F, -8.0F, -8.0F)
          close()
          moveTo(7.5F, 6.0F)
          curveTo(7.224F, 6.0F, 7.0F, 6.224F, 7.0F, 6.5F)
          reflectiveCurveTo(7.224F, 7.0F, 7.5F, 7.0F)
          horizontalLineToRelative(4.076F)
          curveToRelative(-0.209F, 0.345F, -0.464F, 0.796F, -0.735F, 1.34F)
          curveToRelative(-0.67F, 1.344F, -1.439F, 3.266F, -1.834F, 5.576F)
          curveToRelative(-0.046F, 0.272F, 0.136F, 0.53F, 0.409F, 0.577F)
          curveToRelative(0.272F, 0.046F, 0.53F, -0.136F, 0.577F, -0.409F)
          curveToRelative(0.375F, -2.19F, 1.105F, -4.018F, 1.743F, -5.299F)
          curveToRelative(0.319F, -0.64F, 0.613F, -1.14F, 0.827F, -1.48F)
          curveToRelative(0.106F, -0.17F, 0.193F, -0.298F, 0.252F, -0.384F)
          lineToRelative(0.066F, -0.095F)
          lineToRelative(0.017F, -0.022F)
          lineToRelative(0.003F, -0.005F)
          curveToRelative(0.113F, -0.152F, 0.13F, -0.355F, 0.046F, -0.524F)
          curveTo(12.862F, 6.107F, 12.689F, 6.0F, 12.5F, 6.0F)
          horizontalLineToRelative(-5.0F)
          close()        
      }
    }
    return _numberCircle720!!
  }

private var _numberCircle720: ImageVector? = null
