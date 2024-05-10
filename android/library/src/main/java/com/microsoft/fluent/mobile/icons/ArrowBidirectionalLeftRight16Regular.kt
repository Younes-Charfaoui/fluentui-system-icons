package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowBidirectionalLeftRight16: ImageVector
  get() {
    if (_arrowBidirectionalLeftRight16 != null) {
      return _arrowBidirectionalLeftRight16!!
    }
    _arrowBidirectionalLeftRight16 = fluentIcon(name = "Regular.ArrowBidirectionalLeftRight16", 16f) {
      materialPath {
          moveTo(2.147F, 8.854F)
          curveToRelative(-0.196F, -0.196F, -0.196F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.195F, -0.195F, 0.511F, -0.195F, 0.707F, 0.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(3.707F, 8.0F)
          horizontalLineToRelative(8.586F)
          lineToRelative(-2.147F, -2.146F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(3.0F, 3.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.707F)
          lineToRelative(-3.0F, 3.0F)
          curveToRelative(-0.196F, 0.196F, -0.512F, 0.196F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.195F, -0.195F, -0.511F, 0.0F, -0.707F)
          lineTo(12.293F, 9.0F)
          horizontalLineTo(3.707F)
          lineToRelative(2.147F, 2.146F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.707F)
          curveToRelative(-0.196F, 0.196F, -0.512F, 0.196F, -0.708F, 0.0F)
          lineToRelative(-3.0F, -3.0F)
          close()        
      }
    }
    return _arrowBidirectionalLeftRight16!!
  }

private var _arrowBidirectionalLeftRight16: ImageVector? = null
