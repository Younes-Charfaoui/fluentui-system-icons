package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Kiosk24: ImageVector
  get() {
    if (_kiosk24 != null) {
      return _kiosk24!!
    }
    _kiosk24 = fluentIcon(name = "Filled.Kiosk24", 24f) {
      materialPath {
          moveTo(6.25F, 2.0F)
          curveTo(5.007F, 2.0F, 4.0F, 3.007F, 4.0F, 4.25F)
          verticalLineToRelative(6.5F)
          curveTo(4.0F, 11.993F, 5.007F, 13.0F, 6.25F, 13.0F)
          horizontalLineTo(9.5F)
          verticalLineToRelative(7.5F)
          horizontalLineTo(7.75F)
          curveTo(7.336F, 20.5F, 7.0F, 20.836F, 7.0F, 21.25F)
          reflectiveCurveTo(7.336F, 22.0F, 7.75F, 22.0F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(14.5F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(3.25F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineToRelative(-6.5F)
          curveTo(20.0F, 3.007F, 18.993F, 2.0F, 17.75F, 2.0F)
          horizontalLineTo(6.25F)
          close()
          moveTo(11.0F, 20.5F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(7.5F)
          horizontalLineToRelative(-2.0F)
          close()        
      }
    }
    return _kiosk24!!
  }

private var _kiosk24: ImageVector? = null
