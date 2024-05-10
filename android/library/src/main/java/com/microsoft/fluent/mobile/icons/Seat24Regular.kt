package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Seat24: ImageVector
  get() {
    if (_seat24 != null) {
      return _seat24!!
    }
    _seat24 = fluentIcon(name = "Regular.Seat24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(12.5F)
          curveTo(3.0F, 19.993F, 4.007F, 21.0F, 5.25F, 21.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(13.25F, 8.627F)
          curveTo(18.933F, 11.232F, 18.244F, 11.0F, 17.5F, 11.0F)
          curveToRelative(-1.116F, 0.0F, -2.11F, 0.522F, -2.75F, 1.335F)
          curveTo(14.11F, 11.522F, 13.116F, 11.0F, 12.0F, 11.0F)
          reflectiveCurveToRelative(-2.11F, 0.522F, -2.75F, 1.335F)
          curveTo(8.61F, 11.522F, 7.615F, 11.0F, 6.5F, 11.0F)
          curveToRelative(-0.744F, 0.0F, -1.433F, 0.232F, -2.0F, 0.627F)
          verticalLineTo(6.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(5.377F)
          close()
          moveTo(14.0F, 14.5F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(1.5F, 5.0F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(4.25F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(15.5F)
          close()
          moveToRelative(-10.25F, 0.0F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(14.5F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          horizontalLineTo(5.25F)
          close()        
      }
    }
    return _seat24!!
  }

private var _seat24: ImageVector? = null
