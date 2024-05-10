package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnOneThirdLeft24: ImageVector
  get() {
    if (_layoutColumnOneThirdLeft24 != null) {
      return _layoutColumnOneThirdLeft24!!
    }
    _layoutColumnOneThirdLeft24 = fluentIcon(name = "Filled.LayoutColumnOneThirdLeft24", 24f) {
      materialPath {
          moveTo(9.5F, 21.0F)
          horizontalLineToRelative(8.25F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(9.5F)
          verticalLineToRelative(18.0F)
          close()
          moveTo(8.0F, 3.0F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineTo(8.0F)
          verticalLineTo(3.0F)
          close()        
      }
    }
    return _layoutColumnOneThirdLeft24!!
  }

private var _layoutColumnOneThirdLeft24: ImageVector? = null
