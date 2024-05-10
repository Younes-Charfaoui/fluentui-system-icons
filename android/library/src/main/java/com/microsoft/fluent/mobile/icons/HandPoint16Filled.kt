package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HandPoint16: ImageVector
  get() {
    if (_handPoint16 != null) {
      return _handPoint16!!
    }
    _handPoint16 = fluentIcon(name = "Filled.HandPoint16", 16f) {
      materialPath {
          moveTo(8.0F, 0.998F)
          curveTo(6.894F, 0.998F, 5.997F, 1.894F, 5.997F, 3.0F)
          verticalLineToRelative(4.205F)
          lineTo(5.371F, 6.927F)
          curveToRelative(-1.47F, -0.652F, -3.194F, -0.221F, -4.185F, 1.045F)
          curveTo(0.828F, 8.43F, 1.011F, 9.092F, 1.53F, 9.32F)
          curveToRelative(2.0F, 0.877F, 3.206F, 1.604F, 3.985F, 2.268F)
          curveToRelative(0.765F, 0.65F, 1.134F, 1.252F, 1.44F, 1.918F)
          curveToRelative(0.456F, 0.993F, 1.483F, 1.62F, 2.6F, 1.47F)
          lineToRelative(2.07F, -0.28F)
          curveToRelative(1.015F, -0.137F, 1.844F, -0.88F, 2.092F, -1.873F)
          lineToRelative(0.681F, -2.733F)
          curveToRelative(0.498F, -1.997F, -0.827F, -3.99F, -2.86F, -4.305F)
          lineTo(10.0F, 5.546F)
          verticalLineTo(2.999F)
          curveToRelative(0.0F, -1.105F, -0.896F, -2.001F, -2.001F, -2.001F)
          close()        
      }
    }
    return _handPoint16!!
  }

private var _handPoint16: ImageVector? = null
