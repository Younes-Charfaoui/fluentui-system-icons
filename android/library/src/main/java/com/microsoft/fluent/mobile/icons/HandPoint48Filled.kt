package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HandPoint48: ImageVector
  get() {
    if (_handPoint48 != null) {
      return _handPoint48!!
    }
    _handPoint48 = fluentIcon(name = "Filled.HandPoint48", 48f) {
      materialPath {
          moveTo(18.0F, 9.002F)
          curveToRelative(0.0F, -2.762F, 2.24F, -5.0F, 5.0F, -5.0F)
          reflectiveCurveToRelative(5.004F, 2.238F, 5.004F, 5.0F)
          verticalLineToRelative(8.012F)
          lineToRelative(6.201F, 0.988F)
          curveToRelative(5.352F, 0.853F, 8.826F, 6.105F, 7.52F, 11.366F)
          lineToRelative(-2.375F, 9.555F)
          curveToRelative(-0.51F, 2.053F, -2.202F, 3.6F, -4.292F, 3.922F)
          lineToRelative(-7.07F, 1.09F)
          curveToRelative(-2.74F, 0.424F, -5.06F, -1.376F, -6.1F, -3.598F)
          curveToRelative(-1.564F, -3.338F, -5.32F, -7.831F, -16.585F, -12.785F)
          curveToRelative(-1.198F, -0.527F, -1.697F, -2.025F, -0.952F, -3.165F)
          curveToRelative(2.524F, -3.867F, 7.483F, -5.326F, 11.698F, -3.441F)
          lineTo(18.0F, 21.822F)
          verticalLineTo(9.002F)
          close()        
      }
    }
    return _handPoint48!!
  }

private var _handPoint48: ImageVector? = null
