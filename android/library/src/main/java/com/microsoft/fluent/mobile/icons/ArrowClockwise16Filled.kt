package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowClockwise16: ImageVector
  get() {
    if (_arrowClockwise16 != null) {
      return _arrowClockwise16!!
    }
    _arrowClockwise16 = fluentIcon(name = "Filled.ArrowClockwise16", 16f) {
      materialPath {
          moveTo(3.5F, 8.0F)
          curveToRelative(0.0F, -2.485F, 2.015F, -4.5F, 4.5F, -4.5F)
          curveToRelative(1.332F, 0.0F, 2.53F, 0.579F, 3.354F, 1.5F)
          horizontalLineTo(9.75F)
          curveTo(9.336F, 5.0F, 9.0F, 5.336F, 9.0F, 5.75F)
          reflectiveCurveTo(9.336F, 6.5F, 9.75F, 6.5F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.0F)
          curveTo(13.5F, 2.336F, 13.164F, 2.0F, 12.75F, 2.0F)
          reflectiveCurveTo(12.0F, 2.336F, 12.0F, 2.75F)
          verticalLineToRelative(0.778F)
          curveTo(10.939F, 2.578F, 9.537F, 2.0F, 8.0F, 2.0F)
          curveTo(4.686F, 2.0F, 2.0F, 4.686F, 2.0F, 8.0F)
          reflectiveCurveToRelative(2.686F, 6.0F, 6.0F, 6.0F)
          curveToRelative(3.025F, 0.0F, 5.526F, -2.238F, 5.94F, -5.148F)
          curveToRelative(0.058F, -0.41F, -0.227F, -0.79F, -0.637F, -0.848F)
          curveToRelative(-0.41F, -0.059F, -0.79F, 0.226F, -0.848F, 0.637F)
          curveTo(12.145F, 10.822F, 10.267F, 12.5F, 8.0F, 12.5F)
          curveToRelative(-2.485F, 0.0F, -4.5F, -2.015F, -4.5F, -4.5F)
          close()        
      }
    }
    return _arrowClockwise16!!
  }

private var _arrowClockwise16: ImageVector? = null
