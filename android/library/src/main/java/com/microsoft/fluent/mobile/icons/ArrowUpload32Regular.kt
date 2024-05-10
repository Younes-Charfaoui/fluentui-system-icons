package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowUpload32: ImageVector
  get() {
    if (_arrowUpload32 != null) {
      return _arrowUpload32!!
    }
    _arrowUpload32 = fluentIcon(name = "Regular.ArrowUpload32", 32f) {
      materialPath {
          moveTo(7.0F, 2.0F)
          curveTo(6.448F, 2.0F, 6.0F, 2.448F, 6.0F, 3.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(18.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(7.0F)
          close()
          moveToRelative(9.707F, 4.293F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          lineToRelative(-7.0F, 7.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          lineTo(15.0F, 9.414F)
          verticalLineTo(29.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(9.414F)
          lineToRelative(5.293F, 5.293F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-7.0F, -7.0F)
          close()        
      }
    }
    return _arrowUpload32!!
  }

private var _arrowUpload32: ImageVector? = null
