package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SubtractCircle16: ImageVector
  get() {
    if (_subtractCircle16 != null) {
      return _subtractCircle16!!
    }
    _subtractCircle16 = fluentIcon(name = "Filled.SubtractCircle16", 16f) {
      materialPath {
          moveTo(1.0F, 8.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          reflectiveCurveToRelative(-3.134F, 7.0F, -7.0F, 7.0F)
          reflectiveCurveToRelative(-7.0F, -3.134F, -7.0F, -7.0F)
          close()
          moveToRelative(4.0F, 0.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(5.0F)
          curveTo(10.776F, 8.5F, 11.0F, 8.276F, 11.0F, 8.0F)
          reflectiveCurveToRelative(-0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(5.224F, 7.5F, 5.0F, 7.724F, 5.0F, 8.0F)
          close()        
      }
    }
    return _subtractCircle16!!
  }

private var _subtractCircle16: ImageVector? = null
