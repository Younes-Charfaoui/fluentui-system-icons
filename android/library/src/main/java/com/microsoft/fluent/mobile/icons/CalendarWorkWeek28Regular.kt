package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CalendarWorkWeek28: ImageVector
  get() {
    if (_calendarWorkWeek28 != null) {
      return _calendarWorkWeek28!!
    }
    _calendarWorkWeek28 = fluentIcon(name = "Regular.CalendarWorkWeek28", 28f) {
      materialPath {
          moveTo(6.25F, 25.0F)
          curveTo(4.455F, 25.0F, 3.0F, 23.545F, 3.0F, 21.75F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(15.5F)
          curveTo(23.545F, 3.0F, 25.0F, 4.455F, 25.0F, 6.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(0.0F, -1.5F)
          horizontalLineToRelative(15.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(6.25F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(6.25F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          close()
          moveTo(7.5F, 8.75F)
          curveTo(7.5F, 8.336F, 7.836F, 8.0F, 8.25F, 8.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(5.5F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(8.25F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineToRelative(-5.5F)
          close()
          moveTo(9.0F, 9.5F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(10.0F)
          verticalLineToRelative(-4.0F)
          horizontalLineTo(9.0F)
          close()        
      }
    }
    return _calendarWorkWeek28!!
  }

private var _calendarWorkWeek28: ImageVector? = null
