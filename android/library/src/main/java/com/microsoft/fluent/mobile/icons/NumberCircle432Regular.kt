package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle432: ImageVector
  get() {
    if (_numberCircle432 != null) {
      return _numberCircle432!!
    }
    _numberCircle432 = fluentIcon(name = "Regular.NumberCircle432", 432f) {
      materialPath {
          moveTo(4.0F, 16.0F)
          curveTo(4.0F, 9.373F, 9.373F, 4.0F, 16.0F, 4.0F)
          reflectiveCurveToRelative(12.0F, 5.373F, 12.0F, 12.0F)
          reflectiveCurveToRelative(-5.373F, 12.0F, -12.0F, 12.0F)
          reflectiveCurveTo(4.0F, 22.627F, 4.0F, 16.0F)
          close()
          moveTo(16.0F, 2.0F)
          curveTo(8.268F, 2.0F, 2.0F, 8.268F, 2.0F, 16.0F)
          reflectiveCurveToRelative(6.268F, 14.0F, 14.0F, 14.0F)
          reflectiveCurveToRelative(14.0F, -6.268F, 14.0F, -14.0F)
          reflectiveCurveTo(23.732F, 2.0F, 16.0F, 2.0F)
          close()
          moveToRelative(2.998F, 7.821F)
          curveToRelative(0.0F, -1.385F, -1.797F, -1.929F, -2.565F, -0.776F)
          lineToRelative(-5.954F, 8.934F)
          curveTo(9.903F, 18.843F, 10.522F, 20.0F, 11.56F, 20.0F)
          horizontalLineToRelative(5.437F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineTo(9.821F)
          close()
          moveToRelative(-2.0F, 1.982F)
          verticalLineTo(18.0F)
          horizontalLineToRelative(-4.13F)
          lineToRelative(4.13F, -6.197F)
          close()        
      }
    }
    return _numberCircle432!!
  }

private var _numberCircle432: ImageVector? = null
