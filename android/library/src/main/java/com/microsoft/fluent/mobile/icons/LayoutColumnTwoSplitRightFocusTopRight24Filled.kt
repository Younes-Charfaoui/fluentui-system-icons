package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitRightFocusTopRight24: ImageVector
  get() {
    if (_layoutColumnTwoSplitRightFocusTopRight24 != null) {
      return _layoutColumnTwoSplitRightFocusTopRight24!!
    }
    _layoutColumnTwoSplitRightFocusTopRight24 = fluentIcon(name = "Filled.LayoutColumnTwoSplitRightFocusTopRight24", 24f) {
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
          moveTo(6.25F, 4.5F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(-15.0F)
          horizontalLineToRelative(-5.0F)
          close()
          moveToRelative(11.5F, 15.0F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(-6.75F)
          verticalLineToRelative(7.5F)
          horizontalLineToRelative(5.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitRightFocusTopRight24!!
  }

private var _layoutColumnTwoSplitRightFocusTopRight24: ImageVector? = null
