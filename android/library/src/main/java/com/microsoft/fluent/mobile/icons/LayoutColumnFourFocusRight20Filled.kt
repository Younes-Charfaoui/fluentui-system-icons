package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnFourFocusRight20: ImageVector
  get() {
    if (_layoutColumnFourFocusRight20 != null) {
      return _layoutColumnFourFocusRight20!!
    }
    _layoutColumnFourFocusRight20 = fluentIcon(name = "Filled.LayoutColumnFourFocusRight20", 20f) {
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
          moveTo(4.0F, 6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(0.5F)
          verticalLineToRelative(12.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(3.5F, 10.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(10.0F)
          verticalLineToRelative(12.0F)
          horizontalLineTo(7.5F)
          close()
          moveToRelative(6.0F, 0.0F)
          horizontalLineTo(11.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(2.5F)
          verticalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutColumnFourFocusRight20!!
  }

private var _layoutColumnFourFocusRight20: ImageVector? = null
