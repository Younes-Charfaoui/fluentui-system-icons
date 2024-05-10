package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineHorizontal1Dashes20: ImageVector
  get() {
    if (_lineHorizontal1Dashes20 != null) {
      return _lineHorizontal1Dashes20!!
    }
    _lineHorizontal1Dashes20 = fluentIcon(name = "Filled.LineHorizontal1Dashes20", 120f) {
      materialPath {
          moveTo(2.0F, 9.75F)
          curveTo(2.0F, 9.336F, 2.336F, 9.0F, 2.75F, 9.0F)
          horizontalLineToRelative(2.5F)
          curveTo(5.664F, 9.0F, 6.0F, 9.336F, 6.0F, 9.75F)
          reflectiveCurveTo(5.664F, 10.5F, 5.25F, 10.5F)
          horizontalLineToRelative(-2.5F)
          curveTo(2.336F, 10.5F, 2.0F, 10.164F, 2.0F, 9.75F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveTo(8.0F, 9.336F, 8.336F, 9.0F, 8.75F, 9.0F)
          horizontalLineToRelative(2.5F)
          curveTo(11.664F, 9.0F, 12.0F, 9.336F, 12.0F, 9.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-2.5F)
          curveTo(8.336F, 10.5F, 8.0F, 10.164F, 8.0F, 9.75F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveTo(14.0F, 9.336F, 14.336F, 9.0F, 14.75F, 9.0F)
          horizontalLineToRelative(2.5F)
          curveTo(17.664F, 9.0F, 18.0F, 9.336F, 18.0F, 9.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-2.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()        
      }
    }
    return _lineHorizontal1Dashes20!!
  }

private var _lineHorizontal1Dashes20: ImageVector? = null
