package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal2DashesSolid24: ImageVector
  get() {
    if (_lineHorizontal2DashesSolid24 != null) {
      return _lineHorizontal2DashesSolid24!!
    }
    _lineHorizontal2DashesSolid24 = fluentIcon(name = "Regular.LineHorizontal2DashesSolid24", 224f) {
      materialPath {
          moveTo(2.75F, 7.0F)
          curveTo(2.336F, 7.0F, 2.0F, 7.336F, 2.0F, 7.75F)
          reflectiveCurveTo(2.336F, 8.5F, 2.75F, 8.5F)
          horizontalLineToRelative(3.5F)
          curveTo(6.664F, 8.5F, 7.0F, 8.164F, 7.0F, 7.75F)
          reflectiveCurveTo(6.664F, 7.0F, 6.25F, 7.0F)
          horizontalLineToRelative(-3.5F)
          close()
          moveToRelative(7.5F, 0.0F)
          curveTo(9.836F, 7.0F, 9.5F, 7.336F, 9.5F, 7.75F)
          reflectiveCurveTo(9.836F, 8.5F, 10.25F, 8.5F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(14.164F, 7.0F, 13.75F, 7.0F)
          horizontalLineToRelative(-3.5F)
          close()
          moveToRelative(7.5F, 0.0F)
          curveTo(17.336F, 7.0F, 17.0F, 7.336F, 17.0F, 7.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(3.5F)
          curveTo(21.664F, 8.5F, 22.0F, 8.164F, 22.0F, 7.75F)
          reflectiveCurveTo(21.664F, 7.0F, 21.25F, 7.0F)
          horizontalLineToRelative(-3.5F)
          close()
          moveToRelative(-15.0F, 8.0F)
          curveTo(2.336F, 15.0F, 2.0F, 15.336F, 2.0F, 15.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(18.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(21.664F, 15.0F, 21.25F, 15.0F)
          horizontalLineTo(2.75F)
          close()        
      }
    }
    return _lineHorizontal2DashesSolid24!!
  }

private var _lineHorizontal2DashesSolid24: ImageVector? = null
