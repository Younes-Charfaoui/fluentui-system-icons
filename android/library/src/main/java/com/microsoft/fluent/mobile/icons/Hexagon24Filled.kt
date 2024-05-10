package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon24: ImageVector
  get() {
    if (_hexagon24 != null) {
      return _hexagon24!!
    }
    _hexagon24 = fluentIcon(name = "Filled.Hexagon24", 24f) {
      materialPath {
          moveTo(8.105F, 3.0F)
          curveTo(7.301F, 3.0F, 6.56F, 3.429F, 6.157F, 4.125F)
          lineToRelative(-3.896F, 6.75F)
          curveToRelative(-0.402F, 0.696F, -0.402F, 1.554F, 0.0F, 2.25F)
          lineToRelative(3.896F, 6.75F)
          curveTo(6.559F, 20.57F, 7.3F, 21.0F, 8.105F, 21.0F)
          horizontalLineToRelative(7.79F)
          curveToRelative(0.804F, 0.0F, 1.547F, -0.429F, 1.95F, -1.125F)
          lineToRelative(3.895F, -6.75F)
          curveToRelative(0.401F, -0.696F, 0.401F, -1.554F, 0.0F, -2.25F)
          lineToRelative(-3.896F, -6.75F)
          curveTo(17.442F, 3.43F, 16.7F, 3.0F, 15.895F, 3.0F)
          horizontalLineToRelative(-7.79F)
          close()        
      }
    }
    return _hexagon24!!
  }

private var _hexagon24: ImageVector? = null
