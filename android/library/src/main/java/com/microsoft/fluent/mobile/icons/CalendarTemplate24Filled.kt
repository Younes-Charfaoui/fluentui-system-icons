package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarTemplate24: ImageVector
  get() {
    if (_calendarTemplate24 != null) {
      return _calendarTemplate24!!
    }
    _calendarTemplate24 = fluentIcon(name = "Filled.CalendarTemplate24", 24f) {
      materialPath {
          moveTo(2.0F, 5.25F)
          curveTo(2.0F, 3.455F, 3.455F, 2.0F, 5.25F, 2.0F)
          horizontalLineToRelative(10.5F)
          curveTo(17.545F, 2.0F, 19.0F, 3.455F, 19.0F, 5.25F)
          verticalLineTo(9.0F)
          horizontalLineTo(6.75F)
          curveTo(6.336F, 9.0F, 6.0F, 9.336F, 6.0F, 9.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(3.0F)
          curveTo(9.279F, 11.127F, 9.0F, 11.906F, 9.0F, 12.75F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 0.257F, 0.026F, 0.508F, 0.075F, 0.75F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 20.0F, 2.0F, 18.545F, 2.0F, 16.75F)
          verticalLineTo(5.25F)
          close()
          moveToRelative(4.0F, 1.5F)
          curveTo(6.0F, 7.164F, 6.336F, 7.5F, 6.75F, 7.5F)
          horizontalLineToRelative(7.5F)
          curveTo(14.664F, 7.5F, 15.0F, 7.164F, 15.0F, 6.75F)
          reflectiveCurveTo(14.664F, 6.0F, 14.25F, 6.0F)
          horizontalLineToRelative(-7.5F)
          curveTo(6.336F, 6.0F, 6.0F, 6.336F, 6.0F, 6.75F)
          close()
          moveToRelative(4.0F, 6.0F)
          curveToRelative(0.0F, -1.519F, 1.231F, -2.75F, 2.75F, -2.75F)
          horizontalLineToRelative(6.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          verticalLineToRelative(0.75F)
          horizontalLineTo(10.0F)
          verticalLineToRelative(-0.75F)
          close()
          moveTo(10.0F, 15.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(4.25F)
          curveToRelative(0.0F, 1.519F, -1.231F, 2.75F, -2.75F, 2.75F)
          horizontalLineToRelative(-6.5F)
          curveTo(11.231F, 22.0F, 10.0F, 20.769F, 10.0F, 19.25F)
          verticalLineTo(15.0F)
          close()        
      }
    }
    return _calendarTemplate24!!
  }

private var _calendarTemplate24: ImageVector? = null
