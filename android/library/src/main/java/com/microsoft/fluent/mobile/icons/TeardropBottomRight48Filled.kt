package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TeardropBottomRight48: ImageVector
  get() {
    if (_teardropBottomRight48 != null) {
      return _teardropBottomRight48!!
    }
    _teardropBottomRight48 = fluentIcon(name = "Filled.TeardropBottomRight48", 48f) {
      materialPath {
          moveTo(4.0F, 24.0F)
          curveTo(4.0F, 12.954F, 12.954F, 4.0F, 24.0F, 4.0F)
          reflectiveCurveToRelative(20.0F, 8.954F, 20.0F, 20.0F)
          verticalLineToRelative(15.75F)
          curveToRelative(0.0F, 2.347F, -1.903F, 4.25F, -4.25F, 4.25F)
          horizontalLineTo(24.0F)
          curveTo(12.954F, 44.0F, 4.0F, 35.046F, 4.0F, 24.0F)
          close()        
      }
    }
    return _teardropBottomRight48!!
  }

private var _teardropBottomRight48: ImageVector? = null
