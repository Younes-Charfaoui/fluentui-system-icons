package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailRead32: ImageVector
  get() {
    if (_mailRead32 != null) {
      return _mailRead32!!
    }
    _mailRead32 = fluentIcon(name = "Filled.MailRead32", 32f) {
      materialPath {
          moveTo(13.745F, 2.623F)
          curveToRelative(1.395F, -0.807F, 3.115F, -0.807F, 4.51F, 0.0F)
          lineToRelative(9.5F, 5.5F)
          curveToRelative(0.662F, 0.384F, 1.202F, 0.921F, 1.587F, 1.552F)
          lineTo(16.0F, 16.865F)
          lineTo(2.653F, 9.682F)
          curveToRelative(0.385F, -0.635F, 0.928F, -1.175F, 1.592F, -1.56F)
          lineToRelative(9.5F, -5.5F)
          close()
          moveToRelative(-11.727F, 8.99F)
          curveTo(2.006F, 11.745F, 2.0F, 11.882F, 2.0F, 12.018F)
          verticalLineTo(22.5F)
          curveTo(2.0F, 24.985F, 4.015F, 27.0F, 6.5F, 27.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(12.018F)
          curveToRelative(0.0F, -0.14F, -0.006F, -0.278F, -0.02F, -0.415F)
          lineTo(16.475F, 18.88F)
          curveToRelative(-0.296F, 0.16F, -0.652F, 0.16F, -0.948F, 0.0F)
          lineTo(2.018F, 11.614F)
          close()        
      }
    }
    return _mailRead32!!
  }

private var _mailRead32: ImageVector? = null
