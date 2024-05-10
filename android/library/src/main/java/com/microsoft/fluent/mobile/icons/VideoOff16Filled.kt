package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoOff16: ImageVector
  get() {
    if (_videoOff16 != null) {
      return _videoOff16!!
    }
    _videoOff16 = fluentIcon(name = "Filled.VideoOff16", 16f) {
      materialPath {
          moveTo(9.992F, 10.7F)
          lineToRelative(4.154F, 4.154F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.355F, 1.354F)
          curveTo(1.617F, 3.593F, 1.0F, 4.475F, 1.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 11.88F, 2.12F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(1.314F, 0.0F, 2.39F, -1.013F, 2.492F, -2.3F)
          close()
          moveToRelative(0.928F, -1.902F)
          lineToRelative(3.157F, 3.158F)
          curveToRelative(0.508F, -0.142F, 0.919F, -0.6F, 0.919F, -1.206F)
          verticalLineTo(5.252F)
          curveToRelative(0.0F, -1.007F, -1.131F, -1.601F, -1.96F, -1.029F)
          lineTo(10.9F, 5.698F)
          curveToRelative(0.013F, 0.092F, 0.02F, 0.187F, 0.02F, 0.282F)
          verticalLineToRelative(2.818F)
          close()
          moveTo(5.12F, 3.0F)
          lineTo(10.0F, 7.879F)
          verticalLineTo(5.5F)
          curveTo(10.0F, 4.12F, 8.88F, 3.0F, 7.5F, 3.0F)
          horizontalLineTo(5.121F)
          close()        
      }
    }
    return _videoOff16!!
  }

private var _videoOff16: ImageVector? = null
