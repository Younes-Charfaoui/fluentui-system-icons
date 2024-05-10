package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon28: ImageVector
  get() {
    if (_hexagon28 != null) {
      return _hexagon28!!
    }
    _hexagon28 = fluentIcon(name = "Regular.Hexagon28", 28f) {
      materialPath {
          moveTo(9.39F, 4.5F)
          curveToRelative(-0.441F, 0.0F, -0.85F, 0.233F, -1.075F, 0.613F)
          lineToRelative(-4.886F, 8.25F)
          curveToRelative(-0.232F, 0.393F, -0.232F, 0.881F, 0.0F, 1.274F)
          lineToRelative(4.886F, 8.25F)
          curveTo(8.54F, 23.267F, 8.949F, 23.5F, 9.39F, 23.5F)
          horizontalLineToRelative(9.22F)
          curveToRelative(0.442F, 0.0F, 0.85F, -0.233F, 1.076F, -0.613F)
          lineToRelative(4.887F, -8.25F)
          curveToRelative(0.233F, -0.393F, 0.233F, -0.881F, 0.0F, -1.274F)
          lineToRelative(-4.887F, -8.25F)
          curveTo(19.46F, 4.733F, 19.052F, 4.5F, 18.61F, 4.5F)
          horizontalLineTo(9.39F)
          close()
          moveTo(7.024F, 4.349F)
          curveTo(7.519F, 3.513F, 8.419F, 3.0F, 9.39F, 3.0F)
          horizontalLineToRelative(9.22F)
          curveToRelative(0.972F, 0.0F, 1.871F, 0.513F, 2.366F, 1.348F)
          lineToRelative(4.887F, 8.25F)
          curveToRelative(0.512F, 0.865F, 0.512F, 1.94F, 0.0F, 2.804F)
          lineToRelative(-4.887F, 8.25F)
          curveTo(20.481F, 24.487F, 19.582F, 25.0F, 18.61F, 25.0F)
          horizontalLineTo(9.39F)
          curveToRelative(-0.971F, 0.0F, -1.87F, -0.513F, -2.366F, -1.349F)
          lineToRelative(-4.885F, -8.25F)
          curveToRelative(-0.512F, -0.864F, -0.512F, -1.938F, 0.0F, -2.802F)
          lineToRelative(4.885F, -8.25F)
          close()        
      }
    }
    return _hexagon28!!
  }

private var _hexagon28: ImageVector? = null
