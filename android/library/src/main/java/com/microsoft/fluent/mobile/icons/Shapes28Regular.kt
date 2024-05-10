package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Shapes28: ImageVector
  get() {
    if (_shapes28 != null) {
      return _shapes28!!
    }
    _shapes28 = fluentIcon(name = "Regular.Shapes28", 28f) {
      materialPath {
          moveTo(10.0F, 16.5F)
          curveToRelative(-3.59F, 0.0F, -6.5F, -2.91F, -6.5F, -6.5F)
          reflectiveCurveTo(6.41F, 3.5F, 10.0F, 3.5F)
          reflectiveCurveToRelative(6.5F, 2.91F, 6.5F, 6.5F)
          horizontalLineTo(18.0F)
          curveToRelative(0.0F, -4.418F, -3.582F, -8.0F, -8.0F, -8.0F)
          reflectiveCurveToRelative(-8.0F, 3.582F, -8.0F, 8.0F)
          reflectiveCurveToRelative(3.582F, 8.0F, 8.0F, 8.0F)
          verticalLineToRelative(-1.5F)
          close()
          moveToRelative(4.75F, -5.5F)
          curveTo(12.679F, 11.0F, 11.0F, 12.679F, 11.0F, 14.75F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineToRelative(7.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineToRelative(-7.5F)
          curveToRelative(0.0F, -2.071F, -1.679F, -3.75F, -3.75F, -3.75F)
          horizontalLineToRelative(-7.5F)
          close()
          moveToRelative(-2.25F, 3.75F)
          curveToRelative(0.0F, -1.243F, 1.007F, -2.25F, 2.25F, -2.25F)
          horizontalLineToRelative(7.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, 1.007F, 2.25F, 2.25F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineToRelative(-7.5F)
          curveToRelative(-1.243F, 0.0F, -2.25F, -1.007F, -2.25F, -2.25F)
          verticalLineToRelative(-7.5F)
          close()        
      }
    }
    return _shapes28!!
  }

private var _shapes28: ImageVector? = null
