package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextboxAlignTopCenter24: ImageVector
  get() {
    if (_textboxAlignTopCenter24 != null) {
      return _textboxAlignTopCenter24!!
    }
    _textboxAlignTopCenter24 = fluentIcon(name = "Filled.TextboxAlignTopCenter24", 24f) {
      materialPath {
          moveTo(5.75F, 3.0F)
          curveTo(4.231F, 3.0F, 3.0F, 4.231F, 3.0F, 5.75F)
          verticalLineToRelative(12.5F)
          curveTo(3.0F, 19.769F, 4.231F, 21.0F, 5.75F, 21.0F)
          horizontalLineToRelative(12.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineTo(5.75F)
          curveTo(21.0F, 4.231F, 19.769F, 3.0F, 18.25F, 3.0F)
          horizontalLineTo(5.75F)
          close()
          moveToRelative(1.5F, 4.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(17.164F, 8.5F, 16.75F, 8.5F)
          horizontalLineToRelative(-9.5F)
          curveTo(6.836F, 8.5F, 6.5F, 8.164F, 6.5F, 7.75F)
          reflectiveCurveTo(6.836F, 7.0F, 7.25F, 7.0F)
          close()
          moveToRelative(2.0F, 4.0F)
          horizontalLineToRelative(5.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-5.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          reflectiveCurveTo(8.836F, 11.0F, 9.25F, 11.0F)
          close()        
      }
    }
    return _textboxAlignTopCenter24!!
  }

private var _textboxAlignTopCenter24: ImageVector? = null
