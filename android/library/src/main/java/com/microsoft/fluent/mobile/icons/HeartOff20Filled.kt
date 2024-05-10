package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HeartOff20: ImageVector
  get() {
    if (_heartOff20 != null) {
      return _heartOff20!!
    }
    _heartOff20 = fluentIcon(name = "Filled.HeartOff20", 20f) {
      materialPath {
          moveTo(2.853F, 2.147F)
          curveToRelative(-0.195F, -0.196F, -0.511F, -0.196F, -0.707F, 0.0F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.511F, 0.0F, 0.707F)
          lineToRelative(1.271F, 1.27F)
          curveToRelative(-0.053F, 0.049F, -0.105F, 0.098F, -0.156F, 0.15F)
          curveToRelative(-1.688F, 1.705F, -1.68F, 4.476F, 0.016F, 6.189F)
          lineToRelative(6.277F, 6.34F)
          curveToRelative(0.26F, 0.263F, 0.682F, 0.263F, 0.942F, 0.0F)
          lineToRelative(2.787F, -2.813F)
          lineToRelative(3.863F, 3.864F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-15.0F, -15.0F)
          close()
          moveToRelative(13.888F, 8.352F)
          lineToRelative(-2.05F, 2.07F)
          lineToRelative(-9.438F, -9.437F)
          curveTo(6.684F, 2.769F, 8.266F, 3.156F, 9.388F, 4.29F)
          lineTo(9.993F, 4.9F)
          lineToRelative(0.596F, -0.603F)
          curveToRelative(1.692F, -1.709F, 4.436F, -1.7F, 6.135F, 0.016F)
          curveToRelative(1.696F, 1.713F, 1.701F, 4.476F, 0.017F, 6.186F)
          close()        
      }
    }
    return _heartOff20!!
  }

private var _heartOff20: ImageVector? = null
