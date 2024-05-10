package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon20: ImageVector
  get() {
    if (_hexagon20 != null) {
      return _hexagon20!!
    }
    _hexagon20 = fluentIcon(name = "Regular.Hexagon20", 20f) {
      materialPath {
          moveTo(6.826F, 4.0F)
          curveTo(6.647F, 4.0F, 6.482F, 4.095F, 6.393F, 4.25F)
          lineToRelative(-3.176F, 5.5F)
          curveToRelative(-0.089F, 0.155F, -0.089F, 0.346F, 0.0F, 0.5F)
          lineToRelative(3.176F, 5.5F)
          curveTo(6.482F, 15.906F, 6.647F, 16.0F, 6.826F, 16.0F)
          horizontalLineToRelative(6.35F)
          curveToRelative(0.179F, 0.0F, 0.344F, -0.095F, 0.433F, -0.25F)
          lineToRelative(3.176F, -5.5F)
          curveToRelative(0.089F, -0.154F, 0.089F, -0.345F, 0.0F, -0.5F)
          lineToRelative(-3.176F, -5.5F)
          curveTo(13.52F, 4.095F, 13.355F, 4.0F, 13.176F, 4.0F)
          horizontalLineToRelative(-6.35F)
          close()
          moveToRelative(-1.3F, -0.25F)
          curveTo(5.796F, 3.286F, 6.29F, 3.0F, 6.827F, 3.0F)
          horizontalLineToRelative(6.35F)
          curveToRelative(0.536F, 0.0F, 1.031F, 0.286F, 1.3F, 0.75F)
          lineToRelative(3.175F, 5.5F)
          curveToRelative(0.268F, 0.464F, 0.268F, 1.036F, 0.0F, 1.5F)
          lineToRelative(-3.176F, 5.5F)
          curveToRelative(-0.269F, 0.466F, -0.764F, 0.75F, -1.3F, 0.75F)
          horizontalLineToRelative(-6.35F)
          curveToRelative(-0.536F, 0.0F, -1.031F, -0.285F, -1.3F, -0.75F)
          lineToRelative(-3.175F, -5.5F)
          curveToRelative(-0.268F, -0.464F, -0.268F, -1.036F, 0.0F, -1.5F)
          lineToRelative(3.176F, -5.5F)
          close()        
      }
    }
    return _hexagon20!!
  }

private var _hexagon20: ImageVector? = null
