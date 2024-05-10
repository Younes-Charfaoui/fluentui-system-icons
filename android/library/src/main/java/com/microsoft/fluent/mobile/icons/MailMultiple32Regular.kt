package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailMultiple32: ImageVector
  get() {
    if (_mailMultiple32 != null) {
      return _mailMultiple32!!
    }
    _mailMultiple32 = fluentIcon(name = "Regular.MailMultiple32", 32f) {
      materialPath {
          moveTo(7.5F, 7.0F)
          curveTo(6.146F, 7.0F, 5.043F, 8.076F, 5.001F, 9.42F)
          lineToRelative(9.499F, 5.428F)
          lineToRelative(9.499F, -5.428F)
          curveTo(23.957F, 8.076F, 22.854F, 7.0F, 21.5F, 7.0F)
          horizontalLineToRelative(-14.0F)
          close()
          moveTo(3.0F, 9.5F)
          curveTo(3.0F, 7.015F, 5.015F, 5.0F, 7.5F, 5.0F)
          horizontalLineToRelative(14.0F)
          curveTo(23.985F, 5.0F, 26.0F, 7.015F, 26.0F, 9.5F)
          verticalLineToRelative(10.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-14.0F)
          curveTo(5.015F, 24.0F, 3.0F, 21.985F, 3.0F, 19.5F)
          verticalLineToRelative(-10.0F)
          close()
          moveToRelative(21.0F, 10.0F)
          verticalLineToRelative(-7.777F)
          lineToRelative(-9.004F, 5.145F)
          curveToRelative(-0.307F, 0.176F, -0.685F, 0.176F, -0.992F, 0.0F)
          lineTo(5.0F, 11.723F)
          verticalLineTo(19.5F)
          curveTo(5.0F, 20.88F, 6.12F, 22.0F, 7.5F, 22.0F)
          horizontalLineToRelative(14.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          close()
          moveToRelative(-13.0F, 8.0F)
          curveToRelative(-1.56F, 0.0F, -2.935F, -0.794F, -3.742F, -2.0F)
          horizontalLineTo(22.0F)
          curveToRelative(3.038F, 0.0F, 5.5F, -2.462F, 5.5F, -5.5F)
          verticalLineTo(9.258F)
          curveToRelative(1.206F, 0.807F, 2.0F, 2.182F, 2.0F, 3.742F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 4.142F, -3.358F, 7.5F, -7.5F, 7.5F)
          horizontalLineTo(11.0F)
          close()        
      }
    }
    return _mailMultiple32!!
  }

private var _mailMultiple32: ImageVector? = null
