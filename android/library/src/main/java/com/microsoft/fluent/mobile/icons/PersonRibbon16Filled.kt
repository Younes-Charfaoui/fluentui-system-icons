package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonRibbon16: ImageVector
  get() {
    if (_personRibbon16 != null) {
      return _personRibbon16!!
    }
    _personRibbon16 = fluentIcon(name = "Filled.PersonRibbon16", 16f) {
      materialPath {
          moveTo(10.0F, 12.645F)
          verticalLineToRelative(1.044F)
          curveTo(9.41F, 13.887F, 8.74F, 14.0F, 8.0F, 14.0F)
          curveToRelative(-3.14F, 0.0F, -5.0F, -2.029F, -5.0F, -4.0F)
          verticalLineTo(9.5F)
          curveTo(3.0F, 8.672F, 3.672F, 8.0F, 4.5F, 8.0F)
          horizontalLineToRelative(5.035F)
          curveTo(9.195F, 8.588F, 9.0F, 9.271F, 9.0F, 10.0F)
          curveToRelative(0.0F, 1.014F, 0.378F, 1.94F, 1.0F, 2.645F)
          close()
          moveTo(8.0F, 1.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          reflectiveCurveTo(9.519F, 7.0F, 8.0F, 7.0F)
          reflectiveCurveTo(5.25F, 5.769F, 5.25F, 4.25F)
          reflectiveCurveTo(6.481F, 1.5F, 8.0F, 1.5F)
          close()
          moveTo(13.0F, 13.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.344F, 3.0F, -3.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          reflectiveCurveToRelative(-3.0F, 1.343F, -3.0F, 3.0F)
          curveToRelative(0.0F, 1.656F, 1.343F, 3.0F, 3.0F, 3.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          curveToRelative(0.729F, 0.0F, 1.412F, -0.196F, 2.0F, -0.536F)
          verticalLineToRelative(2.285F)
          curveToRelative(0.0F, 0.194F, -0.211F, 0.314F, -0.378F, 0.215F)
          lineTo(13.0F, 15.0F)
          lineToRelative(-1.622F, 0.965F)
          curveTo(11.21F, 16.064F, 11.0F, 15.944F, 11.0F, 15.75F)
          verticalLineToRelative(-2.285F)
          curveTo(11.588F, 13.805F, 12.271F, 14.0F, 13.0F, 14.0F)
          close()        
      }
    }
    return _personRibbon16!!
  }

private var _personRibbon16: ImageVector? = null
