package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowStepInDiagonalDownLeft28: ImageVector
  get() {
    if (_arrowStepInDiagonalDownLeft28 != null) {
      return _arrowStepInDiagonalDownLeft28!!
    }
    _arrowStepInDiagonalDownLeft28 = fluentIcon(name = "Regular.ArrowStepInDiagonalDownLeft28", 28f) {
      materialPath {
          moveTo(23.78F, 5.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-9.22F, 9.22F)
          verticalLineTo(7.75F)
          curveTo(13.5F, 7.336F, 13.164F, 7.0F, 12.75F, 7.0F)
          reflectiveCurveTo(12.0F, 7.336F, 12.0F, 7.75F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-5.69F)
          lineToRelative(9.22F, -9.22F)
          close()
          moveTo(8.0F, 24.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          reflectiveCurveToRelative(-4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          close()
          moveToRelative(0.0F, -1.5F)
          curveToRelative(-1.38F, 0.0F, -2.5F, -1.12F, -2.5F, -2.5F)
          reflectiveCurveToRelative(1.12F, -2.5F, 2.5F, -2.5F)
          reflectiveCurveToRelative(2.5F, 1.12F, 2.5F, 2.5F)
          reflectiveCurveToRelative(-1.12F, 2.5F, -2.5F, 2.5F)
          close()        
      }
    }
    return _arrowStepInDiagonalDownLeft28!!
  }

private var _arrowStepInDiagonalDownLeft28: ImageVector? = null
