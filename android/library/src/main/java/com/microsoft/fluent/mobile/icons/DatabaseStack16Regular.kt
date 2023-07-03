package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DatabaseStack16: ImageVector
  get() {
    if (_databaseStack16 != null) {
      return _databaseStack16!!
    }
    _databaseStack16 = fluentIcon(name = "Regular.DatabaseStack16", 16f) {
      materialPath {
          moveTo(8.0F, 1.0F)
          curveTo(5.149F, 1.0F, 3.0F, 2.075F, 3.0F, 3.5F)
          verticalLineToRelative(9.0F)
          curveTo(3.0F, 13.925F, 5.149F, 15.0F, 8.0F, 15.0F)
          reflectiveCurveToRelative(5.0F, -1.075F, 5.0F, -2.5F)
          verticalLineToRelative(-9.0F)
          curveTo(13.0F, 2.075F, 10.851F, 1.0F, 8.0F, 1.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          curveToRelative(2.441F, 0.0F, 4.0F, 0.888F, 4.0F, 1.5F)
          reflectiveCurveTo(10.441F, 5.0F, 8.0F, 5.0F)
          reflectiveCurveTo(4.0F, 4.112F, 4.0F, 3.5F)
          reflectiveCurveTo(5.558F, 2.0F, 8.0F, 2.0F)
          close()
          moveToRelative(0.0F, 12.0F)
          curveToRelative(-2.442F, 0.0F, -4.0F, -0.889F, -4.0F, -1.5F)
          verticalLineTo(9.537F)
          curveTo(4.897F, 10.13F, 6.328F, 10.5F, 8.0F, 10.5F)
          curveToRelative(1.672F, 0.0F, 3.103F, -0.37F, 4.0F, -0.963F)
          verticalLineTo(12.5F)
          curveToRelative(0.0F, 0.611F, -1.559F, 1.5F, -4.0F, 1.5F)
          close()
          moveToRelative(0.0F, -4.5F)
          curveTo(5.558F, 9.5F, 4.0F, 8.612F, 4.0F, 8.0F)
          verticalLineTo(5.021F)
          curveTo(5.214F, 5.719F, 6.601F, 6.058F, 8.0F, 6.0F)
          curveToRelative(1.399F, 0.058F, 2.786F, -0.281F, 4.0F, -0.979F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, 0.612F, -1.558F, 1.5F, -4.0F, 1.5F)
          close()        
      }
    }
    return _databaseStack16!!
  }

private var _databaseStack16: ImageVector? = null
