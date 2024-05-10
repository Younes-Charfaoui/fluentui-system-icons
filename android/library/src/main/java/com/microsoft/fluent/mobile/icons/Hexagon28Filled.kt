package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon28: ImageVector
  get() {
    if (_hexagon28 != null) {
      return _hexagon28!!
    }
    _hexagon28 = fluentIcon(name = "Filled.Hexagon28", 28f) {
      materialPath {
          moveTo(9.39F, 3.0F)
          curveTo(8.42F, 3.0F, 7.52F, 3.513F, 7.024F, 4.349F)
          lineToRelative(-4.885F, 8.25F)
          curveToRelative(-0.512F, 0.864F, -0.512F, 1.938F, 0.0F, 2.802F)
          lineToRelative(4.885F, 8.25F)
          curveTo(7.519F, 24.487F, 8.419F, 25.0F, 9.39F, 25.0F)
          horizontalLineToRelative(9.22F)
          curveToRelative(0.972F, 0.0F, 1.871F, -0.513F, 2.366F, -1.348F)
          lineToRelative(4.887F, -8.25F)
          curveToRelative(0.512F, -0.865F, 0.512F, -1.94F, 0.0F, -2.804F)
          lineToRelative(-4.887F, -8.25F)
          curveTo(20.481F, 3.513F, 19.582F, 3.0F, 18.61F, 3.0F)
          horizontalLineTo(9.39F)
          close()
          moveToRelative(-7.25F, 9.599F)
          lineToRelative(0.645F, 0.382F)
          lineToRelative(-0.645F, -0.382F)
          close()        
      }
    }
    return _hexagon28!!
  }

private var _hexagon28: ImageVector? = null
