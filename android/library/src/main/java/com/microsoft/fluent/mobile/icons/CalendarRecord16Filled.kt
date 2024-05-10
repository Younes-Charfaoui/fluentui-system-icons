package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarRecord16: ImageVector
  get() {
    if (_calendarRecord16 != null) {
      return _calendarRecord16!!
    }
    _calendarRecord16 = fluentIcon(name = "Filled.CalendarRecord16", 16f) {
      materialPath {
          moveTo(11.5F, 6.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(5.5F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(2.1F)
          curveTo(6.216F, 13.25F, 6.0F, 12.4F, 6.0F, 11.5F)
          curveTo(6.0F, 8.462F, 8.462F, 6.0F, 11.5F, 6.0F)
          close()
          moveTo(14.0F, 4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(4.5F)
          close()
          moveTo(11.5F, 8.0F)
          curveToRelative(1.933F, 0.0F, 3.5F, 1.567F, 3.5F, 3.5F)
          reflectiveCurveTo(13.433F, 15.0F, 11.5F, 15.0F)
          reflectiveCurveTo(8.0F, 13.433F, 8.0F, 11.5F)
          reflectiveCurveTo(9.567F, 8.0F, 11.5F, 8.0F)
          close()
          moveToRelative(0.0F, 8.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          reflectiveCurveTo(13.985F, 7.0F, 11.5F, 7.0F)
          reflectiveCurveTo(7.0F, 9.015F, 7.0F, 11.5F)
          reflectiveCurveTo(9.015F, 16.0F, 11.5F, 16.0F)
          close()
          moveToRelative(2.5F, -4.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          reflectiveCurveTo(9.0F, 12.88F, 9.0F, 11.5F)
          reflectiveCurveTo(10.12F, 9.0F, 11.5F, 9.0F)
          reflectiveCurveToRelative(2.5F, 1.12F, 2.5F, 2.5F)
          close()        
      }
    }
    return _calendarRecord16!!
  }

private var _calendarRecord16: ImageVector? = null
