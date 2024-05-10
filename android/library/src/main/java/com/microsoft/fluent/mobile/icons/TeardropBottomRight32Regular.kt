package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TeardropBottomRight32: ImageVector
  get() {
    if (_teardropBottomRight32 != null) {
      return _teardropBottomRight32!!
    }
    _teardropBottomRight32 = fluentIcon(name = "Regular.TeardropBottomRight32", 32f) {
      materialPath {
          moveTo(2.0F, 16.0F)
          curveTo(2.0F, 8.268F, 8.268F, 2.0F, 16.0F, 2.0F)
          reflectiveCurveToRelative(14.0F, 6.268F, 14.0F, 14.0F)
          verticalLineToRelative(10.75F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(16.0F)
          curveTo(8.268F, 30.0F, 2.0F, 23.732F, 2.0F, 16.0F)
          close()
          moveTo(16.0F, 4.0F)
          curveTo(9.373F, 4.0F, 4.0F, 9.373F, 4.0F, 16.0F)
          reflectiveCurveToRelative(5.373F, 12.0F, 12.0F, 12.0F)
          horizontalLineToRelative(10.75F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineTo(16.0F)
          curveToRelative(0.0F, -6.627F, -5.373F, -12.0F, -12.0F, -12.0F)
          close()        
      }
    }
    return _teardropBottomRight32!!
  }

private var _teardropBottomRight32: ImageVector? = null
