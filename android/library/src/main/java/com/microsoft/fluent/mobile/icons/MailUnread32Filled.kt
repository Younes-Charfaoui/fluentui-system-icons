package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailUnread32: ImageVector
  get() {
    if (_mailUnread32 != null) {
      return _mailUnread32!!
    }
    _mailUnread32 = fluentIcon(name = "Filled.MailUnread32", 32f) {
      materialPath {
          moveTo(27.0F, 10.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          reflectiveCurveToRelative(-4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          close()
          moveToRelative(-5.5F, -4.0F)
          curveToRelative(0.0F, 2.73F, 1.99F, 4.996F, 4.599F, 5.427F)
          lineTo(16.0F, 16.864F)
          lineTo(3.48F, 10.123F)
          lineToRelative(-1.476F, -0.82F)
          curveTo(2.107F, 6.909F, 4.081F, 5.0F, 6.5F, 5.0F)
          horizontalLineToRelative(15.09F)
          curveToRelative(-0.059F, 0.324F, -0.09F, 0.659F, -0.09F, 1.0F)
          close()
          moveTo(2.0F, 11.588F)
          verticalLineTo(22.5F)
          curveTo(2.0F, 24.985F, 4.015F, 27.0F, 6.5F, 27.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(11.588F)
          lineToRelative(-0.526F, 0.293F)
          lineToRelative(-13.0F, 7.0F)
          curveToRelative(-0.296F, 0.159F, -0.652F, 0.159F, -0.948F, 0.0F)
          lineTo(2.514F, 11.874F)
          lineTo(2.0F, 11.588F)
          close()        
      }
    }
    return _mailUnread32!!
  }

private var _mailUnread32: ImageVector? = null
