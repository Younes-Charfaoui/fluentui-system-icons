package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronCircleLeft32: ImageVector
  get() {
    if (_chevronCircleLeft32 != null) {
      return _chevronCircleLeft32!!
    }
    _chevronCircleLeft32 = fluentIcon(name = "Filled.ChevronCircleLeft32", 32f) {
      materialPath {
          moveTo(30.0F, 16.0F)
          curveToRelative(0.0F, 7.732F, -6.268F, 14.0F, -14.0F, 14.0F)
          reflectiveCurveTo(2.0F, 23.732F, 2.0F, 16.0F)
          reflectiveCurveTo(8.268F, 2.0F, 16.0F, 2.0F)
          reflectiveCurveToRelative(14.0F, 6.268F, 14.0F, 14.0F)
          close()
          moveToRelative(-12.707F, 6.707F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineTo(13.414F, 16.0F)
          lineToRelative(5.293F, -5.293F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          lineToRelative(-5.879F, 5.878F)
          lineToRelative(-0.028F, 0.033F)
          curveToRelative(-0.024F, 0.027F, -0.047F, 0.053F, -0.073F, 0.08F)
          curveTo(11.114F, 15.48F, 11.017F, 15.74F, 11.02F, 16.0F)
          curveToRelative(-0.003F, 0.26F, 0.097F, 0.484F, 0.293F, 0.718F)
          curveToRelative(0.041F, 0.05F, 0.05F, 0.06F, 0.1F, 0.11F)
          horizontalLineToRelative(0.002F)
          lineToRelative(5.878F, 5.88F)
          close()        
      }
    }
    return _chevronCircleLeft32!!
  }

private var _chevronCircleLeft32: ImageVector? = null
