package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Seat16: ImageVector
  get() {
    if (_seat16 != null) {
      return _seat16!!
    }
    _seat16 = fluentIcon(name = "Filled.Seat16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(3.0F)
          curveTo(13.582F, 7.186F, 13.063F, 7.0F, 12.5F, 7.0F)
          curveToRelative(-0.894F, 0.0F, -1.678F, 0.469F, -2.12F, 1.174F)
          curveTo(9.832F, 7.46F, 8.97F, 7.0F, 8.0F, 7.0F)
          reflectiveCurveTo(6.168F, 7.46F, 5.62F, 8.174F)
          curveTo(5.178F, 7.469F, 4.394F, 7.0F, 3.5F, 7.0F)
          curveTo(2.937F, 7.0F, 2.418F, 7.186F, 2.0F, 7.5F)
          verticalLineToRelative(-3.0F)
          close()
          moveToRelative(8.0F, 5.5F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(-4.0F)
          close()
          moveToRelative(1.0F, 4.0F)
          horizontalLineToRelative(1.25F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(9.5F)
          curveTo(14.0F, 8.672F, 13.328F, 8.0F, 12.5F, 8.0F)
          reflectiveCurveTo(11.0F, 8.672F, 11.0F, 9.5F)
          verticalLineTo(14.0F)
          close()
          moveToRelative(-6.0F, 0.0F)
          horizontalLineTo(3.75F)
          curveTo(2.784F, 14.0F, 2.0F, 13.216F, 2.0F, 12.25F)
          verticalLineTo(9.5F)
          curveTo(2.0F, 8.672F, 2.672F, 8.0F, 3.5F, 8.0F)
          reflectiveCurveTo(5.0F, 8.672F, 5.0F, 9.5F)
          verticalLineTo(14.0F)
          close()        
      }
    }
    return _seat16!!
  }

private var _seat16: ImageVector? = null
