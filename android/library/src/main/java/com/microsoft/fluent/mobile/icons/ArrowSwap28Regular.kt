package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSwap28: ImageVector
  get() {
    if (_arrowSwap28 != null) {
      return _arrowSwap28!!
    }
    _arrowSwap28 = fluentIcon(name = "Regular.ArrowSwap28", 28f) {
      materialPath {
          moveTo(17.78F, 2.72F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(3.72F, 3.72F)
          horizontalLineTo(5.75F)
          curveTo(5.336F, 7.5F, 5.0F, 7.836F, 5.0F, 8.25F)
          reflectiveCurveTo(5.336F, 9.0F, 5.75F, 9.0F)
          horizontalLineToRelative(14.69F)
          lineToRelative(-3.72F, 3.72F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(5.0F, -5.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-5.0F, -5.0F)
          close()
          moveToRelative(-6.5F, 12.56F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-5.0F, 5.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(5.0F, 5.0F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(7.56F, 20.5F)
          horizontalLineToRelative(14.69F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(22.664F, 19.0F, 22.25F, 19.0F)
          horizontalLineTo(7.56F)
          lineToRelative(3.72F, -3.72F)
          close()        
      }
    }
    return _arrowSwap28!!
  }

private var _arrowSwap28: ImageVector? = null
