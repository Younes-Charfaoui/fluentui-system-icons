package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Mail48: ImageVector
  get() {
    if (_mail48 != null) {
      return _mail48!!
    }
    _mail48 = fluentIcon(name = "Filled.Mail48", 48f) {
      materialPath {
          moveTo(4.02F, 13.747F)
          curveTo(4.276F, 10.53F, 6.968F, 8.0F, 10.25F, 8.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.31F, 0.0F, 6.019F, 2.573F, 6.236F, 5.828F)
          lineTo(24.002F, 24.35F)
          lineTo(4.02F, 13.747F)
          close()
          moveTo(4.0F, 16.567F)
          verticalLineTo(33.75F)
          curveTo(4.0F, 37.202F, 6.798F, 40.0F, 10.25F, 40.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineTo(16.645F)
          lineTo(24.582F, 26.87F)
          curveToRelative(-0.365F, 0.192F, -0.803F, 0.191F, -1.168F, -0.002F)
          lineTo(4.0F, 16.567F)
          close()        
      }
    }
    return _mail48!!
  }

private var _mail48: ImageVector? = null
