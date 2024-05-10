package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowUpExclamation20: ImageVector
  get() {
    if (_arrowUpExclamation20 != null) {
      return _arrowUpExclamation20!!
    }
    _arrowUpExclamation20 = fluentIcon(name = "Filled.ArrowUpExclamation20", 20f) {
      materialPath {
          moveTo(3.0F, 5.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          curveToRelative(0.0F, 2.25F, -0.788F, 5.214F, -1.224F, 6.69F)
          curveTo(7.54F, 12.481F, 6.81F, 13.0F, 6.0F, 13.0F)
          reflectiveCurveToRelative(-1.542F, -0.52F, -1.776F, -1.315F)
          curveTo(3.789F, 10.204F, 3.0F, 7.227F, 3.0F, 5.0F)
          close()
          moveToRelative(1.0F, 11.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          reflectiveCurveToRelative(-0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          close()
          moveTo(15.0F, 3.707F)
          verticalLineTo(17.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(14.0F, 17.776F, 14.0F, 17.5F)
          verticalLineTo(3.707F)
          lineToRelative(-2.146F, 2.147F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(3.0F, 3.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineTo(15.0F, 3.707F)
          close()        
      }
    }
    return _arrowUpExclamation20!!
  }

private var _arrowUpExclamation20: ImageVector? = null
