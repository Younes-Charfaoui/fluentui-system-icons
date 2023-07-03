package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Calendar3Day16: ImageVector
  get() {
    if (_calendar3Day16 != null) {
      return _calendar3Day16!!
    }
    _calendar3Day16 = fluentIcon(name = "Filled.Calendar3Day16", 316f) {
      materialPath {
          moveTo(14.0F, 11.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          close()
          moveToRelative(-8.0F, -6.0F)
          curveTo(6.0F, 5.224F, 5.776F, 5.0F, 5.5F, 5.0F)
          reflectiveCurveTo(5.0F, 5.224F, 5.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(5.0F, 10.776F, 5.224F, 11.0F, 5.5F, 11.0F)
          reflectiveCurveTo(6.0F, 10.776F, 6.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(2.5F, 0.0F)
          curveTo(8.5F, 5.224F, 8.276F, 5.0F, 8.0F, 5.0F)
          reflectiveCurveTo(7.5F, 5.224F, 7.5F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(7.5F, 10.776F, 7.724F, 11.0F, 8.0F, 11.0F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(2.5F, 0.0F)
          curveTo(11.0F, 5.224F, 10.776F, 5.0F, 10.5F, 5.0F)
          reflectiveCurveTo(10.0F, 5.224F, 10.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-5.0F)
          close()        
      }
    }
    return _calendar3Day16!!
  }

private var _calendar3Day16: ImageVector? = null
