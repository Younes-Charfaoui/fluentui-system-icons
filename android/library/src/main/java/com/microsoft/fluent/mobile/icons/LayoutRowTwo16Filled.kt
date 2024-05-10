package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwo16: ImageVector
  get() {
    if (_layoutRowTwo16 != null) {
      return _layoutRowTwo16!!
    }
    _layoutRowTwo16 = fluentIcon(name = "Filled.LayoutRowTwo16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(-3.0F)
          close()
          moveToRelative(0.0F, 4.0F)
          verticalLineToRelative(3.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-3.0F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _layoutRowTwo16!!
  }

private var _layoutRowTwo16: ImageVector? = null
