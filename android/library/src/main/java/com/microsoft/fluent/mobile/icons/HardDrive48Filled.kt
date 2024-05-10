package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HardDrive48: ImageVector
  get() {
    if (_hardDrive48 != null) {
      return _hardDrive48!!
    }
    _hardDrive48 = fluentIcon(name = "Filled.HardDrive48", 48f) {
      materialPath {
          moveTo(15.117F, 9.0F)
          curveToRelative(-1.62F, 0.0F, -3.098F, 0.92F, -3.813F, 2.373F)
          lineTo(6.155F, 21.83F)
          curveToRelative(0.66F, -0.214F, 1.365F, -0.33F, 2.095F, -0.33F)
          horizontalLineToRelative(31.5F)
          curveToRelative(0.731F, 0.0F, 1.435F, 0.116F, 2.095F, 0.331F)
          lineToRelative(-5.149F, -10.458F)
          curveTo(35.981F, 9.92F, 34.502F, 9.0F, 32.883F, 9.0F)
          horizontalLineTo(15.117F)
          close()
          moveTo(4.0F, 28.25F)
          verticalLineToRelative(6.5F)
          curveTo(4.0F, 37.097F, 5.903F, 39.0F, 8.25F, 39.0F)
          horizontalLineToRelative(31.5F)
          curveToRelative(2.347F, 0.0F, 4.25F, -1.903F, 4.25F, -4.25F)
          verticalLineToRelative(-6.5F)
          curveToRelative(0.0F, -2.347F, -1.903F, -4.25F, -4.25F, -4.25F)
          horizontalLineTo(8.25F)
          curveTo(5.903F, 24.0F, 4.0F, 25.903F, 4.0F, 28.25F)
          close()
          moveToRelative(34.5F, 3.25F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()        
      }
    }
    return _hardDrive48!!
  }

private var _hardDrive48: ImageVector? = null
