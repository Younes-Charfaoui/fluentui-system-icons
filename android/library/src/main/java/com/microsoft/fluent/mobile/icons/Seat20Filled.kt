package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Seat20: ImageVector
  get() {
    if (_seat20 != null) {
      return _seat20!!
    }
    _seat20 = fluentIcon(name = "Filled.Seat20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(3.764F)
          curveTo(16.47F, 9.289F, 15.768F, 9.0F, 15.0F, 9.0F)
          curveToRelative(-1.043F, 0.0F, -1.963F, 0.533F, -2.5F, 1.341F)
          curveTo(11.963F, 9.533F, 11.043F, 9.0F, 10.0F, 9.0F)
          reflectiveCurveToRelative(-1.963F, 0.533F, -2.5F, 1.341F)
          curveTo(6.963F, 9.533F, 6.043F, 9.0F, 5.0F, 9.0F)
          curveTo(4.232F, 9.0F, 3.53F, 9.289F, 3.0F, 9.764F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(9.0F, 6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(1.0F, 5.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          close()
          moveToRelative(-6.0F, 0.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          close()        
      }
    }
    return _seat20!!
  }

private var _seat20: ImageVector? = null
