package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PanelLeft28: ImageVector
  get() {
    if (_panelLeft28 != null) {
      return _panelLeft28!!
    }
    _panelLeft28 = fluentIcon(name = "Regular.PanelLeft28", 28f) {
      materialPath {
          moveTo(5.754F, 4.0F)
          curveToRelative(-2.071F, 0.0F, -3.75F, 1.679F, -3.75F, 3.75F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineTo(22.25F)
          curveToRelative(2.07F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(7.75F)
          curveTo(26.0F, 5.679F, 24.32F, 4.0F, 22.25F, 4.0F)
          horizontalLineTo(5.753F)
          close()
          moveToRelative(-2.25F, 3.75F)
          curveToRelative(0.0F, -1.243F, 1.007F, -2.25F, 2.25F, -2.25F)
          horizontalLineTo(9.0F)
          verticalLineToRelative(16.0F)
          horizontalLineTo(5.754F)
          curveToRelative(-1.243F, 0.0F, -2.25F, -1.007F, -2.25F, -2.25F)
          verticalLineTo(7.75F)
          close()
          moveTo(10.5F, 21.5F)
          verticalLineToRelative(-16.0F)
          horizontalLineToRelative(11.75F)
          curveToRelative(1.243F, 0.0F, 2.25F, 1.007F, 2.25F, 2.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(10.5F)
          close()        
      }
    }
    return _panelLeft28!!
  }

private var _panelLeft28: ImageVector? = null
