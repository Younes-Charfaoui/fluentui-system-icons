package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon48: ImageVector
  get() {
    if (_hexagon48 != null) {
      return _hexagon48!!
    }
    _hexagon48 = fluentIcon(name = "Regular.Hexagon48", 48f) {
      materialPath {
          moveTo(15.427F, 8.5F)
          curveToRelative(-0.272F, 0.0F, -0.523F, 0.148F, -0.655F, 0.385F)
          lineToRelative(-8.208F, 14.75F)
          curveToRelative(-0.126F, 0.227F, -0.126F, 0.503F, 0.0F, 0.73F)
          lineToRelative(8.208F, 14.75F)
          curveToRelative(0.132F, 0.237F, 0.383F, 0.385F, 0.655F, 0.385F)
          horizontalLineToRelative(17.148F)
          curveToRelative(0.272F, 0.0F, 0.523F, -0.148F, 0.656F, -0.385F)
          lineToRelative(8.207F, -14.75F)
          curveToRelative(0.126F, -0.227F, 0.126F, -0.503F, 0.0F, -0.73F)
          lineTo(33.23F, 8.885F)
          curveTo(33.098F, 8.648F, 32.847F, 8.5F, 32.575F, 8.5F)
          horizontalLineTo(15.427F)
          close()
          moveToRelative(-2.84F, -0.83F)
          curveTo(13.161F, 6.64F, 14.247F, 6.0F, 15.427F, 6.0F)
          horizontalLineToRelative(17.148F)
          curveToRelative(1.18F, 0.0F, 2.267F, 0.64F, 2.84F, 1.67F)
          lineToRelative(8.208F, 14.75F)
          curveToRelative(0.546F, 0.982F, 0.546F, 2.178F, 0.0F, 3.16F)
          lineToRelative(-8.208F, 14.75F)
          curveToRelative(-0.573F, 1.03F, -1.66F, 1.67F, -2.84F, 1.67F)
          horizontalLineTo(15.427F)
          curveToRelative(-1.18F, 0.0F, -2.266F, -0.64F, -2.84F, -1.67F)
          lineTo(4.38F, 25.58F)
          curveToRelative(-0.547F, -0.982F, -0.547F, -2.178F, 0.0F, -3.16F)
          lineToRelative(8.207F, -14.75F)
          close()        
      }
    }
    return _hexagon48!!
  }

private var _hexagon48: ImageVector? = null
