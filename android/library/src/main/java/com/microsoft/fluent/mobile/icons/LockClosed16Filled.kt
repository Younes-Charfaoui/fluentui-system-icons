package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockClosed16: ImageVector
  get() {
    if (_lockClosed16 != null) {
      return _lockClosed16!!
    }
    _lockClosed16 = fluentIcon(name = "Filled.LockClosed16", 16f) {
      materialPath {
          moveTo(5.0F, 3.5F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(0.5F)
          curveTo(12.88F, 4.0F, 14.0F, 5.12F, 14.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-5.0F)
          curveTo(2.0F, 5.12F, 3.12F, 4.0F, 4.5F, 4.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(3.5F)
          close()
          moveToRelative(3.0F, -2.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(3.5F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          close()
          moveTo(8.0F, 10.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveTo(8.552F, 8.0F, 8.0F, 8.0F)
          reflectiveCurveTo(7.0F, 8.448F, 7.0F, 9.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          close()        
      }
    }
    return _lockClosed16!!
  }

private var _lockClosed16: ImageVector? = null
