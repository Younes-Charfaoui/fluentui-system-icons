package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowBidirectionalLeftRight20: ImageVector
  get() {
    if (_arrowBidirectionalLeftRight20 != null) {
      return _arrowBidirectionalLeftRight20!!
    }
    _arrowBidirectionalLeftRight20 = fluentIcon(name = "Regular.ArrowBidirectionalLeftRight20", 20f) {
      materialPath {
          moveTo(7.354F, 5.646F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(4.707F, 9.0F)
          horizontalLineToRelative(10.586F)
          lineToRelative(-2.647F, -2.646F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.707F)
          lineToRelative(-3.5F, 3.5F)
          curveToRelative(-0.196F, 0.196F, -0.512F, 0.196F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.195F, -0.195F, -0.511F, 0.0F, -0.707F)
          lineTo(15.293F, 10.0F)
          horizontalLineTo(4.707F)
          lineToRelative(2.647F, 2.646F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineToRelative(-3.5F, -3.5F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.707F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.196F, -0.196F, 0.512F, -0.196F, 0.708F, 0.0F)
          close()        
      }
    }
    return _arrowBidirectionalLeftRight20!!
  }

private var _arrowBidirectionalLeftRight20: ImageVector? = null
