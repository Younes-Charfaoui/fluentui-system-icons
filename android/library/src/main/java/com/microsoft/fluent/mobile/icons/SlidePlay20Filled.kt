package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SlidePlay20: ImageVector
  get() {
    if (_slidePlay20 != null) {
      return _slidePlay20!!
    }
    _slidePlay20 = fluentIcon(name = "Filled.SlidePlay20", 20f) {
      materialPath {
          moveTo(4.75F, 4.0F)
          curveTo(3.231F, 4.0F, 2.0F, 5.231F, 2.0F, 6.75F)
          verticalLineToRelative(6.5F)
          curveTo(2.0F, 14.769F, 3.231F, 16.0F, 4.75F, 16.0F)
          horizontalLineToRelative(4.457F)
          curveTo(9.072F, 15.523F, 9.0F, 15.02F, 9.0F, 14.5F)
          curveTo(9.0F, 11.462F, 11.462F, 9.0F, 14.5F, 9.0F)
          curveToRelative(1.33F, 0.0F, 2.55F, 0.472F, 3.5F, 1.257F)
          verticalLineTo(6.75F)
          curveTo(18.0F, 5.231F, 16.769F, 4.0F, 15.25F, 4.0F)
          horizontalLineTo(4.75F)
          close()
          moveTo(19.0F, 14.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(10.0F, 16.985F, 10.0F, 14.5F)
          reflectiveCurveToRelative(2.015F, -4.5F, 4.5F, -4.5F)
          reflectiveCurveToRelative(4.5F, 2.015F, 4.5F, 4.5F)
          close()
          moveToRelative(-6.0F, 1.495F)
          curveToRelative(0.0F, 0.389F, 0.424F, 0.629F, 0.757F, 0.429F)
          lineToRelative(2.5F, -1.497F)
          curveToRelative(0.325F, -0.194F, 0.325F, -0.664F, 0.0F, -0.858F)
          lineToRelative(-2.5F, -1.497F)
          curveTo(13.424F, 12.372F, 13.0F, 12.612F, 13.0F, 13.0F)
          verticalLineToRelative(2.994F)
          close()        
      }
    }
    return _slidePlay20!!
  }

private var _slidePlay20: ImageVector? = null
