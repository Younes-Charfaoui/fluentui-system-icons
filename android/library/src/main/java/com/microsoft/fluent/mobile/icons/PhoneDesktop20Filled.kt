package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PhoneDesktop20: ImageVector
  get() {
    if (_phoneDesktop20 != null) {
      return _phoneDesktop20!!
    }
    _phoneDesktop20 = fluentIcon(name = "Filled.PhoneDesktop20", 20f) {
      materialPath {
          moveTo(6.0F, 2.0F)
          curveTo(4.895F, 2.0F, 4.0F, 2.895F, 4.0F, 4.0F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(2.5F)
          curveTo(7.88F, 7.0F, 9.0F, 8.12F, 9.0F, 9.5F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(2.0F)
          horizontalLineTo(9.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(5.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(14.776F, 15.0F, 14.5F, 15.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          close()
          moveTo(3.5F, 8.0F)
          curveTo(2.672F, 8.0F, 2.0F, 8.672F, 2.0F, 9.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 17.328F, 2.672F, 18.0F, 3.5F, 18.0F)
          horizontalLineToRelative(3.0F)
          curveTo(7.328F, 18.0F, 8.0F, 17.328F, 8.0F, 16.5F)
          verticalLineToRelative(-7.0F)
          curveTo(8.0F, 8.672F, 7.328F, 8.0F, 6.5F, 8.0F)
          horizontalLineToRelative(-3.0F)
          close()
          moveTo(4.0F, 15.5F)
          curveTo(4.0F, 15.224F, 4.224F, 15.0F, 4.5F, 15.0F)
          horizontalLineToRelative(1.0F)
          curveTo(5.776F, 15.0F, 6.0F, 15.224F, 6.0F, 15.5F)
          reflectiveCurveTo(5.776F, 16.0F, 5.5F, 16.0F)
          horizontalLineToRelative(-1.0F)
          curveTo(4.224F, 16.0F, 4.0F, 15.776F, 4.0F, 15.5F)
          close()        
      }
    }
    return _phoneDesktop20!!
  }

private var _phoneDesktop20: ImageVector? = null
