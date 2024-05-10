package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CreditCardClock24: ImageVector
  get() {
    if (_creditCardClock24 != null) {
      return _creditCardClock24!!
    }
    _creditCardClock24 = fluentIcon(name = "Filled.CreditCardClock24", 24f) {
      materialPath {
          moveTo(5.25F, 5.0F)
          curveTo(3.455F, 5.0F, 2.0F, 6.455F, 2.0F, 8.25F)
          verticalLineTo(9.5F)
          horizontalLineToRelative(20.0F)
          verticalLineTo(8.25F)
          curveTo(22.0F, 6.455F, 20.545F, 5.0F, 18.75F, 5.0F)
          horizontalLineTo(5.25F)
          close()
          moveToRelative(0.0F, 14.0F)
          horizontalLineToRelative(5.924F)
          curveTo(11.06F, 18.518F, 11.0F, 18.016F, 11.0F, 17.5F)
          curveToRelative(0.0F, -3.59F, 2.91F, -6.5F, 6.5F, -6.5F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(4.75F)
          curveTo(2.0F, 17.545F, 3.455F, 19.0F, 5.25F, 19.0F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, -3.038F, -2.462F, -5.5F, -5.5F, -5.5F)
          reflectiveCurveTo(12.0F, 14.462F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, 5.5F, 5.5F, 5.5F)
          reflectiveCurveToRelative(5.5F, -2.462F, 5.5F, -5.5F)
          close()
          moveTo(17.5F, 14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(20.276F, 18.0F, 20.0F, 18.0F)
          horizontalLineToRelative(-2.5F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          close()        
      }
    }
    return _creditCardClock24!!
  }

private var _creditCardClock24: ImageVector? = null
