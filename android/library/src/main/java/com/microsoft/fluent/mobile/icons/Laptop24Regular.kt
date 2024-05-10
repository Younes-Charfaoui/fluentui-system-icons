package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Laptop24: ImageVector
  get() {
    if (_laptop24 != null) {
      return _laptop24!!
    }
    _laptop24 = fluentIcon(name = "Regular.Laptop24", 24f) {
      materialPath {
          moveTo(6.25F, 4.0F)
          curveTo(5.007F, 4.0F, 4.0F, 5.007F, 4.0F, 6.25F)
          verticalLineToRelative(7.5F)
          curveTo(4.0F, 14.993F, 5.007F, 16.0F, 6.25F, 16.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineToRelative(-7.5F)
          curveTo(20.0F, 5.007F, 18.993F, 4.0F, 17.75F, 4.0F)
          horizontalLineTo(6.25F)
          close()
          moveTo(5.5F, 6.25F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(6.25F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineToRelative(-7.5F)
          close()
          moveTo(2.75F, 17.5F)
          curveTo(2.336F, 17.5F, 2.0F, 17.836F, 2.0F, 18.25F)
          reflectiveCurveTo(2.336F, 19.0F, 2.75F, 19.0F)
          horizontalLineToRelative(18.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(2.75F)
          close()        
      }
    }
    return _laptop24!!
  }

private var _laptop24: ImageVector? = null
