package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarSearch16: ImageVector
  get() {
    if (_calendarSearch16 != null) {
      return _calendarSearch16!!
    }
    _calendarSearch16 = fluentIcon(name = "Filled.CalendarSearch16", 16f) {
      materialPath {
          moveTo(14.0F, 11.5F)
          verticalLineTo(6.0F)
          horizontalLineTo(3.5F)
          curveTo(5.985F, 6.0F, 8.0F, 8.015F, 8.0F, 10.5F)
          curveToRelative(0.0F, 0.695F, -0.157F, 1.353F, -0.439F, 1.94F)
          lineTo(9.121F, 14.0F)
          horizontalLineTo(11.5F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          close()
          moveToRelative(0.0F, -7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(4.5F)
          close()
          moveTo(3.5F, 14.0F)
          curveToRelative(0.786F, 0.0F, 1.512F, -0.26F, 2.096F, -0.697F)
          lineToRelative(2.55F, 2.55F)
          curveToRelative(0.196F, 0.196F, 0.512F, 0.196F, 0.707F, 0.0F)
          curveToRelative(0.196F, -0.195F, 0.196F, -0.511F, 0.0F, -0.707F)
          lineToRelative(-2.55F, -2.55F)
          curveTo(6.741F, 12.012F, 7.0F, 11.286F, 7.0F, 10.5F)
          curveTo(7.0F, 8.567F, 5.433F, 7.0F, 3.5F, 7.0F)
          reflectiveCurveTo(0.0F, 8.567F, 0.0F, 10.5F)
          reflectiveCurveTo(1.567F, 14.0F, 3.5F, 14.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          curveTo(2.12F, 13.0F, 1.0F, 11.88F, 1.0F, 10.5F)
          reflectiveCurveTo(2.12F, 8.0F, 3.5F, 8.0F)
          reflectiveCurveTo(6.0F, 9.12F, 6.0F, 10.5F)
          reflectiveCurveTo(4.88F, 13.0F, 3.5F, 13.0F)
          close()        
      }
    }
    return _calendarSearch16!!
  }

private var _calendarSearch16: ImageVector? = null
