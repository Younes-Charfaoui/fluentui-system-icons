package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailRead32: ImageVector
  get() {
    if (_mailRead32 != null) {
      return _mailRead32!!
    }
    _mailRead32 = fluentIcon(name = "Regular.MailRead32", 32f) {
      materialPath {
          moveTo(18.255F, 2.623F)
          curveToRelative(-1.395F, -0.807F, -3.115F, -0.807F, -4.51F, 0.0F)
          lineToRelative(-9.5F, 5.5F)
          curveTo(2.855F, 8.928F, 2.0F, 10.413F, 2.0F, 12.018F)
          verticalLineTo(22.5F)
          curveTo(2.0F, 24.985F, 4.015F, 27.0F, 6.5F, 27.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(12.018F)
          curveToRelative(0.0F, -1.606F, -0.856F, -3.09F, -2.245F, -3.895F)
          lineToRelative(-9.5F, -5.5F)
          close()
          moveToRelative(-3.508F, 1.731F)
          curveToRelative(0.775F, -0.449F, 1.73F, -0.449F, 2.506F, 0.0F)
          lineToRelative(9.5F, 5.5F)
          curveToRelative(0.337F, 0.195F, 0.617F, 0.462F, 0.826F, 0.775F)
          lineTo(16.0F, 16.864F)
          lineTo(4.421F, 10.63F)
          curveToRelative(0.21F, -0.313F, 0.49F, -0.58F, 0.826F, -0.775F)
          lineToRelative(9.5F, -5.5F)
          close()
          moveTo(4.0F, 12.674F)
          lineToRelative(11.526F, 6.207F)
          curveToRelative(0.296F, 0.159F, 0.652F, 0.159F, 0.948F, 0.0F)
          lineTo(28.0F, 12.674F)
          verticalLineTo(22.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-19.0F)
          curveTo(5.12F, 25.0F, 4.0F, 23.88F, 4.0F, 22.5F)
          verticalLineToRelative(-9.826F)
          close()        
      }
    }
    return _mailRead32!!
  }

private var _mailRead32: ImageVector? = null
