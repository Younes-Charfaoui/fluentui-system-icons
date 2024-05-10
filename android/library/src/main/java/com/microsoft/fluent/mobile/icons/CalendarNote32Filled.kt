package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarNote32: ImageVector
  get() {
    if (_calendarNote32 != null) {
      return _calendarNote32!!
    }
    _calendarNote32 = fluentIcon(name = "Filled.CalendarNote32", 32f) {
      materialPath {
          moveTo(7.5F, 3.0F)
          curveTo(5.015F, 3.0F, 3.0F, 5.015F, 3.0F, 7.5F)
          verticalLineTo(9.0F)
          horizontalLineToRelative(26.0F)
          verticalLineTo(7.5F)
          curveTo(29.0F, 5.015F, 26.985F, 3.0F, 24.5F, 3.0F)
          horizontalLineToRelative(-17.0F)
          close()
          moveTo(29.0F, 11.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(13.5F)
          curveTo(3.0F, 26.985F, 5.015F, 29.0F, 7.5F, 29.0F)
          horizontalLineToRelative(6.626F)
          curveTo(14.044F, 28.68F, 14.0F, 28.345F, 14.0F, 28.0F)
          verticalLineToRelative(-9.0F)
          curveToRelative(0.0F, -2.21F, 1.79F, -4.0F, 4.0F, -4.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(0.345F, 0.0F, 0.68F, 0.044F, 1.0F, 0.126F)
          verticalLineTo(11.0F)
          close()
          moveToRelative(-11.0F, 5.5F)
          curveToRelative(-1.38F, 0.0F, -2.5F, 1.12F, -2.5F, 2.5F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 1.38F, 1.12F, 2.5F, 2.5F, 2.5F)
          horizontalLineToRelative(10.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-9.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          horizontalLineTo(18.0F)
          close()
          moveToRelative(0.75F, 5.5F)
          curveTo(18.336F, 22.0F, 18.0F, 21.664F, 18.0F, 21.25F)
          reflectiveCurveToRelative(0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(27.664F, 22.0F, 27.25F, 22.0F)
          horizontalLineToRelative(-8.5F)
          close()
          moveTo(18.0F, 25.75F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-8.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()        
      }
    }
    return _calendarNote32!!
  }

private var _calendarNote32: ImageVector? = null
