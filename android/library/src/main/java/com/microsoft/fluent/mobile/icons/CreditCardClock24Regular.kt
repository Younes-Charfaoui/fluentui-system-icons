package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CreditCardClock24: ImageVector
  get() {
    if (_creditCardClock24 != null) {
      return _creditCardClock24!!
    }
    _creditCardClock24 = fluentIcon(name = "Regular.CreditCardClock24", 24f) {
      materialPath {
          moveTo(2.0F, 8.25F)
          curveTo(2.0F, 6.455F, 3.455F, 5.0F, 5.25F, 5.0F)
          horizontalLineToRelative(13.5F)
          curveTo(20.545F, 5.0F, 22.0F, 6.455F, 22.0F, 8.25F)
          verticalLineTo(11.0F)
          horizontalLineTo(3.5F)
          verticalLineToRelative(4.75F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineTo(11.0F)
          curveToRelative(0.0F, 0.516F, 0.06F, 1.018F, 0.174F, 1.5F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 19.0F, 2.0F, 17.545F, 2.0F, 15.75F)
          verticalLineToRelative(-7.5F)
          close()
          moveTo(20.5F, 9.5F)
          verticalLineTo(8.25F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(5.25F)
          curveTo(4.284F, 6.5F, 3.5F, 7.284F, 3.5F, 8.25F)
          verticalLineTo(9.5F)
          horizontalLineToRelative(17.0F)
          close()
          moveToRelative(2.5F, 8.0F)
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
