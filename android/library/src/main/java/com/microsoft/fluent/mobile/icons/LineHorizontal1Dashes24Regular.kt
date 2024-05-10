package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal1Dashes24: ImageVector
  get() {
    if (_lineHorizontal1Dashes24 != null) {
      return _lineHorizontal1Dashes24!!
    }
    _lineHorizontal1Dashes24 = fluentIcon(name = "Regular.LineHorizontal1Dashes24", 124f) {
      materialPath {
          moveTo(2.0F, 11.75F)
          curveTo(2.0F, 11.336F, 2.336F, 11.0F, 2.75F, 11.0F)
          horizontalLineToRelative(3.5F)
          curveTo(6.664F, 11.0F, 7.0F, 11.336F, 7.0F, 11.75F)
          reflectiveCurveTo(6.664F, 12.5F, 6.25F, 12.5F)
          horizontalLineToRelative(-3.5F)
          curveTo(2.336F, 12.5F, 2.0F, 12.164F, 2.0F, 11.75F)
          close()
          moveToRelative(7.5F, 0.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-3.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()
          moveToRelative(7.5F, 0.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-3.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()        
      }
    }
    return _lineHorizontal1Dashes24!!
  }

private var _lineHorizontal1Dashes24: ImageVector? = null
