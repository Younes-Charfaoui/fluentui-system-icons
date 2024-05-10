package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NextFrame24: ImageVector
  get() {
    if (_nextFrame24 != null) {
      return _nextFrame24!!
    }
    _nextFrame24 = fluentIcon(name = "Regular.NextFrame24", 24f) {
      materialPath {
          moveTo(5.5F, 3.75F)
          curveTo(5.5F, 3.336F, 5.164F, 3.0F, 4.75F, 3.0F)
          reflectiveCurveTo(4.0F, 3.336F, 4.0F, 3.75F)
          verticalLineToRelative(16.5F)
          curveTo(4.0F, 20.664F, 4.336F, 21.0F, 4.75F, 21.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(3.75F)
          close()
          moveToRelative(6.24F, -0.44F)
          curveTo(10.577F, 2.513F, 9.0F, 3.344F, 9.0F, 4.752F)
          verticalLineToRelative(14.495F)
          curveToRelative(0.0F, 1.413F, 1.589F, 2.244F, 2.75F, 1.437F)
          lineToRelative(10.498F, -7.302F)
          curveToRelative(1.005F, -0.7F, 1.0F, -2.188F, -0.01F, -2.88F)
          lineTo(11.739F, 3.309F)
          close()
          moveTo(10.5F, 4.752F)
          curveToRelative(0.0F, -0.201F, 0.225F, -0.32F, 0.391F, -0.206F)
          lineTo(21.39F, 11.74F)
          curveToRelative(0.144F, 0.1F, 0.145F, 0.312F, 0.001F, 0.412F)
          lineToRelative(-10.498F, 7.301F)
          curveTo(10.727F, 19.57F, 10.5F, 19.45F, 10.5F, 19.248F)
          verticalLineTo(4.753F)
          close()        
      }
    }
    return _nextFrame24!!
  }

private var _nextFrame24: ImageVector? = null
