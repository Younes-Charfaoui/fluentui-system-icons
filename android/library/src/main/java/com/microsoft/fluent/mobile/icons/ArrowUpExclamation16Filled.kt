package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowUpExclamation16: ImageVector
  get() {
    if (_arrowUpExclamation16 != null) {
      return _arrowUpExclamation16!!
    }
    _arrowUpExclamation16 = fluentIcon(name = "Filled.ArrowUpExclamation16", 16f) {
      materialPath {
          moveTo(12.0F, 2.707F)
          verticalLineTo(14.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(11.0F, 14.776F, 11.0F, 14.5F)
          verticalLineTo(2.707F)
          lineTo(9.854F, 3.854F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.707F, 0.0F)
          curveToRelative(-0.196F, -0.196F, -0.196F, -0.512F, 0.0F, -0.708F)
          lineToRelative(2.0F, -2.0F)
          curveToRelative(0.195F, -0.195F, 0.511F, -0.195F, 0.707F, 0.0F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineTo(12.0F, 2.707F)
          close()
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
      }
    }
    return _arrowUpExclamation16!!
  }

private var _arrowUpExclamation16: ImageVector? = null
