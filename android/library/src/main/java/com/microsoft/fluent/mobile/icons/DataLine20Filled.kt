package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DataLine20: ImageVector
  get() {
    if (_dataLine20 != null) {
      return _dataLine20!!
    }
    _dataLine20 = fluentIcon(name = "Filled.DataLine20", 20f) {
      materialPath {
          moveTo(18.0F, 5.5F)
          curveTo(18.0F, 6.88F, 16.88F, 8.0F, 15.5F, 8.0F)
          curveToRelative(-0.334F, 0.0F, -0.652F, -0.065F, -0.943F, -0.184F)
          lineToRelative(-1.282F, 1.923F)
          curveTo(13.723F, 10.191F, 14.0F, 10.813F, 14.0F, 11.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          curveToRelative(-0.851F, 0.0F, -1.603F, -0.425F, -2.055F, -1.075F)
          lineToRelative(-2.496F, 1.07F)
          curveTo(6.982F, 14.158F, 7.0F, 14.327F, 7.0F, 14.5F)
          curveTo(7.0F, 15.88F, 5.88F, 17.0F, 4.5F, 17.0F)
          reflectiveCurveTo(2.0F, 15.88F, 2.0F, 14.5F)
          reflectiveCurveTo(3.12F, 12.0F, 4.5F, 12.0F)
          curveToRelative(0.851F, 0.0F, 1.603F, 0.425F, 2.055F, 1.075F)
          lineToRelative(2.496F, -1.07F)
          curveTo(9.018F, 11.842F, 9.0F, 11.673F, 9.0F, 11.5F)
          curveTo(9.0F, 10.12F, 10.12F, 9.0F, 11.5F, 9.0F)
          curveToRelative(0.334F, 0.0F, 0.652F, 0.065F, 0.943F, 0.184F)
          lineToRelative(1.282F, -1.923F)
          curveTo(13.277F, 6.809F, 13.0F, 6.187F, 13.0F, 5.5F)
          curveTo(13.0F, 4.12F, 14.12F, 3.0F, 15.5F, 3.0F)
          reflectiveCurveTo(18.0F, 4.12F, 18.0F, 5.5F)
          close()        
      }
    }
    return _dataLine20!!
  }

private var _dataLine20: ImageVector? = null