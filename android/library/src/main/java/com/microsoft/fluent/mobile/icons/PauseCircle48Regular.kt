package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PauseCircle48: ImageVector
  get() {
    if (_pauseCircle48 != null) {
      return _pauseCircle48!!
    }
    _pauseCircle48 = fluentIcon(name = "Regular.PauseCircle48", 48f) {
      materialPath {
          moveTo(18.0F, 16.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          reflectiveCurveToRelative(1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineToRelative(14.5F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          reflectiveCurveTo(18.0F, 31.94F, 18.0F, 31.25F)
          verticalLineToRelative(-14.5F)
          close()
          moveToRelative(10.75F, -1.25F)
          curveToRelative(-0.69F, 0.0F, -1.25F, 0.56F, -1.25F, 1.25F)
          verticalLineToRelative(14.5F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveTo(30.0F, 31.94F, 30.0F, 31.25F)
          verticalLineToRelative(-14.5F)
          curveToRelative(0.0F, -0.69F, -0.56F, -1.25F, -1.25F, -1.25F)
          close()
          moveTo(24.0F, 4.0F)
          curveToRelative(11.046F, 0.0F, 20.0F, 8.954F, 20.0F, 20.0F)
          reflectiveCurveToRelative(-8.954F, 20.0F, -20.0F, 20.0F)
          reflectiveCurveTo(4.0F, 35.046F, 4.0F, 24.0F)
          reflectiveCurveTo(12.954F, 4.0F, 24.0F, 4.0F)
          close()
          moveToRelative(0.0F, 2.5F)
          curveTo(14.335F, 6.5F, 6.5F, 14.335F, 6.5F, 24.0F)
          reflectiveCurveTo(14.335F, 41.5F, 24.0F, 41.5F)
          reflectiveCurveTo(41.5F, 33.665F, 41.5F, 24.0F)
          reflectiveCurveTo(33.665F, 6.5F, 24.0F, 6.5F)
          close()        
      }
    }
    return _pauseCircle48!!
  }

private var _pauseCircle48: ImageVector? = null
