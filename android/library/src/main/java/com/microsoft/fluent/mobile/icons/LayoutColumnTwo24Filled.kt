package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnTwo24: ImageVector
  get() {
    if (_layoutColumnTwo24 != null) {
      return _layoutColumnTwo24!!
    }
    _layoutColumnTwo24 = fluentIcon(name = "Filled.LayoutColumnTwo24", 24f) {
      materialPath {
          moveTo(12.75F, 21.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(18.0F)
          close()
          moveToRelative(-1.5F, -18.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(5.0F)
          verticalLineTo(3.0F)
          close()        
      }
    }
    return _layoutColumnTwo24!!
  }

private var _layoutColumnTwo24: ImageVector? = null
