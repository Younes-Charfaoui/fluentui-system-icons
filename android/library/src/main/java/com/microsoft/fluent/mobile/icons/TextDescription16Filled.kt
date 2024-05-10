package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextDescription16: ImageVector
  get() {
    if (_textDescription16 != null) {
      return _textDescription16!!
    }
    _textDescription16 = fluentIcon(name = "Filled.TextDescription16", 16f) {
      materialPath {
          moveTo(1.75F, 3.0F)
          curveTo(1.336F, 3.0F, 1.0F, 3.336F, 1.0F, 3.75F)
          reflectiveCurveTo(1.336F, 4.5F, 1.75F, 4.5F)
          horizontalLineToRelative(12.5F)
          curveTo(14.664F, 4.5F, 15.0F, 4.164F, 15.0F, 3.75F)
          reflectiveCurveTo(14.664F, 3.0F, 14.25F, 3.0F)
          horizontalLineTo(1.75F)
          close()
          moveToRelative(0.0F, 3.0F)
          curveTo(1.336F, 6.0F, 1.0F, 6.336F, 1.0F, 6.75F)
          reflectiveCurveTo(1.336F, 7.5F, 1.75F, 7.5F)
          horizontalLineToRelative(12.5F)
          curveTo(14.664F, 7.5F, 15.0F, 7.164F, 15.0F, 6.75F)
          reflectiveCurveTo(14.664F, 6.0F, 14.25F, 6.0F)
          horizontalLineTo(1.75F)
          close()
          moveTo(1.0F, 9.75F)
          curveTo(1.0F, 9.336F, 1.336F, 9.0F, 1.75F, 9.0F)
          horizontalLineToRelative(12.5F)
          curveTo(14.664F, 9.0F, 15.0F, 9.336F, 15.0F, 9.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(1.75F)
          curveTo(1.336F, 10.5F, 1.0F, 10.164F, 1.0F, 9.75F)
          close()
          moveTo(1.75F, 12.0F)
          curveTo(1.336F, 12.0F, 1.0F, 12.336F, 1.0F, 12.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(10.664F, 12.0F, 10.25F, 12.0F)
          horizontalLineToRelative(-8.5F)
          close()        
      }
    }
    return _textDescription16!!
  }

private var _textDescription16: ImageVector? = null
