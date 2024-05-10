package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowDownExclamation16: ImageVector
  get() {
    if (_arrowDownExclamation16 != null) {
      return _arrowDownExclamation16!!
    }
    _arrowDownExclamation16 = fluentIcon(name = "Filled.ArrowDownExclamation16", 16f) {
      materialPath {
          moveTo(4.5F, 1.0F)
          curveTo(3.12F, 1.0F, 2.0F, 2.12F, 2.0F, 3.5F)
          curveToRelative(0.0F, 2.318F, 0.67F, 4.768F, 1.036F, 5.938F)
          curveTo(3.239F, 10.088F, 3.842F, 10.5F, 4.5F, 10.5F)
          curveToRelative(0.658F, 0.0F, 1.261F, -0.412F, 1.464F, -1.062F)
          curveTo(6.33F, 8.268F, 7.0F, 5.818F, 7.0F, 3.5F)
          curveTo(7.0F, 2.12F, 5.88F, 1.0F, 4.5F, 1.0F)
          close()
          moveTo(2.75F, 13.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          reflectiveCurveToRelative(1.75F, 0.784F, 1.75F, 1.75F)
          reflectiveCurveTo(5.466F, 15.0F, 4.5F, 15.0F)
          reflectiveCurveToRelative(-1.75F, -0.784F, -1.75F, -1.75F)
          close()
          moveTo(12.0F, 1.5F)
          curveTo(12.0F, 1.224F, 11.776F, 1.0F, 11.5F, 1.0F)
          reflectiveCurveTo(11.0F, 1.224F, 11.0F, 1.5F)
          verticalLineToRelative(11.793F)
          lineToRelative(-1.146F, -1.147F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          curveToRelative(-0.196F, 0.196F, -0.196F, 0.512F, 0.0F, 0.708F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.195F, 0.195F, 0.511F, 0.195F, 0.707F, 0.0F)
          lineToRelative(2.0F, -2.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(12.0F, 13.293F)
          verticalLineTo(1.5F)
          close()        
      }
    }
    return _arrowDownExclamation16!!
  }

private var _arrowDownExclamation16: ImageVector? = null
