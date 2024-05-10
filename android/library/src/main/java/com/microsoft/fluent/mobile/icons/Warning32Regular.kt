package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Warning32: ImageVector
  get() {
    if (_warning32 != null) {
      return _warning32!!
    }
    _warning32 = fluentIcon(name = "Regular.Warning32", 32f) {
      materialPath {
          moveTo(17.25F, 22.0F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          reflectiveCurveToRelative(-1.25F, -0.56F, -1.25F, -1.25F)
          reflectiveCurveToRelative(0.56F, -1.25F, 1.25F, -1.25F)
          reflectiveCurveToRelative(1.25F, 0.56F, 1.25F, 1.25F)
          close()
          moveTo(16.0F, 9.0F)
          curveToRelative(-0.553F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 0.552F, 0.447F, 1.0F, 1.0F, 1.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-8.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          close()
          moveToRelative(-3.064F, -5.191F)
          curveToRelative(1.332F, -2.41F, 4.796F, -2.41F, 6.128F, 0.0F)
          lineToRelative(10.493F, 18.999F)
          curveTo(30.846F, 25.14F, 29.158F, 28.0F, 26.494F, 28.0F)
          horizontalLineTo(5.507F)
          curveToRelative(-2.665F, 0.0F, -4.352F, -2.86F, -3.064F, -5.192F)
          lineToRelative(10.493F, -19.0F)
          close()
          moveToRelative(4.377F, 0.967F)
          curveToRelative(-0.57F, -1.033F, -2.055F, -1.033F, -2.626F, 0.0F)
          lineTo(4.194F, 23.775F)
          curveTo(3.642F, 24.775F, 4.364F, 26.0F, 5.507F, 26.0F)
          horizontalLineToRelative(20.986F)
          curveToRelative(1.143F, 0.0F, 1.866F, -1.226F, 1.314F, -2.225F)
          lineToRelative(-10.494F, -19.0F)
          close()        
      }
    }
    return _warning32!!
  }

private var _warning32: ImageVector? = null
