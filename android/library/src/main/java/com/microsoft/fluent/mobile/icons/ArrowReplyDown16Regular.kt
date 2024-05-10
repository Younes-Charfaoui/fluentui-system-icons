package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReplyDown16: ImageVector
  get() {
    if (_arrowReplyDown16 != null) {
      return _arrowReplyDown16!!
    }
    _arrowReplyDown16 = fluentIcon(name = "Regular.ArrowReplyDown16", 16f) {
      materialPath {
          moveTo(13.5F, 3.0F)
          curveTo(13.776F, 3.0F, 14.0F, 3.224F, 14.0F, 3.5F)
          curveTo(14.0F, 6.538F, 11.538F, 9.0F, 8.5F, 9.0F)
          horizontalLineTo(3.707F)
          lineToRelative(2.647F, 2.646F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineToRelative(-3.5F, -3.5F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.707F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.196F, -0.196F, 0.512F, -0.196F, 0.708F, 0.0F)
          curveToRelative(0.195F, 0.195F, 0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(3.707F, 8.0F)
          horizontalLineTo(8.5F)
          curveTo(10.985F, 8.0F, 13.0F, 5.985F, 13.0F, 3.5F)
          curveTo(13.0F, 3.224F, 13.224F, 3.0F, 13.5F, 3.0F)
          close()        
      }
    }
    return _arrowReplyDown16!!
  }

private var _arrowReplyDown16: ImageVector? = null
