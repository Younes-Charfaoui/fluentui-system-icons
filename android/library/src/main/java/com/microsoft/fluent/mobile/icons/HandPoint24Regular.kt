package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.HandPoint24: ImageVector
  get() {
    if (_handPoint24 != null) {
      return _handPoint24!!
    }
    _handPoint24 = fluentIcon(name = "Regular.HandPoint24", 24f) {
      materialPath {
          moveTo(11.5F, 3.5F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(7.502F)
          curveToRelative(0.0F, 0.247F, -0.122F, 0.478F, -0.325F, 0.618F)
          curveToRelative(-0.204F, 0.14F, -0.464F, 0.17F, -0.694F, 0.082F)
          lineToRelative(-2.514F, -0.966F)
          curveToRelative(-1.18F, -0.454F, -2.496F, -0.07F, -3.254F, 0.895F)
          curveToRelative(5.488F, 2.461F, 7.557F, 4.81F, 8.477F, 6.833F)
          curveToRelative(0.33F, 0.725F, 0.977F, 1.113F, 1.578F, 1.02F)
          lineToRelative(3.456F, -0.532F)
          curveToRelative(0.498F, -0.077F, 0.9F, -0.445F, 1.022F, -0.934F)
          lineToRelative(1.153F, -4.633F)
          curveToRelative(0.46F, -1.851F, -0.765F, -3.699F, -2.65F, -3.995F)
          lineToRelative(-3.615F, -0.57F)
          curveTo(12.77F, 9.764F, 12.5F, 9.45F, 12.5F, 9.081F)
          verticalLineTo(4.5F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          close()
          moveTo(9.0F, 4.5F)
          curveTo(9.0F, 3.12F, 10.12F, 2.0F, 11.5F, 2.0F)
          reflectiveCurveTo(14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(3.94F)
          lineToRelative(2.983F, 0.468F)
          curveToRelative(2.754F, 0.433F, 4.545F, 3.134F, 3.872F, 5.84F)
          lineToRelative(-1.153F, 4.632F)
          curveToRelative(-0.268F, 1.076F, -1.154F, 1.886F, -2.25F, 2.054F)
          lineToRelative(-3.455F, 0.533F)
          curveToRelative(-1.442F, 0.222F, -2.646F, -0.726F, -3.173F, -1.882F)
          curveToRelative(-0.735F, -1.617F, -2.527F, -3.834F, -8.19F, -6.29F)
          curveToRelative(-0.546F, -0.237F, -0.812F, -0.905F, -0.511F, -1.463F)
          curveToRelative(1.035F, -1.926F, 3.341F, -2.781F, 5.382F, -1.996F)
          lineTo(9.0F, 10.91F)
          verticalLineTo(4.5F)
          close()        
      }
    }
    return _handPoint24!!
  }

private var _handPoint24: ImageVector? = null
