package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Road24: ImageVector
  get() {
    if (_road24 != null) {
      return _road24!!
    }
    _road24 = fluentIcon(name = "Regular.Road24", 24f) {
      materialPath {
          moveTo(5.5F, 2.75F)
          curveTo(5.5F, 2.336F, 5.164F, 2.0F, 4.75F, 2.0F)
          reflectiveCurveTo(4.0F, 2.336F, 4.0F, 2.75F)
          verticalLineToRelative(18.5F)
          curveTo(4.0F, 21.664F, 4.336F, 22.0F, 4.75F, 22.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(2.75F)
          close()
          moveToRelative(14.5F, 0.0F)
          curveTo(20.0F, 2.336F, 19.664F, 2.0F, 19.25F, 2.0F)
          reflectiveCurveTo(18.5F, 2.336F, 18.5F, 2.75F)
          verticalLineToRelative(18.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(20.0F, 21.664F, 20.0F, 21.25F)
          verticalLineTo(2.75F)
          close()
          moveToRelative(-7.25F, 0.0F)
          curveTo(12.75F, 2.336F, 12.414F, 2.0F, 12.0F, 2.0F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          curveTo(11.25F, 6.664F, 11.586F, 7.0F, 12.0F, 7.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          close()
          moveToRelative(-1.5F, 11.0F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          close()
          moveToRelative(0.0F, 4.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          close()        
      }
    }
    return _road24!!
  }

private var _road24: ImageVector? = null
