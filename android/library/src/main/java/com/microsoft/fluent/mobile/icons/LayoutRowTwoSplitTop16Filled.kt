package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitTop16: ImageVector
  get() {
    if (_layoutRowTwoSplitTop16 != null) {
      return _layoutRowTwoSplitTop16!!
    }
    _layoutRowTwoSplitTop16 = fluentIcon(name = "Filled.LayoutRowTwoSplitTop16", 16f) {
      materialPath {
          moveTo(7.5F, 7.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(5.5F)
          close()
          moveToRelative(1.0F, 0.0F)
          horizontalLineTo(14.0F)
          verticalLineToRelative(-3.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-3.0F)
          verticalLineToRelative(5.5F)
          close()
          moveToRelative(5.5F, 1.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(3.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _layoutRowTwoSplitTop16!!
  }

private var _layoutRowTwoSplitTop16: ImageVector? = null
