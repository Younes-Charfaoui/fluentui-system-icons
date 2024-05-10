package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CalendarShield16: ImageVector
  get() {
    if (_calendarShield16 != null) {
      return _calendarShield16!!
    }
    _calendarShield16 = fluentIcon(name = "Filled.CalendarShield16", 16f) {
      materialPath {
          moveTo(11.5F, 6.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(5.5F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(3.076F)
          curveTo(7.228F, 13.316F, 7.0F, 12.493F, 7.0F, 11.517F)
          verticalLineTo(9.194F)
          curveTo(7.0F, 8.386F, 7.626F, 7.82F, 8.293F, 7.723F)
          curveToRelative(0.855F, -0.124F, 1.633F, -0.761F, 2.102F, -1.254F)
          curveTo(10.694F, 6.156F, 11.097F, 6.0F, 11.5F, 6.0F)
          close()
          moveTo(14.0F, 4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(4.5F)
          close()
          moveToRelative(-2.12F, 2.66F)
          curveToRelative(0.508F, 0.532F, 1.484F, 1.379F, 2.684F, 1.552F)
          curveTo(14.803F, 8.747F, 15.0F, 8.946F, 15.0F, 9.194F)
          verticalLineToRelative(2.323F)
          curveToRelative(0.0F, 3.122F, -2.784F, 4.255F, -3.386F, 4.463F)
          curveToRelative(-0.075F, 0.026F, -0.152F, 0.026F, -0.228F, 0.0F)
          curveTo(10.785F, 15.772F, 8.0F, 14.64F, 8.0F, 11.517F)
          verticalLineTo(9.194F)
          curveToRelative(0.0F, -0.248F, 0.197F, -0.447F, 0.436F, -0.482F)
          curveToRelative(1.2F, -0.173F, 2.175F, -1.02F, 2.683F, -1.553F)
          curveToRelative(0.202F, -0.212F, 0.56F, -0.212F, 0.762F, 0.0F)
          close()        
      }
    }
    return _calendarShield16!!
  }

private var _calendarShield16: ImageVector? = null
