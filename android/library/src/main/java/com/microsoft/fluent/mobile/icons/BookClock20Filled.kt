package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BookClock20: ImageVector
  get() {
    if (_bookClock20 != null) {
      return _bookClock20!!
    }
    _bookClock20 = fluentIcon(name = "Filled.BookClock20", 20f) {
      materialPath {
          moveTo(4.0F, 4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(11.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(5.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(15.776F, 18.0F, 15.5F, 18.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(4.0F)
          close()
          moveToRelative(6.0F, 9.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          reflectiveCurveToRelative(-4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          close()
          moveTo(9.5F, 7.0F)
          curveTo(9.776F, 7.0F, 10.0F, 7.224F, 10.0F, 7.5F)
          verticalLineTo(9.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(11.276F, 10.0F, 11.0F, 10.0F)
          horizontalLineTo(9.5F)
          curveTo(9.224F, 10.0F, 9.0F, 9.776F, 9.0F, 9.5F)
          verticalLineToRelative(-2.0F)
          curveTo(9.0F, 7.224F, 9.224F, 7.0F, 9.5F, 7.0F)
          close()        
      }
    }
    return _bookClock20!!
  }

private var _bookClock20: ImageVector? = null
