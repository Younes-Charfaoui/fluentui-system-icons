package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowCounterclockwise20: ImageVector
  get() {
    if (_arrowCounterclockwise20 != null) {
      return _arrowCounterclockwise20!!
    }
    _arrowCounterclockwise20 = fluentIcon(name = "Filled.ArrowCounterclockwise20", 20f) {
      materialPath {
          moveTo(16.0F, 10.0F)
          curveToRelative(0.0F, -3.314F, -2.686F, -6.0F, -6.0F, -6.0F)
          curveToRelative(-1.521F, 0.0F, -2.91F, 0.566F, -3.969F, 1.5F)
          horizontalLineTo(7.25F)
          curveTo(7.664F, 5.5F, 8.0F, 5.836F, 8.0F, 6.25F)
          reflectiveCurveTo(7.664F, 7.0F, 7.25F, 7.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(3.836F, 7.0F, 3.5F, 6.664F, 3.5F, 6.25F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          reflectiveCurveTo(5.0F, 2.836F, 5.0F, 3.25F)
          verticalLineToRelative(1.16F)
          curveTo(6.326F, 3.223F, 8.079F, 2.5F, 10.0F, 2.5F)
          curveToRelative(4.142F, 0.0F, 7.5F, 3.358F, 7.5F, 7.5F)
          curveToRelative(0.0F, 4.142F, -3.358F, 7.5F, -7.5F, 7.5F)
          curveToRelative(-4.142F, 0.0F, -7.5F, -3.358F, -7.5F, -7.5F)
          curveToRelative(0.0F, -0.093F, 0.002F, -0.185F, 0.005F, -0.277F)
          curveTo(2.52F, 9.309F, 2.868F, 8.985F, 3.282F, 9.0F)
          curveToRelative(0.414F, 0.015F, 0.737F, 0.363F, 0.722F, 0.777F)
          curveTo(4.001F, 9.851F, 4.0F, 9.925F, 4.0F, 10.0F)
          curveToRelative(0.0F, 3.314F, 2.686F, 6.0F, 6.0F, 6.0F)
          reflectiveCurveToRelative(6.0F, -2.686F, 6.0F, -6.0F)
          close()        
      }
    }
    return _arrowCounterclockwise20!!
  }

private var _arrowCounterclockwise20: ImageVector? = null
