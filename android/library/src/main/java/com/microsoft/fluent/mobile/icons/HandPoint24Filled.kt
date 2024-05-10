package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HandPoint24: ImageVector
  get() {
    if (_handPoint24 != null) {
      return _handPoint24!!
    }
    _handPoint24 = fluentIcon(name = "Filled.HandPoint24", 24f) {
      materialPath {
          moveTo(11.5F, 2.0F)
          curveTo(10.12F, 2.0F, 9.0F, 3.12F, 9.0F, 4.5F)
          verticalLineToRelative(6.41F)
          lineToRelative(-1.495F, -0.574F)
          curveToRelative(-2.04F, -0.785F, -4.346F, 0.07F, -5.382F, 1.996F)
          curveToRelative(-0.301F, 0.558F, -0.035F, 1.226F, 0.512F, 1.463F)
          curveToRelative(5.662F, 2.456F, 7.454F, 4.673F, 8.19F, 6.29F)
          curveToRelative(0.526F, 1.156F, 1.73F, 2.104F, 3.172F, 1.882F)
          lineToRelative(3.455F, -0.533F)
          curveToRelative(1.096F, -0.169F, 1.982F, -0.978F, 2.25F, -2.054F)
          lineToRelative(1.153F, -4.633F)
          curveToRelative(0.673F, -2.705F, -1.118F, -5.406F, -3.872F, -5.839F)
          lineTo(14.0F, 8.44F)
          verticalLineTo(4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          close()        
      }
    }
    return _handPoint24!!
  }

private var _handPoint24: ImageVector? = null
