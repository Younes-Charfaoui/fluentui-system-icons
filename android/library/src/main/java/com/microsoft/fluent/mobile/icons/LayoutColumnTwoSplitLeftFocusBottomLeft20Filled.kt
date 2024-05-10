package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitLeftFocusBottomLeft20: ImageVector
  get() {
    if (_layoutColumnTwoSplitLeftFocusBottomLeft20 != null) {
      return _layoutColumnTwoSplitLeftFocusBottomLeft20!!
    }
    _layoutColumnTwoSplitLeftFocusBottomLeft20 = fluentIcon(name = "Filled.LayoutColumnTwoSplitLeftFocusBottomLeft20", 20f) {
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
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(5.5F)
          verticalLineTo(4.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(8.0F, 12.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(12.0F)
          horizontalLineTo(14.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitLeftFocusBottomLeft20!!
  }

private var _layoutColumnTwoSplitLeftFocusBottomLeft20: ImageVector? = null
