package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Games32: ImageVector
  get() {
    if (_games32 != null) {
      return _games32!!
    }
    _games32 = fluentIcon(name = "Regular.Games32", 32f) {
      materialPath {
          moveTo(22.0F, 19.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(0.0F, -4.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          close()
          moveToRelative(-12.0F, -3.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineTo(7.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(-2.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          close()
          moveToRelative(-8.0F, 4.0F)
          curveTo(2.0F, 10.477F, 6.477F, 6.0F, 12.0F, 6.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(5.523F, 0.0F, 10.0F, 4.477F, 10.0F, 10.0F)
          reflectiveCurveToRelative(-4.477F, 10.0F, -10.0F, 10.0F)
          horizontalLineToRelative(-8.0F)
          curveTo(6.477F, 26.0F, 2.0F, 21.523F, 2.0F, 16.0F)
          close()
          moveToRelative(10.0F, -8.0F)
          curveToRelative(-4.418F, 0.0F, -8.0F, 3.582F, -8.0F, 8.0F)
          reflectiveCurveToRelative(3.582F, 8.0F, 8.0F, 8.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(4.418F, 0.0F, 8.0F, -3.582F, 8.0F, -8.0F)
          reflectiveCurveToRelative(-3.582F, -8.0F, -8.0F, -8.0F)
          horizontalLineToRelative(-8.0F)
          close()        
      }
    }
    return _games32!!
  }

private var _games32: ImageVector? = null
