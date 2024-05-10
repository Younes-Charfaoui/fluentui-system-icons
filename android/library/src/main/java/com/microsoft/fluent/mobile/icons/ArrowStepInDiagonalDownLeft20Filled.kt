package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowStepInDiagonalDownLeft20: ImageVector
  get() {
    if (_arrowStepInDiagonalDownLeft20 != null) {
      return _arrowStepInDiagonalDownLeft20!!
    }
    _arrowStepInDiagonalDownLeft20 = fluentIcon(name = "Filled.ArrowStepInDiagonalDownLeft20", 20f) {
      materialPath {
          moveTo(16.854F, 3.147F)
          curveToRelative(0.195F, 0.195F, 0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(9.707F, 11.0F)
          horizontalLineTo(14.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(14.776F, 12.0F, 14.5F, 12.0F)
          horizontalLineTo(8.476F)
          curveToRelative(-0.057F, -0.003F, -0.114F, -0.016F, -0.167F, -0.038F)
          curveToRelative(-0.06F, -0.024F, -0.115F, -0.06F, -0.162F, -0.108F)
          curveToRelative(-0.049F, -0.048F, -0.085F, -0.104F, -0.11F, -0.163F)
          curveTo(8.014F, 11.632F, 8.0F, 11.568F, 8.0F, 11.5F)
          verticalLineToRelative(-6.0F)
          curveTo(8.0F, 5.224F, 8.224F, 5.0F, 8.5F, 5.0F)
          reflectiveCurveTo(9.0F, 5.224F, 9.0F, 5.5F)
          verticalLineToRelative(4.793F)
          lineToRelative(7.146F, -7.146F)
          curveToRelative(0.196F, -0.196F, 0.512F, -0.196F, 0.708F, 0.0F)
          close()
          moveTo(5.0F, 17.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          close()        
      }
    }
    return _arrowStepInDiagonalDownLeft20!!
  }

private var _arrowStepInDiagonalDownLeft20: ImageVector? = null
