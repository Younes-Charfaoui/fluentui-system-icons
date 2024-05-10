package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TeardropBottomRight28: ImageVector
  get() {
    if (_teardropBottomRight28 != null) {
      return _teardropBottomRight28!!
    }
    _teardropBottomRight28 = fluentIcon(name = "Filled.TeardropBottomRight28", 28f) {
      materialPath {
          moveTo(13.75F, 2.0F)
          curveTo(7.26F, 2.0F, 2.0F, 7.26F, 2.0F, 13.75F)
          verticalLineToRelative(0.5F)
          curveTo(2.0F, 20.74F, 7.26F, 26.0F, 13.75F, 26.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineToRelative(-9.5F)
          curveTo(26.0F, 7.26F, 20.74F, 2.0F, 14.25F, 2.0F)
          horizontalLineToRelative(-0.5F)
          close()        
      }
    }
    return _teardropBottomRight28!!
  }

private var _teardropBottomRight28: ImageVector? = null
