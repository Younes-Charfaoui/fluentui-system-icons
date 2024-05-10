package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThreeFocusRight16: ImageVector
  get() {
    if (_layoutColumnThreeFocusRight16 != null) {
      return _layoutColumnThreeFocusRight16!!
    }
    _layoutColumnThreeFocusRight16 = fluentIcon(name = "Filled.LayoutColumnThreeFocusRight16", 16f) {
      materialPath {
          moveTo(14.0F, 4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(7.0F, 13.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(10.0F)
          horizontalLineTo(7.0F)
          close()
          moveToRelative(-1.0F, 0.0F)
          horizontalLineTo(4.5F)
          curveTo(3.672F, 13.0F, 3.0F, 12.328F, 3.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(10.0F)
          close()        
      }
    }
    return _layoutColumnThreeFocusRight16!!
  }

private var _layoutColumnThreeFocusRight16: ImageVector? = null
