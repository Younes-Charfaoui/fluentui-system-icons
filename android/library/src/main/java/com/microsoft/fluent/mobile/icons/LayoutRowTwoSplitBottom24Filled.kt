package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitBottom24: ImageVector
  get() {
    if (_layoutRowTwoSplitBottom24 != null) {
      return _layoutRowTwoSplitBottom24!!
    }
    _layoutRowTwoSplitBottom24 = fluentIcon(name = "Filled.LayoutRowTwoSplitBottom24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(18.0F)
          verticalLineToRelative(-5.0F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          close()
          moveTo(21.0F, 12.75F)
          horizontalLineToRelative(-8.25F)
          verticalLineTo(21.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(-9.75F, 0.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(5.0F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(-8.25F)
          close()        
      }
    }
    return _layoutRowTwoSplitBottom24!!
  }

private var _layoutRowTwoSplitBottom24: ImageVector? = null
