package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Video20: ImageVector
  get() {
    if (_video20 != null) {
      return _video20!!
    }
    _video20 = fluentIcon(name = "Regular.Video20", 20f) {
      materialPath {
          moveTo(5.0F, 4.0F)
          curveTo(3.343F, 4.0F, 2.0F, 5.343F, 2.0F, 7.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineToRelative(-0.321F)
          lineToRelative(3.037F, 2.097F)
          curveToRelative(0.83F, 0.572F, 1.96F, -0.021F, 1.96F, -1.029F)
          verticalLineTo(6.252F)
          curveToRelative(0.0F, -1.007F, -1.13F, -1.601F, -1.96F, -1.029F)
          lineTo(13.0F, 7.321F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(5.0F)
          close()
          moveToRelative(8.0F, 4.536F)
          lineToRelative(3.605F, -2.49F)
          curveToRelative(0.166F, -0.114F, 0.392F, 0.005F, 0.392F, 0.206F)
          verticalLineToRelative(7.495F)
          curveToRelative(0.0F, 0.202F, -0.226F, 0.32F, -0.392F, 0.206F)
          lineTo(13.0F, 11.463F)
          verticalLineTo(8.537F)
          close()
          moveTo(3.0F, 7.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(7.0F)
          close()        
      }
    }
    return _video20!!
  }

private var _video20: ImageVector? = null
