package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowDownload32: ImageVector
  get() {
    if (_arrowDownload32 != null) {
      return _arrowDownload32!!
    }
    _arrowDownload32 = fluentIcon(name = "Filled.ArrowDownload32", 32f) {
      materialPath {
          moveTo(17.25F, 4.25F)
          curveTo(17.25F, 3.56F, 16.69F, 3.0F, 16.0F, 3.0F)
          reflectiveCurveToRelative(-1.25F, 0.56F, -1.25F, 1.25F)
          verticalLineToRelative(15.482F)
          lineToRelative(-4.616F, -4.616F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(6.75F, 6.75F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          lineToRelative(6.75F, -6.75F)
          curveToRelative(0.488F, -0.488F, 0.488F, -1.28F, 0.0F, -1.768F)
          reflectiveCurveToRelative(-1.28F, -0.488F, -1.768F, 0.0F)
          lineToRelative(-4.616F, 4.616F)
          verticalLineTo(4.25F)
          close()
          moveToRelative(-11.0F, 22.25F)
          curveTo(5.56F, 26.5F, 5.0F, 27.06F, 5.0F, 27.75F)
          reflectiveCurveTo(5.56F, 29.0F, 6.25F, 29.0F)
          horizontalLineToRelative(19.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineTo(6.25F)
          close()        
      }
    }
    return _arrowDownload32!!
  }

private var _arrowDownload32: ImageVector? = null
