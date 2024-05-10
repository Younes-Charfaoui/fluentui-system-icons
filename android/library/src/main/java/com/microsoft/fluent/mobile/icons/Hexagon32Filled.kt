package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Hexagon32: ImageVector
  get() {
    if (_hexagon32 != null) {
      return _hexagon32!!
    }
    _hexagon32 = fluentIcon(name = "Filled.Hexagon32", 32f) {
      materialPath {
          moveTo(10.617F, 3.0F)
          curveTo(9.572F, 3.0F, 8.603F, 3.543F, 8.058F, 4.433F)
          lineToRelative(-6.123F, 10.0F)
          curveToRelative(-0.589F, 0.962F, -0.589F, 2.172F, 0.0F, 3.134F)
          lineToRelative(6.123F, 10.0F)
          curveTo(8.603F, 28.457F, 9.572F, 29.0F, 10.617F, 29.0F)
          horizontalLineToRelative(10.758F)
          curveToRelative(1.045F, 0.0F, 2.014F, -0.543F, 2.56F, -1.434F)
          lineToRelative(6.119F, -10.0F)
          curveToRelative(0.588F, -0.961F, 0.588F, -2.17F, 0.0F, -3.132F)
          lineToRelative(-6.12F, -10.0F)
          curveTo(23.39F, 3.544F, 22.42F, 3.0F, 21.375F, 3.0F)
          horizontalLineTo(10.617F)
          close()        
      }
    }
    return _hexagon32!!
  }

private var _hexagon32: ImageVector? = null
