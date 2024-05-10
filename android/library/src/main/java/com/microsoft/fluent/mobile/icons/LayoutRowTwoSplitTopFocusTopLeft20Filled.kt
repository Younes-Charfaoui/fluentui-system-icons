package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitTopFocusTopLeft20: ImageVector
  get() {
    if (_layoutRowTwoSplitTopFocusTopLeft20 != null) {
      return _layoutRowTwoSplitTopFocusTopLeft20!!
    }
    _layoutRowTwoSplitTopFocusTopLeft20 = fluentIcon(name = "Filled.LayoutRowTwoSplitTopFocusTopLeft20", 20f) {
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
          moveToRelative(4.0F, 6.5F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(-6.0F)
          close()
          moveToRelative(6.0F, 1.0F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineToRelative(-3.5F)
          horizontalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutRowTwoSplitTopFocusTopLeft20!!
  }

private var _layoutRowTwoSplitTopFocusTopLeft20: ImageVector? = null
