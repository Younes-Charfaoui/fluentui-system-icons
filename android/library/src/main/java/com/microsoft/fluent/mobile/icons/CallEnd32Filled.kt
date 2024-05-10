package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CallEnd32: ImageVector
  get() {
    if (_callEnd32 != null) {
      return _callEnd32!!
    }
    _callEnd32 = fluentIcon(name = "Filled.CallEnd32", 32f) {
      materialPath {
          moveTo(6.557F, 10.724F)
          curveTo(9.054F, 9.621F, 12.385F, 9.0F, 15.997F, 9.0F)
          curveToRelative(3.618F, 0.0F, 6.968F, 0.623F, 9.474F, 1.73F)
          curveToRelative(2.439F, 1.078F, 4.402F, 2.776F, 4.522F, 5.084F)
          curveToRelative(0.013F, 0.251F, -0.018F, 0.48F, -0.052F, 0.66F)
          lineToRelative(-0.502F, 2.67F)
          curveToRelative(-0.355F, 1.89F, -2.17F, 3.14F, -4.063F, 2.797F)
          lineToRelative(-3.23F, -0.584F)
          curveToRelative(-1.203F, -0.218F, -2.154F, -1.144F, -2.403F, -2.342F)
          lineTo(19.13F, 16.06F)
          curveToRelative(-0.603F, -0.202F, -1.736F, -0.5F, -3.133F, -0.5F)
          reflectiveCurveToRelative(-2.53F, 0.298F, -3.132F, 0.5F)
          lineToRelative(-0.615F, 2.955F)
          curveToRelative(-0.248F, 1.198F, -1.2F, 2.124F, -2.403F, 2.342F)
          lineToRelative(-3.23F, 0.584F)
          curveToRelative(-1.893F, 0.343F, -3.707F, -0.906F, -4.062F, -2.797F)
          lineToRelative(-0.499F, -2.65F)
          curveToRelative(-0.037F, -0.198F, -0.069F, -0.448F, -0.049F, -0.722F)
          curveToRelative(0.168F, -2.285F, 2.116F, -3.972F, 4.551F, -5.048F)
          close()        
      }
    }
    return _callEnd32!!
  }

private var _callEnd32: ImageVector? = null
