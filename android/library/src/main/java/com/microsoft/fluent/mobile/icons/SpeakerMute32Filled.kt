package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SpeakerMute32: ImageVector
  get() {
    if (_speakerMute32 != null) {
      return _speakerMute32!!
    }
    _speakerMute32 = fluentIcon(name = "Filled.SpeakerMute32", 32f) {
      materialPath {
          moveTo(18.0F, 5.604F)
          curveToRelative(0.0F, -1.114F, -1.346F, -1.672F, -2.134F, -0.884F)
          lineToRelative(-4.694F, 4.694F)
          curveTo(10.796F, 9.79F, 10.288F, 10.0F, 9.757F, 10.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-2.21F, 0.0F, -4.0F, 1.79F, -4.0F, 4.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 2.21F, 1.79F, 4.0F, 4.0F, 4.0F)
          horizontalLineToRelative(3.757F)
          curveToRelative(0.53F, 0.0F, 1.04F, 0.21F, 1.415F, 0.586F)
          lineToRelative(4.694F, 4.694F)
          curveTo(16.654F, 28.068F, 18.0F, 27.51F, 18.0F, 26.396F)
          verticalLineTo(5.604F)
          close()
          moveToRelative(3.293F, 6.689F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          lineTo(25.0F, 14.586F)
          lineToRelative(2.293F, -2.293F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(26.414F, 16.0F)
          lineToRelative(2.293F, 2.293F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          lineTo(25.0F, 17.414F)
          lineToRelative(-2.293F, 2.293F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          lineTo(23.586F, 16.0F)
          lineToRelative(-2.293F, -2.293F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          close()        
      }
    }
    return _speakerMute32!!
  }

private var _speakerMute32: ImageVector? = null
