package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Status32: ImageVector
  get() {
    if (_status32 != null) {
      return _status32!!
    }
    _status32 = fluentIcon(name = "Filled.Status32", 32f) {
      materialPath {
          moveTo(22.318F, 3.318F)
          curveToRelative(1.757F, -1.757F, 4.607F, -1.757F, 6.364F, 0.0F)
          curveToRelative(1.757F, 1.757F, 1.757F, 4.607F, 0.0F, 6.364F)
          lineToRelative(-8.66F, 8.66F)
          curveToRelative(-0.36F, 0.36F, -0.804F, 0.621F, -1.292F, 0.762F)
          lineToRelative(-6.453F, 1.857F)
          curveToRelative(-0.35F, 0.1F, -0.727F, 0.003F, -0.984F, -0.254F)
          reflectiveCurveToRelative(-0.355F, -0.634F, -0.254F, -0.983F)
          lineToRelative(1.857F, -6.454F)
          curveToRelative(0.14F, -0.488F, 0.403F, -0.933F, 0.762F, -1.292F)
          lineToRelative(8.66F, -8.66F)
          close()
          moveTo(16.0F, 6.0F)
          curveToRelative(0.48F, 0.0F, 0.953F, 0.034F, 1.415F, 0.1F)
          lineToRelative(1.693F, -1.693F)
          curveTo(18.117F, 4.14F, 17.075F, 4.0F, 16.0F, 4.0F)
          curveTo(9.373F, 4.0F, 4.0F, 9.373F, 4.0F, 16.0F)
          reflectiveCurveToRelative(5.373F, 12.0F, 12.0F, 12.0F)
          reflectiveCurveToRelative(12.0F, -5.373F, 12.0F, -12.0F)
          curveToRelative(0.0F, -1.075F, -0.141F, -2.117F, -0.407F, -3.108F)
          lineToRelative(-1.692F, 1.693F)
          curveTo(25.966F, 15.047F, 26.0F, 15.52F, 26.0F, 16.0F)
          curveToRelative(0.0F, 5.523F, -4.477F, 10.0F, -10.0F, 10.0F)
          reflectiveCurveTo(6.0F, 21.523F, 6.0F, 16.0F)
          reflectiveCurveTo(10.477F, 6.0F, 16.0F, 6.0F)
          close()        
      }
    }
    return _status32!!
  }

private var _status32: ImageVector? = null
