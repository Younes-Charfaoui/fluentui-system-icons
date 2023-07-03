package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.AppRecent20: ImageVector
  get() {
    if (_appRecent20 != null) {
      return _appRecent20!!
    }
    _appRecent20 = fluentIcon(name = "Regular.AppRecent20", 20f) {
      materialPath {
          moveTo(7.0F, 2.0F)
          curveTo(5.896F, 2.0F, 5.0F, 2.895F, 5.0F, 4.0F)
          horizontalLineTo(4.0F)
          curveTo(2.895F, 4.0F, 2.0F, 4.895F, 2.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.104F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.104F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.896F, 2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-1.0F)
          curveToRelative(0.0F, -1.105F, -0.896F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(7.0F)
          close()
          moveToRelative(8.0F, 3.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineTo(5.0F)
          close()
          moveTo(5.0F, 15.0F)
          horizontalLineTo(4.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(10.0F)
          close()
          moveTo(6.0F, 4.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(7.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(4.0F)
          close()        
      }
    }
    return _appRecent20!!
  }

private var _appRecent20: ImageVector? = null
