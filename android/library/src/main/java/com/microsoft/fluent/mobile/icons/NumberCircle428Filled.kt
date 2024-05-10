package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.NumberCircle428: ImageVector
  get() {
    if (_numberCircle428 != null) {
      return _numberCircle428!!
    }
    _numberCircle428 = fluentIcon(name = "Filled.NumberCircle428", 428f) {
      materialPath {
          moveTo(2.0F, 14.0F)
          curveTo(2.0F, 7.373F, 7.373F, 2.0F, 14.0F, 2.0F)
          reflectiveCurveToRelative(12.0F, 5.373F, 12.0F, 12.0F)
          reflectiveCurveToRelative(-5.373F, 12.0F, -12.0F, 12.0F)
          reflectiveCurveTo(2.0F, 20.627F, 2.0F, 14.0F)
          close()
          moveToRelative(14.5F, -5.581F)
          curveToRelative(0.0F, -1.092F, -1.42F, -1.517F, -2.02F, -0.605F)
          lineToRelative(-5.403F, 8.214F)
          curveTo(8.662F, 16.66F, 9.115F, 17.5F, 9.871F, 17.5F)
          horizontalLineToRelative(5.128F)
          verticalLineToRelative(1.75F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          curveToRelative(0.415F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(17.5F)
          horizontalLineTo(17.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(17.914F, 16.0F, 17.5F, 16.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineTo(8.419F)
          close()
          moveTo(15.0F, 9.755F)
          verticalLineTo(16.0F)
          horizontalLineToRelative(-4.11F)
          lineTo(15.0F, 9.755F)
          close()        
      }
    }
    return _numberCircle428!!
  }

private var _numberCircle428: ImageVector? = null
