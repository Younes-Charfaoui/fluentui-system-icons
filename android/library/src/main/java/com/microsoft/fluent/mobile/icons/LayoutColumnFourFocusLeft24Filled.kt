package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnFourFocusLeft24: ImageVector
  get() {
    if (_layoutColumnFourFocusLeft24 != null) {
      return _layoutColumnFourFocusLeft24!!
    }
    _layoutColumnFourFocusLeft24 = fluentIcon(name = "Filled.LayoutColumnFourFocusLeft24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          close()
          moveTo(8.0F, 19.5F)
          verticalLineToRelative(-15.0F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(15.0F)
          horizontalLineTo(8.0F)
          close()
          moveToRelative(4.5F, 0.0F)
          verticalLineToRelative(-15.0F)
          horizontalLineTo(15.0F)
          verticalLineToRelative(15.0F)
          horizontalLineToRelative(-2.5F)
          close()
          moveToRelative(4.0F, 0.0F)
          verticalLineToRelative(-15.0F)
          horizontalLineToRelative(1.25F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(16.5F)
          close()        
      }
    }
    return _layoutColumnFourFocusLeft24!!
  }

private var _layoutColumnFourFocusLeft24: ImageVector? = null
