package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DataBarHorizontalDescending16: ImageVector
  get() {
    if (_dataBarHorizontalDescending16 != null) {
      return _dataBarHorizontalDescending16!!
    }
    _dataBarHorizontalDescending16 = fluentIcon(name = "Filled.DataBarHorizontalDescending16", 16f) {
      materialPath {
          moveTo(13.0F, 5.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(3.0F)
          curveTo(1.895F, 1.0F, 1.0F, 1.895F, 1.0F, 3.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(10.0F)
          close()
          moveTo(7.0F, 15.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(4.0F)
          close()
          moveToRelative(4.0F, -7.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          close()        
      }
    }
    return _dataBarHorizontalDescending16!!
  }

private var _dataBarHorizontalDescending16: ImageVector? = null
