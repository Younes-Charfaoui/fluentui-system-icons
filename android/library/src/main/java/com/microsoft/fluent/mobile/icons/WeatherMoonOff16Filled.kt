package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.WeatherMoonOff16: ImageVector
  get() {
    if (_weatherMoonOff16 != null) {
      return _weatherMoonOff16!!
    }
    _weatherMoonOff16 = fluentIcon(name = "Filled.WeatherMoonOff16", 16f) {
      materialPath {
          moveTo(11.616F, 12.323F)
          lineToRelative(2.53F, 2.53F)
          curveToRelative(0.196F, 0.196F, 0.512F, 0.196F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.511F, 0.0F, -0.707F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(6.38F, 7.086F)
          curveToRelative(-0.86F, 1.93F, -2.748F, 2.586F, -3.97F, 2.808F)
          curveToRelative(-0.153F, 0.028F, -0.285F, 0.126F, -0.356F, 0.266F)
          curveToRelative(-0.07F, 0.139F, -0.072F, 0.303F, -0.004F, 0.444F)
          curveTo(3.019F, 12.613F, 5.075F, 14.0F, 7.456F, 14.0F)
          curveToRelative(1.616F, 0.0F, 3.082F, -0.638F, 4.16F, -1.677F)
          close()
          moveTo(13.456F, 8.0F)
          curveToRelative(0.0F, 0.97F, -0.23F, 1.886F, -0.638F, 2.696F)
          lineTo(6.916F, 4.795F)
          curveToRelative(0.052F, -0.788F, -0.02F, -1.538F, -0.145F, -2.2F)
          curveToRelative(-0.026F, -0.142F, 0.01F, -0.29F, 0.101F, -0.404F)
          curveTo(6.964F, 2.077F, 7.1F, 2.009F, 7.246F, 2.004F)
          curveTo(7.316F, 2.0F, 7.386F, 2.0F, 7.456F, 2.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          close()        
      }
    }
    return _weatherMoonOff16!!
  }

private var _weatherMoonOff16: ImageVector? = null
