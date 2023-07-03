package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Stop16: ImageVector
  get() {
    if (_stop16 != null) {
      return _stop16!!
    }
    _stop16 = fluentIcon(name = "Regular.Stop16", 16f) {
      materialPath {
          moveTo(12.5F, 3.0F)
          curveTo(12.776F, 3.0F, 13.0F, 3.224F, 13.0F, 3.5F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          horizontalLineToRelative(-9.0F)
          curveTo(3.224F, 13.0F, 3.0F, 12.776F, 3.0F, 12.5F)
          verticalLineToRelative(-9.0F)
          curveTo(3.0F, 3.224F, 3.224F, 3.0F, 3.5F, 3.0F)
          horizontalLineToRelative(9.0F)
          close()
          moveToRelative(-9.0F, -1.0F)
          curveTo(2.672F, 2.0F, 2.0F, 2.672F, 2.0F, 3.5F)
          verticalLineToRelative(9.0F)
          curveTo(2.0F, 13.328F, 2.672F, 14.0F, 3.5F, 14.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-9.0F)
          curveTo(14.0F, 2.672F, 13.328F, 2.0F, 12.5F, 2.0F)
          horizontalLineToRelative(-9.0F)
          close()        
      }
    }
    return _stop16!!
  }

private var _stop16: ImageVector? = null
