package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockClosed32: ImageVector
  get() {
    if (_lockClosed32 != null) {
      return _lockClosed32!!
    }
    _lockClosed32 = fluentIcon(name = "Filled.LockClosed32", 32f) {
      materialPath {
          moveTo(10.0F, 8.0F)
          curveToRelative(0.0F, -3.314F, 2.686F, -6.0F, 6.0F, -6.0F)
          reflectiveCurveToRelative(6.0F, 2.686F, 6.0F, 6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-15.0F)
          curveTo(6.015F, 30.0F, 4.0F, 27.985F, 4.0F, 25.5F)
          verticalLineToRelative(-12.0F)
          curveTo(4.0F, 11.015F, 6.015F, 9.0F, 8.5F, 9.0F)
          horizontalLineTo(10.0F)
          verticalLineTo(8.0F)
          close()
          moveToRelative(6.0F, -4.0F)
          curveToRelative(-2.21F, 0.0F, -4.0F, 1.79F, -4.0F, 4.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(8.0F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, -2.21F, -1.79F, -4.0F, -4.0F, -4.0F)
          close()
          moveToRelative(0.0F, 18.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          close()        
      }
    }
    return _lockClosed32!!
  }

private var _lockClosed32: ImageVector? = null
