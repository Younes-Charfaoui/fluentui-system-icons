package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Laptop48: ImageVector
  get() {
    if (_laptop48 != null) {
      return _laptop48!!
    }
    _laptop48 = fluentIcon(name = "Regular.Laptop48", 48f) {
      materialPath {
          moveTo(12.25F, 8.0F)
          curveTo(9.903F, 8.0F, 8.0F, 9.903F, 8.0F, 12.25F)
          verticalLineToRelative(15.5F)
          curveTo(8.0F, 30.097F, 9.903F, 32.0F, 12.25F, 32.0F)
          horizontalLineToRelative(23.5F)
          curveToRelative(2.347F, 0.0F, 4.25F, -1.903F, 4.25F, -4.25F)
          verticalLineToRelative(-15.5F)
          curveTo(40.0F, 9.903F, 38.097F, 8.0F, 35.75F, 8.0F)
          horizontalLineToRelative(-23.5F)
          close()
          moveToRelative(-1.75F, 4.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(23.5F)
          curveToRelative(0.967F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 0.966F, -0.783F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-23.5F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineToRelative(-15.5F)
          close()
          moveTo(5.25F, 35.5F)
          curveTo(4.56F, 35.5F, 4.0F, 36.06F, 4.0F, 36.75F)
          reflectiveCurveTo(4.56F, 38.0F, 5.25F, 38.0F)
          horizontalLineToRelative(37.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineTo(5.25F)
          close()        
      }
    }
    return _laptop48!!
  }

private var _laptop48: ImageVector? = null
