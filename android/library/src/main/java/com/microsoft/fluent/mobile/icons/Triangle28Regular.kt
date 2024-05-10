package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Triangle28: ImageVector
  get() {
    if (_triangle28 != null) {
      return _triangle28!!
    }
    _triangle28 = fluentIcon(name = "Regular.Triangle28", 28f) {
      materialPath {
          moveTo(12.034F, 4.158F)
          curveToRelative(0.857F, -1.542F, 3.076F, -1.542F, 3.933F, 0.0F)
          lineToRelative(8.965F, 16.127F)
          curveTo(25.858F, 21.952F, 24.653F, 24.0F, 22.747F, 24.0F)
          horizontalLineTo(5.254F)
          curveToRelative(-1.907F, 0.0F, -3.112F, -2.048F, -2.185F, -3.715F)
          lineToRelative(8.965F, -16.127F)
          close()
          moveToRelative(2.622F, 0.729F)
          curveToRelative(-0.286F, -0.514F, -1.025F, -0.514F, -1.311F, 0.0F)
          lineTo(4.38F, 21.014F)
          curveTo(4.009F, 21.681F, 4.49F, 22.5F, 5.254F, 22.5F)
          horizontalLineToRelative(17.493F)
          curveToRelative(0.762F, 0.0F, 1.244F, -0.82F, 0.874F, -1.486F)
          lineTo(14.656F, 4.887F)
          close()        
      }
    }
    return _triangle28!!
  }

private var _triangle28: ImageVector? = null
