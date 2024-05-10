package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Laptop28: ImageVector
  get() {
    if (_laptop28 != null) {
      return _laptop28!!
    }
    _laptop28 = fluentIcon(name = "Filled.Laptop28", 28f) {
      materialPath {
          moveTo(4.004F, 7.75F)
          curveTo(4.004F, 6.231F, 5.235F, 5.0F, 6.754F, 5.0F)
          horizontalLineToRelative(14.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 1.519F, -1.231F, 2.75F, -2.75F, 2.75F)
          horizontalLineToRelative(-14.5F)
          curveToRelative(-1.519F, 0.0F, -2.75F, -1.231F, -2.75F, -2.75F)
          verticalLineToRelative(-8.5F)
          close()
          moveToRelative(-2.0F, 13.5F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineTo(25.25F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(25.665F, 22.0F, 25.25F, 22.0F)
          horizontalLineTo(2.753F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()        
      }
    }
    return _laptop28!!
  }

private var _laptop28: ImageVector? = null
