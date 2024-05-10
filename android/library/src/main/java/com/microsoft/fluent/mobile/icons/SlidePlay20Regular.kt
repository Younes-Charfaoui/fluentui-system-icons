package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SlidePlay20: ImageVector
  get() {
    if (_slidePlay20 != null) {
      return _slidePlay20!!
    }
    _slidePlay20 = fluentIcon(name = "Regular.SlidePlay20", 20f) {
      materialPath {
          moveTo(4.75F, 4.0F)
          curveTo(3.231F, 4.0F, 2.0F, 5.231F, 2.0F, 6.75F)
          verticalLineToRelative(6.5F)
          curveTo(2.0F, 14.769F, 3.231F, 16.0F, 4.75F, 16.0F)
          horizontalLineToRelative(4.457F)
          curveToRelative(-0.091F, -0.322F, -0.154F, -0.657F, -0.185F, -1.0F)
          horizontalLineTo(4.75F)
          curveTo(3.784F, 15.0F, 3.0F, 14.216F, 3.0F, 13.25F)
          verticalLineToRelative(-6.5F)
          curveTo(3.0F, 5.784F, 3.784F, 5.0F, 4.75F, 5.0F)
          horizontalLineToRelative(10.5F)
          curveTo(16.216F, 5.0F, 17.0F, 5.784F, 17.0F, 6.75F)
          verticalLineTo(9.6F)
          curveToRelative(0.358F, 0.183F, 0.693F, 0.404F, 1.0F, 0.657F)
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
