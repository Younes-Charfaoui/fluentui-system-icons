package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PollOff16: ImageVector
  get() {
    if (_pollOff16 != null) {
      return _pollOff16!!
    }
    _pollOff16 = fluentIcon(name = "Filled.PollOff16", 16f) {
      materialPath {
          moveTo(6.0F, 6.707F)
          verticalLineTo(13.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          reflectiveCurveToRelative(2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-2.293F)
          lineToRelative(1.0F, 1.0F)
          verticalLineTo(13.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          curveToRelative(0.37F, 0.0F, 0.718F, -0.101F, 1.016F, -0.277F)
          lineToRelative(0.13F, 0.13F)
          curveToRelative(0.196F, 0.196F, 0.512F, 0.196F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.511F, 0.0F, -0.707F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(6.0F, 6.707F)
          close()
          moveTo(11.0F, 7.0F)
          verticalLineToRelative(1.879F)
          lineToRelative(4.0F, 4.0F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          close()
          moveTo(6.0F, 3.0F)
          verticalLineToRelative(0.879F)
          lineToRelative(4.0F, 4.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveTo(6.0F, 1.895F, 6.0F, 3.0F)
          close()
          moveTo(1.0F, 9.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(9.0F)
          close()        
      }
    }
    return _pollOff16!!
  }

private var _pollOff16: ImageVector? = null
