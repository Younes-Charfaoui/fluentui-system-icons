package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitRightFocusLeft20: ImageVector
  get() {
    if (_layoutColumnTwoSplitRightFocusLeft20 != null) {
      return _layoutColumnTwoSplitRightFocusLeft20!!
    }
    _layoutColumnTwoSplitRightFocusLeft20 = fluentIcon(name = "Filled.LayoutColumnTwoSplitRightFocusLeft20", 20f) {
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
          moveToRelative(7.0F, -2.0F)
          verticalLineToRelative(5.5F)
          horizontalLineToRelative(6.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-4.0F)
          close()
          moveToRelative(0.0F, 6.5F)
          verticalLineTo(16.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-3.5F)
          horizontalLineToRelative(-6.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitRightFocusLeft20!!
  }

private var _layoutColumnTwoSplitRightFocusLeft20: ImageVector? = null
