package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowCounterclockwise16: ImageVector
  get() {
    if (_arrowCounterclockwise16 != null) {
      return _arrowCounterclockwise16!!
    }
    _arrowCounterclockwise16 = fluentIcon(name = "Filled.ArrowCounterclockwise16", 16f) {
      materialPath {
          moveTo(12.5F, 8.0F)
          curveToRelative(0.0F, -2.485F, -2.014F, -4.5F, -4.5F, -4.5F)
          curveToRelative(-1.332F, 0.0F, -2.53F, 0.579F, -3.354F, 1.5F)
          horizontalLineTo(6.25F)
          curveTo(6.664F, 5.0F, 7.0F, 5.336F, 7.0F, 5.75F)
          reflectiveCurveTo(6.664F, 6.5F, 6.25F, 6.5F)
          horizontalLineToRelative(-3.0F)
          curveTo(2.836F, 6.5F, 2.5F, 6.164F, 2.5F, 5.75F)
          verticalLineToRelative(-3.0F)
          curveTo(2.5F, 2.336F, 2.836F, 2.0F, 3.25F, 2.0F)
          reflectiveCurveTo(4.0F, 2.336F, 4.0F, 2.75F)
          verticalLineToRelative(0.778F)
          curveTo(5.061F, 2.578F, 6.463F, 2.0F, 8.0F, 2.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          reflectiveCurveToRelative(-2.686F, 6.0F, -6.0F, 6.0F)
          curveToRelative(-3.025F, 0.0F, -5.526F, -2.238F, -5.94F, -5.148F)
          curveToRelative(-0.058F, -0.41F, 0.227F, -0.79F, 0.637F, -0.848F)
          curveToRelative(0.41F, -0.059F, 0.79F, 0.226F, 0.848F, 0.637F)
          curveTo(3.855F, 10.822F, 5.733F, 12.5F, 8.0F, 12.5F)
          curveToRelative(2.486F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          close()        
      }
    }
    return _arrowCounterclockwise16!!
  }

private var _arrowCounterclockwise16: ImageVector? = null
