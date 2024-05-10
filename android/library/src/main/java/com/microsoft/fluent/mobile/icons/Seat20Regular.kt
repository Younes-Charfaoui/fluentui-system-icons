package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Seat20: ImageVector
  get() {
    if (_seat20 != null) {
      return _seat20!!
    }
    _seat20 = fluentIcon(name = "Regular.Seat20", 20f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(10.0F, 6.5F)
          curveTo(15.582F, 9.186F, 15.063F, 9.0F, 14.5F, 9.0F)
          curveToRelative(-0.894F, 0.0F, -1.678F, 0.469F, -2.12F, 1.174F)
          curveTo(11.832F, 9.46F, 10.97F, 9.0F, 10.0F, 9.0F)
          reflectiveCurveToRelative(-1.832F, 0.46F, -2.38F, 1.174F)
          curveTo(7.178F, 9.469F, 6.394F, 9.0F, 5.5F, 9.0F)
          curveTo(4.937F, 9.0F, 4.418F, 9.186F, 4.0F, 9.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(3.5F)
          close()
          moveTo(12.0F, 12.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(-4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(1.0F, 4.0F)
          verticalLineToRelative(-4.5F)
          curveToRelative(0.0F, -0.828F, 0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          verticalLineTo(15.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineToRelative(-2.0F)
          close()
          moveToRelative(-9.0F, -1.0F)
          verticalLineToRelative(-3.5F)
          curveTo(4.0F, 10.672F, 4.672F, 10.0F, 5.5F, 10.0F)
          reflectiveCurveTo(7.0F, 10.672F, 7.0F, 11.5F)
          verticalLineTo(16.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          close()        
      }
    }
    return _seat20!!
  }

private var _seat20: ImageVector? = null
