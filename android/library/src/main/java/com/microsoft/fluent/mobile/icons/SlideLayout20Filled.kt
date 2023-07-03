package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SlideLayout20: ImageVector
  get() {
    if (_slideLayout20 != null) {
      return _slideLayout20!!
    }
    _slideLayout20 = fluentIcon(name = "Filled.SlideLayout20", 20f) {
      materialPath {
          moveTo(5.5F, 7.0F)
          horizontalLineToRelative(9.0F)
          curveTo(14.776F, 7.0F, 15.0F, 7.224F, 15.0F, 7.5F)
          verticalLineTo(9.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(7.5F)
          curveTo(5.0F, 7.224F, 5.224F, 7.0F, 5.5F, 7.0F)
          close()
          moveTo(7.0F, 10.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(5.5F)
          curveTo(5.224F, 13.0F, 5.0F, 12.776F, 5.0F, 12.5F)
          verticalLineTo(10.0F)
          horizontalLineToRelative(2.0F)
          close()
          moveToRelative(7.5F, 3.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(-3.0F)
          horizontalLineToRelative(7.0F)
          verticalLineToRelative(2.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          close()
          moveToRelative(-10.0F, -9.0F)
          curveTo(3.12F, 4.0F, 2.0F, 5.12F, 2.0F, 6.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 14.88F, 3.12F, 16.0F, 4.5F, 16.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(18.0F, 5.12F, 16.88F, 4.0F, 15.5F, 4.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveToRelative(10.0F, 10.0F)
          horizontalLineToRelative(-9.0F)
          curveTo(4.672F, 14.0F, 4.0F, 13.328F, 4.0F, 12.5F)
          verticalLineToRelative(-5.0F)
          curveTo(4.0F, 6.672F, 4.672F, 6.0F, 5.5F, 6.0F)
          horizontalLineToRelative(9.0F)
          curveTo(15.328F, 6.0F, 16.0F, 6.672F, 16.0F, 7.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          close()        
      }
    }
    return _slideLayout20!!
  }

private var _slideLayout20: ImageVector? = null
