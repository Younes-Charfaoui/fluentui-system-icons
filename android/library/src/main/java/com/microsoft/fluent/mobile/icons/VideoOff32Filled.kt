package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoOff32: ImageVector
  get() {
    if (_videoOff32 != null) {
      return _videoOff32!!
    }
    _videoOff32 = fluentIcon(name = "Filled.VideoOff32", 32f) {
      materialPath {
          moveTo(20.923F, 22.337F)
          lineToRelative(7.37F, 7.37F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-26.0F, -26.0F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(4.884F, 6.3F)
          curveTo(3.197F, 6.949F, 2.0F, 8.584F, 2.0F, 10.5F)
          verticalLineToRelative(11.0F)
          curveTo(2.0F, 23.985F, 4.015F, 26.0F, 6.5F, 26.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(2.2F, 0.0F, 4.03F, -1.578F, 4.423F, -3.663F)
          close()
          moveToRelative(1.577F, -3.374F)
          lineToRelative(5.52F, 5.519F)
          curveToRelative(1.056F, -0.134F, 1.976F, -1.017F, 1.976F, -2.236F)
          verticalLineTo(9.754F)
          curveToRelative(0.0F, -1.814F, -2.036F, -2.882F, -3.528F, -1.852F)
          lineToRelative(-3.968F, 2.74F)
          verticalLineToRelative(8.321F)
          close()
          moveTo(9.537F, 6.0F)
          lineTo(21.0F, 17.463F)
          verticalLineTo(10.5F)
          curveTo(21.0F, 8.015F, 18.986F, 6.0F, 16.5F, 6.0F)
          horizontalLineTo(9.537F)
          close()        
      }
    }
    return _videoOff32!!
  }

private var _videoOff32: ImageVector? = null
