package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HandPoint20: ImageVector
  get() {
    if (_handPoint20 != null) {
      return _handPoint20!!
    }
    _handPoint20 = fluentIcon(name = "Filled.HandPoint20", 20f) {
      materialPath {
          moveTo(10.0F, 1.998F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(5.675F)
          lineTo(6.688F, 8.985F)
          curveToRelative(-1.57F, -0.825F, -3.51F, -0.356F, -4.53F, 1.095F)
          curveToRelative(-0.329F, 0.466F, -0.128F, 1.1F, 0.375F, 1.319F)
          curveToRelative(4.331F, 1.873F, 5.952F, 3.583F, 6.663F, 4.894F)
          curveToRelative(0.546F, 1.003F, 1.617F, 1.86F, 2.906F, 1.681F)
          lineToRelative(2.866F, -0.397F)
          curveToRelative(1.008F, -0.14F, 1.83F, -0.877F, 2.08F, -1.863F)
          lineToRelative(0.823F, -3.253F)
          curveToRelative(0.58F, -2.295F, -0.947F, -4.589F, -3.288F, -4.938F)
          lineTo(12.0F, 7.138F)
          verticalLineToRelative(-3.14F)
          curveToRelative(0.0F, -1.105F, -0.896F, -2.0F, -2.0F, -2.0F)
          close()        
      }
    }
    return _handPoint20!!
  }

private var _handPoint20: ImageVector? = null
