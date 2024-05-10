package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Rss16: ImageVector
  get() {
    if (_rss16 != null) {
      return _rss16!!
    }
    _rss16 = fluentIcon(name = "Filled.Rss16", 16f) {
      materialPath {
          moveTo(11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.119F, 2.0F, 2.0F, 3.119F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.881F, 3.119F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.381F, 0.0F, 2.5F, -1.119F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.119F, 12.881F, 2.0F, 11.5F, 2.0F)
          close()
          moveToRelative(-6.0F, 9.25F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          reflectiveCurveTo(5.086F, 9.75F, 5.5F, 9.75F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          close()
          moveToRelative(3.0F, -0.25F)
          curveTo(8.224F, 11.0F, 8.0F, 10.776F, 8.0F, 10.5F)
          curveTo(8.0F, 9.121F, 6.879F, 8.0F, 5.5F, 8.0F)
          curveTo(5.224F, 8.0F, 5.0F, 7.776F, 5.0F, 7.5F)
          reflectiveCurveTo(5.224F, 7.0F, 5.5F, 7.0F)
          curveTo(7.43F, 7.0F, 9.0F, 8.57F, 9.0F, 10.5F)
          curveTo(9.0F, 10.776F, 8.776F, 11.0F, 8.5F, 11.0F)
          close()
          moveToRelative(3.0F, 0.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          curveTo(11.0F, 7.468F, 8.532F, 5.0F, 5.5F, 5.0F)
          curveTo(5.224F, 5.0F, 5.0F, 4.776F, 5.0F, 4.5F)
          reflectiveCurveTo(5.224F, 4.0F, 5.5F, 4.0F)
          curveTo(9.084F, 4.0F, 12.0F, 6.916F, 12.0F, 10.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          close()        
      }
    }
    return _rss16!!
  }

private var _rss16: ImageVector? = null
