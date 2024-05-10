package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Autocorrect32: ImageVector
  get() {
    if (_autocorrect32 != null) {
      return _autocorrect32!!
    }
    _autocorrect32 = fluentIcon(name = "Filled.Autocorrect32", 32f) {
      materialPath {
          moveTo(15.165F, 7.903F)
          curveToRelative(0.395F, -0.6F, 1.276F, -0.6F, 1.67F, 0.0F)
          lineTo(20.187F, 13.0F)
          horizontalLineTo(19.5F)
          curveToRelative(-3.59F, 0.0F, -6.5F, 2.91F, -6.5F, 6.5F)
          reflectiveCurveToRelative(2.91F, 6.5F, 6.5F, 6.5F)
          reflectiveCurveToRelative(6.5F, -2.91F, 6.5F, -6.5F)
          curveToRelative(0.0F, -1.206F, -0.328F, -2.335F, -0.9F, -3.302F)
          lineToRelative(-0.04F, -0.075F)
          lineToRelative(-0.371F, -0.623F)
          horizontalLineToRelative(4.061F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveTo(29.44F, 13.0F, 28.75F, 13.0F)
          horizontalLineToRelative(-5.572F)
          lineToRelative(-4.253F, -6.47F)
          curveToRelative(-1.383F, -2.103F, -4.467F, -2.103F, -5.85F, 0.0F)
          lineTo(2.206F, 23.065F)
          curveToRelative(-0.379F, 0.577F, -0.218F, 1.352F, 0.358F, 1.731F)
          curveToRelative(0.577F, 0.38F, 1.352F, 0.22F, 1.732F, -0.358F)
          lineToRelative(10.87F, -16.535F)
          close()
          moveTo(15.5F, 19.5F)
          curveToRelative(0.0F, -2.21F, 1.791F, -4.0F, 4.0F, -4.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, 1.79F, 4.0F, 4.0F)
          reflectiveCurveToRelative(-1.79F, 4.0F, -4.0F, 4.0F)
          curveToRelative(-2.209F, 0.0F, -4.0F, -1.79F, -4.0F, -4.0F)
          close()        
      }
    }
    return _autocorrect32!!
  }

private var _autocorrect32: ImageVector? = null
