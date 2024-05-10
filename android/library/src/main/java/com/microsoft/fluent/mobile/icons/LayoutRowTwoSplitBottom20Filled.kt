package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwoSplitBottom20: ImageVector
  get() {
    if (_layoutRowTwoSplitBottom20 != null) {
      return _layoutRowTwoSplitBottom20!!
    }
    _layoutRowTwoSplitBottom20 = fluentIcon(name = "Filled.LayoutRowTwoSplitBottom20", 20f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(14.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(11.0F, 7.5F)
          horizontalLineToRelative(-6.5F)
          verticalLineTo(17.0F)
          horizontalLineTo(14.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineToRelative(-3.5F)
          close()
          moveToRelative(-7.5F, 0.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(3.5F)
          verticalLineToRelative(-6.5F)
          close()        
      }
    }
    return _layoutRowTwoSplitBottom20!!
  }

private var _layoutRowTwoSplitBottom20: ImageVector? = null
