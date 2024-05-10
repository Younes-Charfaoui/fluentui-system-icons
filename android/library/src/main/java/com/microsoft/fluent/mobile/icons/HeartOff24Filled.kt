package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HeartOff24: ImageVector
  get() {
    if (_heartOff24 != null) {
      return _heartOff24!!
    }
    _heartOff24 = fluentIcon(name = "Filled.HeartOff24", 24f) {
      materialPath {
          moveTo(3.28F, 2.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(1.855F, 1.856F)
          curveToRelative(-0.174F, 0.135F, -0.34F, 0.283F, -0.5F, 0.443F)
          curveToRelative(-2.1F, 2.099F, -2.1F, 5.502F, 0.0F, 7.601F)
          lineToRelative(7.895F, 7.896F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(3.744F, -3.742F)
          lineToRelative(4.445F, 4.447F)
          curveToRelative(0.293F, 0.292F, 0.768F, 0.292F, 1.061F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.768F, 0.0F, -1.061F)
          lineTo(3.28F, 2.22F)
          close()
          moveToRelative(17.152F, 10.959F)
          lineToRelative(-2.036F, 2.035F)
          lineTo(7.19F, 4.008F)
          curveToRelative(1.436F, -0.05F, 2.89F, 0.474F, 3.986F, 1.57F)
          lineToRelative(0.823F, 0.824F)
          lineToRelative(0.82F, -0.822F)
          curveToRelative(2.104F, -2.103F, 5.508F, -2.103F, 7.611F, 0.0F)
          curveToRelative(2.1F, 2.1F, 2.096F, 5.493F, 0.002F, 7.599F)
          close()        
      }
    }
    return _heartOff24!!
  }

private var _heartOff24: ImageVector? = null
