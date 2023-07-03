package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextField24: ImageVector
  get() {
    if (_textField24 != null) {
      return _textField24!!
    }
    _textField24 = fluentIcon(name = "Filled.TextField24", 24f) {
      materialPath {
          moveTo(2.0F, 6.75F)
          curveTo(2.0F, 4.679F, 3.679F, 3.0F, 5.75F, 3.0F)
          horizontalLineToRelative(12.5F)
          curveTo(20.321F, 3.0F, 22.0F, 4.679F, 22.0F, 6.75F)
          verticalLineToRelative(10.5F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineTo(5.75F)
          curveTo(3.679F, 21.0F, 2.0F, 19.321F, 2.0F, 17.25F)
          verticalLineTo(6.75F)
          close()
          moveTo(12.75F, 7.5F)
          horizontalLineToRelative(2.75F)
          verticalLineToRelative(0.75F)
          curveTo(15.5F, 8.664F, 15.836F, 9.0F, 16.25F, 9.0F)
          reflectiveCurveTo(17.0F, 8.664F, 17.0F, 8.25F)
          verticalLineToRelative(-1.5F)
          curveTo(17.0F, 6.336F, 16.664F, 6.0F, 16.25F, 6.0F)
          horizontalLineToRelative(-8.5F)
          curveTo(7.336F, 6.0F, 7.0F, 6.336F, 7.0F, 6.75F)
          verticalLineToRelative(1.5F)
          curveTo(7.0F, 8.664F, 7.336F, 9.0F, 7.75F, 9.0F)
          reflectiveCurveTo(8.5F, 8.664F, 8.5F, 8.25F)
          verticalLineTo(7.5F)
          horizontalLineToRelative(2.75F)
          verticalLineToRelative(9.0F)
          horizontalLineToRelative(-0.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, 0.336F, -0.75F, 0.75F)
          reflectiveCurveTo(10.336F, 18.0F, 10.75F, 18.0F)
          horizontalLineToRelative(2.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-0.5F)
          verticalLineToRelative(-9.0F)
          close()        
      }
    }
    return _textField24!!
  }

private var _textField24: ImageVector? = null
