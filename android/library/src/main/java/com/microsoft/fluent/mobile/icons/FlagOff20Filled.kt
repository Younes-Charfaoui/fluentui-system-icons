package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FlagOff20: ImageVector
  get() {
    if (_flagOff20 != null) {
      return _flagOff20!!
    }
    _flagOff20 = fluentIcon(name = "Filled.FlagOff20", 20f) {
      materialPath {
          moveTo(2.853F, 2.147F)
          curveToRelative(-0.195F, -0.196F, -0.511F, -0.196F, -0.707F, 0.0F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.511F, 0.0F, 0.707F)
          lineTo(4.0F, 4.707F)
          verticalLineTo(17.5F)
          curveTo(4.0F, 17.776F, 4.224F, 18.0F, 4.5F, 18.0F)
          reflectiveCurveTo(5.0F, 17.776F, 5.0F, 17.5F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(7.293F)
          lineToRelative(4.853F, 4.854F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-15.0F, -15.0F)
          close()
          moveTo(16.5F, 13.0F)
          horizontalLineToRelative(-1.379F)
          lineToRelative(-10.0F, -10.0F)
          horizontalLineTo(16.5F)
          curveToRelative(0.4F, 0.0F, 0.637F, 0.445F, 0.416F, 0.777F)
          lineTo(14.101F, 8.0F)
          lineToRelative(2.815F, 4.223F)
          curveTo(17.137F, 12.555F, 16.899F, 13.0F, 16.5F, 13.0F)
          close()        
      }
    }
    return _flagOff20!!
  }

private var _flagOff20: ImageVector? = null
