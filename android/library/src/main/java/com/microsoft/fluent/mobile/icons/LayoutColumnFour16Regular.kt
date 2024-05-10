package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LayoutColumnFour16: ImageVector
  get() {
    if (_layoutColumnFour16 != null) {
      return _layoutColumnFour16!!
    }
    _layoutColumnFour16 = fluentIcon(name = "Regular.LayoutColumnFour16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(3.0F, 4.5F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          verticalLineToRelative(10.0F)
          curveTo(3.672F, 13.0F, 3.0F, 12.328F, 3.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(8.5F, 13.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(10.0F)
          horizontalLineToRelative(-2.0F)
          close()
          moveToRelative(-1.0F, 0.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(10.0F)
          close()
          moveToRelative(5.5F, -1.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          verticalLineTo(3.0F)
          curveTo(12.328F, 3.0F, 13.0F, 3.672F, 13.0F, 4.5F)
          verticalLineToRelative(7.0F)
          close()        
      }
    }
    return _layoutColumnFour16!!
  }

private var _layoutColumnFour16: ImageVector? = null
