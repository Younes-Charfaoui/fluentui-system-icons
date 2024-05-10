package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoOff28: ImageVector
  get() {
    if (_videoOff28 != null) {
      return _videoOff28!!
    }
    _videoOff28 = fluentIcon(name = "Filled.VideoOff28", 28f) {
      materialPath {
          moveTo(3.28F, 2.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(2.792F, 2.793F)
          curveTo(3.294F, 6.415F, 2.0F, 7.932F, 2.0F, 9.75F)
          verticalLineToRelative(8.5F)
          curveTo(2.0F, 20.321F, 3.679F, 22.0F, 5.75F, 22.0F)
          horizontalLineToRelative(8.5F)
          curveToRelative(1.818F, 0.0F, 3.334F, -1.294F, 3.677F, -3.012F)
          lineToRelative(6.792F, 6.793F)
          curveToRelative(0.293F, 0.292F, 0.768F, 0.292F, 1.061F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.768F, 0.0F, -1.061F)
          lineTo(3.28F, 2.22F)
          close()
          moveTo(9.183F, 6.0F)
          lineTo(18.0F, 14.817F)
          verticalLineTo(9.75F)
          curveTo(18.0F, 7.679F, 16.321F, 6.0F, 14.25F, 6.0F)
          horizontalLineTo(9.183F)
          close()
          moveTo(19.0F, 15.817F)
          lineToRelative(5.177F, 5.178F)
          curveToRelative(0.933F, 0.034F, 1.819F, -0.697F, 1.819F, -1.752F)
          verticalLineTo(8.753F)
          curveToRelative(0.0F, -1.41F, -1.583F, -2.242F, -2.744F, -1.44F)
          lineTo(19.0F, 10.249F)
          verticalLineToRelative(5.568F)
          close()        
      }
    }
    return _videoOff28!!
  }

private var _videoOff28: ImageVector? = null
