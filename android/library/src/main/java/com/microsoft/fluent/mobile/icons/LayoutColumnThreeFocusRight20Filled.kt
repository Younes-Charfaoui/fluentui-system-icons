package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThreeFocusRight20: ImageVector
  get() {
    if (_layoutColumnThreeFocusRight20 != null) {
      return _layoutColumnThreeFocusRight20!!
    }
    _layoutColumnThreeFocusRight20 = fluentIcon(name = "Filled.LayoutColumnThreeFocusRight20", 20f) {
      materialPath {
          moveTo(17.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          close()
          moveTo(8.0F, 16.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(12.0F)
          horizontalLineTo(8.0F)
          close()
          moveToRelative(-1.0F, 0.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutColumnThreeFocusRight20!!
  }

private var _layoutColumnThreeFocusRight20: ImageVector? = null
