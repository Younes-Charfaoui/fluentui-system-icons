package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SelectAllOff20: ImageVector
  get() {
    if (_selectAllOff20 != null) {
      return _selectAllOff20!!
    }
    _selectAllOff20 = fluentIcon(name = "Filled.SelectAllOff20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(4.99F, 11.0F)
          curveToRelative(-0.889F, 0.0F, -1.687F, -0.386F, -2.236F, -1.0F)
          horizontalLineToRelative(6.736F)
          curveToRelative(1.933F, 0.0F, 3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineToRelative(-1.201F)
          curveToRelative(0.005F, -0.1F, 0.008F, -0.199F, 0.008F, -0.299F)
          verticalLineTo(5.772F)
          curveTo(16.608F, 6.32F, 16.99F, 7.116F, 16.99F, 8.0F)
          verticalLineToRelative(4.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-4.5F)
          close()        
      }
    }
    return _selectAllOff20!!
  }

private var _selectAllOff20: ImageVector? = null
