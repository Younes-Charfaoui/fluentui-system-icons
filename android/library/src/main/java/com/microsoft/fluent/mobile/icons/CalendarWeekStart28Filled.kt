package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarWeekStart28: ImageVector
  get() {
    if (_calendarWeekStart28 != null) {
      return _calendarWeekStart28!!
    }
    _calendarWeekStart28 = fluentIcon(name = "Filled.CalendarWeekStart28", 28f) {
      materialPath {
          moveTo(6.25F, 25.0F)
          curveTo(4.455F, 25.0F, 3.0F, 23.545F, 3.0F, 21.75F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(15.5F)
          curveTo(23.545F, 3.0F, 25.0F, 4.455F, 25.0F, 6.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(2.5F, -5.25F)
          curveToRelative(0.38F, 0.0F, 0.694F, -0.282F, 0.743F, -0.648F)
          lineTo(9.5F, 19.0F)
          verticalLineTo(9.0F)
          lineTo(9.493F, 8.898F)
          curveTo(9.443F, 8.532F, 9.13F, 8.25F, 8.75F, 8.25F)
          reflectiveCurveTo(8.056F, 8.532F, 8.007F, 8.898F)
          lineTo(8.0F, 9.0F)
          verticalLineToRelative(10.0F)
          lineToRelative(0.007F, 0.102F)
          curveToRelative(0.05F, 0.366F, 0.363F, 0.648F, 0.743F, 0.648F)
          close()        
      }
    }
    return _calendarWeekStart28!!
  }

private var _calendarWeekStart28: ImageVector? = null