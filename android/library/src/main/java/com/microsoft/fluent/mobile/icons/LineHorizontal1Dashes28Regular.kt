package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal1Dashes28: ImageVector
  get() {
    if (_lineHorizontal1Dashes28 != null) {
      return _lineHorizontal1Dashes28!!
    }
    _lineHorizontal1Dashes28 = fluentIcon(name = "Regular.LineHorizontal1Dashes28", 128f) {
      materialPath {
          moveTo(2.0F, 13.75F)
          curveTo(2.0F, 13.336F, 2.336F, 13.0F, 2.75F, 13.0F)
          horizontalLineToRelative(4.5F)
          curveTo(7.664F, 13.0F, 8.0F, 13.336F, 8.0F, 13.75F)
          reflectiveCurveTo(7.664F, 14.5F, 7.25F, 14.5F)
          horizontalLineToRelative(-4.5F)
          curveTo(2.336F, 14.5F, 2.0F, 14.164F, 2.0F, 13.75F)
          close()
          moveToRelative(9.0F, 0.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(4.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-4.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()
          moveToRelative(9.0F, 0.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(4.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-4.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()        
      }
    }
    return _lineHorizontal1Dashes28!!
  }

private var _lineHorizontal1Dashes28: ImageVector? = null
