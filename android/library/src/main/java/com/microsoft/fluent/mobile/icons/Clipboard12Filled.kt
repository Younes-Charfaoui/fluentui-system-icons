package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Clipboard12: ImageVector
  get() {
    if (_clipboard12 != null) {
      return _clipboard12!!
    }
    _clipboard12 = fluentIcon(name = "Filled.Clipboard12", 12f) {
      materialPath {
          moveTo(7.915F, 2.0F)
          horizontalLineTo(8.5F)
          curveTo(9.328F, 2.0F, 10.0F, 2.672F, 10.0F, 3.5F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(2.672F, 11.0F, 2.0F, 10.328F, 2.0F, 9.5F)
          verticalLineToRelative(-6.0F)
          curveTo(2.0F, 2.672F, 2.672F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(0.585F)
          curveTo(4.291F, 1.417F, 4.847F, 1.0F, 5.5F, 1.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.653F, 0.0F, 1.209F, 0.417F, 1.415F, 1.0F)
          close()
          moveTo(5.0F, 2.5F)
          curveTo(5.0F, 2.776F, 5.224F, 3.0F, 5.5F, 3.0F)
          horizontalLineToRelative(1.0F)
          curveTo(6.776F, 3.0F, 7.0F, 2.776F, 7.0F, 2.5F)
          reflectiveCurveTo(6.776F, 2.0F, 6.5F, 2.0F)
          horizontalLineToRelative(-1.0F)
          curveTo(5.224F, 2.0F, 5.0F, 2.224F, 5.0F, 2.5F)
          close()        
      }
    }
    return _clipboard12!!
  }

private var _clipboard12: ImageVector? = null
