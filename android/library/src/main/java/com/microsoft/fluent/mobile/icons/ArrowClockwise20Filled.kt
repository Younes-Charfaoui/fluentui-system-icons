package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowClockwise20: ImageVector
  get() {
    if (_arrowClockwise20 != null) {
      return _arrowClockwise20!!
    }
    _arrowClockwise20 = fluentIcon(name = "Filled.ArrowClockwise20", 20f) {
      materialPath {
          moveTo(4.0F, 10.0F)
          curveToRelative(0.0F, -3.314F, 2.686F, -6.0F, 6.0F, -6.0F)
          curveToRelative(1.521F, 0.0F, 2.91F, 0.566F, 3.969F, 1.5F)
          horizontalLineTo(12.75F)
          curveTo(12.336F, 5.5F, 12.0F, 5.836F, 12.0F, 6.25F)
          reflectiveCurveTo(12.336F, 7.0F, 12.75F, 7.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          reflectiveCurveTo(15.0F, 2.836F, 15.0F, 3.25F)
          verticalLineToRelative(1.16F)
          curveToRelative(-1.326F, -1.187F, -3.079F, -1.91F, -5.0F, -1.91F)
          curveToRelative(-4.142F, 0.0F, -7.5F, 3.358F, -7.5F, 7.5F)
          curveToRelative(0.0F, 4.142F, 3.358F, 7.5F, 7.5F, 7.5F)
          curveToRelative(4.142F, 0.0F, 7.5F, -3.358F, 7.5F, -7.5F)
          curveToRelative(0.0F, -0.093F, -0.002F, -0.185F, -0.005F, -0.277F)
          curveTo(17.48F, 9.309F, 17.132F, 8.985F, 16.718F, 9.0F)
          curveToRelative(-0.414F, 0.015F, -0.737F, 0.363F, -0.722F, 0.777F)
          curveTo(15.999F, 9.851F, 16.0F, 9.925F, 16.0F, 10.0F)
          curveToRelative(0.0F, 3.314F, -2.686F, 6.0F, -6.0F, 6.0F)
          reflectiveCurveToRelative(-6.0F, -2.686F, -6.0F, -6.0F)
          close()        
      }
    }
    return _arrowClockwise20!!
  }

private var _arrowClockwise20: ImageVector? = null
