package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThree16: ImageVector
  get() {
    if (_layoutRowThree16 != null) {
      return _layoutRowThree16!!
    }
    _layoutRowThree16 = fluentIcon(name = "Filled.LayoutRowThree16", 16f) {
      materialPath {
          moveTo(14.0F, 5.0F)
          verticalLineTo(4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(12.0F)
          close()
          moveTo(2.0F, 6.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(6.0F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(0.0F, 5.5F)
          verticalLineTo(11.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(0.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          close()        
      }
    }
    return _layoutRowThree16!!
  }

private var _layoutRowThree16: ImageVector? = null
