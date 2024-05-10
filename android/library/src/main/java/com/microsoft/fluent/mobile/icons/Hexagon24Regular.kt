package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon24: ImageVector
  get() {
    if (_hexagon24 != null) {
      return _hexagon24!!
    }
    _hexagon24 = fluentIcon(name = "Regular.Hexagon24", 24f) {
      materialPath {
          moveTo(6.157F, 4.125F)
          curveTo(6.559F, 3.43F, 7.3F, 3.0F, 8.105F, 3.0F)
          horizontalLineToRelative(7.79F)
          curveToRelative(0.804F, 0.0F, 1.547F, 0.429F, 1.95F, 1.125F)
          lineToRelative(3.895F, 6.75F)
          curveToRelative(0.401F, 0.696F, 0.401F, 1.554F, 0.0F, 2.25F)
          lineToRelative(-3.896F, 6.75F)
          curveTo(17.442F, 20.57F, 16.7F, 21.0F, 15.895F, 21.0F)
          horizontalLineToRelative(-7.79F)
          curveToRelative(-0.804F, 0.0F, -1.546F, -0.429F, -1.948F, -1.125F)
          lineToRelative(-3.896F, -6.75F)
          curveToRelative(-0.402F, -0.696F, -0.402F, -1.554F, 0.0F, -2.25F)
          lineToRelative(3.896F, -6.75F)
          close()
          moveTo(8.105F, 4.5F)
          curveToRelative(-0.268F, 0.0F, -0.515F, 0.143F, -0.65F, 0.375F)
          lineToRelative(-3.895F, 6.75F)
          curveToRelative(-0.134F, 0.232F, -0.134F, 0.518F, 0.0F, 0.75F)
          lineToRelative(3.896F, 6.75F)
          curveTo(7.59F, 19.357F, 7.837F, 19.5F, 8.106F, 19.5F)
          horizontalLineToRelative(7.79F)
          curveToRelative(0.267F, 0.0F, 0.515F, -0.143F, 0.649F, -0.375F)
          lineToRelative(3.895F, -6.75F)
          curveToRelative(0.134F, -0.232F, 0.134F, -0.518F, 0.0F, -0.75F)
          lineToRelative(-3.895F, -6.75F)
          curveTo(16.41F, 4.643F, 16.163F, 4.5F, 15.895F, 4.5F)
          horizontalLineToRelative(-7.79F)
          close()        
      }
    }
    return _hexagon24!!
  }

private var _hexagon24: ImageVector? = null
