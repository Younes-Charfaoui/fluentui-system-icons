package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Mailbox16: ImageVector
  get() {
    if (_mailbox16 != null) {
      return _mailbox16!!
    }
    _mailbox16 = fluentIcon(name = "Regular.Mailbox16", 16f) {
      materialPath {
          moveTo(2.0F, 1.5F)
          curveTo(2.0F, 1.224F, 2.224F, 1.0F, 2.5F, 1.0F)
          horizontalLineToRelative(3.0F)
          curveTo(5.776F, 1.0F, 6.0F, 1.224F, 6.0F, 1.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(2.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(1.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(2.5F)
          curveTo(2.224F, 4.0F, 2.0F, 3.776F, 2.0F, 3.5F)
          verticalLineToRelative(-2.0F)
          close()
          moveToRelative(3.0F, 8.0F)
          verticalLineTo(7.0F)
          horizontalLineTo(4.0F)
          curveTo(2.895F, 7.0F, 2.0F, 7.895F, 2.0F, 9.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(7.0F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, -0.768F, 0.289F, -1.47F, 0.764F, -2.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(2.5F)
          curveTo(6.0F, 9.776F, 5.776F, 10.0F, 5.5F, 10.0F)
          reflectiveCurveTo(5.0F, 9.776F, 5.0F, 9.5F)
          close()
          moveTo(14.0F, 9.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(9.0F)
          close()
          moveToRelative(-2.5F, 0.0F)
          curveTo(11.224F, 9.0F, 11.0F, 9.224F, 11.0F, 9.5F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(12.776F, 9.0F, 12.5F, 9.0F)
          horizontalLineToRelative(-1.0F)
          close()        
      }
    }
    return _mailbox16!!
  }

private var _mailbox16: ImageVector? = null
