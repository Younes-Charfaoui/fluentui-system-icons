package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DataUsage16: ImageVector
  get() {
    if (_dataUsage16 != null) {
      return _dataUsage16!!
    }
    _dataUsage16 = fluentIcon(name = "Filled.DataUsage16", 16f) {
      materialPath {
          moveTo(2.0F, 3.75F)
          curveTo(2.0F, 2.784F, 2.784F, 2.0F, 3.75F, 2.0F)
          horizontalLineToRelative(8.5F)
          curveTo(13.216F, 2.0F, 14.0F, 2.784F, 14.0F, 3.75F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-8.5F)
          curveTo(2.784F, 14.0F, 2.0F, 13.216F, 2.0F, 12.25F)
          verticalLineToRelative(-8.5F)
          close()
          moveTo(6.0F, 6.5F)
          curveTo(6.0F, 6.224F, 5.776F, 6.0F, 5.5F, 6.0F)
          reflectiveCurveTo(5.0F, 6.224F, 5.0F, 6.5F)
          verticalLineToRelative(4.0F)
          curveTo(5.0F, 10.776F, 5.224F, 11.0F, 5.5F, 11.0F)
          reflectiveCurveTo(6.0F, 10.776F, 6.0F, 10.5F)
          verticalLineToRelative(-4.0F)
          close()
          moveTo(8.0F, 8.0F)
          curveTo(7.724F, 8.0F, 7.5F, 8.224F, 7.5F, 8.5F)
          verticalLineToRelative(2.0F)
          curveTo(7.5F, 10.776F, 7.724F, 11.0F, 8.0F, 11.0F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-2.0F)
          curveTo(8.5F, 8.224F, 8.276F, 8.0F, 8.0F, 8.0F)
          close()
          moveToRelative(3.0F, -2.5F)
          curveTo(11.0F, 5.224F, 10.776F, 5.0F, 10.5F, 5.0F)
          reflectiveCurveTo(10.0F, 5.224F, 10.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-5.0F)
          close()        
      }
    }
    return _dataUsage16!!
  }

private var _dataUsage16: ImageVector? = null
