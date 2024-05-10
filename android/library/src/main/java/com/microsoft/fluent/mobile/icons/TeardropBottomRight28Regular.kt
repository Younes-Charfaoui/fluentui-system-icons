package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TeardropBottomRight28: ImageVector
  get() {
    if (_teardropBottomRight28 != null) {
      return _teardropBottomRight28!!
    }
    _teardropBottomRight28 = fluentIcon(name = "Regular.TeardropBottomRight28", 28f) {
      materialPath {
          moveTo(2.0F, 13.75F)
          curveTo(2.0F, 7.26F, 7.26F, 2.0F, 13.75F, 2.0F)
          horizontalLineToRelative(0.5F)
          curveTo(20.74F, 2.0F, 26.0F, 7.26F, 26.0F, 13.75F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 1.519F, -1.231F, 2.75F, -2.75F, 2.75F)
          horizontalLineToRelative(-9.5F)
          curveTo(7.26F, 26.0F, 2.0F, 20.74F, 2.0F, 14.25F)
          verticalLineToRelative(-0.5F)
          close()
          moveTo(13.75F, 3.5F)
          curveTo(8.09F, 3.5F, 3.5F, 8.09F, 3.5F, 13.75F)
          verticalLineToRelative(0.5F)
          curveToRelative(0.0F, 5.66F, 4.59F, 10.25F, 10.25F, 10.25F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-9.5F)
          curveToRelative(0.0F, -5.66F, -4.59F, -10.25F, -10.25F, -10.25F)
          horizontalLineToRelative(-0.5F)
          close()        
      }
    }
    return _teardropBottomRight28!!
  }

private var _teardropBottomRight28: ImageVector? = null
