package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CalendarStar16: ImageVector
  get() {
    if (_calendarStar16 != null) {
      return _calendarStar16!!
    }
    _calendarStar16 = fluentIcon(name = "Regular.CalendarStar16", 16f) {
      materialPath {
          moveTo(11.5F, 2.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(2.1F)
          curveToRelative(-0.317F, -0.162F, -0.651F, -0.294F, -1.0F, -0.393F)
          verticalLineTo(6.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(5.5F)
          curveTo(3.0F, 12.328F, 3.672F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(1.707F)
          curveToRelative(0.099F, 0.349F, 0.23F, 0.683F, 0.393F, 1.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(10.0F)
          verticalLineTo(4.5F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          close()
          moveToRelative(4.5F, 8.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(7.0F, 13.985F, 7.0F, 11.5F)
          reflectiveCurveTo(9.015F, 7.0F, 11.5F, 7.0F)
          reflectiveCurveTo(16.0F, 9.015F, 16.0F, 11.5F)
          close()
          moveToRelative(-4.024F, -2.64F)
          curveToRelative(-0.15F, -0.48F, -0.802F, -0.48F, -0.952F, 0.0F)
          lineToRelative(-0.477F, 1.532F)
          horizontalLineTo(9.0F)
          curveToRelative(-0.484F, 0.0F, -0.686F, 0.647F, -0.294F, 0.944F)
          lineToRelative(1.25F, 0.947F)
          lineToRelative(-0.477F, 1.532F)
          curveToRelative(-0.15F, 0.48F, 0.378F, 0.88F, 0.77F, 0.583F)
          lineToRelative(1.25F, -0.947F)
          lineToRelative(1.25F, 0.947F)
          curveToRelative(0.392F, 0.297F, 0.92F, -0.103F, 0.77F, -0.583F)
          lineToRelative(-0.477F, -1.532F)
          lineToRelative(1.25F, -0.947F)
          curveToRelative(0.392F, -0.297F, 0.19F, -0.944F, -0.294F, -0.944F)
          horizontalLineToRelative(-1.546F)
          lineToRelative(-0.477F, -1.531F)
          close()        
      }
    }
    return _calendarStar16!!
  }

private var _calendarStar16: ImageVector? = null
