package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PreviousFrame24: ImageVector
  get() {
    if (_previousFrame24 != null) {
      return _previousFrame24!!
    }
    _previousFrame24 = fluentIcon(name = "Regular.PreviousFrame24", 24f) {
      materialPath {
          moveTo(18.5F, 3.75F)
          curveTo(18.5F, 3.336F, 18.836F, 3.0F, 19.25F, 3.0F)
          curveTo(19.665F, 3.0F, 20.0F, 3.336F, 20.0F, 3.75F)
          verticalLineToRelative(16.5F)
          curveToRelative(0.0F, 0.414F, -0.335F, 0.75F, -0.75F, 0.75F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(3.75F)
          close()
          moveToRelative(-6.239F, -0.44F)
          curveToRelative(1.162F, -0.796F, 2.74F, 0.035F, 2.74F, 1.443F)
          verticalLineToRelative(14.495F)
          curveToRelative(0.0F, 1.413F, -1.59F, 2.244F, -2.75F, 1.437F)
          lineTo(1.753F, 13.383F)
          curveToRelative(-1.006F, -0.7F, -1.0F, -2.188F, 0.01F, -2.88F)
          lineTo(12.26F, 3.309F)
          close()
          moveToRelative(1.24F, 1.443F)
          curveToRelative(0.0F, -0.201F, -0.226F, -0.32F, -0.392F, -0.206F)
          lineTo(2.611F, 11.74F)
          curveToRelative(-0.145F, 0.1F, -0.145F, 0.312F, -0.002F, 0.412F)
          lineToRelative(10.499F, 7.301F)
          curveToRelative(0.165F, 0.116F, 0.392F, -0.003F, 0.392F, -0.205F)
          verticalLineTo(4.753F)
          close()        
      }
    }
    return _previousFrame24!!
  }

private var _previousFrame24: ImageVector? = null
