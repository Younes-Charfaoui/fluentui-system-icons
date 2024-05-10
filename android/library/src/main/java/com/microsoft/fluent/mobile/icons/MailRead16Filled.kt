package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailRead16: ImageVector
  get() {
    if (_mailRead16 != null) {
      return _mailRead16!!
    }
    _mailRead16 = fluentIcon(name = "Filled.MailRead16", 16f) {
      materialPath {
          moveTo(7.732F, 1.078F)
          curveToRelative(0.163F, -0.104F, 0.373F, -0.104F, 0.536F, 0.0F)
          lineToRelative(4.806F, 3.058F)
          curveToRelative(0.412F, 0.262F, 0.707F, 0.662F, 0.843F, 1.117F)
          lineTo(8.0F, 8.434F)
          lineTo(2.086F, 5.243F)
          curveToRelative(0.137F, -0.452F, 0.431F, -0.848F, 0.84F, -1.108F)
          lineToRelative(4.806F, -3.058F)
          close()
          moveTo(2.0F, 6.334F)
          verticalLineTo(11.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(6.344F)
          lineTo(8.237F, 9.44F)
          curveToRelative(-0.148F, 0.08F, -0.326F, 0.08F, -0.474F, 0.0F)
          lineTo(2.0F, 6.334F)
          close()        
      }
    }
    return _mailRead16!!
  }

private var _mailRead16: ImageVector? = null
