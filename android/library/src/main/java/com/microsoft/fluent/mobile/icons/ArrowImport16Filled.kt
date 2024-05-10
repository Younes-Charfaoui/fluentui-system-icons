package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowImport16: ImageVector
  get() {
    if (_arrowImport16 != null) {
      return _arrowImport16!!
    }
    _arrowImport16 = fluentIcon(name = "Filled.ArrowImport16", 16f) {
      materialPath {
          moveTo(7.22F, 4.22F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(-3.5F, 3.5F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(9.44F, 9.0F)
          horizontalLineTo(1.75F)
          curveTo(1.336F, 9.0F, 1.0F, 8.664F, 1.0F, 8.25F)
          reflectiveCurveTo(1.336F, 7.5F, 1.75F, 7.5F)
          horizontalLineToRelative(7.69F)
          lineTo(7.22F, 5.28F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          close()
          moveToRelative(7.28F, -0.47F)
          curveTo(14.5F, 3.336F, 14.164F, 3.0F, 13.75F, 3.0F)
          reflectiveCurveTo(13.0F, 3.336F, 13.0F, 3.75F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-8.5F)
          close()        
      }
    }
    return _arrowImport16!!
  }

private var _arrowImport16: ImageVector? = null
