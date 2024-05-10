package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Poll32: ImageVector
  get() {
    if (_poll32 != null) {
      return _poll32!!
    }
    _poll32 = fluentIcon(name = "Filled.Poll32", 32f) {
      materialPath {
          moveTo(12.0F, 6.5F)
          curveTo(12.0F, 4.567F, 13.567F, 3.0F, 15.5F, 3.0F)
          reflectiveCurveTo(19.0F, 4.567F, 19.0F, 6.5F)
          verticalLineToRelative(19.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          reflectiveCurveTo(12.0F, 27.433F, 12.0F, 25.5F)
          verticalLineToRelative(-19.0F)
          close()
          moveTo(25.5F, 9.0F)
          curveToRelative(-1.933F, 0.0F, -3.5F, 1.567F, -3.5F, 3.5F)
          verticalLineToRelative(13.0F)
          curveToRelative(0.0F, 1.933F, 1.567F, 3.5F, 3.5F, 3.5F)
          reflectiveCurveToRelative(3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineToRelative(-13.0F)
          curveToRelative(0.0F, -1.933F, -1.567F, -3.5F, -3.5F, -3.5F)
          close()
          moveTo(2.0F, 18.5F)
          curveTo(2.0F, 16.567F, 3.567F, 15.0F, 5.5F, 15.0F)
          reflectiveCurveTo(9.0F, 16.567F, 9.0F, 18.5F)
          verticalLineToRelative(7.0F)
          curveTo(9.0F, 27.433F, 7.433F, 29.0F, 5.5F, 29.0F)
          reflectiveCurveTo(2.0F, 27.433F, 2.0F, 25.5F)
          verticalLineToRelative(-7.0F)
          close()        
      }
    }
    return _poll32!!
  }

private var _poll32: ImageVector? = null
