package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.GlanceHorizontal20: ImageVector
  get() {
    if (_glanceHorizontal20 != null) {
      return _glanceHorizontal20!!
    }
    _glanceHorizontal20 = fluentIcon(name = "Filled.GlanceHorizontal20", 20f) {
      materialPath {
          moveTo(14.5F, 3.0F)
          horizontalLineToRelative(1.0F)
          curveTo(16.328F, 3.0F, 17.0F, 3.672F, 17.0F, 4.5F)
          verticalLineToRelative(3.0F)
          curveTo(17.0F, 8.328F, 16.328F, 9.0F, 15.5F, 9.0F)
          horizontalLineToRelative(-1.0F)
          curveTo(13.672F, 9.0F, 13.0F, 8.328F, 13.0F, 7.5F)
          verticalLineToRelative(-3.0F)
          curveTo(13.0F, 3.672F, 13.672F, 3.0F, 14.5F, 3.0F)
          close()
          moveToRelative(-10.0F, 0.0F)
          horizontalLineToRelative(5.0F)
          curveTo(10.328F, 3.0F, 11.0F, 3.672F, 11.0F, 4.5F)
          verticalLineToRelative(3.0F)
          curveTo(11.0F, 8.328F, 10.328F, 9.0F, 9.5F, 9.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(3.672F, 9.0F, 3.0F, 8.328F, 3.0F, 7.5F)
          verticalLineToRelative(-3.0F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          close()
          moveToRelative(0.0F, 8.0F)
          horizontalLineToRelative(1.0F)
          curveTo(6.328F, 11.0F, 7.0F, 11.672F, 7.0F, 12.5F)
          verticalLineToRelative(3.0F)
          curveTo(7.0F, 16.328F, 6.328F, 17.0F, 5.5F, 17.0F)
          horizontalLineToRelative(-1.0F)
          curveTo(3.672F, 17.0F, 3.0F, 16.328F, 3.0F, 15.5F)
          verticalLineToRelative(-3.0F)
          curveTo(3.0F, 11.672F, 3.672F, 11.0F, 4.5F, 11.0F)
          close()
          moveTo(9.0F, 12.5F)
          curveToRelative(0.0F, -0.828F, 0.672F, -1.5F, 1.5F, -1.5F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, 0.672F, 1.5F, 1.5F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(9.672F, 17.0F, 9.0F, 16.328F, 9.0F, 15.5F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _glanceHorizontal20!!
  }

private var _glanceHorizontal20: ImageVector? = null
