package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LayoutRowFour20: ImageVector
  get() {
    if (_layoutRowFour20 != null) {
      return _layoutRowFour20!!
    }
    _layoutRowFour20 = fluentIcon(name = "Regular.LayoutRowFour20", 20f) {
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
          moveToRelative(-3.0F, -2.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          horizontalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          close()
          moveTo(4.0F, 10.5F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(13.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(-2.5F)
          close()
          moveToRelative(0.0F, -1.0F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(2.5F)
          horizontalLineTo(4.0F)
          close()
          moveTo(6.0F, 16.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          close()        
      }
    }
    return _layoutRowFour20!!
  }

private var _layoutRowFour20: ImageVector? = null
