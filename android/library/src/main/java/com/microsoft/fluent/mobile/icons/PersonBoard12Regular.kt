package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PersonBoard12: ImageVector
  get() {
    if (_personBoard12 != null) {
      return _personBoard12!!
    }
    _personBoard12 = fluentIcon(name = "Regular.PersonBoard12", 12f) {
      materialPath {
          moveTo(3.0F, 1.0F)
          curveTo(1.895F, 1.0F, 1.0F, 1.895F, 1.0F, 3.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(3.0F)
          close()
          moveTo(2.0F, 3.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(3.0F)
          curveTo(2.448F, 8.0F, 2.0F, 7.552F, 2.0F, 7.0F)
          verticalLineTo(3.0F)
          close()
          moveToRelative(1.268F, 7.0F)
          curveTo(3.613F, 10.598F, 4.26F, 11.0F, 5.0F, 11.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -0.74F, -0.402F, -1.387F, -1.0F, -1.732F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(3.268F)
          close()
          moveTo(6.0F, 3.5F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          close()
          moveToRelative(1.0F, 2.25F)
          curveToRelative(0.0F, 0.75F, -0.5F, 1.5F, -2.0F, 1.5F)
          reflectiveCurveTo(3.0F, 6.5F, 3.0F, 5.75F)
          curveTo(3.0F, 5.336F, 3.336F, 5.0F, 3.75F, 5.0F)
          horizontalLineToRelative(2.5F)
          curveTo(6.664F, 5.0F, 7.0F, 5.336F, 7.0F, 5.75F)
          close()        
      }
    }
    return _personBoard12!!
  }

private var _personBoard12: ImageVector? = null
