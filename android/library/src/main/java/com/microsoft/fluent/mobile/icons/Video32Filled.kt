package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Video32: ImageVector
  get() {
    if (_video32 != null) {
      return _video32!!
    }
    _video32 = fluentIcon(name = "Filled.Video32", 32f) {
      materialPath {
          moveTo(2.0F, 10.5F)
          curveTo(2.0F, 8.015F, 4.015F, 6.0F, 6.5F, 6.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(11.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-10.0F)
          curveTo(4.015F, 26.0F, 2.0F, 23.985F, 2.0F, 21.5F)
          verticalLineToRelative(-11.0F)
          close()
          moveToRelative(27.996F, -0.746F)
          curveToRelative(0.0F, -1.814F, -2.036F, -2.882F, -3.529F, -1.852F)
          lineToRelative(-3.967F, 2.74F)
          verticalLineToRelative(10.716F)
          lineToRelative(3.968F, 2.74F)
          curveToRelative(1.492F, 1.03F, 3.528F, -0.038F, 3.528F, -1.852F)
          verticalLineTo(9.754F)
          close()        
      }
    }
    return _video32!!
  }

private var _video32: ImageVector? = null
