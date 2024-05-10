package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarLtr32: ImageVector
  get() {
    if (_calendarLtr32 != null) {
      return _calendarLtr32!!
    }
    _calendarLtr32 = fluentIcon(name = "Filled.CalendarLtr32", 32f) {
      materialPath {
          moveTo(3.0F, 7.5F)
          curveTo(3.0F, 5.015F, 5.015F, 3.0F, 7.5F, 3.0F)
          horizontalLineToRelative(17.0F)
          curveTo(26.985F, 3.0F, 29.0F, 5.015F, 29.0F, 7.5F)
          verticalLineTo(9.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(7.5F)
          close()
          moveTo(3.0F, 11.0F)
          verticalLineToRelative(13.5F)
          curveTo(3.0F, 26.985F, 5.015F, 29.0F, 7.5F, 29.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(11.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(7.5F, 7.0F)
          curveTo(9.672F, 18.0F, 9.0F, 17.328F, 9.0F, 16.5F)
          reflectiveCurveTo(9.672F, 15.0F, 10.5F, 15.0F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveToRelative(-0.672F, 1.5F, -1.5F, 1.5F)
          close()
          moveToRelative(1.5F, 3.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          reflectiveCurveTo(9.0F, 22.328F, 9.0F, 21.5F)
          reflectiveCurveTo(9.672F, 20.0F, 10.5F, 20.0F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          close()
          moveToRelative(4.0F, 1.5F)
          curveToRelative(-0.828F, 0.0F, -1.5F, -0.672F, -1.5F, -1.5F)
          reflectiveCurveTo(15.172F, 20.0F, 16.0F, 20.0F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveTo(16.828F, 23.0F, 16.0F, 23.0F)
          close()
          moveToRelative(1.5F, -6.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          reflectiveCurveToRelative(-1.5F, -0.672F, -1.5F, -1.5F)
          reflectiveCurveTo(15.172F, 15.0F, 16.0F, 15.0F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          close()
          moveToRelative(4.0F, 1.5F)
          curveToRelative(-0.828F, 0.0F, -1.5F, -0.672F, -1.5F, -1.5F)
          reflectiveCurveToRelative(0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveToRelative(-0.672F, 1.5F, -1.5F, 1.5F)
          close()        
      }
    }
    return _calendarLtr32!!
  }

private var _calendarLtr32: ImageVector? = null
