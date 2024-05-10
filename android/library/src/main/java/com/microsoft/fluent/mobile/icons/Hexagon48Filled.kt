package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon48: ImageVector
  get() {
    if (_hexagon48 != null) {
      return _hexagon48!!
    }
    _hexagon48 = fluentIcon(name = "Filled.Hexagon48", 48f) {
      materialPath {
          moveTo(15.427F, 6.0F)
          curveToRelative(-1.18F, 0.0F, -2.266F, 0.64F, -2.84F, 1.67F)
          lineTo(4.38F, 22.42F)
          curveToRelative(-0.547F, 0.982F, -0.547F, 2.178F, 0.0F, 3.16F)
          lineToRelative(8.207F, 14.75F)
          curveToRelative(0.574F, 1.03F, 1.66F, 1.67F, 2.84F, 1.67F)
          horizontalLineToRelative(17.148F)
          curveToRelative(1.18F, 0.0F, 2.267F, -0.64F, 2.84F, -1.67F)
          lineToRelative(8.208F, -14.75F)
          curveToRelative(0.546F, -0.982F, 0.546F, -2.178F, 0.0F, -3.16F)
          lineTo(35.415F, 7.67F)
          curveTo(34.842F, 6.64F, 33.755F, 6.0F, 32.575F, 6.0F)
          horizontalLineTo(15.427F)
          close()        
      }
    }
    return _hexagon48!!
  }

private var _hexagon48: ImageVector? = null
