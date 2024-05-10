package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Options32: ImageVector
  get() {
    if (_options32 != null) {
      return _options32!!
    }
    _options32 = fluentIcon(name = "Filled.Options32", 32f) {
      materialPath {
          moveTo(20.5F, 4.5F)
          curveToRelative(-2.142F, 0.0F, -3.934F, 1.496F, -4.389F, 3.5F)
          horizontalLineTo(3.0F)
          curveTo(2.448F, 8.0F, 2.0F, 8.448F, 2.0F, 9.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(13.111F)
          curveToRelative(0.455F, 2.004F, 2.247F, 3.5F, 4.389F, 3.5F)
          curveToRelative(2.142F, 0.0F, 3.934F, -1.496F, 4.389F, -3.5F)
          horizontalLineTo(29.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-4.111F)
          curveToRelative(-0.455F, -2.004F, -2.247F, -3.5F, -4.389F, -3.5F)
          close()
          moveTo(15.889F, 22.0F)
          horizontalLineTo(29.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(15.889F)
          curveToRelative(-0.455F, 2.004F, -2.247F, 3.5F, -4.389F, 3.5F)
          curveToRelative(-2.142F, 0.0F, -3.934F, -1.496F, -4.388F, -3.5F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(4.112F)
          curveToRelative(0.454F, -2.004F, 2.246F, -3.5F, 4.388F, -3.5F)
          reflectiveCurveToRelative(3.934F, 1.496F, 4.389F, 3.5F)
          close()        
      }
    }
    return _options32!!
  }

private var _options32: ImageVector? = null
