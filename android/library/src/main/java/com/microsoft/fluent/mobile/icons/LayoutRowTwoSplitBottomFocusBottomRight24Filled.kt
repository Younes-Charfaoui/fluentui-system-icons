package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitBottomFocusBottomRight24: ImageVector
  get() {
    if (_layoutRowTwoSplitBottomFocusBottomRight24 != null) {
      return _layoutRowTwoSplitBottomFocusBottomRight24!!
    }
    _layoutRowTwoSplitBottomFocusBottomRight24 = fluentIcon(name = "Filled.LayoutRowTwoSplitBottomFocusBottomRight24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          close()
          moveTo(4.5F, 6.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(0.0F, 6.5F)
          horizontalLineTo(12.0F)
          verticalLineToRelative(6.75F)
          horizontalLineTo(6.25F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineToRelative(-5.0F)
          close()        
      }
    }
    return _layoutRowTwoSplitBottomFocusBottomRight24!!
  }

private var _layoutRowTwoSplitBottomFocusBottomRight24: ImageVector? = null
