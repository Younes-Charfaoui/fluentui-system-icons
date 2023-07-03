package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Eye20: ImageVector
  get() {
    if (_eye20 != null) {
      return _eye20!!
    }
    _eye20 = fluentIcon(name = "Filled.Eye20", 20f) {
      materialPath {
          moveTo(3.26F, 11.602F)
          curveTo(3.942F, 8.327F, 6.793F, 6.0F, 10.0F, 6.0F)
          curveToRelative(3.206F, 0.0F, 6.057F, 2.327F, 6.74F, 5.602F)
          curveToRelative(0.057F, 0.27F, 0.322F, 0.444F, 0.593F, 0.387F)
          curveToRelative(0.27F, -0.056F, 0.443F, -0.32F, 0.387F, -0.591F)
          curveTo(16.943F, 7.673F, 13.693F, 5.0F, 10.0F, 5.0F)
          curveToRelative(-3.693F, 0.0F, -6.943F, 2.673F, -7.72F, 6.398F)
          curveToRelative(-0.056F, 0.27F, 0.117F, 0.535F, 0.388F, 0.591F)
          curveToRelative(0.27F, 0.057F, 0.535F, -0.117F, 0.591F, -0.387F)
          close()
          moveTo(9.99F, 8.0F)
          curveToRelative(1.932F, 0.0F, 3.5F, 1.567F, 3.5F, 3.5F)
          reflectiveCurveTo(11.921F, 15.0F, 9.99F, 15.0F)
          curveToRelative(-1.934F, 0.0F, -3.5F, -1.567F, -3.5F, -3.5F)
          reflectiveCurveTo(8.056F, 8.0F, 9.99F, 8.0F)
          close()        
      }
    }
    return _eye20!!
  }

private var _eye20: ImageVector? = null
