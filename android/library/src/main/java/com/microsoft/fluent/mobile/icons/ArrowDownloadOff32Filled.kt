package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowDownloadOff32: ImageVector
  get() {
    if (_arrowDownloadOff32 != null) {
      return _arrowDownloadOff32!!
    }
    _arrowDownloadOff32 = fluentIcon(name = "Filled.ArrowDownloadOff32", 32f) {
      materialPath {
          moveTo(26.877F, 28.291F)
          lineToRelative(1.416F, 1.416F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-26.0F, -26.0F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(14.75F, 16.164F)
          verticalLineToRelative(3.568F)
          lineToRelative(-4.616F, -4.616F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(6.75F, 6.75F)
          curveToRelative(0.489F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          lineToRelative(2.668F, -2.668F)
          lineToRelative(5.534F, 5.534F)
          horizontalLineTo(6.25F)
          curveTo(5.56F, 26.5F, 5.0F, 27.06F, 5.0F, 27.75F)
          reflectiveCurveTo(5.56F, 29.0F, 6.25F, 29.0F)
          horizontalLineToRelative(19.5F)
          curveToRelative(0.497F, 0.0F, 0.926F, -0.29F, 1.127F, -0.709F)
          close()
          moveToRelative(-9.093F, -9.093F)
          lineToRelative(-0.534F, 0.534F)
          verticalLineToRelative(-1.067F)
          lineToRelative(0.534F, 0.533F)
          close()
          moveToRelative(4.242F, -0.706F)
          lineToRelative(-1.767F, -1.768F)
          lineToRelative(1.607F, -1.608F)
          curveToRelative(0.489F, -0.488F, 1.28F, -0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(-1.608F, 1.608F)
          close()
          moveTo(14.75F, 4.25F)
          verticalLineToRelative(6.966F)
          lineToRelative(2.5F, 2.5F)
          verticalLineTo(4.25F)
          curveTo(17.25F, 3.56F, 16.69F, 3.0F, 16.0F, 3.0F)
          reflectiveCurveToRelative(-1.25F, 0.56F, -1.25F, 1.25F)
          close()        
      }
    }
    return _arrowDownloadOff32!!
  }

private var _arrowDownloadOff32: ImageVector? = null
