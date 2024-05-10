package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowForward32: ImageVector
  get() {
    if (_arrowForward32 != null) {
      return _arrowForward32!!
    }
    _arrowForward32 = fluentIcon(name = "Filled.ArrowForward32", 32f) {
      materialPath {
          moveTo(20.116F, 6.884F)
          curveToRelative(-0.488F, -0.488F, -0.488F, -1.28F, 0.0F, -1.768F)
          reflectiveCurveToRelative(1.28F, -0.488F, 1.768F, 0.0F)
          lineToRelative(7.0F, 7.0F)
          curveToRelative(0.488F, 0.488F, 0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(-7.0F, 7.0F)
          curveToRelative(-0.488F, 0.488F, -1.28F, 0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(4.866F, -4.866F)
          horizontalLineTo(16.0F)
          curveToRelative(-5.937F, 0.0F, -10.75F, 4.813F, -10.75F, 10.75F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          reflectiveCurveTo(2.75F, 25.69F, 2.75F, 25.0F)
          curveToRelative(0.0F, -7.318F, 5.932F, -13.25F, 13.25F, -13.25F)
          horizontalLineToRelative(8.982F)
          lineToRelative(-4.866F, -4.866F)
          close()        
      }
    }
    return _arrowForward32!!
  }

private var _arrowForward32: ImageVector? = null
