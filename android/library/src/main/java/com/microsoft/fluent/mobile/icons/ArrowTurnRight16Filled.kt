package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowTurnRight16: ImageVector
  get() {
    if (_arrowTurnRight16 != null) {
      return _arrowTurnRight16!!
    }
    _arrowTurnRight16 = fluentIcon(name = "Filled.ArrowTurnRight16", 16f) {
      materialPath {
          moveTo(8.72F, 1.72F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(-3.5F, 3.5F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(2.22F, -2.22F)
          horizontalLineTo(5.75F)
          curveTo(5.06F, 6.5F, 4.5F, 7.06F, 4.5F, 7.75F)
          verticalLineToRelative(5.5F)
          curveTo(4.5F, 13.664F, 4.164F, 14.0F, 3.75F, 14.0F)
          reflectiveCurveTo(3.0F, 13.664F, 3.0F, 13.25F)
          verticalLineToRelative(-5.5F)
          curveTo(3.0F, 6.231F, 4.231F, 5.0F, 5.75F, 5.0F)
          horizontalLineToRelative(5.19F)
          lineTo(8.72F, 2.78F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          close()        
      }
    }
    return _arrowTurnRight16!!
  }

private var _arrowTurnRight16: ImageVector? = null
