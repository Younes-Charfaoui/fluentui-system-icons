package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LayoutColumnTwoSplitRight20: ImageVector
  get() {
    if (_layoutColumnTwoSplitRight20 != null) {
      return _layoutColumnTwoSplitRight20!!
    }
    _layoutColumnTwoSplitRight20 = fluentIcon(name = "Regular.LayoutColumnTwoSplitRight20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(3.0F, -2.0F)
          curveTo(4.895F, 4.0F, 4.0F, 4.895F, 4.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(3.5F)
          verticalLineTo(4.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(8.0F, 12.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-3.5F)
          horizontalLineToRelative(-5.5F)
          verticalLineTo(16.0F)
          horizontalLineTo(14.0F)
          close()
          moveToRelative(2.0F, -6.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(5.5F)
          horizontalLineTo(16.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitRight20!!
  }

private var _layoutColumnTwoSplitRight20: ImageVector? = null
