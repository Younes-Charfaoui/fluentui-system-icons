package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailUnread32: ImageVector
  get() {
    if (_mailUnread32 != null) {
      return _mailUnread32!!
    }
    _mailUnread32 = fluentIcon(name = "Regular.MailUnread32", 32f) {
      materialPath {
          moveTo(27.0F, 10.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          reflectiveCurveToRelative(-4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          close()
          moveTo(6.5F, 5.0F)
          horizontalLineToRelative(15.09F)
          curveToRelative(-0.059F, 0.324F, -0.09F, 0.659F, -0.09F, 1.0F)
          curveToRelative(0.0F, 0.341F, 0.031F, 0.676F, 0.09F, 1.0F)
          horizontalLineTo(6.5F)
          curveTo(5.12F, 7.0F, 4.0F, 8.12F, 4.0F, 9.5F)
          verticalLineToRelative(0.903F)
          lineToRelative(12.0F, 6.461F)
          lineToRelative(10.1F, -5.438F)
          curveToRelative(0.292F, 0.05F, 0.593F, 0.074F, 0.9F, 0.074F)
          curveToRelative(1.107F, 0.0F, 2.137F, -0.327F, 3.0F, -0.89F)
          verticalLineTo(22.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-19.0F)
          curveTo(4.015F, 27.0F, 2.0F, 24.985F, 2.0F, 22.5F)
          verticalLineToRelative(-13.0F)
          curveTo(2.0F, 7.015F, 4.015F, 5.0F, 6.5F, 5.0F)
          close()
          moveTo(4.0F, 12.674F)
          verticalLineTo(22.5F)
          curveTo(4.0F, 23.88F, 5.12F, 25.0F, 6.5F, 25.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-9.826F)
          lineToRelative(-11.526F, 6.207F)
          curveToRelative(-0.296F, 0.159F, -0.652F, 0.159F, -0.948F, 0.0F)
          lineTo(4.0F, 12.674F)
          close()        
      }
    }
    return _mailUnread32!!
  }

private var _mailUnread32: ImageVector? = null
