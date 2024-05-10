package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutCellFourFocusTopRight24: ImageVector
  get() {
    if (_layoutCellFourFocusTopRight24 != null) {
      return _layoutCellFourFocusTopRight24!!
    }
    _layoutCellFourFocusTopRight24 = fluentIcon(name = "Filled.LayoutCellFourFocusTopRight24", 24f) {
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
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(6.75F)
          horizontalLineTo(4.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(0.0F, 6.5F)
          horizontalLineToRelative(6.75F)
          verticalLineToRelative(6.75F)
          horizontalLineToRelative(-5.0F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(15.0F, 0.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(-6.75F)
          horizontalLineToRelative(6.75F)
          close()        
      }
    }
    return _layoutCellFourFocusTopRight24!!
  }

private var _layoutCellFourFocusTopRight24: ImageVector? = null
