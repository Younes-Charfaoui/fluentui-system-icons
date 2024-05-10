package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TeardropBottomRight24: ImageVector
  get() {
    if (_teardropBottomRight24 != null) {
      return _teardropBottomRight24!!
    }
    _teardropBottomRight24 = fluentIcon(name = "Filled.TeardropBottomRight24", 24f) {
      materialPath {
          moveTo(2.0F, 12.0F)
          curveTo(2.0F, 6.477F, 6.477F, 2.0F, 12.0F, 2.0F)
          reflectiveCurveToRelative(10.0F, 4.477F, 10.0F, 10.0F)
          verticalLineToRelative(7.75F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(12.0F)
          curveTo(6.477F, 22.0F, 2.0F, 17.523F, 2.0F, 12.0F)
          close()        
      }
    }
    return _teardropBottomRight24!!
  }

private var _teardropBottomRight24: ImageVector? = null
