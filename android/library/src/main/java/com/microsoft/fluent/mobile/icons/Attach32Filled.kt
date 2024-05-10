package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Attach32: ImageVector
  get() {
    if (_attach32 != null) {
      return _attach32!!
    }
    _attach32 = fluentIcon(name = "Filled.Attach32", 32f) {
      materialPath {
          moveTo(16.028F, 4.397F)
          curveToRelative(3.197F, -3.196F, 8.379F, -3.196F, 11.575F, 0.0F)
          curveToRelative(3.197F, 3.197F, 3.197F, 8.38F, 0.0F, 11.576F)
          lineTo(15.06F, 28.515F)
          curveToRelative(-1.977F, 1.978F, -5.184F, 1.978F, -7.161F, 0.0F)
          curveToRelative(-1.978F, -1.977F, -1.978F, -5.184F, 0.0F, -7.162F)
          lineToRelative(11.14F, -11.14F)
          curveToRelative(0.489F, -0.489F, 1.28F, -0.489F, 1.769F, 0.0F)
          curveToRelative(0.488F, 0.487F, 0.488F, 1.279F, 0.0F, 1.767F)
          lineTo(9.665F, 23.12F)
          curveToRelative(-1.001F, 1.002F, -1.001F, 2.625F, 0.0F, 3.627F)
          curveToRelative(1.002F, 1.001F, 2.625F, 1.001F, 3.627F, 0.0F)
          lineToRelative(12.543F, -12.543F)
          curveToRelative(2.22F, -2.22F, 2.22F, -5.82F, 0.0F, -8.04F)
          curveToRelative(-2.22F, -2.22F, -5.82F, -2.22F, -8.04F, 0.0F)
          lineTo(4.135F, 19.827F)
          curveToRelative(-0.488F, 0.488F, -1.28F, 0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, -1.28F, 0.0F, -1.768F)
          lineTo(16.028F, 4.397F)
          close()        
      }
    }
    return _attach32!!
  }

private var _attach32: ImageVector? = null
