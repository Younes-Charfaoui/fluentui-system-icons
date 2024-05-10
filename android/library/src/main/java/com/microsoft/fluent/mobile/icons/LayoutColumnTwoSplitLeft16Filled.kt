package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitLeft16: ImageVector
  get() {
    if (_layoutColumnTwoSplitLeft16 != null) {
      return _layoutColumnTwoSplitLeft16!!
    }
    _layoutColumnTwoSplitLeft16 = fluentIcon(name = "Filled.LayoutColumnTwoSplitLeft16", 16f) {
      materialPath {
          moveTo(11.5F, 14.0F)
          horizontalLineToRelative(-3.0F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(3.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          close()
          moveToRelative(-7.0F, -12.0F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(5.5F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(-3.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          close()
          moveTo(2.0F, 8.5F)
          verticalLineToRelative(3.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(3.0F)
          verticalLineTo(8.5F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitLeft16!!
  }

private var _layoutColumnTwoSplitLeft16: ImageVector? = null
