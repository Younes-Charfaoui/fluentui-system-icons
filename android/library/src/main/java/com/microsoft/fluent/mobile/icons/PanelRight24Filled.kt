package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelRight24: ImageVector
  get() {
    if (_panelRight24 != null) {
      return _panelRight24!!
    }
    _panelRight24 = fluentIcon(name = "Filled.PanelRight24", 24f) {
      materialPath {
          moveTo(18.75F, 4.0F)
          curveTo(20.545F, 4.0F, 22.0F, 5.455F, 22.0F, 7.25F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 20.0F, 2.0F, 18.545F, 2.0F, 16.75F)
          verticalLineToRelative(-9.5F)
          curveTo(2.0F, 5.455F, 3.455F, 4.0F, 5.25F, 4.0F)
          horizontalLineToRelative(13.5F)
          close()
          moveTo(5.25F, 5.5F)
          curveTo(4.284F, 5.5F, 3.5F, 6.284F, 3.5F, 7.25F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(9.25F)
          verticalLineToRelative(-13.0F)
          horizontalLineTo(5.25F)
          close()        
      }
    }
    return _panelRight24!!
  }

private var _panelRight24: ImageVector? = null
