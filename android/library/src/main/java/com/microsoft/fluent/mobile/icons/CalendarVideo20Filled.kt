package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarVideo20: ImageVector
  get() {
    if (_calendarVideo20 != null) {
      return _calendarVideo20!!
    }
    _calendarVideo20 = fluentIcon(name = "Filled.CalendarVideo20", 20f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineTo(2.0F)
          verticalLineTo(4.5F)
          close()
          moveTo(2.0F, 6.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(2.0F)
          horizontalLineTo(8.5F)
          curveTo(6.567F, 8.0F, 5.0F, 9.567F, 5.0F, 11.5F)
          verticalLineTo(14.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(4.0F, 5.5F)
          curveTo(6.0F, 10.12F, 7.12F, 9.0F, 8.5F, 9.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          verticalLineToRelative(0.129F)
          lineToRelative(2.035F, -1.405F)
          curveToRelative(0.83F, -0.573F, 1.96F, 0.02F, 1.96F, 1.028F)
          verticalLineToRelative(5.498F)
          curveToRelative(0.0F, 1.007F, -1.13F, 1.6F, -1.96F, 1.028F)
          lineTo(16.0F, 16.373F)
          verticalLineTo(16.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(7.12F, 19.0F, 6.0F, 17.88F, 6.0F, 16.5F)
          verticalLineToRelative(-5.0F)
          close()        
      }
    }
    return _calendarVideo20!!
  }

private var _calendarVideo20: ImageVector? = null
