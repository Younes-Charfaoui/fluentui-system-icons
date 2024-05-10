package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LayoutColumnFour20: ImageVector
  get() {
    if (_layoutColumnFour20 != null) {
      return _layoutColumnFour20!!
    }
    _layoutColumnFour20 = fluentIcon(name = "Regular.LayoutColumnFour20", 20f) {
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
          verticalLineToRelative(12.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(6.5F, 10.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(12.0F)
          horizontalLineToRelative(-2.5F)
          close()
          moveToRelative(-1.0F, 0.0F)
          horizontalLineTo(7.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(2.5F)
          verticalLineToRelative(12.0F)
          close()
          moveToRelative(6.5F, -2.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          verticalLineTo(4.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(8.0F)
          close()        
      }
    }
    return _layoutColumnFour20!!
  }

private var _layoutColumnFour20: ImageVector? = null
