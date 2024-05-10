package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnOneThirdRight20: ImageVector
  get() {
    if (_layoutColumnOneThirdRight20 != null) {
      return _layoutColumnOneThirdRight20!!
    }
    _layoutColumnOneThirdRight20 = fluentIcon(name = "Filled.LayoutColumnOneThirdRight20", 20f) {
      materialPath {
          moveTo(13.0F, 17.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineToRelative(14.0F)
          close()
          moveTo(12.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(6.0F)
          verticalLineTo(3.0F)
          close()        
      }
    }
    return _layoutColumnOneThirdRight20!!
  }

private var _layoutColumnOneThirdRight20: ImageVector? = null
