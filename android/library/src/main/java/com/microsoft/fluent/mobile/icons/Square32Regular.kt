package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Square32: ImageVector
  get() {
    if (_square32 != null) {
      return _square32!!
    }
    _square32 = fluentIcon(name = "Regular.Square32", 32f) {
      materialPath {
          moveTo(3.0F, 7.5F)
          curveTo(3.0F, 5.015F, 5.015F, 3.0F, 7.5F, 3.0F)
          horizontalLineToRelative(17.0F)
          curveTo(26.985F, 3.0F, 29.0F, 5.015F, 29.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-17.0F)
          curveTo(5.015F, 29.0F, 3.0F, 26.985F, 3.0F, 24.5F)
          verticalLineToRelative(-17.0F)
          close()
          moveTo(7.5F, 5.0F)
          curveTo(6.12F, 5.0F, 5.0F, 6.12F, 5.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveTo(5.0F, 25.88F, 6.12F, 27.0F, 7.5F, 27.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-17.0F)
          curveTo(27.0F, 6.12F, 25.88F, 5.0F, 24.5F, 5.0F)
          horizontalLineToRelative(-17.0F)
          close()        
      }
    }
    return _square32!!
  }

private var _square32: ImageVector? = null