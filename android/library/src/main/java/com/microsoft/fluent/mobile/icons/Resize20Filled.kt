package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Resize20: ImageVector
  get() {
    if (_resize20 != null) {
      return _resize20!!
    }
    _resize20 = fluentIcon(name = "Filled.Resize20", 20f) {
      materialPath {
          moveTo(8.5F, 3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(0.5F)
          curveTo(3.0F, 6.776F, 3.224F, 7.0F, 3.5F, 7.0F)
          reflectiveCurveTo(4.0F, 6.776F, 4.0F, 6.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(2.5F)
          curveTo(8.776F, 4.0F, 9.0F, 3.776F, 9.0F, 3.5F)
          reflectiveCurveTo(8.776F, 3.0F, 8.5F, 3.0F)
          close()
          moveTo(3.0F, 14.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, 1.343F, -3.0F, 3.0F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(10.5F, 3.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          reflectiveCurveToRelative(0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineTo(14.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-2.5F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          reflectiveCurveToRelative(0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineToRelative(-0.5F)
          close()
          moveTo(17.0F, 8.5F)
          curveTo(17.0F, 8.776F, 16.776F, 9.0F, 16.5F, 9.0F)
          reflectiveCurveTo(16.0F, 8.776F, 16.0F, 8.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(11.224F, 4.0F, 11.0F, 3.776F, 11.0F, 3.5F)
          reflectiveCurveTo(11.224F, 3.0F, 11.5F, 3.0F)
          horizontalLineTo(14.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(2.5F)
          close()        
      }
    }
    return _resize20!!
  }

private var _resize20: ImageVector? = null
