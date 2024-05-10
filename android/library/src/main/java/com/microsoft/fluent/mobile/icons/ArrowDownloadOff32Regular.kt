package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowDownloadOff32: ImageVector
  get() {
    if (_arrowDownloadOff32 != null) {
      return _arrowDownloadOff32!!
    }
    _arrowDownloadOff32 = fluentIcon(name = "Regular.ArrowDownloadOff32", 32f) {
      materialPath {
          moveTo(19.5F, 20.914F)
          lineToRelative(8.793F, 8.793F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-26.0F, -26.0F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(15.0F, 16.414F)
          verticalLineToRelative(4.172F)
          lineToRelative(-5.293F, -5.293F)
          curveToRelative(-0.39F, -0.39F, -1.023F, -0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          lineToRelative(7.0F, 7.0F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          lineToRelative(2.793F, -2.793F)
          close()
          moveTo(18.086F, 19.5F)
          lineTo(17.0F, 20.586F)
          verticalLineToRelative(-2.171F)
          lineToRelative(1.086F, 1.085F)
          close()
          moveToRelative(3.889F, -1.06F)
          lineToRelative(-1.415F, -1.414F)
          lineToRelative(1.733F, -1.733F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineToRelative(-1.732F, 1.733F)
          close()
          moveTo(15.0F, 4.0F)
          verticalLineToRelative(7.466F)
          lineToRelative(2.0F, 2.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, -0.447F, -1.0F, -1.0F, -1.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          close()
          moveTo(7.0F, 27.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(18.0F)
          curveToRelative(0.553F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.447F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(7.0F)
          close()        
      }
    }
    return _arrowDownloadOff32!!
  }

private var _arrowDownloadOff32: ImageVector? = null
