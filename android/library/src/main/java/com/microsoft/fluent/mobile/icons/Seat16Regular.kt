package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Seat16: ImageVector
  get() {
    if (_seat16 != null) {
      return _seat16!!
    }
    _seat16 = fluentIcon(name = "Regular.Seat16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.75F)
          curveTo(2.0F, 13.216F, 2.784F, 14.0F, 3.75F, 14.0F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(13.0F, 7.5F)
          curveTo(12.582F, 7.186F, 12.063F, 7.0F, 11.5F, 7.0F)
          curveToRelative(-0.744F, 0.0F, -1.412F, 0.325F, -1.87F, 0.84F)
          curveTo(9.267F, 7.333F, 8.672F, 7.0F, 8.0F, 7.0F)
          curveTo(7.327F, 7.0F, 6.733F, 7.332F, 6.37F, 7.84F)
          curveTo(5.912F, 7.326F, 5.244F, 7.0F, 4.5F, 7.0F)
          curveTo(3.937F, 7.0F, 3.418F, 7.186F, 3.0F, 7.5F)
          verticalLineToRelative(-3.0F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.328F, 3.0F, 13.0F, 3.672F, 13.0F, 4.5F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(-3.0F, 2.0F)
          curveTo(10.0F, 8.672F, 10.672F, 8.0F, 11.5F, 8.0F)
          reflectiveCurveTo(13.0F, 8.672F, 13.0F, 9.5F)
          verticalLineToRelative(2.75F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(10.0F)
          verticalLineTo(9.5F)
          close()
          moveTo(9.0F, 9.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(7.0F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          close()
          moveToRelative(-5.25F, 4.0F)
          curveTo(3.336F, 13.0F, 3.0F, 12.664F, 3.0F, 12.25F)
          verticalLineTo(9.5F)
          curveTo(3.0F, 8.672F, 3.672F, 8.0F, 4.5F, 8.0F)
          reflectiveCurveTo(6.0F, 8.672F, 6.0F, 9.5F)
          verticalLineTo(13.0F)
          horizontalLineTo(3.75F)
          close()        
      }
    }
    return _seat16!!
  }

private var _seat16: ImageVector? = null
