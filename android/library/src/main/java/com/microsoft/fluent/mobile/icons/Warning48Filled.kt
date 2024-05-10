package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Warning48: ImageVector
  get() {
    if (_warning48 != null) {
      return _warning48!!
    }
    _warning48 = fluentIcon(name = "Filled.Warning48", 48f) {
      materialPath {
          moveTo(20.471F, 6.228F)
          curveToRelative(1.617F, -2.99F, 5.916F, -2.966F, 7.5F, 0.042F)
          lineToRelative(15.533F, 29.502F)
          curveToRelative(1.49F, 2.83F, -0.562F, 6.23F, -3.76F, 6.23F)
          horizontalLineTo(8.255F)
          curveToRelative(-3.22F, 0.0F, -5.27F, -3.44F, -3.738F, -6.272F)
          lineTo(20.47F, 6.228F)
          close()
          moveTo(24.0F, 15.0F)
          curveToRelative(-0.69F, 0.0F, -1.25F, 0.56F, -1.25F, 1.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveToRelative(1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-11.5F)
          curveToRelative(0.0F, -0.69F, -0.56F, -1.25F, -1.25F, -1.25F)
          close()
          moveToRelative(0.0F, 20.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          close()        
      }
    }
    return _warning48!!
  }

private var _warning48: ImageVector? = null
