package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailCopy32: ImageVector
  get() {
    if (_mailCopy32 != null) {
      return _mailCopy32!!
    }
    _mailCopy32 = fluentIcon(name = "Filled.MailCopy32", 32f) {
      materialPath {
          moveTo(10.5F, 5.0F)
          curveTo(8.383F, 5.0F, 6.607F, 6.462F, 6.128F, 8.432F)
          lineToRelative(11.871F, 6.43F)
          lineToRelative(11.873F, -6.43F)
          curveTo(29.392F, 6.462F, 27.617F, 5.0F, 25.5F, 5.0F)
          horizontalLineToRelative(-15.0F)
          close()
          moveTo(6.0F, 19.5F)
          verticalLineToRelative(-8.863F)
          lineToRelative(11.523F, 6.242F)
          curveToRelative(0.297F, 0.161F, 0.655F, 0.161F, 0.953F, 0.0F)
          lineTo(30.0F, 10.637F)
          verticalLineTo(19.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-15.0F)
          curveTo(8.015F, 24.0F, 6.0F, 21.985F, 6.0F, 19.5F)
          close()
          moveTo(4.0F, 9.758F)
          curveTo(2.794F, 10.565F, 2.0F, 11.94F, 2.0F, 13.5F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 4.695F, 3.806F, 8.5F, 8.5F, 8.5F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.56F, 0.0F, 2.935F, -0.794F, 3.742F, -2.0F)
          horizontalLineTo(10.5F)
          curveTo(6.91F, 26.0F, 4.0F, 23.09F, 4.0F, 19.5F)
          verticalLineTo(9.758F)
          close()        
      }
    }
    return _mailCopy32!!
  }

private var _mailCopy32: ImageVector? = null
