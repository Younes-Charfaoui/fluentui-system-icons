package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowTurnUpLeft48: ImageVector
  get() {
    if (_arrowTurnUpLeft48 != null) {
      return _arrowTurnUpLeft48!!
    }
    _arrowTurnUpLeft48 = fluentIcon(name = "Filled.ArrowTurnUpLeft48", 48f) {
      materialPath {
          moveTo(35.0F, 40.5F)
          curveToRelative(0.0F, 0.828F, 0.672F, 1.5F, 1.5F, 1.5F)
          reflectiveCurveToRelative(1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-18.0F)
          curveToRelative(0.0F, -4.142F, -3.358F, -7.5F, -7.5F, -7.5F)
          horizontalLineTo(13.121F)
          lineToRelative(6.44F, -6.44F)
          curveToRelative(0.585F, -0.585F, 0.585F, -1.535F, 0.0F, -2.12F)
          curveToRelative(-0.586F, -0.587F, -1.536F, -0.587F, -2.122F, 0.0F)
          lineToRelative(-9.0F, 9.0F)
          curveToRelative(-0.585F, 0.585F, -0.585F, 1.535F, 0.0F, 2.12F)
          lineToRelative(9.0F, 9.0F)
          curveToRelative(0.586F, 0.586F, 1.536F, 0.586F, 2.122F, 0.0F)
          curveToRelative(0.585F, -0.585F, 0.585F, -1.535F, 0.0F, -2.12F)
          lineTo(13.12F, 18.0F)
          horizontalLineTo(30.5F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(18.0F)
          close()        
      }
    }
    return _arrowTurnUpLeft48!!
  }

private var _arrowTurnUpLeft48: ImageVector? = null
