package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextboxAlignTopLeft24: ImageVector
  get() {
    if (_textboxAlignTopLeft24 != null) {
      return _textboxAlignTopLeft24!!
    }
    _textboxAlignTopLeft24 = fluentIcon(name = "Regular.TextboxAlignTopLeft24", 24f) {
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
          moveTo(4.5F, 5.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineToRelative(12.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineToRelative(12.5F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineTo(5.75F)
          curveToRelative(-0.69F, 0.0F, -1.25F, -0.56F, -1.25F, -1.25F)
          verticalLineTo(5.75F)
          close()
          moveTo(7.25F, 7.0F)
          curveTo(6.836F, 7.0F, 6.5F, 7.336F, 6.5F, 7.75F)
          reflectiveCurveTo(6.836F, 8.5F, 7.25F, 8.5F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(17.164F, 7.0F, 16.75F, 7.0F)
          horizontalLineToRelative(-9.5F)
          close()
          moveToRelative(0.0F, 4.0F)
          curveToRelative(-0.414F, 0.0F, -0.75F, 0.336F, -0.75F, 0.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(6.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(14.164F, 11.0F, 13.75F, 11.0F)
          horizontalLineToRelative(-6.5F)
          close()        
      }
    }
    return _textboxAlignTopLeft24!!
  }

private var _textboxAlignTopLeft24: ImageVector? = null
