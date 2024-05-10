package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutCellFour20: ImageVector
  get() {
    if (_layoutCellFour20 != null) {
      return _layoutCellFour20!!
    }
    _layoutCellFour20 = fluentIcon(name = "Filled.LayoutCellFour20", 20f) {
      materialPath {
          moveTo(14.0F, 17.0F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(-6.5F)
          horizontalLineTo(17.0F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          close()
          moveToRelative(3.0F, -7.5F)
          horizontalLineToRelative(-6.5F)
          verticalLineTo(3.0F)
          horizontalLineTo(14.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(3.5F)
          close()
          moveToRelative(-7.5F, 0.0F)
          verticalLineTo(3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(6.5F)
          close()
          moveToRelative(-6.5F, 1.0F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(3.5F)
          verticalLineToRelative(-6.5F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _layoutCellFour20!!
  }

private var _layoutCellFour20: ImageVector? = null
