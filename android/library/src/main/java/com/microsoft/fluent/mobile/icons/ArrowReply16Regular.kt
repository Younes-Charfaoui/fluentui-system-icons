package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReply16: ImageVector
  get() {
    if (_arrowReply16 != null) {
      return _arrowReply16!!
    }
    _arrowReply16 = fluentIcon(name = "Regular.ArrowReply16", 16f) {
      materialPath {
          moveTo(6.354F, 3.647F)
          curveToRelative(0.195F, 0.195F, 0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(3.707F, 7.0F)
          horizontalLineTo(8.5F)
          curveToRelative(3.038F, 0.0F, 5.5F, 2.462F, 5.5F, 5.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(13.0F, 12.776F, 13.0F, 12.5F)
          curveTo(13.0F, 10.015F, 10.985F, 8.0F, 8.5F, 8.0F)
          horizontalLineTo(3.707F)
          lineToRelative(2.647F, 2.646F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineToRelative(-3.5F, -3.5F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          close()        
      }
    }
    return _arrowReply16!!
  }

private var _arrowReply16: ImageVector? = null
