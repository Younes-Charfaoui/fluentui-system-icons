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
          moveTo(17.5F, 1.0F)
          curveTo(20.538F, 1.0F, 23.0F, 3.462F, 23.0F, 6.5F)
          reflectiveCurveTo(20.538F, 12.0F, 17.5F, 12.0F)
          reflectiveCurveTo(12.0F, 9.538F, 12.0F, 6.5F)
          reflectiveCurveTo(14.462F, 1.0F, 17.5F, 1.0F)
          close()
          moveToRelative(2.0F, 5.5F)
          horizontalLineToRelative(-2.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.276F, -0.224F, -0.5F, -0.5F, -0.5F)
          reflectiveCurveTo(16.5F, 3.724F, 16.5F, 4.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(2.5F)
          curveTo(19.776F, 7.5F, 20.0F, 7.276F, 20.0F, 7.0F)
          reflectiveCurveToRelative(-0.224F, -0.5F, -0.5F, -0.5F)
          close()
          moveToRelative(-2.0F, 6.5F)
          curveToRelative(1.747F, 0.0F, 3.332F, -0.689F, 4.5F, -1.81F)
          verticalLineToRelative(5.56F)
          curveToRelative(0.0F, 1.733F, -1.357F, 3.15F, -3.066F, 3.245F)
          lineTo(18.75F, 20.0F)
          horizontalLineTo(5.25F)
          curveToRelative(-1.733F, 0.0F, -3.15F, -1.357F, -3.245F, -3.066F)
          lineTo(2.0F, 16.75F)
          verticalLineTo(8.608F)
          lineToRelative(9.652F, 5.056F)
          curveToRelative(0.218F, 0.114F, 0.478F, 0.114F, 0.696F, 0.0F)
          lineToRelative(2.417F, -1.266F)
          curveTo(15.596F, 12.784F, 16.523F, 13.0F, 17.5F, 13.0F)
          close()
          moveTo(5.25F, 4.0F)
          horizontalLineToRelative(6.248F)
          curveTo(11.178F, 4.77F, 11.0F, 5.614F, 11.0F, 6.5F)
          curveToRelative(0.0F, 1.992F, 0.897F, 3.776F, 2.308F, 4.968F)
          lineTo(12.0F, 12.153F)
          lineToRelative(-9.984F, -5.23F)
          curveToRelative(0.158F, -1.58F, 1.448F, -2.828F, 3.048F, -2.918F)
          lineTo(5.25F, 4.0F)
          close()        
      }
    }
    return _mailClock24!!
  }

private var _mailClock24: ImageVector? = null
