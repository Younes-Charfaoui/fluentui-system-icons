package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LockClosed16: ImageVector
  get() {
    if (_lockClosed16 != null) {
      return _lockClosed16!!
    }
    _lockClosed16 = fluentIcon(name = "Regular.LockClosed16", 16f) {
      materialPath {
          moveTo(9.0F, 9.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveTo(7.0F, 9.552F, 7.0F, 9.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          close()
          moveTo(5.0F, 4.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 4.0F, 2.0F, 5.12F, 2.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-5.0F)
          curveTo(14.0F, 5.12F, 12.88F, 4.0F, 11.5F, 4.0F)
          horizontalLineTo(11.0F)
          verticalLineTo(3.5F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          reflectiveCurveToRelative(-3.0F, 1.343F, -3.0F, 3.0F)
          verticalLineTo(4.0F)
          close()
          moveToRelative(1.0F, -0.5F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(6.0F)
          verticalLineTo(3.5F)
          close()
          moveTo(11.5F, 5.0F)
          curveTo(12.328F, 5.0F, 13.0F, 5.672F, 13.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.672F, 13.0F, 3.0F, 12.328F, 3.0F, 11.5F)
          verticalLineToRelative(-5.0F)
          curveTo(3.0F, 5.672F, 3.672F, 5.0F, 4.5F, 5.0F)
          horizontalLineToRelative(7.0F)
          close()        
      }
    }
    return _lockClosed16!!
  }

private var _lockClosed16: ImageVector? = null
