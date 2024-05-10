package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReplyAll16: ImageVector
  get() {
    if (_arrowReplyAll16 != null) {
      return _arrowReplyAll16!!
    }
    _arrowReplyAll16 = fluentIcon(name = "Regular.ArrowReplyAll16", 16f) {
      materialPath {
          moveTo(6.354F, 3.647F)
          curveToRelative(0.195F, 0.195F, 0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(3.207F, 7.5F)
          lineToRelative(3.147F, 3.146F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineToRelative(-3.5F, -3.5F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          close()
          moveToRelative(3.0F, 0.0F)
          curveToRelative(0.195F, 0.195F, 0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(6.707F, 7.0F)
          horizontalLineTo(9.5F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(13.0F, 12.776F, 13.0F, 12.5F)
          verticalLineToRelative(-1.0F)
          curveTo(13.0F, 9.567F, 11.433F, 8.0F, 9.5F, 8.0F)
          horizontalLineTo(6.707F)
          lineToRelative(2.647F, 2.646F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.707F, 0.0F)
          lineToRelative(-3.5F, -3.5F)
          curveToRelative(-0.196F, -0.196F, -0.196F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.195F, -0.195F, 0.511F, -0.195F, 0.707F, 0.0F)
          close()        
      }
    }
    return _arrowReplyAll16!!
  }

private var _arrowReplyAll16: ImageVector? = null
