package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CalendarPhone16: ImageVector
  get() {
    if (_calendarPhone16 != null) {
      return _calendarPhone16!!
    }
    _calendarPhone16 = fluentIcon(name = "Regular.CalendarPhone16", 16f) {
      materialPath {
          moveTo(11.5F, 2.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(1.604F)
          curveTo(13.762F, 6.036F, 13.51F, 6.0F, 13.25F, 6.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(5.5F)
          curveTo(3.0F, 12.328F, 3.672F, 13.0F, 4.5F, 13.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(1.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(10.0F)
          verticalLineTo(4.5F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          close()
          moveTo(9.0F, 8.75F)
          curveTo(9.0F, 7.784F, 9.784F, 7.0F, 10.75F, 7.0F)
          horizontalLineToRelative(2.5F)
          curveTo(14.216F, 7.0F, 15.0F, 7.784F, 15.0F, 8.75F)
          verticalLineToRelative(5.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-2.5F)
          curveTo(9.784F, 16.0F, 9.0F, 15.216F, 9.0F, 14.25F)
          verticalLineToRelative(-5.5F)
          close()
          moveTo(11.5F, 13.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, 0.224F, -0.5F, 0.5F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(12.776F, 13.0F, 12.5F, 13.0F)
          horizontalLineToRelative(-1.0F)
          close()        
      }
    }
    return _calendarPhone16!!
  }

private var _calendarPhone16: ImageVector? = null
