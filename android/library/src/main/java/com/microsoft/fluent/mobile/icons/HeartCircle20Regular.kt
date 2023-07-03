package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.HeartCircle20: ImageVector
  get() {
    if (_heartCircle20 != null) {
      return _heartCircle20!!
    }
    _heartCircle20 = fluentIcon(name = "Regular.HeartCircle20", 20f) {
      materialPath {
          moveTo(9.6F, 7.614F)
          lineTo(9.99F, 8.0F)
          lineToRelative(0.4F, -0.393F)
          curveToRelative(1.032F, -1.016F, 2.757F, -0.72F, 3.392F, 0.583F)
          curveToRelative(0.384F, 0.79F, 0.242F, 1.734F, -0.357F, 2.376F)
          lineToRelative(-3.06F, 3.273F)
          curveToRelative(-0.197F, 0.212F, -0.533F, 0.212F, -0.73F, 0.0F)
          lineTo(6.57F, 10.561F)
          curveTo(5.974F, 9.922F, 5.831F, 8.982F, 6.213F, 8.196F)
          curveToRelative(0.631F, -1.303F, 2.356F, -1.6F, 3.386F, -0.582F)
          close()
          moveTo(2.0F, 10.0F)
          curveToRelative(0.0F, -4.418F, 3.582F, -8.0F, 8.0F, -8.0F)
          reflectiveCurveToRelative(8.0F, 3.582F, 8.0F, 8.0F)
          reflectiveCurveToRelative(-3.582F, 8.0F, -8.0F, 8.0F)
          reflectiveCurveToRelative(-8.0F, -3.582F, -8.0F, -8.0F)
          close()
          moveToRelative(8.0F, -7.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          reflectiveCurveToRelative(7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          close()        
      }
    }
    return _heartCircle20!!
  }

private var _heartCircle20: ImageVector? = null
