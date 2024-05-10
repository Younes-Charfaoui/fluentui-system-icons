package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailRead20: ImageVector
  get() {
    if (_mailRead20 != null) {
      return _mailRead20!!
    }
    _mailRead20 = fluentIcon(name = "Filled.MailRead20", 20f) {
      materialPath {
          moveTo(10.257F, 1.071F)
          curveToRelative(-0.158F, -0.095F, -0.356F, -0.095F, -0.514F, 0.0F)
          lineTo(2.97F, 5.134F)
          curveToRelative(-0.15F, 0.09F, -0.286F, 0.198F, -0.405F, 0.32F)
          lineTo(10.0F, 9.918F)
          lineToRelative(7.435F, -4.461F)
          curveToRelative(-0.12F, -0.123F, -0.255F, -0.231F, -0.406F, -0.322F)
          lineToRelative(-6.772F, -4.063F)
          close()
          moveToRelative(7.673F, 5.254F)
          lineToRelative(-7.673F, 4.604F)
          curveToRelative(-0.158F, 0.095F, -0.356F, 0.095F, -0.514F, 0.0F)
          lineTo(2.07F, 6.323F)
          curveTo(2.024F, 6.493F, 2.0F, 6.67F, 2.0F, 6.85F)
          verticalLineToRelative(6.65F)
          curveTo(2.0F, 14.88F, 3.12F, 16.0F, 4.5F, 16.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineTo(6.85F)
          curveToRelative(0.0F, -0.18F, -0.024F, -0.356F, -0.07F, -0.525F)
          close()        
      }
    }
    return _mailRead20!!
  }

private var _mailRead20: ImageVector? = null
