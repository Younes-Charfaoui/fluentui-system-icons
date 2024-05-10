package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwo24: ImageVector
  get() {
    if (_layoutRowTwo24 != null) {
      return _layoutRowTwo24!!
    }
    _layoutRowTwo24 = fluentIcon(name = "Filled.LayoutRowTwo24", 24f) {
      materialPath {
          moveTo(3.0F, 6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(5.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(0.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-5.0F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _layoutRowTwo24!!
  }

private var _layoutRowTwo24: ImageVector? = null
