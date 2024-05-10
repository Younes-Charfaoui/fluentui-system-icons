package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Mailbox20: ImageVector
  get() {
    if (_mailbox20 != null) {
      return _mailbox20!!
    }
    _mailbox20 = fluentIcon(name = "Regular.Mailbox20", 20f) {
      materialPath {
          moveTo(3.5F, 2.0F)
          curveTo(3.224F, 2.0F, 3.0F, 2.224F, 3.0F, 2.5F)
          verticalLineToRelative(2.0F)
          curveTo(3.0F, 4.776F, 3.224F, 5.0F, 3.5F, 5.0F)
          horizontalLineTo(7.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(5.5F)
          curveTo(3.567F, 8.0F, 2.0F, 9.567F, 2.0F, 11.5F)
          verticalLineTo(17.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(14.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-5.5F)
          curveTo(18.0F, 9.567F, 16.433F, 8.0F, 14.5F, 8.0F)
          horizontalLineTo(8.0F)
          verticalLineTo(2.5F)
          curveTo(8.0F, 2.224F, 7.776F, 2.0F, 7.5F, 2.0F)
          horizontalLineToRelative(-4.0F)
          close()
          moveTo(7.0F, 9.0F)
          verticalLineToRelative(2.5F)
          curveTo(7.0F, 11.776F, 7.224F, 12.0F, 7.5F, 12.0F)
          reflectiveCurveTo(8.0F, 11.776F, 8.0F, 11.5F)
          verticalLineTo(9.0F)
          horizontalLineToRelative(4.05F)
          curveTo(11.402F, 9.635F, 11.0F, 10.52F, 11.0F, 11.5F)
          verticalLineTo(17.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(-5.5F)
          curveTo(3.0F, 10.12F, 4.12F, 9.0F, 5.5F, 9.0F)
          horizontalLineTo(7.0F)
          close()
          moveToRelative(10.0F, 2.5F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(-5.5F)
          curveToRelative(0.0F, -1.38F, 1.12F, -2.5F, 2.5F, -2.5F)
          reflectiveCurveToRelative(2.5F, 1.12F, 2.5F, 2.5F)
          close()
          moveTo(14.0F, 11.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, 0.224F, -0.5F, 0.5F)
          reflectiveCurveTo(13.724F, 12.0F, 14.0F, 12.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(15.276F, 11.0F, 15.0F, 11.0F)
          horizontalLineToRelative(-1.0F)
          close()        
      }
    }
    return _mailbox20!!
  }

private var _mailbox20: ImageVector? = null
