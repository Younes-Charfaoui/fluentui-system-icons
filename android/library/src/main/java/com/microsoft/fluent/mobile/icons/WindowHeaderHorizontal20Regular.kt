package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.WindowHeaderHorizontal20: ImageVector
  get() {
    if (_windowHeaderHorizontal20 != null) {
      return _windowHeaderHorizontal20!!
    }
    _windowHeaderHorizontal20 = fluentIcon(name = "Regular.WindowHeaderHorizontal20", 20f) {
      materialPath {
          moveTo(5.5F, 3.0F)
          curveTo(4.12F, 3.0F, 3.0F, 4.12F, 3.0F, 5.5F)
          verticalLineToRelative(9.0F)
          curveTo(3.0F, 15.88F, 4.12F, 17.0F, 5.5F, 17.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-9.0F)
          curveTo(17.0F, 4.12F, 15.88F, 3.0F, 14.5F, 3.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(4.0F, 14.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-9.0F)
          curveTo(4.672F, 16.0F, 4.0F, 15.328F, 4.0F, 14.5F)
          close()        
      }
    }
    return _windowHeaderHorizontal20!!
  }

private var _windowHeaderHorizontal20: ImageVector? = null
