package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.BookClock20: ImageVector
  get() {
    if (_bookClock20 != null) {
      return _bookClock20!!
    }
    _bookClock20 = fluentIcon(name = "Regular.BookClock20", 20f) {
      materialPath {
          moveTo(4.0F, 4.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(15.776F, 17.0F, 15.5F, 17.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          curveTo(4.895F, 2.0F, 4.0F, 2.895F, 4.0F, 4.0F)
          close()
          moveToRelative(10.0F, -1.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(11.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(8.0F)
          close()
          moveToRelative(-4.0F, 3.0F)
          curveTo(8.343F, 6.0F, 7.0F, 7.343F, 7.0F, 9.0F)
          reflectiveCurveToRelative(1.343F, 3.0F, 3.0F, 3.0F)
          reflectiveCurveToRelative(3.0F, -1.343F, 3.0F, -3.0F)
          reflectiveCurveToRelative(-1.343F, -3.0F, -3.0F, -3.0F)
          close()
          moveTo(6.0F, 9.0F)
          curveToRelative(0.0F, -2.21F, 1.79F, -4.0F, 4.0F, -4.0F)
          reflectiveCurveToRelative(4.0F, 1.79F, 4.0F, 4.0F)
          reflectiveCurveToRelative(-1.79F, 4.0F, -4.0F, 4.0F)
          reflectiveCurveToRelative(-4.0F, -1.79F, -4.0F, -4.0F)
          close()
          moveToRelative(4.0F, -1.5F)
          curveTo(10.0F, 7.224F, 9.776F, 7.0F, 9.5F, 7.0F)
          reflectiveCurveTo(9.0F, 7.224F, 9.0F, 7.5F)
          verticalLineToRelative(2.0F)
          curveTo(9.0F, 9.776F, 9.224F, 10.0F, 9.5F, 10.0F)
          horizontalLineTo(11.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(11.276F, 9.0F, 11.0F, 9.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineTo(7.5F)
          close()        
      }
    }
    return _bookClock20!!
  }

private var _bookClock20: ImageVector? = null
