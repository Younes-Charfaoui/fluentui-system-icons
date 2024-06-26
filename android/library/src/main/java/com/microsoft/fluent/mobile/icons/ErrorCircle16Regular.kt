package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ErrorCircle16: ImageVector
  get() {
    if (_errorCircle16 != null) {
      return _errorCircle16!!
    }
    _errorCircle16 = fluentIcon(name = "Regular.ErrorCircle16", 16f) {
      materialPath {
          moveTo(8.0F, 2.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          reflectiveCurveToRelative(-2.686F, 6.0F, -6.0F, 6.0F)
          reflectiveCurveToRelative(-6.0F, -2.686F, -6.0F, -6.0F)
          reflectiveCurveToRelative(2.686F, -6.0F, 6.0F, -6.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          curveTo(5.239F, 3.0F, 3.0F, 5.239F, 3.0F, 8.0F)
          reflectiveCurveToRelative(2.239F, 5.0F, 5.0F, 5.0F)
          reflectiveCurveToRelative(5.0F, -2.239F, 5.0F, -5.0F)
          reflectiveCurveToRelative(-2.239F, -5.0F, -5.0F, -5.0F)
          close()
          moveToRelative(0.0F, 7.0F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(8.414F, 11.5F, 8.0F, 11.5F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          reflectiveCurveTo(7.586F, 10.0F, 8.0F, 10.0F)
          close()
          moveToRelative(0.0F, -5.5F)
          curveToRelative(0.245F, 0.0F, 0.45F, 0.177F, 0.492F, 0.41F)
          lineTo(8.5F, 5.0F)
          verticalLineToRelative(3.5F)
          curveTo(8.5F, 8.776F, 8.276F, 9.0F, 8.0F, 9.0F)
          curveTo(7.755F, 9.0F, 7.55F, 8.823F, 7.508F, 8.59F)
          lineTo(7.5F, 8.5F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          close()        
      }
    }
    return _errorCircle16!!
  }

private var _errorCircle16: ImageVector? = null
