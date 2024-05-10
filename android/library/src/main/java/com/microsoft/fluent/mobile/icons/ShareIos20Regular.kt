package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ShareIos20: ImageVector
  get() {
    if (_shareIos20 != null) {
      return _shareIos20!!
    }
    _shareIos20 = fluentIcon(name = "Regular.ShareIos20", 20f) {
      materialPath {
          moveTo(10.354F, 2.147F)
          curveToRelative(-0.196F, -0.196F, -0.512F, -0.196F, -0.707F, 0.0F)
          lineToRelative(-4.5F, 4.5F)
          curveToRelative(-0.196F, 0.195F, -0.196F, 0.511F, 0.0F, 0.707F)
          curveToRelative(0.195F, 0.195F, 0.511F, 0.195F, 0.707F, 0.0F)
          lineTo(9.5F, 3.707F)
          verticalLineTo(12.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(3.707F)
          lineToRelative(3.646F, 3.647F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-4.5F, -4.5F)
          close()
          moveTo(4.0F, 9.5F)
          curveTo(4.0F, 9.224F, 3.776F, 9.0F, 3.5F, 9.0F)
          reflectiveCurveTo(3.0F, 9.224F, 3.0F, 9.5F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(9.5F)
          curveTo(17.0F, 9.224F, 16.776F, 9.0F, 16.5F, 9.0F)
          reflectiveCurveTo(16.0F, 9.224F, 16.0F, 9.5F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(9.5F)
          close()        
      }
    }
    return _shareIos20!!
  }

private var _shareIos20: ImageVector? = null
