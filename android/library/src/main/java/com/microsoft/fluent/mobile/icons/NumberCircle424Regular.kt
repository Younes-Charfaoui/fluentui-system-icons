package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle424: ImageVector
  get() {
    if (_numberCircle424 != null) {
      return _numberCircle424!!
    }
    _numberCircle424 = fluentIcon(name = "Regular.NumberCircle424", 424f) {
      materialPath {
          moveTo(3.5F, 12.0F)
          curveToRelative(0.0F, -4.694F, 3.806F, -8.5F, 8.5F, -8.5F)
          reflectiveCurveToRelative(8.5F, 3.806F, 8.5F, 8.5F)
          reflectiveCurveToRelative(-3.806F, 8.5F, -8.5F, 8.5F)
          reflectiveCurveToRelative(-8.5F, -3.806F, -8.5F, -8.5F)
          close()
          moveTo(12.0F, 2.0F)
          curveTo(6.477F, 2.0F, 2.0F, 6.477F, 2.0F, 12.0F)
          reflectiveCurveToRelative(4.477F, 10.0F, 10.0F, 10.0F)
          reflectiveCurveToRelative(10.0F, -4.477F, 10.0F, -10.0F)
          reflectiveCurveTo(17.523F, 2.0F, 12.0F, 2.0F)
          close()
          moveToRelative(2.5F, 5.688F)
          curveToRelative(0.0F, -1.097F, -1.43F, -1.518F, -2.024F, -0.596F)
          lineToRelative(-4.157F, 6.443F)
          curveTo(7.91F, 14.167F, 8.365F, 15.0F, 9.117F, 15.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(1.25F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(15.0F)
          horizontalLineToRelative(0.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(14.5F)
          verticalLineTo(7.688F)
          close()
          moveTo(13.0F, 9.046F)
          verticalLineTo(13.5F)
          horizontalLineToRelative(-2.874F)
          lineTo(13.0F, 9.046F)
          close()        
      }
    }
    return _numberCircle424!!
  }

private var _numberCircle424: ImageVector? = null
