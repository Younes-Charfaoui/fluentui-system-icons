package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailOff16: ImageVector
  get() {
    if (_mailOff16 != null) {
      return _mailOff16!!
    }
    _mailOff16 = fluentIcon(name = "Regular.MailOff16", 16f) {
      materialPath {
          moveTo(12.274F, 12.981F)
          lineToRelative(1.872F, 1.873F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(2.74F, 3.446F)
          curveTo(2.288F, 3.814F, 2.0F, 4.373F, 2.0F, 5.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(0.093F, 0.0F, 0.185F, -0.006F, 0.274F, -0.019F)
          close()
          moveTo(11.293F, 12.0F)
          horizontalLineTo(4.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(6.875F)
          lineTo(7.763F, 9.44F)
          curveToRelative(0.148F, 0.08F, 0.326F, 0.08F, 0.474F, 0.0F)
          lineTo(8.56F, 9.267F)
          lineTo(11.293F, 12.0F)
          close()
          moveTo(7.404F, 8.111F)
          lineTo(3.0F, 5.74F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -0.351F, 0.18F, -0.66F, 0.455F, -0.838F)
          lineToRelative(3.95F, 3.95F)
          close()
          moveTo(13.0F, 5.74F)
          lineTo(9.66F, 7.538F)
          lineToRelative(0.738F, 0.739F)
          lineTo(13.0F, 6.876F)
          verticalLineToRelative(4.003F)
          lineToRelative(0.86F, 0.86F)
          curveTo(13.95F, 11.508F, 14.0F, 11.26F, 14.0F, 11.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(5.121F)
          lineToRelative(1.0F, 1.0F)
          horizontalLineTo(12.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(0.74F)
          close()        
      }
    }
    return _mailOff16!!
  }

private var _mailOff16: ImageVector? = null
