package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarVideo28: ImageVector
  get() {
    if (_calendarVideo28 != null) {
      return _calendarVideo28!!
    }
    _calendarVideo28 = fluentIcon(name = "Filled.CalendarVideo28", 28f) {
      materialPath {
          moveTo(1.25F, 5.0F)
          curveToRelative(0.0F, -2.071F, 1.679F, -3.75F, 3.75F, -3.75F)
          horizontalLineToRelative(10.0F)
          curveToRelative(2.071F, 0.0F, 3.75F, 1.679F, 3.75F, 3.75F)
          horizontalLineTo(1.25F)
          close()
          moveToRelative(0.0F, 1.5F)
          verticalLineTo(15.0F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(-2.5F)
          curveTo(7.0F, 13.903F, 8.903F, 12.0F, 11.25F, 12.0F)
          horizontalLineToRelative(7.5F)
          verticalLineTo(6.5F)
          horizontalLineTo(1.25F)
          close()
          moveToRelative(10.5F, 6.5F)
          curveTo(9.679F, 13.0F, 8.0F, 14.679F, 8.0F, 16.75F)
          verticalLineToRelative(6.5F)
          curveTo(8.0F, 25.321F, 9.679F, 27.0F, 11.75F, 27.0F)
          horizontalLineToRelative(6.5F)
          curveToRelative(2.067F, 0.0F, 3.744F, -1.673F, 3.75F, -3.739F)
          lineToRelative(3.25F, 2.262F)
          curveTo(26.412F, 26.33F, 28.0F, 25.5F, 28.0F, 24.086F)
          verticalLineToRelative(-8.172F)
          curveToRelative(0.0F, -1.414F, -1.59F, -2.244F, -2.75F, -1.437F)
          lineTo(22.0F, 16.738F)
          curveTo(21.994F, 14.673F, 20.317F, 13.0F, 18.25F, 13.0F)
          horizontalLineToRelative(-6.5F)
          close()        
      }
    }
    return _calendarVideo28!!
  }

private var _calendarVideo28: ImageVector? = null
