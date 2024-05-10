package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Kiosk24: ImageVector
  get() {
    if (_kiosk24 != null) {
      return _kiosk24!!
    }
    _kiosk24 = fluentIcon(name = "Regular.Kiosk24", 24f) {
      materialPath {
          moveTo(4.0F, 4.25F)
          curveTo(4.0F, 3.007F, 5.007F, 2.0F, 6.25F, 2.0F)
          horizontalLineToRelative(11.5F)
          curveTo(18.993F, 2.0F, 20.0F, 3.007F, 20.0F, 4.25F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(14.5F)
          verticalLineToRelative(7.5F)
          horizontalLineToRelative(1.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(16.664F, 22.0F, 16.25F, 22.0F)
          horizontalLineToRelative(-8.5F)
          curveTo(7.336F, 22.0F, 7.0F, 21.664F, 7.0F, 21.25F)
          reflectiveCurveToRelative(0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineTo(9.5F)
          verticalLineTo(13.0F)
          horizontalLineTo(6.25F)
          curveTo(5.007F, 13.0F, 4.0F, 11.993F, 4.0F, 10.75F)
          verticalLineToRelative(-6.5F)
          close()
          moveTo(11.0F, 13.0F)
          verticalLineToRelative(7.5F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(-2.0F)
          close()
          moveTo(6.25F, 3.5F)
          curveTo(5.836F, 3.5F, 5.5F, 3.836F, 5.5F, 4.25F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-6.5F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(6.25F)
          close()        
      }
    }
    return _kiosk24!!
  }

private var _kiosk24: ImageVector? = null
