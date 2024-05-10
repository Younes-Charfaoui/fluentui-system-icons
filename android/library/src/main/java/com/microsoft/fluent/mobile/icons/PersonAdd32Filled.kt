package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonAdd32: ImageVector
  get() {
    if (_personAdd32 != null) {
      return _personAdd32!!
    }
    _personAdd32 = fluentIcon(name = "Filled.PersonAdd32", 32f) {
      materialPath {
          moveTo(16.0F, 16.0F)
          curveToRelative(3.866F, 0.0F, 7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          reflectiveCurveToRelative(-7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          close()
          moveToRelative(-8.5F, 2.0F)
          curveTo(5.567F, 18.0F, 4.0F, 19.567F, 4.0F, 21.5F)
          verticalLineTo(22.0F)
          curveToRelative(0.0F, 2.393F, 1.523F, 4.417F, 3.685F, 5.793F)
          curveTo(9.859F, 29.177F, 12.802F, 30.0F, 16.0F, 30.0F)
          curveToRelative(0.415F, 0.0F, 0.827F, -0.014F, 1.232F, -0.041F)
          curveToRelative(-1.685F, -1.636F, -2.732F, -3.925F, -2.732F, -6.459F)
          curveToRelative(0.0F, -2.071F, 0.7F, -3.98F, 1.876F, -5.5F)
          horizontalLineTo(7.5F)
          close()
          moveToRelative(16.0F, 13.0F)
          curveToRelative(4.142F, 0.0F, 7.5F, -3.358F, 7.5F, -7.5F)
          curveToRelative(0.0F, -4.142F, -3.358F, -7.5F, -7.5F, -7.5F)
          curveToRelative(-4.142F, 0.0F, -7.5F, 3.358F, -7.5F, 7.5F)
          curveToRelative(0.0F, 4.142F, 3.358F, 7.5F, 7.5F, 7.5F)
          close()
          moveToRelative(1.0F, -12.25F)
          verticalLineToRelative(3.75F)
          horizontalLineToRelative(3.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(28.664F, 24.0F, 28.25F, 24.0F)
          horizontalLineTo(24.5F)
          verticalLineToRelative(3.75F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveTo(23.0F, 28.164F, 23.0F, 27.75F)
          verticalLineTo(24.0F)
          horizontalLineToRelative(-3.75F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          reflectiveCurveToRelative(0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineTo(23.0F)
          verticalLineToRelative(-3.75F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          close()        
      }
    }
    return _personAdd32!!
  }

private var _personAdd32: ImageVector? = null
