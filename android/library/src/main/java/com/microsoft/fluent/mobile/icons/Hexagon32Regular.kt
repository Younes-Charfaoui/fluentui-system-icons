package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Hexagon32: ImageVector
  get() {
    if (_hexagon32 != null) {
      return _hexagon32!!
    }
    _hexagon32 = fluentIcon(name = "Regular.Hexagon32", 32f) {
      materialPath {
          moveTo(10.619F, 5.0F)
          curveTo(10.27F, 5.0F, 9.948F, 5.181F, 9.766F, 5.478F)
          lineToRelative(-6.124F, 10.0F)
          curveToRelative(-0.196F, 0.32F, -0.196F, 0.724F, 0.0F, 1.044F)
          lineToRelative(6.124F, 10.0F)
          curveTo(9.947F, 26.82F, 10.27F, 27.0F, 10.619F, 27.0F)
          horizontalLineToRelative(10.758F)
          curveToRelative(0.348F, 0.0F, 0.671F, -0.181F, 0.853F, -0.478F)
          lineToRelative(6.12F, -10.0F)
          curveToRelative(0.196F, -0.32F, 0.196F, -0.724F, 0.0F, -1.044F)
          lineToRelative(-6.12F, -10.0F)
          curveTo(22.048F, 5.181F, 21.725F, 5.0F, 21.377F, 5.0F)
          horizontalLineTo(10.62F)
          close()
          moveTo(8.06F, 4.433F)
          curveTo(8.605F, 3.543F, 9.574F, 3.0F, 10.62F, 3.0F)
          horizontalLineToRelative(10.758F)
          curveToRelative(1.045F, 0.0F, 2.014F, 0.543F, 2.56F, 1.434F)
          lineToRelative(6.119F, 10.0F)
          curveToRelative(0.588F, 0.961F, 0.588F, 2.17F, 0.0F, 3.132F)
          lineToRelative(-6.12F, 10.0F)
          curveTo(23.391F, 28.456F, 22.422F, 29.0F, 21.377F, 29.0F)
          horizontalLineTo(10.62F)
          curveToRelative(-1.045F, 0.0F, -2.014F, -0.543F, -2.559F, -1.433F)
          lineToRelative(-6.123F, -10.0F)
          curveToRelative(-0.59F, -0.962F, -0.59F, -2.172F, 0.0F, -3.134F)
          lineToRelative(6.123F, -10.0F)
          close()        
      }
    }
    return _hexagon32!!
  }

private var _hexagon32: ImageVector? = null
