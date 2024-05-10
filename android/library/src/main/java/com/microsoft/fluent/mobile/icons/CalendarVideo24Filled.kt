package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarVideo24: ImageVector
  get() {
    if (_calendarVideo24 != null) {
      return _calendarVideo24!!
    }
    _calendarVideo24 = fluentIcon(name = "Filled.CalendarVideo24", 24f) {
      materialPath {
          moveTo(1.25F, 4.5F)
          curveToRelative(0.0F, -1.795F, 1.455F, -3.25F, 3.25F, -3.25F)
          horizontalLineToRelative(9.0F)
          curveToRelative(1.795F, 0.0F, 3.25F, 1.455F, 3.25F, 3.25F)
          horizontalLineTo(1.25F)
          close()
          moveToRelative(0.0F, 1.5F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 1.795F, 1.455F, 3.25F, 3.25F, 3.25F)
          horizontalLineToRelative(0.75F)
          verticalLineTo(13.5F)
          curveToRelative(0.0F, -2.347F, 1.903F, -4.25F, 4.25F, -4.25F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.435F, 0.0F, 0.855F, 0.065F, 1.25F, 0.187F)
          verticalLineTo(6.0F)
          horizontalLineTo(1.25F)
          close()
          moveToRelative(14.25F, 4.25F)
          curveToRelative(0.443F, 0.0F, 0.865F, 0.089F, 1.25F, 0.25F)
          curveToRelative(1.13F, 0.47F, 1.937F, 1.561F, 1.997F, 2.848F)
          lineToRelative(2.474F, -1.8F)
          curveTo(22.377F, 10.707F, 24.0F, 11.533F, 24.0F, 12.964F)
          verticalLineToRelative(7.072F)
          curveToRelative(0.0F, 1.43F, -1.623F, 2.257F, -2.78F, 1.415F)
          lineToRelative(-2.473F, -1.8F)
          curveToRelative(-0.08F, 1.725F, -1.503F, 3.099F, -3.247F, 3.099F)
          horizontalLineToRelative(-6.0F)
          curveToRelative(-1.795F, 0.0F, -3.25F, -1.455F, -3.25F, -3.25F)
          verticalLineToRelative(-6.0F)
          curveToRelative(0.0F, -1.795F, 1.455F, -3.25F, 3.25F, -3.25F)
          horizontalLineToRelative(6.0F)
          close()        
      }
    }
    return _calendarVideo24!!
  }

private var _calendarVideo24: ImageVector? = null
