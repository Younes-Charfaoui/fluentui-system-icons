package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FlagPride32: ImageVector
  get() {
    if (_flagPride32 != null) {
      return _flagPride32!!
    }
    _flagPride32 = fluentIcon(name = "Filled.FlagPride32", 32f) {
      materialPath {
          moveTo(5.0F, 16.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(3.5F)
          horizontalLineTo(5.0F)
          verticalLineTo(16.0F)
          close()
          moveTo(5.0F, 13.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(-4.0F)
          close()
          moveTo(5.0F, 11.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(-3.0F)
          close()
          moveTo(5.0F, 9.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(9.0F)
          close()
          moveTo(5.0F, 6.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(6.0F)
          close()
          moveTo(5.0F, 4.0F)
          horizontalLineToRelative(22.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(4.0F)
          close()
          moveTo(4.0F, 4.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(22.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(16.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(4.0F)
          close()
          moveToRelative(2.0F, 15.0F)
          horizontalLineToRelative(20.0F)
          verticalLineTo(5.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(14.0F)
          close()        
      }
    }
    return _flagPride32!!
  }

private var _flagPride32: ImageVector? = null
