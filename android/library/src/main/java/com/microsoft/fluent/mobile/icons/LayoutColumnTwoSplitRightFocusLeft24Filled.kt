package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitRightFocusLeft24: ImageVector
  get() {
    if (_layoutColumnTwoSplitRightFocusLeft24 != null) {
      return _layoutColumnTwoSplitRightFocusLeft24!!
    }
    _layoutColumnTwoSplitRightFocusLeft24 = fluentIcon(name = "Filled.LayoutColumnTwoSplitRightFocusLeft24", 24f) {
      materialPath {
          moveTo(3.0F, 6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          close()
          moveToRelative(9.0F, -1.75F)
          verticalLineToRelative(6.75F)
          horizontalLineToRelative(7.5F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(12.0F)
          close()
          moveToRelative(0.0F, 8.25F)
          verticalLineToRelative(6.75F)
          horizontalLineToRelative(5.75F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineToRelative(-5.0F)
          horizontalLineTo(12.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitRightFocusLeft24!!
  }

private var _layoutColumnTwoSplitRightFocusLeft24: ImageVector? = null
