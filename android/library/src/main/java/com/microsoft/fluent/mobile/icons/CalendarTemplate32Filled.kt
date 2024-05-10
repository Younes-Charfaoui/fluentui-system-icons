package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarTemplate32: ImageVector
  get() {
    if (_calendarTemplate32 != null) {
      return _calendarTemplate32!!
    }
    _calendarTemplate32 = fluentIcon(name = "Filled.CalendarTemplate32", 32f) {
      materialPath {
          moveTo(2.0F, 6.5F)
          curveTo(2.0F, 4.015F, 4.015F, 2.0F, 6.5F, 2.0F)
          horizontalLineToRelative(15.0F)
          curveTo(23.985F, 2.0F, 26.0F, 4.015F, 26.0F, 6.5F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(-9.5F)
          curveToRelative(-0.782F, 0.0F, -1.523F, 0.18F, -2.182F, 0.5F)
          horizontalLineTo(8.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.169F)
          curveToRelative(-0.426F, 0.735F, -0.669F, 1.59F, -0.669F, 2.5F)
          verticalLineTo(26.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(4.015F, 26.0F, 2.0F, 23.985F, 2.0F, 21.5F)
          verticalLineToRelative(-15.0F)
          close()
          moveTo(7.0F, 9.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(8.0F)
          curveTo(7.448F, 8.0F, 7.0F, 8.448F, 7.0F, 9.0F)
          close()
          moveToRelative(6.0F, 7.5F)
          curveToRelative(0.0F, -1.933F, 1.567F, -3.5F, 3.5F, -3.5F)
          horizontalLineToRelative(10.0F)
          curveToRelative(1.933F, 0.0F, 3.5F, 1.567F, 3.5F, 3.5F)
          verticalLineTo(18.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(-1.5F)
          close()
          moveToRelative(0.0F, 10.0F)
          verticalLineTo(20.0F)
          horizontalLineToRelative(17.0F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          horizontalLineToRelative(-10.0F)
          curveToRelative(-1.933F, 0.0F, -3.5F, -1.567F, -3.5F, -3.5F)
          close()        
      }
    }
    return _calendarTemplate32!!
  }

private var _calendarTemplate32: ImageVector? = null
