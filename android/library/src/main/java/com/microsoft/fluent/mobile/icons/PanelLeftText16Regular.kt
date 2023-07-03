package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PanelLeftText16: ImageVector
  get() {
    if (_panelLeftText16 != null) {
      return _panelLeftText16!!
    }
    _panelLeftText16 = fluentIcon(name = "Regular.PanelLeftText16", 16f) {
      materialPath {
          moveTo(4.0F, 5.5F)
          curveTo(4.0F, 5.224F, 4.224F, 5.0F, 4.5F, 5.0F)
          horizontalLineToRelative(1.0F)
          curveTo(5.776F, 5.0F, 6.0F, 5.224F, 6.0F, 5.5F)
          reflectiveCurveTo(5.776F, 6.0F, 5.5F, 6.0F)
          horizontalLineToRelative(-1.0F)
          curveTo(4.224F, 6.0F, 4.0F, 5.776F, 4.0F, 5.5F)
          close()
          moveTo(4.0F, 8.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(1.0F)
          curveTo(5.776F, 7.5F, 6.0F, 7.724F, 6.0F, 8.0F)
          reflectiveCurveTo(5.776F, 8.5F, 5.5F, 8.5F)
          horizontalLineToRelative(-1.0F)
          curveTo(4.224F, 8.5F, 4.0F, 8.276F, 4.0F, 8.0F)
          close()
          moveToRelative(0.5F, 2.0F)
          curveTo(4.224F, 10.0F, 4.0F, 10.224F, 4.0F, 10.5F)
          reflectiveCurveTo(4.224F, 11.0F, 4.5F, 11.0F)
          horizontalLineToRelative(1.0F)
          curveTo(5.776F, 11.0F, 6.0F, 10.776F, 6.0F, 10.5F)
          reflectiveCurveTo(5.776F, 10.0F, 5.5F, 10.0F)
          horizontalLineToRelative(-1.0F)
          close()
          moveToRelative(0.0F, -7.0F)
          curveTo(3.12F, 3.0F, 2.0F, 4.12F, 2.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 11.88F, 3.12F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-5.0F)
          curveTo(14.0F, 4.12F, 12.88F, 3.0F, 11.5F, 3.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(3.0F, 5.5F)
          curveTo(3.0F, 4.672F, 3.672F, 4.0F, 4.5F, 4.0F)
          horizontalLineTo(7.0F)
          verticalLineToRelative(8.0F)
          horizontalLineTo(4.5F)
          curveTo(3.672F, 12.0F, 3.0F, 11.328F, 3.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveTo(8.0F, 12.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(3.5F)
          curveTo(12.328F, 4.0F, 13.0F, 4.672F, 13.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineTo(8.0F)
          close()        
      }
    }
    return _panelLeftText16!!
  }

private var _panelLeftText16: ImageVector? = null
