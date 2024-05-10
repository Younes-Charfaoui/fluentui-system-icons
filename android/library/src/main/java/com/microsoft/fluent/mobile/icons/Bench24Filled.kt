package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Bench24: ImageVector
  get() {
    if (_bench24 != null) {
      return _bench24!!
    }
    _bench24 = fluentIcon(name = "Filled.Bench24", 24f) {
      materialPath {
          moveTo(5.75F, 4.0F)
          curveTo(4.231F, 4.0F, 3.0F, 5.231F, 3.0F, 6.75F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(18.0F)
          verticalLineTo(6.75F)
          curveTo(21.0F, 5.231F, 19.769F, 4.0F, 18.25F, 4.0F)
          horizontalLineTo(5.75F)
          close()
          moveTo(3.0F, 13.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          verticalLineToRelative(2.25F)
          curveTo(3.0F, 19.664F, 3.336F, 20.0F, 3.75F, 20.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(15.0F)
          verticalLineToRelative(2.25F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(21.0F, 19.664F, 21.0F, 19.25F)
          verticalLineTo(17.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _bench24!!
  }

private var _bench24: ImageVector? = null
