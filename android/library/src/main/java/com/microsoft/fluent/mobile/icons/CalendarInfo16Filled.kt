package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarInfo16: ImageVector
  get() {
    if (_calendarInfo16 != null) {
      return _calendarInfo16!!
    }
    _calendarInfo16 = fluentIcon(name = "Filled.CalendarInfo16", 16f) {
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
          moveToRelative(-3.125F, 5.0F)
          curveToRelative(0.0F, -0.345F, 0.28F, -0.625F, 0.625F, -0.625F)
          reflectiveCurveToRelative(0.625F, 0.28F, 0.625F, 0.625F)
          reflectiveCurveToRelative(-0.28F, 0.625F, -0.625F, 0.625F)
          reflectiveCurveToRelative(-0.625F, -0.28F, -0.625F, -0.625F)
          close()
          moveToRelative(1.125F, 4.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(11.0F, 13.776F, 11.0F, 13.5F)
          verticalLineToRelative(-2.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          reflectiveCurveToRelative(0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineToRelative(2.0F)
          close()
          moveToRelative(-5.0F, -2.0F)
          curveTo(7.0F, 9.015F, 9.015F, 7.0F, 11.5F, 7.0F)
          reflectiveCurveTo(16.0F, 9.015F, 16.0F, 11.5F)
          reflectiveCurveTo(13.985F, 16.0F, 11.5F, 16.0F)
          reflectiveCurveTo(7.0F, 13.985F, 7.0F, 11.5F)
          close()
          moveToRelative(8.0F, 0.0F)
          curveTo(15.0F, 9.567F, 13.433F, 8.0F, 11.5F, 8.0F)
          reflectiveCurveTo(8.0F, 9.567F, 8.0F, 11.5F)
          reflectiveCurveTo(9.567F, 15.0F, 11.5F, 15.0F)
          reflectiveCurveToRelative(3.5F, -1.567F, 3.5F, -3.5F)
          close()        
      }
    }
    return _calendarInfo16!!
  }

private var _calendarInfo16: ImageVector? = null
