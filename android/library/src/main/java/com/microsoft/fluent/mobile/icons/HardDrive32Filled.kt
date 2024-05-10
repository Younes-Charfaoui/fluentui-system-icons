package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HardDrive32: ImageVector
  get() {
    if (_hardDrive32 != null) {
      return _hardDrive32!!
    }
    _hardDrive32 = fluentIcon(name = "Filled.HardDrive32", 32f) {
      materialPath {
          moveTo(9.89F, 5.0F)
          curveTo(8.66F, 5.0F, 7.535F, 5.696F, 6.985F, 6.797F)
          lineToRelative(-3.817F, 7.632F)
          curveTo(3.806F, 14.153F, 4.51F, 14.0F, 5.25F, 14.0F)
          horizontalLineToRelative(21.5F)
          curveToRelative(0.74F, 0.0F, 1.444F, 0.153F, 2.083F, 0.43F)
          lineToRelative(-3.817F, -7.633F)
          curveTo(24.466F, 5.696F, 23.34F, 5.0F, 22.11F, 5.0F)
          horizontalLineTo(9.891F)
          close()
          moveTo(2.0F, 19.25F)
          curveToRelative(0.0F, -0.084F, 0.003F, -0.168F, 0.01F, -0.25F)
          curveToRelative(0.127F, -1.678F, 1.53F, -3.0F, 3.24F, -3.0F)
          horizontalLineToRelative(21.5F)
          curveToRelative(1.71F, 0.0F, 3.113F, 1.322F, 3.24F, 3.0F)
          curveToRelative(0.007F, 0.082F, 0.01F, 0.166F, 0.01F, 0.25F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 26.0F, 2.0F, 24.545F, 2.0F, 22.75F)
          verticalLineToRelative(-3.5F)
          close()
          moveToRelative(23.5F, 3.0F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          reflectiveCurveToRelative(-1.25F, 0.56F, -1.25F, 1.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          close()        
      }
    }
    return _hardDrive32!!
  }

private var _hardDrive32: ImageVector? = null
