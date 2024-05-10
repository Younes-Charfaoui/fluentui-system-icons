package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Road20: ImageVector
  get() {
    if (_road20 != null) {
      return _road20!!
    }
    _road20 = fluentIcon(name = "Regular.Road20", 20f) {
      materialPath {
          moveTo(5.0F, 2.5F)
          curveTo(5.0F, 2.224F, 4.776F, 2.0F, 4.5F, 2.0F)
          reflectiveCurveTo(4.0F, 2.224F, 4.0F, 2.5F)
          verticalLineToRelative(15.0F)
          curveTo(4.0F, 17.776F, 4.224F, 18.0F, 4.5F, 18.0F)
          reflectiveCurveTo(5.0F, 17.776F, 5.0F, 17.5F)
          verticalLineToRelative(-15.0F)
          close()
          moveToRelative(11.0F, 0.0F)
          curveTo(16.0F, 2.224F, 15.776F, 2.0F, 15.5F, 2.0F)
          reflectiveCurveTo(15.0F, 2.224F, 15.0F, 2.5F)
          verticalLineToRelative(15.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-15.0F)
          close()
          moveToRelative(-5.5F, 0.0F)
          curveTo(10.5F, 2.224F, 10.276F, 2.0F, 10.0F, 2.0F)
          reflectiveCurveTo(9.5F, 2.224F, 9.5F, 2.5F)
          verticalLineToRelative(3.0F)
          curveTo(9.5F, 5.776F, 9.724F, 6.0F, 10.0F, 6.0F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          close()
          moveToRelative(-1.0F, 9.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveTo(10.5F, 8.224F, 10.276F, 8.0F, 10.0F, 8.0F)
          reflectiveCurveTo(9.5F, 8.224F, 9.5F, 8.5F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(0.0F, 3.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          reflectiveCurveToRelative(0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveToRelative(-0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _road20!!
  }

private var _road20: ImageVector? = null
