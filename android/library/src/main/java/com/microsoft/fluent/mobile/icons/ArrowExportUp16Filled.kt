package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowExportUp16: ImageVector
  get() {
    if (_arrowExportUp16 != null) {
      return _arrowExportUp16!!
    }
    _arrowExportUp16 = fluentIcon(name = "Filled.ArrowExportUp16", 16f) {
      materialPath {
          moveTo(3.0F, 14.25F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(12.664F, 15.0F, 12.25F, 15.0F)
          horizontalLineToRelative(-8.5F)
          curveTo(3.336F, 15.0F, 3.0F, 14.664F, 3.0F, 14.25F)
          close()
          moveToRelative(0.97F, -9.53F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(2.22F, -2.22F)
          verticalLineToRelative(7.69F)
          curveTo(7.25F, 11.664F, 7.586F, 12.0F, 8.0F, 12.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(3.56F)
          lineToRelative(2.22F, 2.22F)
          curveToRelative(0.293F, 0.293F, 0.768F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-3.5F, -3.5F)
          curveToRelative(-0.292F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-3.5F, 3.5F)
          close()        
      }
    }
    return _arrowExportUp16!!
  }

private var _arrowExportUp16: ImageVector? = null
