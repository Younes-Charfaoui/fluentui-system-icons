package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitTop20: ImageVector
  get() {
    if (_layoutRowTwoSplitTop20 != null) {
      return _layoutRowTwoSplitTop20!!
    }
    _layoutRowTwoSplitTop20 = fluentIcon(name = "Filled.LayoutRowTwoSplitTop20", 20f) {
      materialPath {
          moveTo(9.5F, 9.5F)
          verticalLineTo(3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(6.5F)
          close()
          moveToRelative(1.0F, 0.0F)
          horizontalLineTo(17.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(6.5F)
          close()
          moveToRelative(6.5F, 1.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineToRelative(-3.5F)
          close()        
      }
    }
    return _layoutRowTwoSplitTop20!!
  }

private var _layoutRowTwoSplitTop20: ImageVector? = null
