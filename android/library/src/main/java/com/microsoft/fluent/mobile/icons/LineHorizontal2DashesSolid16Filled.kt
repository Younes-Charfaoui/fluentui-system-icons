package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineHorizontal2DashesSolid16: ImageVector
  get() {
    if (_lineHorizontal2DashesSolid16 != null) {
      return _lineHorizontal2DashesSolid16!!
    }
    _lineHorizontal2DashesSolid16 = fluentIcon(name = "Filled.LineHorizontal2DashesSolid16", 216f) {
      materialPath {
          moveTo(2.75F, 5.0F)
          curveTo(2.336F, 5.0F, 2.0F, 5.336F, 2.0F, 5.75F)
          reflectiveCurveTo(2.336F, 6.5F, 2.75F, 6.5F)
          horizontalLineToRelative(1.5F)
          curveTo(4.664F, 6.5F, 5.0F, 6.164F, 5.0F, 5.75F)
          reflectiveCurveTo(4.664F, 5.0F, 4.25F, 5.0F)
          horizontalLineToRelative(-1.5F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(6.836F, 5.0F, 6.5F, 5.336F, 6.5F, 5.75F)
          reflectiveCurveTo(6.836F, 6.5F, 7.25F, 6.5F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(9.164F, 5.0F, 8.75F, 5.0F)
          horizontalLineToRelative(-1.5F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(11.336F, 5.0F, 11.0F, 5.336F, 11.0F, 5.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(1.5F)
          curveTo(13.664F, 6.5F, 14.0F, 6.164F, 14.0F, 5.75F)
          reflectiveCurveTo(13.664F, 5.0F, 13.25F, 5.0F)
          horizontalLineToRelative(-1.5F)
          close()
          moveToRelative(-9.0F, 5.0F)
          curveTo(2.336F, 10.0F, 2.0F, 10.336F, 2.0F, 10.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(10.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(13.664F, 10.0F, 13.25F, 10.0F)
          horizontalLineTo(2.75F)
          close()        
      }
    }
    return _lineHorizontal2DashesSolid16!!
  }

private var _lineHorizontal2DashesSolid16: ImageVector? = null
