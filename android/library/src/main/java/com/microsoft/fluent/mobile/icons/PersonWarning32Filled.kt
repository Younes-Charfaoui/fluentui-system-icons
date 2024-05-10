package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonWarning32: ImageVector
  get() {
    if (_personWarning32 != null) {
      return _personWarning32!!
    }
    _personWarning32 = fluentIcon(name = "Filled.PersonWarning32", 32f) {
      materialPath {
          moveTo(16.0F, 16.0F)
          curveToRelative(3.866F, 0.0F, 7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          reflectiveCurveToRelative(-7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          close()
          moveToRelative(-8.5F, 2.0F)
          curveTo(5.567F, 18.0F, 4.0F, 19.567F, 4.0F, 21.5F)
          verticalLineTo(22.0F)
          curveToRelative(0.0F, 2.393F, 1.523F, 4.417F, 3.685F, 5.793F)
          curveToRelative(1.784F, 1.136F, 4.086F, 1.894F, 6.622F, 2.13F)
          curveToRelative(-0.415F, -0.93F, -0.435F, -2.042F, 0.107F, -3.064F)
          lineTo(19.116F, 18.0F)
          horizontalLineTo(7.5F)
          close()
          moveToRelative(14.238F, -1.74F)
          lineTo(15.74F, 27.562F)
          curveToRelative(-0.707F, 1.333F, 0.259F, 2.938F, 1.767F, 2.938F)
          horizontalLineToRelative(10.988F)
          curveToRelative(1.509F, 0.0F, 2.474F, -1.605F, 1.767F, -2.938F)
          lineTo(24.264F, 16.26F)
          curveToRelative(-0.537F, -1.013F, -1.988F, -1.013F, -2.526F, 0.0F)
          close()
          moveToRelative(2.013F, 3.49F)
          verticalLineToRelative(5.5F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineToRelative(-5.5F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          close()
          moveToRelative(0.25F, 8.25F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          close()        
      }
    }
    return _personWarning32!!
  }

private var _personWarning32: ImageVector? = null
