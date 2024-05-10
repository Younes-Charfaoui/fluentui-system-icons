package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Seat24: ImageVector
  get() {
    if (_seat24 != null) {
      return _seat24!!
    }
    _seat24 = fluentIcon(name = "Filled.Seat24", 24f) {
      materialPath {
          moveTo(3.0F, 6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(5.627F)
          curveTo(20.315F, 11.328F, 19.446F, 11.0F, 18.5F, 11.0F)
          curveToRelative(-1.339F, 0.0F, -2.524F, 0.658F, -3.25F, 1.668F)
          curveTo(14.524F, 11.658F, 13.339F, 11.0F, 12.0F, 11.0F)
          reflectiveCurveToRelative(-2.524F, 0.658F, -3.25F, 1.668F)
          curveTo(8.024F, 11.658F, 6.839F, 11.0F, 5.5F, 11.0F)
          curveToRelative(-0.946F, 0.0F, -1.815F, 0.328F, -2.5F, 0.877F)
          verticalLineTo(6.25F)
          close()
          moveTo(14.5F, 15.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          reflectiveCurveTo(9.5F, 13.62F, 9.5F, 15.0F)
          verticalLineToRelative(6.0F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(-6.0F)
          close()
          moveToRelative(1.5F, 6.0F)
          horizontalLineToRelative(2.75F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineTo(15.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          reflectiveCurveTo(16.0F, 13.62F, 16.0F, 15.0F)
          verticalLineToRelative(6.0F)
          close()
          moveToRelative(-8.0F, 0.0F)
          horizontalLineTo(5.25F)
          curveTo(4.007F, 21.0F, 3.0F, 19.993F, 3.0F, 18.75F)
          verticalLineTo(15.0F)
          curveToRelative(0.0F, -1.38F, 1.12F, -2.5F, 2.5F, -2.5F)
          reflectiveCurveTo(8.0F, 13.62F, 8.0F, 15.0F)
          verticalLineToRelative(6.0F)
          close()        
      }
    }
    return _seat24!!
  }

private var _seat24: ImageVector? = null
