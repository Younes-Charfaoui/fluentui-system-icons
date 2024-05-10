package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Video16: ImageVector
  get() {
    if (_video16 != null) {
      return _video16!!
    }
    _video16 = fluentIcon(name = "Regular.Video16", 16f) {
      materialPath {
          moveTo(3.5F, 3.0F)
          curveTo(2.12F, 3.0F, 1.0F, 4.12F, 1.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 11.88F, 2.12F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-0.127F)
          lineToRelative(2.035F, 1.405F)
          curveToRelative(0.83F, 0.573F, 1.96F, -0.02F, 1.96F, -1.028F)
          verticalLineTo(5.252F)
          curveToRelative(0.0F, -1.007F, -1.13F, -1.601F, -1.96F, -1.029F)
          lineTo(11.0F, 5.63F)
          verticalLineTo(5.5F)
          curveTo(11.0F, 4.12F, 9.88F, 3.0F, 8.5F, 3.0F)
          horizontalLineToRelative(-5.0F)
          close()
          moveTo(11.0F, 6.844F)
          lineToRelative(2.604F, -1.798F)
          curveToRelative(0.166F, -0.114F, 0.392F, 0.005F, 0.392F, 0.206F)
          verticalLineToRelative(5.498F)
          curveToRelative(0.0F, 0.201F, -0.226F, 0.32F, -0.392F, 0.205F)
          lineTo(11.0F, 9.158F)
          verticalLineTo(6.844F)
          close()
          moveTo(2.0F, 5.5F)
          curveTo(2.0F, 4.672F, 2.672F, 4.0F, 3.5F, 4.0F)
          horizontalLineToRelative(5.0F)
          curveTo(9.328F, 4.0F, 10.0F, 4.672F, 10.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(2.672F, 12.0F, 2.0F, 11.328F, 2.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          close()        
      }
    }
    return _video16!!
  }

private var _video16: ImageVector? = null
