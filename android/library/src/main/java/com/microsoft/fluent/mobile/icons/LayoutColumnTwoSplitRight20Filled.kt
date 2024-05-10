package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwoSplitRight20: ImageVector
  get() {
    if (_layoutColumnTwoSplitRight20 != null) {
      return _layoutColumnTwoSplitRight20!!
    }
    _layoutColumnTwoSplitRight20 = fluentIcon(name = "Filled.LayoutColumnTwoSplitRight20", 20f) {
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
          moveTo(6.0F, 3.0F)
          horizontalLineToRelative(3.5F)
          verticalLineToRelative(14.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          close()        
      }
    }
    return _layoutColumnTwoSplitRight20!!
  }

private var _layoutColumnTwoSplitRight20: ImageVector? = null
