package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Important32: ImageVector
  get() {
    if (_important32 != null) {
      return _important32!!
    }
    _important32 = fluentIcon(name = "Filled.Important32", 32f) {
      materialPath {
          moveTo(10.0F, 8.0F)
          curveToRelative(0.0F, -3.314F, 2.686F, -6.0F, 6.0F, -6.0F)
          reflectiveCurveToRelative(6.0F, 2.686F, 6.0F, 6.0F)
          curveToRelative(0.0F, 3.523F, -1.986F, 8.536F, -3.16F, 11.19F)
          curveTo(18.346F, 20.31F, 17.227F, 21.0F, 16.0F, 21.0F)
          curveToRelative(-1.226F, 0.0F, -2.345F, -0.69F, -2.84F, -1.81F)
          curveTo(11.985F, 16.535F, 10.0F, 11.522F, 10.0F, 8.0F)
          close()
          moveToRelative(6.0F, 22.0F)
          curveToRelative(1.933F, 0.0F, 3.5F, -1.567F, 3.5F, -3.5F)
          reflectiveCurveTo(17.933F, 23.0F, 16.0F, 23.0F)
          reflectiveCurveToRelative(-3.5F, 1.567F, -3.5F, 3.5F)
          reflectiveCurveTo(14.067F, 30.0F, 16.0F, 30.0F)
          close()        
      }
    }
    return _important32!!
  }

private var _important32: ImageVector? = null
