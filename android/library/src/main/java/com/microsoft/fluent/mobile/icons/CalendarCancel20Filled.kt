package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarCancel20: ImageVector
  get() {
    if (_calendarCancel20 != null) {
      return _calendarCancel20!!
    }
    _calendarCancel20 = fluentIcon(name = "Filled.CalendarCancel20", 20f) {
      materialPath {
          moveTo(17.0F, 7.0F)
          verticalLineToRelative(2.6F)
          curveTo(16.25F, 9.216F, 15.4F, 9.0F, 14.5F, 9.0F)
          curveTo(11.462F, 9.0F, 9.0F, 11.462F, 9.0F, 14.5F)
          curveToRelative(0.0F, 0.9F, 0.216F, 1.75F, 0.6F, 2.5F)
          horizontalLineTo(5.5F)
          curveTo(4.12F, 17.0F, 3.0F, 15.88F, 3.0F, 14.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(14.0F)
          close()
          moveToRelative(-2.5F, -4.0F)
          curveTo(15.88F, 3.0F, 17.0F, 4.12F, 17.0F, 5.5F)
          verticalLineTo(6.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(5.5F)
          curveTo(3.0F, 4.12F, 4.12F, 3.0F, 5.5F, 3.0F)
          horizontalLineToRelative(9.0F)
          close()
          moveTo(19.0F, 14.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(10.0F, 16.985F, 10.0F, 14.5F)
          reflectiveCurveToRelative(2.015F, -4.5F, 4.5F, -4.5F)
          reflectiveCurveToRelative(4.5F, 2.015F, 4.5F, 4.5F)
          close()
          moveToRelative(-4.5F, 0.707F)
          lineToRelative(1.146F, 1.147F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineTo(15.207F, 14.5F)
          lineToRelative(1.147F, -1.146F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(14.5F, 13.793F)
          lineToRelative(-1.146F, -1.147F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.147F, 1.146F)
          lineToRelative(-1.147F, 1.146F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(1.146F, -1.147F)
          close()        
      }
    }
    return _calendarCancel20!!
  }

private var _calendarCancel20: ImageVector? = null