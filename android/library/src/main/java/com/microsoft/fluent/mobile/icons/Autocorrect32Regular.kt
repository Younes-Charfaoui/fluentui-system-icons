package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Autocorrect32: ImageVector
  get() {
    if (_autocorrect32 != null) {
      return _autocorrect32!!
    }
    _autocorrect32 = fluentIcon(name = "Regular.Autocorrect32", 32f) {
      materialPath {
          moveTo(14.74F, 7.686F)
          curveToRelative(0.592F, -0.914F, 1.929F, -0.914F, 2.52F, 0.0F)
          lineTo(20.697F, 13.0F)
          horizontalLineTo(19.5F)
          curveToRelative(-3.59F, 0.0F, -6.5F, 2.91F, -6.5F, 6.5F)
          reflectiveCurveToRelative(2.91F, 6.5F, 6.5F, 6.5F)
          reflectiveCurveToRelative(6.5F, -2.91F, 6.5F, -6.5F)
          curveToRelative(0.0F, -1.393F, -0.438F, -2.684F, -1.184F, -3.742F)
          lineToRelative(-0.008F, -0.012F)
          lineTo(24.341F, 15.0F)
          horizontalLineTo(29.0F)
          curveToRelative(0.551F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.449F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-5.923F)
          lineTo(18.94F, 6.6F)
          curveToRelative(-1.379F, -2.133F, -4.499F, -2.133F, -5.878F, 0.0F)
          lineToRelative(-10.9F, 16.855F)
          curveToRelative(-0.3F, 0.464F, -0.168F, 1.083F, 0.296F, 1.383F)
          curveToRelative(0.464F, 0.3F, 1.083F, 0.167F, 1.383F, -0.297F)
          lineToRelative(10.9F, -16.855F)
          close()
          moveTo(15.0F, 19.5F)
          curveToRelative(0.0F, -2.485F, 2.015F, -4.5F, 4.5F, -4.5F)
          reflectiveCurveToRelative(4.5F, 2.015F, 4.5F, 4.5F)
          reflectiveCurveToRelative(-2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveToRelative(-4.5F, -2.015F, -4.5F, -4.5F)
          close()        
      }
    }
    return _autocorrect32!!
  }

private var _autocorrect32: ImageVector? = null
