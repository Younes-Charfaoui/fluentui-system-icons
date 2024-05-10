package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FlagClock20: ImageVector
  get() {
    if (_flagClock20 != null) {
      return _flagClock20!!
    }
    _flagClock20 = fluentIcon(name = "Regular.FlagClock20", 20f) {
      materialPath {
          moveTo(5.0F, 13.0F)
          horizontalLineToRelative(4.207F)
          curveToRelative(0.099F, -0.349F, 0.23F, -0.683F, 0.393F, -1.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(10.566F)
          lineToRelative(-2.482F, 3.723F)
          curveToRelative(-0.112F, 0.168F, -0.112F, 0.386F, 0.0F, 0.554F)
          lineToRelative(0.53F, 0.794F)
          curveTo(13.901F, 9.024F, 14.197F, 9.0F, 14.5F, 9.0F)
          curveToRelative(0.091F, 0.0F, 0.182F, 0.002F, 0.272F, 0.007F)
          lineTo(14.101F, 8.0F)
          lineToRelative(2.815F, -4.223F)
          curveTo(17.137F, 3.445F, 16.899F, 3.0F, 16.5F, 3.0F)
          horizontalLineToRelative(-12.0F)
          curveTo(4.224F, 3.0F, 4.0F, 3.224F, 4.0F, 3.5F)
          verticalLineToRelative(14.0F)
          curveTo(4.0F, 17.776F, 4.224F, 18.0F, 4.5F, 18.0F)
          reflectiveCurveTo(5.0F, 17.776F, 5.0F, 17.5F)
          verticalLineTo(13.0F)
          close()
          moveToRelative(14.0F, 1.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(10.0F, 16.985F, 10.0F, 14.5F)
          reflectiveCurveToRelative(2.015F, -4.5F, 4.5F, -4.5F)
          reflectiveCurveToRelative(4.5F, 2.015F, 4.5F, 4.5F)
          close()
          moveTo(14.5F, 12.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, 0.224F, -0.5F, 0.5F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineTo(16.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(16.276F, 14.0F, 16.0F, 14.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineToRelative(-1.5F)
          curveToRelative(0.0F, -0.276F, -0.224F, -0.5F, -0.5F, -0.5F)
          close()        
      }
    }
    return _flagClock20!!
  }

private var _flagClock20: ImageVector? = null
