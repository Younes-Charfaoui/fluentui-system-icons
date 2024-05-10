package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoOff20: ImageVector
  get() {
    if (_videoOff20 != null) {
      return _videoOff20!!
    }
    _videoOff20 = fluentIcon(name = "Filled.VideoOff20", 20f) {
      materialPath {
          moveTo(2.853F, 2.147F)
          curveToRelative(-0.195F, -0.196F, -0.511F, -0.196F, -0.707F, 0.0F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.511F, 0.0F, 0.707F)
          lineToRelative(1.48F, 1.479F)
          curveTo(2.66F, 4.83F, 2.0F, 5.838F, 2.0F, 7.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.438F, 0.0F, 2.639F, -1.011F, 2.932F, -2.361F)
          lineToRelative(4.214F, 4.215F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-15.0F, -15.0F)
          close()
          moveTo(14.0F, 11.878F)
          lineToRelative(3.076F, 3.075F)
          curveToRelative(0.509F, -0.14F, 0.922F, -0.598F, 0.922F, -1.207F)
          verticalLineTo(6.252F)
          curveToRelative(0.0F, -1.007F, -1.132F, -1.601F, -1.96F, -1.029F)
          lineTo(14.0F, 6.63F)
          verticalLineToRelative(5.249F)
          close()
          moveTo(6.121F, 4.0F)
          lineTo(13.0F, 10.879F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.121F)
          close()        
      }
    }
    return _videoOff20!!
  }

private var _videoOff20: ImageVector? = null
