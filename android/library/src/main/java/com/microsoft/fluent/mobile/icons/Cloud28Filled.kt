package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Cloud28: ImageVector
  get() {
    if (_cloud28 != null) {
      return _cloud28!!
    }
    _cloud28 = fluentIcon(name = "Filled.Cloud28", 28f) {
      materialPath {
          moveTo(14.0F, 5.0F)
          curveToRelative(-3.532F, 0.0F, -6.453F, 2.616F, -6.931F, 6.017F)
          curveTo(4.233F, 11.237F, 2.0F, 13.607F, 2.0F, 16.5F)
          curveTo(2.0F, 19.538F, 4.462F, 22.0F, 7.5F, 22.0F)
          horizontalLineToRelative(13.0F)
          curveToRelative(3.038F, 0.0F, 5.5F, -2.462F, 5.5F, -5.5F)
          curveToRelative(0.0F, -2.892F, -2.233F, -5.263F, -5.069F, -5.483F)
          curveTo(20.453F, 7.616F, 17.532F, 5.0F, 14.0F, 5.0F)
          close()        
      }
    }
    return _cloud28!!
  }

private var _cloud28: ImageVector? = null
