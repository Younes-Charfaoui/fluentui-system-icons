package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Bench20: ImageVector
  get() {
    if (_bench20 != null) {
      return _bench20!!
    }
    _bench20 = fluentIcon(name = "Regular.Bench20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          reflectiveCurveToRelative(-0.895F, 2.0F, -2.0F, 2.0F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(16.0F, 15.776F, 16.0F, 15.5F)
          verticalLineTo(14.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(1.5F)
          curveTo(4.0F, 15.776F, 3.776F, 16.0F, 3.5F, 16.0F)
          reflectiveCurveTo(3.0F, 15.776F, 3.0F, 15.5F)
          verticalLineTo(14.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(14.0F, 7.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(14.0F)
          close()
          moveToRelative(-1.0F, -7.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(5.0F)
          curveTo(4.448F, 5.0F, 4.0F, 5.448F, 4.0F, 6.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(6.0F)
          close()        
      }
    }
    return _bench20!!
  }

private var _bench20: ImageVector? = null
