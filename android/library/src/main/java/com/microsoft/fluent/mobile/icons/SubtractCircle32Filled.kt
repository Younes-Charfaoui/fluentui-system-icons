package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SubtractCircle32: ImageVector
  get() {
    if (_subtractCircle32 != null) {
      return _subtractCircle32!!
    }
    _subtractCircle32 = fluentIcon(name = "Filled.SubtractCircle32", 32f) {
      materialPath {
          moveTo(30.0F, 16.0F)
          curveToRelative(0.0F, 7.732F, -6.268F, 14.0F, -14.0F, 14.0F)
          reflectiveCurveTo(2.0F, 23.732F, 2.0F, 16.0F)
          reflectiveCurveTo(8.268F, 2.0F, 16.0F, 2.0F)
          reflectiveCurveToRelative(14.0F, 6.268F, 14.0F, 14.0F)
          close()
          moveToRelative(-20.0F, -1.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(10.0F)
          close()        
      }
    }
    return _subtractCircle32!!
  }

private var _subtractCircle32: ImageVector? = null
