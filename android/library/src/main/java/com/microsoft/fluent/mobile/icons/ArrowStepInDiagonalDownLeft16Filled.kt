package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowStepInDiagonalDownLeft16: ImageVector
  get() {
    if (_arrowStepInDiagonalDownLeft16 != null) {
      return _arrowStepInDiagonalDownLeft16!!
    }
    _arrowStepInDiagonalDownLeft16 = fluentIcon(name = "Filled.ArrowStepInDiagonalDownLeft16", 16f) {
      materialPath {
          moveTo(13.854F, 2.147F)
          curveToRelative(0.195F, 0.195F, 0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(8.707F, 8.0F)
          horizontalLineTo(12.5F)
          curveTo(12.776F, 8.0F, 13.0F, 8.224F, 13.0F, 8.5F)
          reflectiveCurveTo(12.776F, 9.0F, 12.5F, 9.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(7.224F, 9.0F, 7.0F, 8.776F, 7.0F, 8.5F)
          verticalLineToRelative(-5.0F)
          curveTo(7.0F, 3.224F, 7.224F, 3.0F, 7.5F, 3.0F)
          reflectiveCurveTo(8.0F, 3.224F, 8.0F, 3.5F)
          verticalLineToRelative(3.793F)
          lineToRelative(5.146F, -5.146F)
          curveToRelative(0.196F, -0.196F, 0.512F, -0.196F, 0.708F, 0.0F)
          close()
          moveTo(4.0F, 14.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          close()        
      }
    }
    return _arrowStepInDiagonalDownLeft16!!
  }

private var _arrowStepInDiagonalDownLeft16: ImageVector? = null
