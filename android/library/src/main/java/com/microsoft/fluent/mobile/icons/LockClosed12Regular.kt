package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LockClosed12: ImageVector
  get() {
    if (_lockClosed12 != null) {
      return _lockClosed12!!
    }
    _lockClosed12 = fluentIcon(name = "Regular.LockClosed12", 12f) {
      materialPath {
          moveTo(4.0F, 4.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(0.5F)
          curveTo(9.328F, 4.0F, 10.0F, 4.672F, 10.0F, 5.5F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(2.672F, 11.0F, 2.0F, 10.328F, 2.0F, 9.5F)
          verticalLineToRelative(-4.0F)
          curveTo(2.0F, 4.672F, 2.672F, 4.0F, 3.5F, 4.0F)
          horizontalLineTo(4.0F)
          close()
          moveToRelative(1.0F, -1.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveTo(5.0F, 2.448F, 5.0F, 3.0F)
          close()
          moveTo(3.5F, 5.0F)
          curveTo(3.224F, 5.0F, 3.0F, 5.224F, 3.0F, 5.5F)
          verticalLineToRelative(4.0F)
          curveTo(3.0F, 9.776F, 3.224F, 10.0F, 3.5F, 10.0F)
          horizontalLineToRelative(5.0F)
          curveTo(8.776F, 10.0F, 9.0F, 9.776F, 9.0F, 9.5F)
          verticalLineToRelative(-4.0F)
          curveTo(9.0F, 5.224F, 8.776F, 5.0F, 8.5F, 5.0F)
          horizontalLineToRelative(-5.0F)
          close()        
      }
    }
    return _lockClosed12!!
  }

private var _lockClosed12: ImageVector? = null
