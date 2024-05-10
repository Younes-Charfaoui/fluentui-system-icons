package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailRead48: ImageVector
  get() {
    if (_mailRead48 != null) {
      return _mailRead48!!
    }
    _mailRead48 = fluentIcon(name = "Filled.MailRead48", 48f) {
      materialPath {
          moveTo(21.151F, 4.69F)
          curveToRelative(1.789F, -0.916F, 3.91F, -0.916F, 5.698F, 0.0F)
          lineToRelative(13.75F, 7.042F)
          curveToRelative(1.118F, 0.573F, 2.014F, 1.454F, 2.605F, 2.51F)
          lineTo(24.002F, 24.35F)
          lineTo(4.834F, 14.176F)
          curveToRelative(0.591F, -1.027F, 1.473F, -1.883F, 2.567F, -2.444F)
          lineToRelative(13.75F, -7.042F)
          close()
          moveTo(4.041F, 16.585F)
          curveTo(4.013F, 16.819F, 4.0F, 17.055F, 4.0F, 17.295F)
          verticalLineTo(33.75F)
          curveTo(4.0F, 37.202F, 6.798F, 40.0F, 10.25F, 40.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineTo(17.295F)
          curveToRelative(0.0F, -0.212F, -0.01F, -0.422F, -0.032F, -0.63F)
          lineTo(24.582F, 26.87F)
          curveToRelative(-0.366F, 0.192F, -0.803F, 0.191F, -1.168F, -0.002F)
          lineTo(4.04F, 16.585F)
          close()        
      }
    }
    return _mailRead48!!
  }

private var _mailRead48: ImageVector? = null
