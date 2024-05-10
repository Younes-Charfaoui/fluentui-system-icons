package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Video20: ImageVector
  get() {
    if (_video20 != null) {
      return _video20!!
    }
    _video20 = fluentIcon(name = "Filled.Video20", 20f) {
      materialPath {
          moveTo(2.0F, 7.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(7.0F)
          close()
          moveToRelative(14.037F, 7.776F)
          lineTo(14.0F, 13.369F)
          verticalLineTo(6.63F)
          lineToRelative(2.037F, -1.407F)
          curveToRelative(0.83F, -0.572F, 1.96F, 0.022F, 1.96F, 1.03F)
          verticalLineToRelative(7.494F)
          curveToRelative(0.0F, 1.008F, -1.13F, 1.601F, -1.96F, 1.029F)
          close()        
      }
    }
    return _video20!!
  }

private var _video20: ImageVector? = null
