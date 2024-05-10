package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon16: ImageVector
  get() {
    if (_hexagon16 != null) {
      return _hexagon16!!
    }
    _hexagon16 = fluentIcon(name = "Regular.Hexagon16", 16f) {
      materialPath {
          moveTo(5.4F, 3.0F)
          curveTo(5.22F, 3.0F, 5.055F, 3.095F, 4.965F, 3.25F)
          lineToRelative(-2.6F, 4.5F)
          curveToRelative(-0.089F, 0.155F, -0.089F, 0.345F, 0.0F, 0.5F)
          lineToRelative(2.6F, 4.5F)
          curveTo(5.056F, 12.905F, 5.221F, 13.0F, 5.4F, 13.0F)
          horizontalLineToRelative(5.2F)
          curveToRelative(0.179F, 0.0F, 0.344F, -0.095F, 0.433F, -0.25F)
          lineToRelative(2.6F, -4.5F)
          curveToRelative(0.09F, -0.155F, 0.09F, -0.345F, 0.0F, -0.5F)
          lineToRelative(-2.6F, -4.5F)
          curveTo(10.943F, 3.095F, 10.778F, 3.0F, 10.6F, 3.0F)
          horizontalLineTo(5.4F)
          close()
          moveTo(4.1F, 2.75F)
          curveTo(4.37F, 2.286F, 4.865F, 2.0F, 5.4F, 2.0F)
          horizontalLineToRelative(5.2F)
          curveToRelative(0.535F, 0.0F, 1.03F, 0.286F, 1.298F, 0.75F)
          lineToRelative(2.6F, 4.5F)
          curveToRelative(0.268F, 0.464F, 0.268F, 1.036F, 0.0F, 1.5F)
          lineToRelative(-2.6F, 4.5F)
          curveTo(11.63F, 13.714F, 11.135F, 14.0F, 10.6F, 14.0F)
          horizontalLineTo(5.4F)
          curveToRelative(-0.535F, 0.0F, -1.03F, -0.286F, -1.298F, -0.75F)
          lineToRelative(-2.6F, -4.5F)
          curveToRelative(-0.268F, -0.464F, -0.268F, -1.036F, 0.0F, -1.5F)
          lineToRelative(2.6F, -4.5F)
          close()        
      }
    }
    return _hexagon16!!
  }

private var _hexagon16: ImageVector? = null
