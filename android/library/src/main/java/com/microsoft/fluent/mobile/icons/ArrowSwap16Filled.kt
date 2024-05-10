package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowSwap16: ImageVector
  get() {
    if (_arrowSwap16 != null) {
      return _arrowSwap16!!
    }
    _arrowSwap16 = fluentIcon(name = "Filled.ArrowSwap16", 16f) {
      materialPath {
          moveTo(10.28F, 1.72F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineTo(10.44F, 4.0F)
          horizontalLineTo(3.75F)
          curveTo(3.336F, 4.0F, 3.0F, 4.336F, 3.0F, 4.75F)
          reflectiveCurveTo(3.336F, 5.5F, 3.75F, 5.5F)
          horizontalLineToRelative(6.69F)
          lineTo(9.22F, 6.72F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(2.5F, -2.5F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-2.5F, -2.5F)
          close()
          moveToRelative(-3.5F, 7.56F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-2.5F, 2.5F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(2.5F, 2.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(5.56F, 12.0F)
          horizontalLineToRelative(6.69F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(5.56F)
          lineToRelative(1.22F, -1.22F)
          close()        
      }
    }
    return _arrowSwap16!!
  }

private var _arrowSwap16: ImageVector? = null
