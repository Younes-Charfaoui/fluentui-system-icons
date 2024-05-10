package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Beaker20: ImageVector
  get() {
    if (_beaker20 != null) {
      return _beaker20!!
    }
    _beaker20 = fluentIcon(name = "Regular.Beaker20", 20f) {
      materialPath {
          moveTo(14.0F, 3.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(14.276F, 4.0F, 14.0F, 4.0F)
          horizontalLineToRelative(-0.996F)
          verticalLineToRelative(4.684F)
          curveToRelative(0.0F, 0.58F, 0.144F, 1.15F, 0.42F, 1.66F)
          lineToRelative(2.395F, 4.446F)
          curveToRelative(0.538F, 1.0F, -0.185F, 2.212F, -1.32F, 2.212F)
          horizontalLineTo(5.502F)
          curveToRelative(-1.136F, 0.0F, -1.859F, -1.213F, -1.32F, -2.212F)
          lineToRelative(2.394F, -4.443F)
          curveToRelative(0.275F, -0.51F, 0.418F, -1.081F, 0.418F, -1.66F)
          verticalLineTo(4.0F)
          horizontalLineTo(6.0F)
          curveTo(5.724F, 4.0F, 5.5F, 3.776F, 5.5F, 3.5F)
          reflectiveCurveTo(5.724F, 3.0F, 6.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          close()
          moveTo(7.994F, 4.0F)
          verticalLineToRelative(4.687F)
          curveToRelative(0.0F, 0.745F, -0.185F, 1.478F, -0.538F, 2.134F)
          lineTo(6.821F, 12.0F)
          horizontalLineToRelative(6.359F)
          lineToRelative(-0.637F, -1.181F)
          curveToRelative(-0.353F, -0.657F, -0.539F, -1.39F, -0.539F, -2.135F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(-4.01F)
          close()
          moveToRelative(5.724F, 9.0F)
          horizontalLineTo(6.282F)
          lineToRelative(-1.22F, 2.264F)
          curveToRelative(-0.18F, 0.334F, 0.062F, 0.738F, 0.44F, 0.738F)
          horizontalLineToRelative(8.997F)
          curveToRelative(0.378F, 0.0F, 0.62F, -0.404F, 0.44F, -0.738F)
          lineTo(13.719F, 13.0F)
          close()        
      }
    }
    return _beaker20!!
  }

private var _beaker20: ImageVector? = null
