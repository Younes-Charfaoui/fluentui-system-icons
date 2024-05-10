package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Desk28: ImageVector
  get() {
    if (_desk28 != null) {
      return _desk28!!
    }
    _desk28 = fluentIcon(name = "Filled.Desk28", 28f) {
      materialPath {
          moveTo(4.754F, 4.0F)
          curveToRelative(-1.519F, 0.0F, -2.75F, 1.231F, -2.75F, 2.75F)
          verticalLineTo(9.0F)
          horizontalLineTo(24.5F)
          verticalLineToRelative(14.25F)
          curveToRelative(0.0F, 0.414F, 0.335F, 0.75F, 0.75F, 0.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(6.75F)
          curveTo(26.0F, 5.231F, 24.768F, 4.0F, 23.25F, 4.0F)
          horizontalLineTo(4.753F)
          close()
          moveTo(14.0F, 10.5F)
          horizontalLineTo(2.004F)
          verticalLineToRelative(9.75F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineToRelative(4.496F)
          curveToRelative(2.071F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(10.5F)
          close()
          moveToRelative(-8.5F, 4.25F)
          curveTo(5.5F, 14.336F, 5.836F, 14.0F, 6.25F, 14.0F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-3.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()        
      }
    }
    return _desk28!!
  }

private var _desk28: ImageVector? = null
