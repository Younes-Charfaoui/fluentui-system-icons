package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon16: ImageVector
  get() {
    if (_hexagon16 != null) {
      return _hexagon16!!
    }
    _hexagon16 = fluentIcon(name = "Filled.Hexagon16", 16f) {
      materialPath {
          moveTo(5.4F, 2.0F)
          curveTo(4.863F, 2.0F, 4.367F, 2.286F, 4.1F, 2.75F)
          lineToRelative(-2.6F, 4.5F)
          curveToRelative(-0.267F, 0.464F, -0.267F, 1.036F, 0.0F, 1.5F)
          lineToRelative(2.6F, 4.5F)
          curveTo(4.37F, 13.714F, 4.865F, 14.0F, 5.4F, 14.0F)
          horizontalLineToRelative(5.2F)
          curveToRelative(0.535F, 0.0F, 1.03F, -0.286F, 1.298F, -0.75F)
          lineToRelative(2.6F, -4.5F)
          curveToRelative(0.268F, -0.464F, 0.268F, -1.036F, 0.0F, -1.5F)
          lineToRelative(-2.6F, -4.5F)
          curveTo(11.63F, 2.286F, 11.135F, 2.0F, 10.6F, 2.0F)
          horizontalLineTo(5.4F)
          close()        
      }
    }
    return _hexagon16!!
  }

private var _hexagon16: ImageVector? = null
