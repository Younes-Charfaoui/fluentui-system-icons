package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Timer32: ImageVector
  get() {
    if (_timer32 != null) {
      return _timer32!!
    }
    _timer32 = fluentIcon(name = "Regular.Timer32", 32f) {
      materialPath {
          moveTo(13.0F, 2.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-6.0F)
          close()
          moveToRelative(3.0F, 9.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-6.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          close()
          moveToRelative(12.0F, 7.0F)
          curveToRelative(0.0F, 6.627F, -5.373F, 12.0F, -12.0F, 12.0F)
          reflectiveCurveTo(4.0F, 24.627F, 4.0F, 18.0F)
          reflectiveCurveTo(9.373F, 6.0F, 16.0F, 6.0F)
          reflectiveCurveToRelative(12.0F, 5.373F, 12.0F, 12.0F)
          close()
          moveToRelative(-2.0F, 0.0F)
          curveToRelative(0.0F, -5.523F, -4.477F, -10.0F, -10.0F, -10.0F)
          reflectiveCurveTo(6.0F, 12.477F, 6.0F, 18.0F)
          reflectiveCurveToRelative(4.477F, 10.0F, 10.0F, 10.0F)
          reflectiveCurveToRelative(10.0F, -4.477F, 10.0F, -10.0F)
          close()
          moveToRelative(0.708F, -11.707F)
          curveToRelative(-0.39F, -0.391F, -1.024F, -0.391F, -1.414F, 0.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.023F, 0.0F, 1.414F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.39F, 0.39F, 1.023F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.391F, 0.39F, -1.024F, 0.0F, -1.415F)
          lineToRelative(-2.0F, -2.0F)
          close()        
      }
    }
    return _timer32!!
  }

private var _timer32: ImageVector? = null
