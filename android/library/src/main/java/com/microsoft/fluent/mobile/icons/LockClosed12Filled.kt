package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockClosed12: ImageVector
  get() {
    if (_lockClosed12 != null) {
      return _lockClosed12!!
    }
    _lockClosed12 = fluentIcon(name = "Filled.LockClosed12", 12f) {
      materialPath {
          moveTo(8.0F, 4.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveTo(4.0F, 1.895F, 4.0F, 3.0F)
          verticalLineToRelative(1.0F)
          horizontalLineTo(3.5F)
          curveTo(2.672F, 4.0F, 2.0F, 4.672F, 2.0F, 5.5F)
          verticalLineToRelative(4.0F)
          curveTo(2.0F, 10.328F, 2.672F, 11.0F, 3.5F, 11.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-4.0F)
          curveTo(10.0F, 4.672F, 9.328F, 4.0F, 8.5F, 4.0F)
          horizontalLineTo(8.0F)
          close()
          moveTo(6.0F, 2.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(1.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          close()        
      }
    }
    return _lockClosed12!!
  }

private var _lockClosed12: ImageVector? = null
