package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextAlignCenter16: ImageVector
  get() {
    if (_textAlignCenter16 != null) {
      return _textAlignCenter16!!
    }
    _textAlignCenter16 = fluentIcon(name = "Filled.TextAlignCenter16", 16f) {
      materialPath {
          moveTo(3.0F, 3.75F)
          curveTo(3.0F, 3.336F, 3.336F, 3.0F, 3.75F, 3.0F)
          horizontalLineToRelative(8.5F)
          curveTo(12.664F, 3.0F, 13.0F, 3.336F, 13.0F, 3.75F)
          reflectiveCurveTo(12.664F, 4.5F, 12.25F, 4.5F)
          horizontalLineToRelative(-8.5F)
          curveTo(3.336F, 4.5F, 3.0F, 4.164F, 3.0F, 3.75F)
          close()
          moveToRelative(-2.0F, 4.0F)
          curveTo(1.0F, 7.336F, 1.336F, 7.0F, 1.75F, 7.0F)
          horizontalLineToRelative(12.5F)
          curveTo(14.664F, 7.0F, 15.0F, 7.336F, 15.0F, 7.75F)
          reflectiveCurveTo(14.664F, 8.5F, 14.25F, 8.5F)
          horizontalLineTo(1.75F)
          curveTo(1.336F, 8.5F, 1.0F, 8.164F, 1.0F, 7.75F)
          close()
          moveToRelative(4.0F, 4.0F)
          curveTo(5.0F, 11.336F, 5.336F, 11.0F, 5.75F, 11.0F)
          horizontalLineToRelative(4.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-4.5F)
          curveTo(5.336F, 12.5F, 5.0F, 12.164F, 5.0F, 11.75F)
          close()        
      }
    }
    return _textAlignCenter16!!
  }

private var _textAlignCenter16: ImageVector? = null
