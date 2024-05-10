package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitRight16: ImageVector
  get() {
    if (_layoutColumnTwoSplitRight16 != null) {
      return _layoutColumnTwoSplitRight16!!
    }
    _layoutColumnTwoSplitRight16 = fluentIcon(name = "Filled.LayoutColumnTwoSplitRight16", 16f) {
      materialPath {
          moveTo(11.5F, 14.0F)
          horizontalLineToRelative(-3.0F)
          verticalLineTo(8.5F)
          horizontalLineTo(14.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          close()
          moveTo(14.0F, 7.5F)
          horizontalLineTo(8.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(3.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(3.0F)
          close()
          moveTo(4.5F, 2.0F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(12.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitRight16!!
  }

private var _layoutColumnTwoSplitRight16: ImageVector? = null
