package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowStepInDiagonalDownLeft24: ImageVector
  get() {
    if (_arrowStepInDiagonalDownLeft24 != null) {
      return _arrowStepInDiagonalDownLeft24!!
    }
    _arrowStepInDiagonalDownLeft24 = fluentIcon(name = "Filled.ArrowStepInDiagonalDownLeft24", 24f) {
      materialPath {
          moveTo(19.78F, 4.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-8.22F, 8.22F)
          verticalLineTo(5.75F)
          curveTo(10.5F, 5.336F, 10.164F, 5.0F, 9.75F, 5.0F)
          reflectiveCurveTo(9.0F, 5.336F, 9.0F, 5.75F)
          verticalLineToRelative(7.5F)
          curveTo(9.0F, 13.664F, 9.336F, 14.0F, 9.75F, 14.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-5.69F)
          lineToRelative(8.22F, -8.22F)
          close()
          moveTo(9.0F, 18.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          reflectiveCurveToRelative(-3.0F, -1.343F, -3.0F, -3.0F)
          reflectiveCurveToRelative(1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          close()        
      }
    }
    return _arrowStepInDiagonalDownLeft24!!
  }

private var _arrowStepInDiagonalDownLeft24: ImageVector? = null
