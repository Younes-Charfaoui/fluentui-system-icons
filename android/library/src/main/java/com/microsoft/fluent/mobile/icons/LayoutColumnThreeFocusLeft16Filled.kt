package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThreeFocusLeft16: ImageVector
  get() {
    if (_layoutColumnThreeFocusLeft16 != null) {
      return _layoutColumnThreeFocusLeft16!!
    }
    _layoutColumnThreeFocusLeft16 = fluentIcon(name = "Filled.LayoutColumnThreeFocusLeft16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(9.0F, 13.0F)
          verticalLineTo(3.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(10.0F)
          horizontalLineToRelative(3.0F)
          close()
          moveToRelative(1.0F, 0.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-7.0F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          horizontalLineTo(10.0F)
          verticalLineToRelative(10.0F)
          close()        
      }
    }
    return _layoutColumnThreeFocusLeft16!!
  }

private var _layoutColumnThreeFocusLeft16: ImageVector? = null
