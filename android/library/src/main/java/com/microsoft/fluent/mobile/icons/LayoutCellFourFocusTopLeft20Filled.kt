package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutCellFourFocusTopLeft20: ImageVector
  get() {
    if (_layoutCellFourFocusTopLeft20 != null) {
      return _layoutCellFourFocusTopLeft20!!
    }
    _layoutCellFourFocusTopLeft20 = fluentIcon(name = "Filled.LayoutCellFourFocusTopLeft20", 20f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(-2.0F, 7.5F)
          horizontalLineToRelative(5.5F)
          verticalLineTo(16.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineToRelative(-3.5F)
          close()
          moveToRelative(12.0F, 0.0F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(-5.5F)
          horizontalLineTo(16.0F)
          close()
          moveToRelative(-5.5F, -1.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(14.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(-5.5F)
          close()        
      }
    }
    return _layoutCellFourFocusTopLeft20!!
  }

private var _layoutCellFourFocusTopLeft20: ImageVector? = null
