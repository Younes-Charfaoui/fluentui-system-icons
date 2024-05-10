package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Storage32: ImageVector
  get() {
    if (_storage32 != null) {
      return _storage32!!
    }
    _storage32 = fluentIcon(name = "Filled.Storage32", 32f) {
      materialPath {
          moveTo(6.5F, 9.0F)
          curveTo(4.015F, 9.0F, 2.0F, 11.015F, 2.0F, 13.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 20.985F, 4.015F, 23.0F, 6.5F, 23.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -2.485F, -2.015F, -4.5F, -4.5F, -4.5F)
          horizontalLineToRelative(-19.0F)
          close()
          moveTo(21.0F, 14.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          reflectiveCurveTo(18.0F, 15.328F, 18.0F, 14.5F)
          reflectiveCurveToRelative(0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          close()
          moveToRelative(3.5F, 1.5F)
          curveToRelative(-0.828F, 0.0F, -1.5F, -0.672F, -1.5F, -1.5F)
          reflectiveCurveToRelative(0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveToRelative(-0.672F, 1.5F, -1.5F, 1.5F)
          close()        
      }
    }
    return _storage32!!
  }

private var _storage32: ImageVector? = null
