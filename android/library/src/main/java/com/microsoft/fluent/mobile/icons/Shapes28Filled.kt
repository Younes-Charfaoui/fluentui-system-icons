package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Shapes28: ImageVector
  get() {
    if (_shapes28 != null) {
      return _shapes28!!
    }
    _shapes28 = fluentIcon(name = "Filled.Shapes28", 28f) {
      materialPath {
          moveTo(10.0F, 2.0F)
          curveToRelative(4.418F, 0.0F, 8.0F, 3.582F, 8.0F, 8.0F)
          horizontalLineToRelative(-3.25F)
          curveTo(12.127F, 10.0F, 10.0F, 12.127F, 10.0F, 14.75F)
          verticalLineTo(18.0F)
          curveToRelative(-4.418F, 0.0F, -8.0F, -3.582F, -8.0F, -8.0F)
          reflectiveCurveToRelative(3.582F, -8.0F, 8.0F, -8.0F)
          close()
          moveToRelative(1.0F, 12.75F)
          curveToRelative(0.0F, -2.071F, 1.679F, -3.75F, 3.75F, -3.75F)
          horizontalLineToRelative(7.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, 1.679F, 3.75F, 3.75F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineToRelative(-7.5F)
          curveTo(12.679F, 26.0F, 11.0F, 24.321F, 11.0F, 22.25F)
          verticalLineToRelative(-7.5F)
          close()        
      }
    }
    return _shapes28!!
  }

private var _shapes28: ImageVector? = null
