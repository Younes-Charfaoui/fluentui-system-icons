package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Cloud48: ImageVector
  get() {
    if (_cloud48 != null) {
      return _cloud48!!
    }
    _cloud48 = fluentIcon(name = "Regular.Cloud48", 48f) {
      materialPath {
          moveTo(24.0F, 11.5F)
          curveToRelative(-5.247F, 0.0F, -9.5F, 4.253F, -9.5F, 9.5F)
          curveToRelative(0.0F, 0.074F, 0.0F, 0.148F, 0.002F, 0.221F)
          curveToRelative(0.008F, 0.337F, -0.12F, 0.662F, -0.355F, 0.903F)
          curveToRelative(-0.235F, 0.24F, -0.558F, 0.376F, -0.894F, 0.376F)
          horizontalLineTo(11.5F)
          curveToRelative(-3.314F, 0.0F, -6.0F, 2.686F, -6.0F, 6.0F)
          reflectiveCurveToRelative(2.686F, 6.0F, 6.0F, 6.0F)
          horizontalLineToRelative(25.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, -2.686F, 6.0F, -6.0F)
          reflectiveCurveToRelative(-2.686F, -6.0F, -6.0F, -6.0F)
          horizontalLineToRelative(-1.753F)
          curveToRelative(-0.336F, 0.0F, -0.659F, -0.136F, -0.894F, -0.376F)
          reflectiveCurveToRelative(-0.363F, -0.566F, -0.355F, -0.902F)
          lineTo(33.5F, 21.0F)
          curveToRelative(0.0F, -5.247F, -4.253F, -9.5F, -9.5F, -9.5F)
          close()
          moveTo(12.041F, 20.0F)
          curveTo(12.55F, 13.84F, 17.71F, 9.0F, 24.0F, 9.0F)
          reflectiveCurveToRelative(11.45F, 4.84F, 11.959F, 11.0F)
          horizontalLineTo(36.5F)
          curveToRelative(4.694F, 0.0F, 8.5F, 3.806F, 8.5F, 8.5F)
          reflectiveCurveTo(41.194F, 37.0F, 36.5F, 37.0F)
          horizontalLineToRelative(-25.0F)
          curveTo(6.806F, 37.0F, 3.0F, 33.194F, 3.0F, 28.5F)
          reflectiveCurveTo(6.806F, 20.0F, 11.5F, 20.0F)
          horizontalLineToRelative(0.541F)
          close()        
      }
    }
    return _cloud48!!
  }

private var _cloud48: ImageVector? = null
