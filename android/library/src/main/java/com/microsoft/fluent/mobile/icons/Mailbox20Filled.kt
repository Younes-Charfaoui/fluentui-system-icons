package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Mailbox20: ImageVector
  get() {
    if (_mailbox20 != null) {
      return _mailbox20!!
    }
    _mailbox20 = fluentIcon(name = "Filled.Mailbox20", 20f) {
      materialPath {
          moveTo(3.0F, 2.5F)
          curveTo(3.0F, 2.224F, 3.224F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(4.0F)
          curveTo(7.776F, 2.0F, 8.0F, 2.224F, 8.0F, 2.5F)
          verticalLineTo(8.0F)
          horizontalLineToRelative(3.671F)
          curveTo(10.651F, 8.825F, 10.0F, 10.086F, 10.0F, 11.5F)
          verticalLineTo(17.0F)
          curveToRelative(0.0F, 0.364F, 0.097F, 0.706F, 0.268F, 1.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-5.5F)
          curveTo(2.0F, 9.567F, 3.567F, 8.0F, 5.5F, 8.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(3.5F)
          curveTo(6.0F, 11.776F, 6.224F, 12.0F, 6.5F, 12.0F)
          reflectiveCurveTo(7.0F, 11.776F, 7.0F, 11.5F)
          verticalLineTo(5.0F)
          horizontalLineTo(3.5F)
          curveTo(3.224F, 5.0F, 3.0F, 4.776F, 3.0F, 4.5F)
          verticalLineToRelative(-2.0F)
          close()
          moveTo(14.5F, 8.0F)
          curveTo(12.567F, 8.0F, 11.0F, 9.567F, 11.0F, 11.5F)
          verticalLineTo(17.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-5.5F)
          curveTo(18.0F, 9.567F, 16.433F, 8.0F, 14.5F, 8.0F)
          close()
          moveToRelative(-1.25F, 3.5F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveToRelative(-0.224F, 0.5F, -0.5F, 0.5F)
          horizontalLineToRelative(-1.5F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          close()        
      }
    }
    return _mailbox20!!
  }

private var _mailbox20: ImageVector? = null
