package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Desk48: ImageVector
  get() {
    if (_desk48 != null) {
      return _desk48!!
    }
    _desk48 = fluentIcon(name = "Filled.Desk48", 48f) {
      materialPath {
          moveTo(8.25F, 8.0F)
          curveTo(5.903F, 8.0F, 4.0F, 9.903F, 4.0F, 12.25F)
          verticalLineTo(16.0F)
          horizontalLineToRelative(37.5F)
          verticalLineToRelative(22.75F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveTo(44.0F, 39.44F, 44.0F, 38.75F)
          verticalLineToRelative(-26.5F)
          curveTo(44.0F, 9.903F, 42.097F, 8.0F, 39.75F, 8.0F)
          horizontalLineTo(8.25F)
          close()
          moveTo(24.0F, 18.5F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(15.25F)
          curveTo(4.0F, 37.202F, 6.798F, 40.0F, 10.25F, 40.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineTo(18.5F)
          close()
          moveToRelative(-14.0F, 6.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineToRelative(5.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveToRelative(-0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineToRelative(-5.5F)
          curveToRelative(-0.69F, 0.0F, -1.25F, -0.56F, -1.25F, -1.25F)
          close()        
      }
    }
    return _desk48!!
  }

private var _desk48: ImageVector? = null
