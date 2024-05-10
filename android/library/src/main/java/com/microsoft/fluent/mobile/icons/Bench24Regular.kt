package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Bench24: ImageVector
  get() {
    if (_bench24 != null) {
      return _bench24!!
    }
    _bench24 = fluentIcon(name = "Regular.Bench24", 24f) {
      materialPath {
          moveTo(5.75F, 4.0F)
          curveTo(4.231F, 4.0F, 3.0F, 5.231F, 3.0F, 6.75F)
          verticalLineToRelative(5.3F)
          curveToRelative(-1.141F, 0.232F, -2.0F, 1.24F, -2.0F, 2.45F)
          curveToRelative(0.0F, 1.21F, 0.859F, 2.218F, 2.0F, 2.45F)
          verticalLineToRelative(2.3F)
          curveTo(3.0F, 19.664F, 3.336F, 20.0F, 3.75F, 20.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(15.0F)
          verticalLineToRelative(2.25F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(21.0F, 19.664F, 21.0F, 19.25F)
          verticalLineToRelative(-2.3F)
          curveToRelative(1.141F, -0.232F, 2.0F, -1.24F, 2.0F, -2.45F)
          curveToRelative(0.0F, -1.21F, -0.859F, -2.218F, -2.0F, -2.45F)
          verticalLineToRelative(-5.3F)
          curveTo(21.0F, 5.231F, 19.769F, 4.0F, 18.25F, 4.0F)
          horizontalLineTo(5.75F)
          close()
          moveToRelative(13.75F, 8.0F)
          horizontalLineToRelative(-15.0F)
          verticalLineTo(6.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineToRelative(12.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineTo(12.0F)
          close()
          moveToRelative(1.0F, 3.5F)
          horizontalLineToRelative(-17.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          close()        
      }
    }
    return _bench24!!
  }

private var _bench24: ImageVector? = null
