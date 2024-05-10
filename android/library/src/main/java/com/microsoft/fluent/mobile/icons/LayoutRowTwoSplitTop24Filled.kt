package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitTop24: ImageVector
  get() {
    if (_layoutRowTwoSplitTop24 != null) {
      return _layoutRowTwoSplitTop24!!
    }
    _layoutRowTwoSplitTop24 = fluentIcon(name = "Filled.LayoutRowTwoSplitTop24", 24f) {
      materialPath {
          moveTo(11.25F, 11.25F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(8.25F)
          close()
          moveToRelative(1.5F, 0.0F)
          horizontalLineTo(21.0F)
          verticalLineToRelative(-5.0F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(8.25F)
          close()
          moveToRelative(8.25F, 1.5F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(5.0F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-5.0F)
          close()        
      }
    }
    return _layoutRowTwoSplitTop24!!
  }

private var _layoutRowTwoSplitTop24: ImageVector? = null
