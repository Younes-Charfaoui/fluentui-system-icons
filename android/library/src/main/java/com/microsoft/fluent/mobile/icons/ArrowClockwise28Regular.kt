package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowClockwise28: ImageVector
  get() {
    if (_arrowClockwise28 != null) {
      return _arrowClockwise28!!
    }
    _arrowClockwise28 = fluentIcon(name = "Regular.ArrowClockwise28", 28f) {
      materialPath {
          moveTo(4.5F, 14.0F)
          curveToRelative(0.0F, -5.247F, 4.253F, -9.5F, 9.5F, -9.5F)
          curveToRelative(2.732F, 0.0F, 5.195F, 1.152F, 6.928F, 3.0F)
          horizontalLineTo(18.25F)
          curveToRelative(-0.414F, 0.0F, -0.75F, 0.336F, -0.75F, 0.75F)
          reflectiveCurveTo(17.836F, 9.0F, 18.25F, 9.0F)
          horizontalLineToRelative(4.0F)
          curveTo(22.664F, 9.0F, 23.0F, 8.664F, 23.0F, 8.25F)
          verticalLineToRelative(-4.0F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          reflectiveCurveTo(21.5F, 3.836F, 21.5F, 4.25F)
          verticalLineToRelative(1.703F)
          curveTo(19.536F, 4.122F, 16.899F, 3.0F, 14.0F, 3.0F)
          curveTo(7.925F, 3.0F, 3.0F, 7.925F, 3.0F, 14.0F)
          reflectiveCurveToRelative(4.925F, 11.0F, 11.0F, 11.0F)
          reflectiveCurveToRelative(11.0F, -4.925F, 11.0F, -11.0F)
          curveToRelative(0.0F, -0.453F, -0.027F, -0.9F, -0.08F, -1.34F)
          curveToRelative(-0.05F, -0.411F, -0.425F, -0.704F, -0.836F, -0.654F)
          curveToRelative(-0.411F, 0.05F, -0.704F, 0.424F, -0.654F, 0.835F)
          curveToRelative(0.046F, 0.38F, 0.07F, 0.766F, 0.07F, 1.159F)
          curveToRelative(0.0F, 5.247F, -4.253F, 9.5F, -9.5F, 9.5F)
          reflectiveCurveTo(4.5F, 19.247F, 4.5F, 14.0F)
          close()        
      }
    }
    return _arrowClockwise28!!
  }

private var _arrowClockwise28: ImageVector? = null
