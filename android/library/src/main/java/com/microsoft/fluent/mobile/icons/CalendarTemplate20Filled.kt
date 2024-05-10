package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarTemplate20: ImageVector
  get() {
    if (_calendarTemplate20 != null) {
      return _calendarTemplate20!!
    }
    _calendarTemplate20 = fluentIcon(name = "Filled.CalendarTemplate20", 20f) {
      materialPath {
          moveTo(5.0F, 2.0F)
          curveTo(3.343F, 2.0F, 2.0F, 3.343F, 2.0F, 5.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(2.035F)
          curveTo(7.012F, 15.837F, 7.0F, 15.67F, 7.0F, 15.5F)
          verticalLineToRelative(-5.0F)
          curveTo(7.0F, 9.52F, 7.402F, 8.635F, 8.05F, 8.0F)
          horizontalLineTo(5.5F)
          curveTo(5.224F, 8.0F, 5.0F, 7.776F, 5.0F, 7.5F)
          reflectiveCurveTo(5.224F, 7.0F, 5.5F, 7.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(0.17F, 0.0F, 0.337F, 0.012F, 0.5F, 0.035F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(5.0F)
          close()
          moveToRelative(0.0F, 3.5F)
          curveTo(5.0F, 5.224F, 5.224F, 5.0F, 5.5F, 5.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.776F, 5.0F, 13.0F, 5.224F, 13.0F, 5.5F)
          reflectiveCurveTo(12.776F, 6.0F, 12.5F, 6.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(5.224F, 6.0F, 5.0F, 5.776F, 5.0F, 5.5F)
          close()
          moveToRelative(3.0F, 5.0F)
          curveTo(8.0F, 9.12F, 9.12F, 8.0F, 10.5F, 8.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          verticalLineTo(11.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(-0.5F)
          close()
          moveToRelative(0.0F, 5.0F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(10.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(9.12F, 18.0F, 8.0F, 16.88F, 8.0F, 15.5F)
          close()        
      }
    }
    return _calendarTemplate20!!
  }

private var _calendarTemplate20: ImageVector? = null
