package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutCellFour16: ImageVector
  get() {
    if (_layoutCellFour16 != null) {
      return _layoutCellFour16!!
    }
    _layoutCellFour16 = fluentIcon(name = "Filled.LayoutCellFour16", 16f) {
      materialPath {
          moveTo(11.5F, 14.0F)
          horizontalLineToRelative(-3.0F)
          verticalLineTo(8.5F)
          horizontalLineTo(14.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          close()
          moveTo(14.0F, 7.5F)
          horizontalLineTo(8.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(3.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(-6.5F, 0.0F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(5.5F)
          close()
          moveTo(2.0F, 8.5F)
          verticalLineToRelative(3.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(3.0F)
          verticalLineTo(8.5F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _layoutCellFour16!!
  }

private var _layoutCellFour16: ImageVector? = null
