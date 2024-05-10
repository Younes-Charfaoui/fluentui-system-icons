package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PollOff20: ImageVector
  get() {
    if (_pollOff20 != null) {
      return _pollOff20!!
    }
    _pollOff20 = fluentIcon(name = "Filled.PollOff20", 20f) {
      materialPath {
          moveTo(8.0F, 8.707F)
          verticalLineTo(16.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          reflectiveCurveToRelative(2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-3.293F)
          lineToRelative(2.0F, 2.0F)
          verticalLineTo(16.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          curveToRelative(0.37F, 0.0F, 0.718F, -0.101F, 1.016F, -0.277F)
          lineToRelative(0.13F, 0.13F)
          curveToRelative(0.196F, 0.196F, 0.512F, 0.196F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.511F, 0.0F, -0.707F)
          lineToRelative(-15.0F, -15.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(8.0F, 8.707F)
          close()
          moveTo(14.0F, 8.0F)
          verticalLineToRelative(3.879F)
          lineToRelative(4.0F, 4.0F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          close()
          moveTo(8.0F, 5.879F)
          lineToRelative(4.0F, 4.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveTo(8.0F, 2.895F, 8.0F, 4.0F)
          verticalLineToRelative(1.879F)
          close()
          moveTo(4.0F, 10.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          reflectiveCurveToRelative(2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-4.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          close()        
      }
    }
    return _pollOff20!!
  }

private var _pollOff20: ImageVector? = null
