package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarArrowRight24: ImageVector
  get() {
    if (_calendarArrowRight24 != null) {
      return _calendarArrowRight24!!
    }
    _calendarArrowRight24 = fluentIcon(name = "Filled.CalendarArrowRight24", 24f) {
      materialPath {
          moveTo(21.0F, 8.5F)
          verticalLineToRelative(3.522F)
          curveTo(19.99F, 11.375F, 18.789F, 11.0F, 17.5F, 11.0F)
          curveToRelative(-3.59F, 0.0F, -6.5F, 2.91F, -6.5F, 6.5F)
          curveToRelative(0.0F, 1.289F, 0.375F, 2.49F, 1.022F, 3.5F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(8.5F)
          horizontalLineToRelative(18.0F)
          close()
          moveTo(17.75F, 3.0F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineTo(7.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, 3.038F, -2.462F, 5.5F, -5.5F, 5.5F)
          reflectiveCurveTo(12.0F, 20.538F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, -5.5F, 5.5F, -5.5F)
          reflectiveCurveToRelative(5.5F, 2.462F, 5.5F, 5.5F)
          close()
          moveTo(14.5F, 17.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, 0.224F, -0.5F, 0.5F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(4.793F)
          lineToRelative(-1.647F, 1.646F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(2.5F, -2.5F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-2.5F, -2.5F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(19.293F, 17.0F)
          horizontalLineTo(14.5F)
          close()        
      }
    }
    return _calendarArrowRight24!!
  }

private var _calendarArrowRight24: ImageVector? = null