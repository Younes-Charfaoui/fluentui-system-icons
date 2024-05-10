package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSwap16: ImageVector
  get() {
    if (_arrowSwap16 != null) {
      return _arrowSwap16!!
    }
    _arrowSwap16 = fluentIcon(name = "Regular.ArrowSwap16", 16f) {
      materialPath {
          moveTo(10.354F, 1.647F)
          curveToRelative(-0.196F, -0.196F, -0.512F, -0.196F, -0.707F, 0.0F)
          curveToRelative(-0.196F, 0.195F, -0.196F, 0.511F, 0.0F, 0.706F)
          lineTo(11.293F, 4.0F)
          horizontalLineTo(3.5F)
          curveTo(3.224F, 4.0F, 3.0F, 4.224F, 3.0F, 4.5F)
          reflectiveCurveTo(3.224F, 5.0F, 3.5F, 5.0F)
          horizontalLineToRelative(7.793F)
          lineTo(9.647F, 6.646F)
          curveToRelative(-0.196F, 0.196F, -0.196F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.195F, 0.195F, 0.511F, 0.195F, 0.707F, 0.0F)
          lineToRelative(2.5F, -2.5F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-2.5F, -2.5F)
          close()
          moveToRelative(-4.0F, 7.707F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.707F)
          curveToRelative(-0.196F, -0.196F, -0.512F, -0.196F, -0.708F, 0.0F)
          lineToRelative(-2.5F, 2.5F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.511F, 0.0F, 0.707F)
          lineToRelative(2.5F, 2.5F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineTo(4.707F, 12.0F)
          horizontalLineTo(12.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(12.776F, 11.0F, 12.5F, 11.0F)
          horizontalLineTo(4.707F)
          lineToRelative(1.647F, -1.646F)
          close()        
      }
    }
    return _arrowSwap16!!
  }

private var _arrowSwap16: ImageVector? = null
