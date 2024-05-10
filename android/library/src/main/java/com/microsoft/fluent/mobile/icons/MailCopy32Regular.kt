package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailCopy32: ImageVector
  get() {
    if (_mailCopy32 != null) {
      return _mailCopy32!!
    }
    _mailCopy32 = fluentIcon(name = "Regular.MailCopy32", 32f) {
      materialPath {
          moveTo(6.0F, 9.5F)
          curveTo(6.0F, 7.015F, 8.015F, 5.0F, 10.5F, 5.0F)
          horizontalLineToRelative(15.0F)
          curveTo(27.985F, 5.0F, 30.0F, 7.015F, 30.0F, 9.5F)
          verticalLineToRelative(10.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-15.0F)
          curveTo(8.015F, 24.0F, 6.0F, 21.985F, 6.0F, 19.5F)
          verticalLineToRelative(-10.0F)
          close()
          moveToRelative(2.0F, -0.054F)
          lineToRelative(10.0F, 5.417F)
          lineToRelative(10.0F, -5.417F)
          curveTo(27.97F, 8.09F, 26.862F, 7.0F, 25.5F, 7.0F)
          horizontalLineToRelative(-15.0F)
          curveTo(9.137F, 7.0F, 8.03F, 8.09F, 8.0F, 9.446F)
          close()
          moveToRelative(20.0F, 2.274F)
          lineToRelative(-9.524F, 5.16F)
          curveToRelative(-0.297F, 0.16F, -0.656F, 0.16F, -0.953F, 0.0F)
          lineTo(8.0F, 11.72F)
          verticalLineToRelative(7.78F)
          curveToRelative(0.0F, 1.38F, 1.12F, 2.5F, 2.5F, 2.5F)
          horizontalLineToRelative(15.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.78F)
          close()
          moveTo(2.0F, 13.5F)
          curveToRelative(0.0F, -1.56F, 0.794F, -2.935F, 2.0F, -3.742F)
          verticalLineTo(19.5F)
          curveToRelative(0.0F, 3.59F, 2.91F, 6.5F, 6.5F, 6.5F)
          horizontalLineToRelative(14.742F)
          curveToRelative(-0.807F, 1.206F, -2.182F, 2.0F, -3.742F, 2.0F)
          horizontalLineToRelative(-11.0F)
          curveTo(5.806F, 28.0F, 2.0F, 24.195F, 2.0F, 19.5F)
          verticalLineToRelative(-6.0F)
          close()        
      }
    }
    return _mailCopy32!!
  }

private var _mailCopy32: ImageVector? = null
