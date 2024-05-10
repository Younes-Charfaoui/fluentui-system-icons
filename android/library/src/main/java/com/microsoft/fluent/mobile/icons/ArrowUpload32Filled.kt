package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowUpload32: ImageVector
  get() {
    if (_arrowUpload32 != null) {
      return _arrowUpload32!!
    }
    _arrowUpload32 = fluentIcon(name = "Filled.ArrowUpload32", 32f) {
      materialPath {
          moveTo(7.25F, 2.0F)
          curveTo(6.56F, 2.0F, 6.0F, 2.56F, 6.0F, 3.25F)
          reflectiveCurveTo(6.56F, 4.5F, 7.25F, 4.5F)
          horizontalLineToRelative(17.5F)
          curveTo(25.44F, 4.5F, 26.0F, 3.94F, 26.0F, 3.25F)
          reflectiveCurveTo(25.44F, 2.0F, 24.75F, 2.0F)
          horizontalLineTo(7.25F)
          close()
          moveToRelative(9.634F, 4.866F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          lineToRelative(-6.75F, 6.75F)
          curveToRelative(-0.488F, 0.488F, -0.488F, 1.28F, 0.0F, 1.768F)
          reflectiveCurveToRelative(1.28F, 0.488F, 1.768F, 0.0F)
          lineToRelative(4.616F, -4.616F)
          verticalLineTo(28.75F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveToRelative(1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineTo(10.768F)
          lineToRelative(4.616F, 4.616F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(-6.75F, -6.75F)
          close()        
      }
    }
    return _arrowUpload32!!
  }

private var _arrowUpload32: ImageVector? = null
