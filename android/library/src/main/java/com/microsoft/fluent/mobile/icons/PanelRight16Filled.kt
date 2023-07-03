package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelRight16: ImageVector
  get() {
    if (_panelRight16 != null) {
      return _panelRight16!!
    }
    _panelRight16 = fluentIcon(name = "Filled.PanelRight16", 16f) {
      materialPath {
          moveTo(11.5F, 3.0F)
          curveTo(12.88F, 3.0F, 14.0F, 4.12F, 14.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 13.0F, 2.0F, 11.88F, 2.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          curveTo(2.0F, 4.12F, 3.12F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(7.0F)
          close()
          moveTo(9.0F, 4.0F)
          horizontalLineTo(4.5F)
          curveTo(3.672F, 4.0F, 3.0F, 4.672F, 3.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(3.0F, 11.328F, 3.672F, 12.0F, 4.5F, 12.0F)
          horizontalLineTo(9.0F)
          verticalLineTo(4.0F)
          close()        
      }
    }
    return _panelRight16!!
  }

private var _panelRight16: ImageVector? = null
