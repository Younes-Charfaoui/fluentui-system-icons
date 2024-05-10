package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailClock24: ImageVector
  get() {
    if (_mailClock24 != null) {
      return _mailClock24!!
    }
    _mailClock24 = fluentIcon(name = "Filled.MailClock24", 24f) {
      materialPath {
          moveTo(23.0F, 6.5F)
          curveTo(23.0F, 3.462F, 20.538F, 1.0F, 17.5F, 1.0F)
          reflectiveCurveTo(12.0F, 3.462F, 12.0F, 6.5F)
          reflectiveCurveToRelative(2.462F, 5.5F, 5.5F, 5.5F)
          reflectiveCurveTo(23.0F, 9.538F, 23.0F, 6.5F)
          close()
          moveTo(17.5F, 3.0F)
          curveTo(17.776F, 3.0F, 18.0F, 3.224F, 18.0F, 3.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(20.276F, 7.0F, 20.0F, 7.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(17.224F, 7.0F, 17.0F, 6.776F, 17.0F, 6.5F)
          verticalLineToRelative(-3.0F)
          curveTo(17.0F, 3.224F, 17.224F, 3.0F, 17.5F, 3.0F)
          close()
          moveToRelative(4.5F, 8.19F)
          curveTo(20.832F, 12.311F, 19.247F, 13.0F, 17.5F, 13.0F)
          curveToRelative(-0.977F, 0.0F, -1.904F, -0.216F, -2.735F, -0.602F)
          lineToRelative(-2.417F, 1.266F)
          curveToRelative(-0.218F, 0.114F, -0.478F, 0.114F, -0.696F, 0.0F)
          lineTo(2.0F, 8.608F)
          verticalLineToRelative(8.142F)
          lineToRelative(0.005F, 0.184F)
          curveTo(2.101F, 18.644F, 3.517F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          lineToRelative(0.184F, -0.005F)
          curveTo(20.644F, 19.899F, 22.0F, 18.483F, 22.0F, 16.75F)
          verticalLineToRelative(-5.56F)
          close()
          moveTo(11.498F, 4.0F)
          horizontalLineTo(5.25F)
          lineTo(5.064F, 4.005F)
          curveToRelative(-1.6F, 0.09F, -2.89F, 1.338F, -3.048F, 2.919F)
          lineTo(12.0F, 12.154F)
          lineToRelative(1.308F, -0.686F)
          curveTo(11.897F, 10.276F, 11.0F, 8.492F, 11.0F, 6.5F)
          curveToRelative(0.0F, -0.886F, 0.177F, -1.73F, 0.498F, -2.5F)
          close()        
      }
    }
    return _mailClock24!!
  }

private var _mailClock24: ImageVector? = null
