package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReplyDown20: ImageVector
  get() {
    if (_arrowReplyDown20 != null) {
      return _arrowReplyDown20!!
    }
    _arrowReplyDown20 = fluentIcon(name = "Regular.ArrowReplyDown20", 20f) {
      materialPath {
          moveTo(17.5F, 4.0F)
          curveTo(17.776F, 4.0F, 18.0F, 4.224F, 18.0F, 4.5F)
          curveToRelative(0.0F, 4.142F, -3.358F, 7.5F, -7.5F, 7.5F)
          horizontalLineTo(3.707F)
          lineToRelative(3.647F, 3.646F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineToRelative(-4.5F, -4.5F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(4.5F, -4.5F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(3.707F, 11.0F)
          horizontalLineTo(10.5F)
          curveToRelative(3.59F, 0.0F, 6.5F, -2.91F, 6.5F, -6.5F)
          curveTo(17.0F, 4.224F, 17.224F, 4.0F, 17.5F, 4.0F)
          close()        
      }
    }
    return _arrowReplyDown20!!
  }

private var _arrowReplyDown20: ImageVector? = null
