package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowFour16: ImageVector
  get() {
    if (_layoutRowFour16 != null) {
      return _layoutRowFour16!!
    }
    _layoutRowFour16 = fluentIcon(name = "Filled.LayoutRowFour16", 16f) {
      materialPath {
          moveTo(2.0F, 8.5F)
          verticalLineTo(11.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(8.5F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(12.0F, -1.0F)
          verticalLineTo(5.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(2.5F)
          horizontalLineToRelative(12.0F)
          close()
          moveTo(4.5F, 14.0F)
          curveToRelative(-1.21F, 0.0F, -2.218F, -0.859F, -2.45F, -2.0F)
          horizontalLineToRelative(11.9F)
          curveToRelative(-0.232F, 1.141F, -1.24F, 2.0F, -2.45F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveToRelative(9.45F, -10.0F)
          curveToRelative(-0.232F, -1.141F, -1.24F, -2.0F, -2.45F, -2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.29F, 2.0F, 2.282F, 2.859F, 2.05F, 4.0F)
          horizontalLineToRelative(11.9F)
          close()        
      }
    }
    return _layoutRowFour16!!
  }

private var _layoutRowFour16: ImageVector? = null
