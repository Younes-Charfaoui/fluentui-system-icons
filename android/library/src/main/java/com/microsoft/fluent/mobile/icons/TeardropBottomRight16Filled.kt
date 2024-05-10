package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TeardropBottomRight16: ImageVector
  get() {
    if (_teardropBottomRight16 != null) {
      return _teardropBottomRight16!!
    }
    _teardropBottomRight16 = fluentIcon(name = "Filled.TeardropBottomRight16", 16f) {
      materialPath {
          moveTo(1.0F, 8.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          verticalLineToRelative(5.25F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(8.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, -3.134F, -7.0F, -7.0F)
          close()        
      }
    }
    return _teardropBottomRight16!!
  }

private var _teardropBottomRight16: ImageVector? = null
