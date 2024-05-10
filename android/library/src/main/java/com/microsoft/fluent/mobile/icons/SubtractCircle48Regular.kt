package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SubtractCircle48: ImageVector
  get() {
    if (_subtractCircle48 != null) {
      return _subtractCircle48!!
    }
    _subtractCircle48 = fluentIcon(name = "Regular.SubtractCircle48", 48f) {
      materialPath {
          moveTo(6.5F, 24.0F)
          curveToRelative(0.0F, -9.665F, 7.835F, -17.5F, 17.5F, -17.5F)
          reflectiveCurveTo(41.5F, 14.335F, 41.5F, 24.0F)
          reflectiveCurveTo(33.665F, 41.5F, 24.0F, 41.5F)
          reflectiveCurveTo(6.5F, 33.665F, 6.5F, 24.0F)
          close()
          moveTo(24.0F, 4.0F)
          curveTo(12.954F, 4.0F, 4.0F, 12.954F, 4.0F, 24.0F)
          reflectiveCurveToRelative(8.954F, 20.0F, 20.0F, 20.0F)
          reflectiveCurveToRelative(20.0F, -8.954F, 20.0F, -20.0F)
          reflectiveCurveTo(35.046F, 4.0F, 24.0F, 4.0F)
          close()
          moveTo(14.0F, 24.0F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineToRelative(17.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveToRelative(-0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineToRelative(-17.5F)
          curveTo(14.56F, 25.25F, 14.0F, 24.69F, 14.0F, 24.0F)
          close()        
      }
    }
    return _subtractCircle48!!
  }

private var _subtractCircle48: ImageVector? = null
