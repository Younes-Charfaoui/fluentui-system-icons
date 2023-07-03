package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.AirplaneLanding24: ImageVector
  get() {
    if (_airplaneLanding24 != null) {
      return _airplaneLanding24!!
    }
    _airplaneLanding24 = fluentIcon(name = "Filled.AirplaneLanding24", 24f) {
      materialPath {
          moveTo(10.0F, 5.039F)
          verticalLineToRelative(0.778F)
          lineToRelative(3.027F, 1.202F)
          horizontalLineToRelative(2.119F)
          lineToRelative(-1.25F, -2.808F)
          curveTo(13.002F, 2.202F, 10.0F, 2.841F, 10.0F, 5.039F)
          close()
          moveToRelative(2.72F, 2.935F)
          lineTo(8.5F, 6.297F)
          verticalLineToRelative(-1.54F)
          curveToRelative(0.0F, -1.738F, -2.259F, -2.414F, -3.213F, -0.961F)
          lineToRelative(-1.91F, 2.908F)
          curveToRelative(-0.79F, 1.206F, -0.292F, 2.834F, 1.039F, 3.39F)
          lineToRelative(3.503F, 1.464F)
          lineToRelative(-2.045F, 1.898F)
          curveToRelative(-1.627F, 1.511F, -0.004F, 4.165F, 2.082F, 3.405F)
          lineToRelative(6.761F, -2.464F)
          lineToRelative(3.463F, 1.446F)
          curveToRelative(1.34F, 0.56F, 2.82F, -0.425F, 2.82F, -1.878F)
          verticalLineToRelative(-1.23F)
          curveToRelative(0.0F, -2.604F, -2.111F, -4.716F, -4.715F, -4.716F)
          horizontalLineToRelative(-3.326F)
          curveToRelative(-0.082F, 0.0F, -0.162F, -0.015F, -0.238F, -0.045F)
          close()
          moveTo(3.0F, 20.25F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(16.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(20.664F, 21.0F, 20.25F, 21.0F)
          horizontalLineTo(3.75F)
          curveTo(3.336F, 21.0F, 3.0F, 20.664F, 3.0F, 20.25F)
          close()        
      }
    }
    return _airplaneLanding24!!
  }

private var _airplaneLanding24: ImageVector? = null
