package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.GlanceHorizontal12: ImageVector
  get() {
    if (_glanceHorizontal12 != null) {
      return _glanceHorizontal12!!
    }
    _glanceHorizontal12 = fluentIcon(name = "Filled.GlanceHorizontal12", 12f) {
      materialPath {
          moveTo(2.5F, 6.0F)
          curveTo(1.672F, 6.0F, 1.0F, 5.328F, 1.0F, 4.5F)
          verticalLineToRelative(-2.0F)
          curveTo(1.0F, 1.672F, 1.672F, 1.0F, 2.5F, 1.0F)
          horizontalLineToRelative(3.0F)
          curveTo(6.328F, 1.0F, 7.0F, 1.672F, 7.0F, 2.5F)
          verticalLineToRelative(2.0F)
          curveTo(7.0F, 5.328F, 6.328F, 6.0F, 5.5F, 6.0F)
          horizontalLineToRelative(-3.0F)
          close()
          moveToRelative(4.0F, 5.0F)
          curveTo(5.672F, 11.0F, 5.0F, 10.328F, 5.0F, 9.5F)
          verticalLineToRelative(-1.0F)
          curveTo(5.0F, 7.672F, 5.672F, 7.0F, 6.5F, 7.0F)
          horizontalLineToRelative(3.0F)
          curveTo(10.328F, 7.0F, 11.0F, 7.672F, 11.0F, 8.5F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-3.0F)
          close()
          moveTo(8.0F, 4.5F)
          curveTo(8.0F, 5.328F, 8.672F, 6.0F, 9.5F, 6.0F)
          reflectiveCurveTo(11.0F, 5.328F, 11.0F, 4.5F)
          verticalLineToRelative(-2.0F)
          curveTo(11.0F, 1.672F, 10.328F, 1.0F, 9.5F, 1.0F)
          reflectiveCurveTo(8.0F, 1.672F, 8.0F, 2.5F)
          verticalLineToRelative(2.0F)
          close()
          moveTo(2.5F, 11.0F)
          curveTo(1.672F, 11.0F, 1.0F, 10.328F, 1.0F, 9.5F)
          verticalLineToRelative(-1.0F)
          curveTo(1.0F, 7.672F, 1.672F, 7.0F, 2.5F, 7.0F)
          reflectiveCurveTo(4.0F, 7.672F, 4.0F, 8.5F)
          verticalLineToRelative(1.0F)
          curveTo(4.0F, 10.328F, 3.328F, 11.0F, 2.5F, 11.0F)
          close()        
      }
    }
    return _glanceHorizontal12!!
  }

private var _glanceHorizontal12: ImageVector? = null
