package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.VideoOff16: ImageVector
  get() {
    if (_videoOff16 != null) {
      return _videoOff16!!
    }
    _videoOff16 = fluentIcon(name = "Regular.VideoOff16", 16f) {
      materialPath {
          moveTo(10.792F, 11.5F)
          lineToRelative(3.354F, 3.354F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.355F, 1.354F)
          curveTo(1.617F, 3.593F, 1.0F, 4.475F, 1.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 11.88F, 2.12F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.025F, 0.0F, 1.907F, -0.617F, 2.292F, -1.5F)
          close()
          moveToRelative(-0.804F, -0.805F)
          curveTo(9.892F, 11.43F, 9.262F, 12.0F, 8.5F, 12.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(2.672F, 12.0F, 2.0F, 11.328F, 2.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -0.763F, 0.569F, -1.392F, 1.305F, -1.487F)
          lineToRelative(6.683F, 6.682F)
          close()
          moveTo(10.0F, 5.5F)
          verticalLineToRelative(2.379F)
          lineToRelative(1.0F, 1.0F)
          verticalLineTo(6.844F)
          lineToRelative(2.604F, -1.798F)
          curveToRelative(0.166F, -0.114F, 0.392F, 0.005F, 0.392F, 0.206F)
          verticalLineToRelative(5.498F)
          curveToRelative(0.0F, 0.201F, -0.226F, 0.32F, -0.392F, 0.205F)
          lineTo(11.9F, 9.78F)
          lineToRelative(2.176F, 2.176F)
          curveToRelative(0.508F, -0.142F, 0.919F, -0.6F, 0.919F, -1.206F)
          verticalLineTo(5.252F)
          curveToRelative(0.0F, -1.007F, -1.131F, -1.601F, -1.96F, -1.029F)
          lineTo(11.0F, 5.63F)
          verticalLineTo(5.5F)
          curveTo(11.0F, 4.12F, 9.88F, 3.0F, 8.5F, 3.0F)
          horizontalLineTo(5.121F)
          lineToRelative(1.0F, 1.0F)
          horizontalLineTo(8.5F)
          curveTo(9.328F, 4.0F, 10.0F, 4.672F, 10.0F, 5.5F)
          close()        
      }
    }
    return _videoOff16!!
  }

private var _videoOff16: ImageVector? = null
