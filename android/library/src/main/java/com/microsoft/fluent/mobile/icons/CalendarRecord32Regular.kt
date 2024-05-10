package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CalendarRecord32: ImageVector
  get() {
    if (_calendarRecord32 != null) {
      return _calendarRecord32!!
    }
    _calendarRecord32 = fluentIcon(name = "Regular.CalendarRecord32", 32f) {
      materialPath {
          moveTo(7.5F, 3.0F)
          curveTo(5.015F, 3.0F, 3.0F, 5.015F, 3.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveTo(3.0F, 26.985F, 5.015F, 29.0F, 7.5F, 29.0F)
          horizontalLineToRelative(8.875F)
          curveToRelative(-0.47F, -0.61F, -0.865F, -1.28F, -1.17F, -2.0F)
          horizontalLineTo(7.5F)
          curveTo(6.12F, 27.0F, 5.0F, 25.88F, 5.0F, 24.5F)
          verticalLineTo(11.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(4.206F)
          curveToRelative(0.72F, 0.304F, 1.39F, 0.698F, 2.0F, 1.17F)
          verticalLineTo(7.5F)
          curveTo(29.0F, 5.015F, 26.985F, 3.0F, 24.5F, 3.0F)
          horizontalLineToRelative(-17.0F)
          close()
          moveTo(5.0F, 7.5F)
          curveTo(5.0F, 6.12F, 6.12F, 5.0F, 7.5F, 5.0F)
          horizontalLineToRelative(17.0F)
          curveTo(25.88F, 5.0F, 27.0F, 6.12F, 27.0F, 7.5F)
          verticalLineTo(9.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(7.5F)
          close()
          moveTo(23.5F, 18.0F)
          curveToRelative(3.038F, 0.0F, 5.5F, 2.462F, 5.5F, 5.5F)
          reflectiveCurveTo(26.538F, 29.0F, 23.5F, 29.0F)
          reflectiveCurveTo(18.0F, 26.538F, 18.0F, 23.5F)
          reflectiveCurveToRelative(2.462F, -5.5F, 5.5F, -5.5F)
          close()
          moveToRelative(0.0F, 13.0F)
          curveToRelative(4.142F, 0.0F, 7.5F, -3.358F, 7.5F, -7.5F)
          curveToRelative(0.0F, -4.142F, -3.358F, -7.5F, -7.5F, -7.5F)
          curveToRelative(-4.142F, 0.0F, -7.5F, 3.358F, -7.5F, 7.5F)
          curveToRelative(0.0F, 4.142F, 3.358F, 7.5F, 7.5F, 7.5F)
          close()
          moveToRelative(3.5F, -7.5F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          reflectiveCurveTo(20.0F, 25.433F, 20.0F, 23.5F)
          reflectiveCurveToRelative(1.567F, -3.5F, 3.5F, -3.5F)
          reflectiveCurveToRelative(3.5F, 1.567F, 3.5F, 3.5F)
          close()        
      }
    }
    return _calendarRecord32!!
  }

private var _calendarRecord32: ImageVector? = null
