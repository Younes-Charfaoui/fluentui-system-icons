package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BeakerEmpty16: ImageVector
  get() {
    if (_beakerEmpty16 != null) {
      return _beakerEmpty16!!
    }
    _beakerEmpty16 = fluentIcon(name = "Filled.BeakerEmpty16", 16f) {
      materialPath {
          moveTo(12.56F, 11.74F)
          lineTo(10.95F, 9.0F)
          lineToRelative(-0.61F, -1.05F)
          curveTo(10.12F, 7.57F, 10.0F, 7.13F, 10.0F, 6.69F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(0.5F)
          curveTo(10.78F, 3.0F, 11.0F, 2.78F, 11.0F, 2.5F)
          reflectiveCurveTo(10.78F, 2.0F, 10.5F, 2.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(5.22F, 2.0F, 5.0F, 2.22F, 5.0F, 2.5F)
          reflectiveCurveTo(5.22F, 3.0F, 5.5F, 3.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(3.69F)
          curveToRelative(0.0F, 0.44F, -0.12F, 0.88F, -0.34F, 1.26F)
          lineTo(5.05F, 9.0F)
          lineToRelative(-1.61F, 2.74F)
          curveToRelative(-0.58F, 1.0F, 0.14F, 2.26F, 1.3F, 2.26F)
          horizontalLineToRelative(6.52F)
          curveToRelative(1.16F, 0.0F, 1.88F, -1.26F, 1.3F, -2.26F)
          close()        
      }
    }
    return _beakerEmpty16!!
  }

private var _beakerEmpty16: ImageVector? = null
