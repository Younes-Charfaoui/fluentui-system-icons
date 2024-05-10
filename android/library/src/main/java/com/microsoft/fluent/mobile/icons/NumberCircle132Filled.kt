package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.NumberCircle132: ImageVector
  get() {
    if (_numberCircle132 != null) {
      return _numberCircle132!!
    }
    _numberCircle132 = fluentIcon(name = "Filled.NumberCircle132", 132f) {
      materialPath {
          moveTo(2.0F, 16.0F)
          curveTo(2.0F, 8.268F, 8.268F, 2.0F, 16.0F, 2.0F)
          reflectiveCurveToRelative(14.0F, 6.268F, 14.0F, 14.0F)
          reflectiveCurveToRelative(-6.268F, 14.0F, -14.0F, 14.0F)
          reflectiveCurveTo(2.0F, 23.732F, 2.0F, 16.0F)
          close()
          moveToRelative(16.0F, -7.0F)
          curveToRelative(0.0F, -0.499F, -0.367F, -0.921F, -0.861F, -0.99F)
          curveToRelative(-0.493F, -0.07F, -0.962F, 0.235F, -1.1F, 0.713F)
          verticalLineToRelative(0.001F)
          lineToRelative(-0.006F, 0.02F)
          lineToRelative(-0.03F, 0.09F)
          curveToRelative(-0.027F, 0.083F, -0.072F, 0.208F, -0.135F, 0.364F)
          curveToRelative(-0.125F, 0.315F, -0.323F, 0.751F, -0.604F, 1.229F)
          curveToRelative(-0.57F, 0.967F, -1.445F, 2.033F, -2.706F, 2.655F)
          curveToRelative(-0.496F, 0.244F, -0.7F, 0.844F, -0.455F, 1.34F)
          curveToRelative(0.244F, 0.495F, 0.844F, 0.698F, 1.34F, 0.454F)
          curveToRelative(1.072F, -0.529F, 1.912F, -1.273F, 2.557F, -2.037F)
          verticalLineTo(22.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(9.0F)
          close()        
      }
    }
    return _numberCircle132!!
  }

private var _numberCircle132: ImageVector? = null
