package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockOpen28: ImageVector
  get() {
    if (_lockOpen28 != null) {
      return _lockOpen28!!
    }
    _lockOpen28 = fluentIcon(name = "Filled.LockOpen28", 28f) {
      materialPath {
          moveTo(18.0F, 5.5F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(25.5F, 6.914F, 25.5F, 6.5F)
          verticalLineToRelative(-1.0F)
          curveTo(25.5F, 3.015F, 23.485F, 1.0F, 21.0F, 1.0F)
          reflectiveCurveToRelative(-4.5F, 2.015F, -4.5F, 4.5F)
          verticalLineTo(8.0F)
          horizontalLineTo(7.75F)
          curveTo(5.679F, 8.0F, 4.0F, 9.679F, 4.0F, 11.75F)
          verticalLineToRelative(9.5F)
          curveTo(4.0F, 23.321F, 5.679F, 25.0F, 7.75F, 25.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineToRelative(-9.5F)
          curveTo(23.0F, 9.679F, 21.321F, 8.0F, 19.25F, 8.0F)
          horizontalLineTo(18.0F)
          verticalLineTo(5.5F)
          close()
          moveTo(13.5F, 18.0F)
          curveToRelative(-0.828F, 0.0F, -1.5F, -0.672F, -1.5F, -1.5F)
          reflectiveCurveToRelative(0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveToRelative(-0.672F, 1.5F, -1.5F, 1.5F)
          close()        
      }
    }
    return _lockOpen28!!
  }

private var _lockOpen28: ImageVector? = null
