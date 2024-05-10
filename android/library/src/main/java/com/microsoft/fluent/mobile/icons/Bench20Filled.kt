package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Bench20: ImageVector
  get() {
    if (_bench20 != null) {
      return _bench20!!
    }
    _bench20 = fluentIcon(name = "Filled.Bench20", 20f) {
      materialPath {
          moveTo(5.0F, 4.0F)
          curveTo(3.895F, 4.0F, 3.0F, 4.895F, 3.0F, 6.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(14.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(5.0F)
          close()
          moveToRelative(-2.5F, 7.0F)
          curveTo(1.672F, 11.0F, 1.0F, 11.672F, 1.0F, 12.5F)
          reflectiveCurveTo(1.672F, 14.0F, 2.5F, 14.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(1.5F)
          curveTo(3.0F, 15.776F, 3.224F, 16.0F, 3.5F, 16.0F)
          reflectiveCurveTo(4.0F, 15.776F, 4.0F, 15.5F)
          verticalLineTo(14.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(14.0F)
          horizontalLineToRelative(0.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          reflectiveCurveTo(18.328F, 11.0F, 17.5F, 11.0F)
          horizontalLineToRelative(-15.0F)
          close()        
      }
    }
    return _bench20!!
  }

private var _bench20: ImageVector? = null
