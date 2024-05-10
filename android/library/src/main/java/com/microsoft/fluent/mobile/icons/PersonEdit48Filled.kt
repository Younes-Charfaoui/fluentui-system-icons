package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonEdit48: ImageVector
  get() {
    if (_personEdit48 != null) {
      return _personEdit48!!
    }
    _personEdit48 = fluentIcon(name = "Filled.PersonEdit48", 48f) {
      materialPath {
          moveTo(22.0F, 4.0F)
          curveToRelative(-5.523F, 0.0F, -10.0F, 4.477F, -10.0F, 10.0F)
          reflectiveCurveToRelative(4.477F, 10.0F, 10.0F, 10.0F)
          reflectiveCurveToRelative(10.0F, -4.477F, 10.0F, -10.0F)
          reflectiveCurveTo(27.523F, 4.0F, 22.0F, 4.0F)
          close()
          moveTo(10.25F, 28.0F)
          curveTo(7.903F, 28.0F, 6.0F, 29.901F, 6.0F, 32.249F)
          verticalLineTo(33.0F)
          curveToRelative(0.0F, 3.755F, 1.942F, 6.567F, 4.92F, 8.38F)
          curveTo(13.85F, 43.163F, 17.785F, 44.0F, 21.998F, 44.0F)
          curveToRelative(0.002F, -0.328F, 0.044F, -0.664F, 0.132F, -1.003F)
          lineToRelative(0.838F, -3.235F)
          curveToRelative(0.22F, -0.85F, 0.661F, -1.627F, 1.277F, -2.253F)
          lineTo(33.608F, 28.0F)
          horizontalLineTo(10.25F)
          close()
          moveToRelative(34.584F, -2.832F)
          curveToRelative(-1.563F, -1.563F, -4.1F, -1.554F, -5.652F, 0.022F)
          lineTo(25.671F, 38.913F)
          curveToRelative(-0.37F, 0.375F, -0.634F, 0.841F, -0.767F, 1.351F)
          lineToRelative(-0.838F, 3.234F)
          curveToRelative(-0.383F, 1.477F, 0.961F, 2.82F, 2.437F, 2.438F)
          lineToRelative(3.235F, -0.839F)
          curveToRelative(0.51F, -0.132F, 0.976F, -0.396F, 1.351F, -0.766F)
          lineTo(44.812F, 30.82F)
          curveToRelative(1.575F, -1.55F, 1.585F, -4.088F, 0.022F, -5.651F)
          close()        
      }
    }
    return _personEdit48!!
  }

private var _personEdit48: ImageVector? = null
