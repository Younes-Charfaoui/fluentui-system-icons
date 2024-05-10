package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockOpen48: ImageVector
  get() {
    if (_lockOpen48 != null) {
      return _lockOpen48!!
    }
    _lockOpen48 = fluentIcon(name = "Filled.LockOpen48", 48f) {
      materialPath {
          moveTo(32.0F, 10.0F)
          curveToRelative(0.0F, -3.038F, 2.462F, -5.5F, 5.5F, -5.5F)
          reflectiveCurveTo(43.0F, 6.962F, 43.0F, 10.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveTo(45.5F, 11.69F, 45.5F, 11.0F)
          verticalLineToRelative(-1.0F)
          curveToRelative(0.0F, -4.418F, -3.582F, -8.0F, -8.0F, -8.0F)
          reflectiveCurveToRelative(-8.0F, 3.582F, -8.0F, 8.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(14.25F)
          curveTo(10.798F, 14.0F, 8.0F, 16.798F, 8.0F, 20.25F)
          verticalLineToRelative(15.5F)
          curveTo(8.0F, 39.202F, 10.798F, 42.0F, 14.25F, 42.0F)
          horizontalLineToRelative(19.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineToRelative(-15.5F)
          curveToRelative(0.0F, -3.452F, -2.798F, -6.25F, -6.25F, -6.25F)
          horizontalLineTo(32.0F)
          verticalLineToRelative(-4.0F)
          close()
          moveToRelative(-8.0F, 21.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          reflectiveCurveToRelative(1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          reflectiveCurveToRelative(-1.343F, 3.0F, -3.0F, 3.0F)
          close()        
      }
    }
    return _lockOpen48!!
  }

private var _lockOpen48: ImageVector? = null
