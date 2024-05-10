package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PollOff32: ImageVector
  get() {
    if (_pollOff32 != null) {
      return _pollOff32!!
    }
    _pollOff32 = fluentIcon(name = "Filled.PollOff32", 32f) {
      materialPath {
          moveTo(27.165F, 28.58F)
          lineToRelative(1.128F, 1.127F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-26.0F, -26.0F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(12.0F, 13.415F)
          verticalLineTo(25.5F)
          curveToRelative(0.0F, 1.933F, 1.567F, 3.5F, 3.5F, 3.5F)
          reflectiveCurveToRelative(3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineToRelative(-5.086F)
          lineToRelative(3.0F, 3.0F)
          verticalLineTo(25.5F)
          curveToRelative(0.0F, 1.933F, 1.567F, 3.5F, 3.5F, 3.5F)
          curveToRelative(0.603F, 0.0F, 1.17F, -0.152F, 1.665F, -0.42F)
          close()
          moveTo(22.0F, 18.464F)
          lineToRelative(7.0F, 7.0F)
          verticalLineTo(12.5F)
          curveToRelative(0.0F, -1.933F, -1.567F, -3.5F, -3.5F, -3.5F)
          reflectiveCurveTo(22.0F, 10.567F, 22.0F, 12.5F)
          verticalLineToRelative(5.965F)
          close()
          moveToRelative(-10.0F, -10.0F)
          lineToRelative(7.0F, 7.0F)
          verticalLineTo(6.5F)
          curveTo(19.0F, 4.567F, 17.433F, 3.0F, 15.5F, 3.0F)
          reflectiveCurveTo(12.0F, 4.567F, 12.0F, 6.5F)
          verticalLineToRelative(1.966F)
          close()
          moveTo(2.0F, 18.5F)
          curveTo(2.0F, 16.567F, 3.567F, 15.0F, 5.5F, 15.0F)
          reflectiveCurveTo(9.0F, 16.567F, 9.0F, 18.5F)
          verticalLineToRelative(7.0F)
          curveTo(9.0F, 27.433F, 7.433F, 29.0F, 5.5F, 29.0F)
          reflectiveCurveTo(2.0F, 27.433F, 2.0F, 25.5F)
          verticalLineToRelative(-7.0F)
          close()        
      }
    }
    return _pollOff32!!
  }

private var _pollOff32: ImageVector? = null
