package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailOff16: ImageVector
  get() {
    if (_mailOff16 != null) {
      return _mailOff16!!
    }
    _mailOff16 = fluentIcon(name = "Filled.MailOff16", 16f) {
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
          verticalLineToRelative(0.201F)
          lineToRelative(5.404F, 2.91F)
          lineTo(8.56F, 9.267F)
          lineTo(8.238F, 9.44F)
          curveToRelative(-0.148F, 0.08F, -0.326F, 0.08F, -0.474F, 0.0F)
          lineTo(2.0F, 6.337F)
          verticalLineTo(11.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(0.093F, 0.0F, 0.185F, -0.006F, 0.274F, -0.019F)
          close()
          moveToRelative(-1.876F, -4.704F)
          lineToRelative(3.461F, 3.461F)
          curveTo(13.95F, 11.51F, 14.0F, 11.261F, 14.0F, 11.0F)
          verticalLineTo(6.337F)
          lineToRelative(-3.602F, 1.94F)
          close()
          moveTo(5.121F, 3.0F)
          lineTo(9.66F, 7.538F)
          lineTo(14.0F, 5.201F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(5.121F)
          close()        
      }
    }
    return _mailOff16!!
  }

private var _mailOff16: ImageVector? = null
