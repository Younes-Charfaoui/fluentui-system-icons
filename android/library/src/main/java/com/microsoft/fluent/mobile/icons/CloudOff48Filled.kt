package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CloudOff48: ImageVector
  get() {
    if (_cloudOff48 != null) {
      return _cloudOff48!!
    }
    _cloudOff48 = fluentIcon(name = "Filled.CloudOff48", 48f) {
      materialPath {
          moveTo(35.232F, 37.0F)
          lineToRelative(6.634F, 6.634F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(-37.5F, -37.5F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(9.105F, 9.105F)
          curveToRelative(-0.787F, 1.434F, -1.289F, 3.046F, -1.43F, 4.761F)
          horizontalLineTo(11.5F)
          curveTo(6.806F, 20.0F, 3.0F, 23.806F, 3.0F, 28.5F)
          reflectiveCurveTo(6.806F, 37.0F, 11.5F, 37.0F)
          horizontalLineToRelative(23.732F)
          close()
          moveTo(45.0F, 28.5F)
          curveToRelative(0.0F, 3.223F, -1.793F, 6.026F, -4.436F, 7.468F)
          lineTo(16.35F, 11.754F)
          curveTo(18.427F, 10.034F, 21.093F, 9.0F, 24.0F, 9.0F)
          curveToRelative(6.29F, 0.0F, 11.45F, 4.84F, 11.959F, 11.0F)
          horizontalLineTo(36.5F)
          curveToRelative(4.694F, 0.0F, 8.5F, 3.806F, 8.5F, 8.5F)
          close()        
      }
    }
    return _cloudOff48!!
  }

private var _cloudOff48: ImageVector? = null
