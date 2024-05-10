package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LayoutRowTwoSplitTop16: ImageVector
  get() {
    if (_layoutRowTwoSplitTop16 != null) {
      return _layoutRowTwoSplitTop16!!
    }
    _layoutRowTwoSplitTop16 = fluentIcon(name = "Regular.LayoutRowTwoSplitTop16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(4.5F, 3.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(4.5F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(-3.0F)
          close()
          moveToRelative(4.0F, 4.5F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(-3.0F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          horizontalLineToRelative(-3.0F)
          verticalLineToRelative(4.5F)
          close()
          moveToRelative(4.5F, 1.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(3.0F)
          curveTo(3.0F, 12.328F, 3.672F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _layoutRowTwoSplitTop16!!
  }

private var _layoutRowTwoSplitTop16: ImageVector? = null
