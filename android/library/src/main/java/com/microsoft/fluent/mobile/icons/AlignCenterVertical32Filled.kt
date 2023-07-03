package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.AlignCenterVertical32: ImageVector
  get() {
    if (_alignCenterVertical32 != null) {
      return _alignCenterVertical32!!
    }
    _alignCenterVertical32 = fluentIcon(name = "Filled.AlignCenterVertical32", 32f) {
      materialPath {
          moveTo(16.0F, 30.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineToRelative(-3.5F)
          curveTo(9.567F, 27.0F, 8.0F, 25.433F, 8.0F, 23.5F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -1.933F, 1.567F, -3.5F, 3.5F, -3.5F)
          horizontalLineTo(15.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineTo(8.5F)
          curveTo(6.567F, 15.0F, 5.0F, 13.433F, 5.0F, 11.5F)
          verticalLineToRelative(-3.0F)
          curveTo(5.0F, 6.567F, 6.567F, 5.0F, 8.5F, 5.0F)
          horizontalLineTo(15.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(6.5F)
          curveTo(25.433F, 5.0F, 27.0F, 6.567F, 27.0F, 8.5F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          horizontalLineTo(17.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(3.5F)
          curveToRelative(1.933F, 0.0F, 3.5F, 1.567F, 3.5F, 3.5F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          horizontalLineTo(17.0F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          close()        
      }
    }
    return _alignCenterVertical32!!
  }

private var _alignCenterVertical32: ImageVector? = null
