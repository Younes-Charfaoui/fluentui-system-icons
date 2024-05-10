package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThreeFocusLeft20: ImageVector
  get() {
    if (_layoutColumnThreeFocusLeft20 != null) {
      return _layoutColumnThreeFocusLeft20!!
    }
    _layoutColumnThreeFocusLeft20 = fluentIcon(name = "Filled.LayoutColumnThreeFocusLeft20", 20f) {
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
          moveToRelative(9.0F, 10.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(12.0F)
          horizontalLineToRelative(4.0F)
          close()
          moveToRelative(1.0F, 0.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutColumnThreeFocusLeft20!!
  }

private var _layoutColumnThreeFocusLeft20: ImageVector? = null
