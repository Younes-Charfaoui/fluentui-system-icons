package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FlagOff20: ImageVector
  get() {
    if (_flagOff20 != null) {
      return _flagOff20!!
    }
    _flagOff20 = fluentIcon(name = "Regular.FlagOff20", 20f) {
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
          moveTo(11.293F, 12.0F)
          horizontalLineTo(5.0F)
          verticalLineTo(5.707F)
          lineTo(11.293F, 12.0F)
          close()
          moveToRelative(4.273F, 0.0F)
          horizontalLineTo(14.12F)
          lineToRelative(1.0F, 1.0F)
          horizontalLineToRelative(1.38F)
          curveToRelative(0.4F, 0.0F, 0.637F, -0.445F, 0.416F, -0.777F)
          lineTo(14.101F, 8.0F)
          lineToRelative(2.815F, -4.223F)
          curveTo(17.137F, 3.445F, 16.899F, 3.0F, 16.5F, 3.0F)
          horizontalLineTo(5.121F)
          lineToRelative(1.0F, 1.0F)
          horizontalLineToRelative(9.445F)
          lineToRelative(-2.482F, 3.723F)
          curveToRelative(-0.112F, 0.168F, -0.112F, 0.386F, 0.0F, 0.554F)
          lineTo(15.566F, 12.0F)
          close()        
      }
    }
    return _flagOff20!!
  }

private var _flagOff20: ImageVector? = null
