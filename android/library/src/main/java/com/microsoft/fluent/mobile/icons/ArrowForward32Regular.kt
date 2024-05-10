package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowForward32: ImageVector
  get() {
    if (_arrowForward32 != null) {
      return _arrowForward32!!
    }
    _arrowForward32 = fluentIcon(name = "Regular.ArrowForward32", 32f) {
      materialPath {
          moveTo(20.293F, 6.707F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          lineToRelative(7.0F, 7.0F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineToRelative(-7.0F, 7.0F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          lineTo(25.586F, 14.0F)
          horizontalLineTo(16.0F)
          curveTo(9.925F, 14.0F, 5.0F, 18.925F, 5.0F, 25.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          curveToRelative(0.0F, -7.18F, 5.82F, -13.0F, 13.0F, -13.0F)
          horizontalLineToRelative(9.586F)
          lineToRelative(-5.293F, -5.293F)
          close()        
      }
    }
    return _arrowForward32!!
  }

private var _arrowForward32: ImageVector? = null
