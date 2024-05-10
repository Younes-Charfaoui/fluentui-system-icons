package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon20: ImageVector
  get() {
    if (_hexagon20 != null) {
      return _hexagon20!!
    }
    _hexagon20 = fluentIcon(name = "Filled.Hexagon20", 20f) {
      materialPath {
          moveTo(6.826F, 3.0F)
          curveToRelative(-0.536F, 0.0F, -1.031F, 0.286F, -1.3F, 0.75F)
          lineToRelative(-3.175F, 5.5F)
          curveToRelative(-0.268F, 0.464F, -0.268F, 1.036F, 0.0F, 1.5F)
          lineToRelative(3.176F, 5.5F)
          curveTo(5.795F, 16.716F, 6.29F, 17.0F, 6.826F, 17.0F)
          horizontalLineToRelative(6.35F)
          curveToRelative(0.536F, 0.0F, 1.031F, -0.285F, 1.3F, -0.75F)
          lineToRelative(3.175F, -5.5F)
          curveToRelative(0.268F, -0.464F, 0.268F, -1.036F, 0.0F, -1.5F)
          lineToRelative(-3.176F, -5.5F)
          curveTo(14.207F, 3.286F, 13.712F, 3.0F, 13.176F, 3.0F)
          horizontalLineToRelative(-6.35F)
          close()        
      }
    }
    return _hexagon20!!
  }

private var _hexagon20: ImageVector? = null
