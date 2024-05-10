package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarNote16: ImageVector
  get() {
    if (_calendarNote16 != null) {
      return _calendarNote16!!
    }
    _calendarNote16 = fluentIcon(name = "Filled.CalendarNote16", 16f) {
      materialPath {
          moveTo(14.0F, 6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineTo(8.5F)
          curveTo(7.12F, 7.0F, 6.0F, 8.12F, 6.0F, 9.5F)
          verticalLineTo(14.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(12.0F)
          close()
          moveToRelative(-2.5F, -4.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineTo(2.0F)
          verticalLineTo(4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          close()
          moveTo(7.0F, 9.5F)
          curveTo(7.0F, 8.672F, 7.672F, 8.0F, 8.5F, 8.0F)
          horizontalLineToRelative(6.0F)
          curveTo(15.328F, 8.0F, 16.0F, 8.672F, 16.0F, 9.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-6.0F)
          curveTo(7.672F, 16.0F, 7.0F, 15.328F, 7.0F, 14.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(7.0F, 4.0F)
          curveToRelative(0.0F, -0.276F, -0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineToRelative(-4.0F)
          curveTo(9.224F, 13.0F, 9.0F, 13.224F, 9.0F, 13.5F)
          reflectiveCurveTo(9.224F, 14.0F, 9.5F, 14.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          close()
          moveTo(9.5F, 10.0F)
          curveTo(9.224F, 10.0F, 9.0F, 10.224F, 9.0F, 10.5F)
          reflectiveCurveTo(9.224F, 11.0F, 9.5F, 11.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(13.776F, 10.0F, 13.5F, 10.0F)
          horizontalLineToRelative(-4.0F)
          close()        
      }
    }
    return _calendarNote16!!
  }

private var _calendarNote16: ImageVector? = null
