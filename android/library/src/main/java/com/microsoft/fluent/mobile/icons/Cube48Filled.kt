package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Cube48: ImageVector
  get() {
    if (_cube48 != null) {
      return _cube48!!
    }
    _cube48 = fluentIcon(name = "Filled.Cube48", 48f) {
      materialPath {
          moveTo(21.679F, 5.332F)
          curveToRelative(1.49F, -0.596F, 3.152F, -0.596F, 4.642F, 0.0F)
          lineToRelative(15.007F, 6.003F)
          curveTo(42.942F, 11.98F, 44.0F, 13.543F, 44.0F, 15.281F)
          verticalLineToRelative(17.438F)
          curveToRelative(0.0F, 1.738F, -1.058F, 3.3F, -2.672F, 3.946F)
          lineToRelative(-15.007F, 6.003F)
          curveToRelative(-1.49F, 0.596F, -3.152F, 0.596F, -4.642F, 0.0F)
          lineTo(6.672F, 36.665F)
          curveTo(5.058F, 36.019F, 4.0F, 34.457F, 4.0F, 32.719F)
          verticalLineTo(15.28F)
          curveToRelative(0.0F, -1.738F, 1.058F, -3.3F, 2.671F, -3.946F)
          lineTo(21.68F, 5.332F)
          close()
          moveToRelative(-7.426F, 10.273F)
          curveToRelative(-0.633F, -0.277F, -1.37F, 0.01F, -1.648F, 0.642F)
          curveToRelative(-0.277F, 0.633F, 0.01F, 1.37F, 0.643F, 1.648F)
          lineToRelative(9.502F, 4.171F)
          verticalLineToRelative(9.184F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveToRelative(1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-9.184F)
          lineToRelative(9.502F, -4.171F)
          curveToRelative(0.633F, -0.278F, 0.92F, -1.015F, 0.643F, -1.648F)
          curveToRelative(-0.278F, -0.632F, -1.015F, -0.92F, -1.648F, -0.642F)
          lineTo(24.0F, 19.885F)
          lineToRelative(-9.748F, -4.28F)
          close()        
      }
    }
    return _cube48!!
  }

private var _cube48: ImageVector? = null
