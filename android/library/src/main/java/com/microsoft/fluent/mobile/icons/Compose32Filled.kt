package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Compose32: ImageVector
  get() {
    if (_compose32 != null) {
      return _compose32!!
    }
    _compose32 = fluentIcon(name = "Filled.Compose32", 32f) {
      materialPath {
          moveTo(29.634F, 4.134F)
          curveToRelative(0.488F, -0.488F, 0.488F, -1.28F, 0.0F, -1.768F)
          reflectiveCurveToRelative(-1.28F, -0.488F, -1.768F, 0.0F)
          lineTo(12.732F, 17.5F)
          lineTo(12.0F, 20.0F)
          lineToRelative(2.5F, -0.732F)
          lineTo(29.634F, 4.134F)
          close()
          moveTo(18.75F, 3.0F)
          curveTo(19.44F, 3.0F, 20.0F, 3.56F, 20.0F, 4.25F)
          reflectiveCurveTo(19.44F, 5.5F, 18.75F, 5.5F)
          horizontalLineToRelative(-11.0F)
          curveTo(6.507F, 5.5F, 5.5F, 6.507F, 5.5F, 7.75F)
          verticalLineToRelative(16.5F)
          curveToRelative(0.0F, 1.243F, 1.007F, 2.25F, 2.25F, 2.25F)
          horizontalLineToRelative(16.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineToRelative(-11.0F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          reflectiveCurveTo(29.0F, 12.56F, 29.0F, 13.25F)
          verticalLineToRelative(11.0F)
          curveToRelative(0.0F, 2.623F, -2.127F, 4.75F, -4.75F, 4.75F)
          horizontalLineTo(7.75F)
          curveTo(5.127F, 29.0F, 3.0F, 26.873F, 3.0F, 24.25F)
          verticalLineTo(7.75F)
          curveTo(3.0F, 5.127F, 5.127F, 3.0F, 7.75F, 3.0F)
          horizontalLineToRelative(11.0F)
          close()        
      }
    }
    return _compose32!!
  }

private var _compose32: ImageVector? = null
