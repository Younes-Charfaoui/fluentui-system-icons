package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Triangle28: ImageVector
  get() {
    if (_triangle28 != null) {
      return _triangle28!!
    }
    _triangle28 = fluentIcon(name = "Filled.Triangle28", 28f) {
      materialPath {
          moveTo(15.967F, 4.158F)
          curveToRelative(-0.857F, -1.542F, -3.075F, -1.542F, -3.933F, 0.0F)
          lineTo(3.068F, 20.285F)
          curveTo(2.143F, 21.952F, 3.349F, 24.0F, 5.255F, 24.0F)
          horizontalLineToRelative(17.493F)
          curveToRelative(1.906F, 0.0F, 3.111F, -2.048F, 2.185F, -3.715F)
          lineTo(15.967F, 4.158F)
          close()        
      }
    }
    return _triangle28!!
  }

private var _triangle28: ImageVector? = null
