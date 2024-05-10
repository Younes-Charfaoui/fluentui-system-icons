package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.BeakerEmpty16: ImageVector
  get() {
    if (_beakerEmpty16 != null) {
      return _beakerEmpty16!!
    }
    _beakerEmpty16 = fluentIcon(name = "Regular.BeakerEmpty16", 16f) {
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
          moveTo(11.26F, 13.0F)
          horizontalLineTo(4.74F)
          curveToRelative(-0.39F, 0.0F, -0.63F, -0.42F, -0.43F, -0.75F)
          lineTo(5.62F, 10.0F)
          lineTo(6.2F, 9.0F)
          lineToRelative(0.32F, -0.55F)
          curveTo(6.84F, 7.92F, 7.0F, 7.31F, 7.0F, 6.69F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(3.69F)
          curveToRelative(0.0F, 0.62F, 0.16F, 1.23F, 0.48F, 1.76F)
          lineTo(9.8F, 9.0F)
          lineToRelative(0.58F, 1.0F)
          lineToRelative(1.31F, 2.25F)
          curveToRelative(0.19F, 0.33F, -0.05F, 0.75F, -0.43F, 0.75F)
          close()        
      }
    }
    return _beakerEmpty16!!
  }

private var _beakerEmpty16: ImageVector? = null
