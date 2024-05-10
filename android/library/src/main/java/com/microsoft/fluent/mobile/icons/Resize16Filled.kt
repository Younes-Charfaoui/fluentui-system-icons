package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Resize16: ImageVector
  get() {
    if (_resize16 != null) {
      return _resize16!!
    }
    _resize16 = fluentIcon(name = "Filled.Resize16", 16f) {
      materialPath {
          moveTo(6.5F, 2.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          curveTo(2.0F, 4.776F, 2.224F, 5.0F, 2.5F, 5.0F)
          reflectiveCurveTo(3.0F, 4.776F, 3.0F, 4.5F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(2.0F)
          curveTo(6.776F, 3.0F, 7.0F, 2.776F, 7.0F, 2.5F)
          reflectiveCurveTo(6.776F, 2.0F, 6.5F, 2.0F)
          close()
          moveTo(2.0F, 11.5F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-3.0F)
          curveTo(10.0F, 7.12F, 8.88F, 6.0F, 7.5F, 6.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(3.12F, 6.0F, 2.0F, 7.12F, 2.0F, 8.5F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(9.5F, 2.5F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          reflectiveCurveToRelative(0.224F, -0.5F, 0.5F, -0.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-2.0F)
          curveTo(13.0F, 9.224F, 13.224F, 9.0F, 13.5F, 9.0F)
          reflectiveCurveTo(14.0F, 9.224F, 14.0F, 9.5F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          close()
          moveTo(14.0F, 6.5F)
          curveTo(14.0F, 6.776F, 13.776F, 7.0F, 13.5F, 7.0F)
          reflectiveCurveTo(13.0F, 6.776F, 13.0F, 6.5F)
          verticalLineToRelative(-2.0F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(9.224F, 3.0F, 9.0F, 2.776F, 9.0F, 2.5F)
          reflectiveCurveTo(9.224F, 2.0F, 9.5F, 2.0F)
          horizontalLineToRelative(2.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(2.0F)
          close()        
      }
    }
    return _resize16!!
  }

private var _resize16: ImageVector? = null
