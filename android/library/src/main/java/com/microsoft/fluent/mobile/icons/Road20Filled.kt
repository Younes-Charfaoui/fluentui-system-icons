package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Road20: ImageVector
  get() {
    if (_road20 != null) {
      return _road20!!
    }
    _road20 = fluentIcon(name = "Filled.Road20", 20f) {
      materialPath {
          moveTo(5.0F, 2.75F)
          curveTo(5.0F, 2.336F, 4.664F, 2.0F, 4.25F, 2.0F)
          reflectiveCurveTo(3.5F, 2.336F, 3.5F, 2.75F)
          verticalLineToRelative(14.5F)
          curveTo(3.5F, 17.664F, 3.836F, 18.0F, 4.25F, 18.0F)
          reflectiveCurveTo(5.0F, 17.664F, 5.0F, 17.25F)
          verticalLineTo(2.75F)
          close()
          moveToRelative(11.5F, 0.0F)
          curveTo(16.5F, 2.336F, 16.164F, 2.0F, 15.75F, 2.0F)
          reflectiveCurveTo(15.0F, 2.336F, 15.0F, 2.75F)
          verticalLineToRelative(14.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(2.75F)
          close()
          moveToRelative(-5.75F, 0.0F)
          curveTo(10.75F, 2.336F, 10.414F, 2.0F, 10.0F, 2.0F)
          reflectiveCurveTo(9.25F, 2.336F, 9.25F, 2.75F)
          verticalLineToRelative(2.5F)
          curveTo(9.25F, 5.664F, 9.586F, 6.0F, 10.0F, 6.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-2.5F)
          close()
          moveToRelative(-1.5F, 8.5F)
          curveTo(9.25F, 11.664F, 9.586F, 12.0F, 10.0F, 12.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-2.5F)
          curveTo(10.75F, 8.336F, 10.414F, 8.0F, 10.0F, 8.0F)
          reflectiveCurveTo(9.25F, 8.336F, 9.25F, 8.75F)
          verticalLineToRelative(2.5F)
          close()
          moveToRelative(0.0F, 3.5F)
          curveTo(9.25F, 14.336F, 9.586F, 14.0F, 10.0F, 14.0F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(2.5F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineToRelative(-2.5F)
          close()        
      }
    }
    return _road20!!
  }

private var _road20: ImageVector? = null
