package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowTurnRight16: ImageVector
  get() {
    if (_arrowTurnRight16 != null) {
      return _arrowTurnRight16!!
    }
    _arrowTurnRight16 = fluentIcon(name = "Regular.ArrowTurnRight16", 16f) {
      materialPath {
          moveTo(8.646F, 1.647F)
          curveToRelative(0.196F, -0.196F, 0.512F, -0.196F, 0.707F, 0.0F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.196F, 0.195F, 0.196F, 0.511F, 0.0F, 0.707F)
          lineToRelative(-3.5F, 3.5F)
          curveToRelative(-0.195F, 0.195F, -0.511F, 0.195F, -0.707F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.707F)
          lineTo(11.293F, 6.0F)
          horizontalLineTo(5.5F)
          curveTo(4.672F, 6.0F, 4.0F, 6.672F, 4.0F, 7.5F)
          verticalLineToRelative(6.0F)
          curveTo(4.0F, 13.776F, 3.776F, 14.0F, 3.5F, 14.0F)
          reflectiveCurveTo(3.0F, 13.776F, 3.0F, 13.5F)
          verticalLineToRelative(-6.0F)
          curveTo(3.0F, 6.12F, 4.12F, 5.0F, 5.5F, 5.0F)
          horizontalLineToRelative(5.793F)
          lineTo(8.647F, 2.353F)
          curveToRelative(-0.196F, -0.195F, -0.196F, -0.511F, 0.0F, -0.707F)
          close()        
      }
    }
    return _arrowTurnRight16!!
  }

private var _arrowTurnRight16: ImageVector? = null
