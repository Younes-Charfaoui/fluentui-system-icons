package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowBidirectionalLeftRight24: ImageVector
  get() {
    if (_arrowBidirectionalLeftRight24 != null) {
      return _arrowBidirectionalLeftRight24!!
    }
    _arrowBidirectionalLeftRight24 = fluentIcon(name = "Filled.ArrowBidirectionalLeftRight24", 24f) {
      materialPath {
          moveTo(9.457F, 6.543F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(6.414F, 11.0F)
          horizontalLineToRelative(11.172F)
          lineToRelative(-3.043F, -3.043F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          lineToRelative(4.75F, 4.75F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineToRelative(-4.75F, 4.75F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          lineTo(17.586F, 13.0F)
          horizontalLineTo(6.414F)
          lineToRelative(3.043F, 3.043F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          lineToRelative(-4.75F, -4.75F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(4.75F, -4.75F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          close()        
      }
    }
    return _arrowBidirectionalLeftRight24!!
  }

private var _arrowBidirectionalLeftRight24: ImageVector? = null
