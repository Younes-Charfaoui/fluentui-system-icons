package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelLeft24: ImageVector
  get() {
    if (_panelLeft24 != null) {
      return _panelLeft24!!
    }
    _panelLeft24 = fluentIcon(name = "Filled.PanelLeft24", 24f) {
      materialPath {
          moveTo(5.25F, 4.0F)
          curveTo(3.455F, 4.0F, 2.0F, 5.455F, 2.0F, 7.25F)
          verticalLineToRelative(9.5F)
          curveTo(2.0F, 18.545F, 3.455F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.5F)
          curveTo(22.0F, 5.455F, 20.545F, 4.0F, 18.75F, 4.0F)
          horizontalLineTo(5.25F)
          close()
          moveToRelative(13.5F, 1.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(9.5F)
          verticalLineToRelative(-13.0F)
          horizontalLineToRelative(9.25F)
          close()        
      }
    }
    return _panelLeft24!!
  }

private var _panelLeft24: ImageVector? = null