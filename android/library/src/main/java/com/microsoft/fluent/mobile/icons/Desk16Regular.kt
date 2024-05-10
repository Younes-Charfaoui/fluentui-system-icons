package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Desk16: ImageVector
  get() {
    if (_desk16 != null) {
      return _desk16!!
    }
    _desk16 = fluentIcon(name = "Regular.Desk16", 16f) {
      materialPath {
          moveTo(2.75F, 3.0F)
          curveTo(1.784F, 3.0F, 1.0F, 3.784F, 1.0F, 4.75F)
          verticalLineToRelative(6.5F)
          curveTo(1.0F, 12.216F, 1.784F, 13.0F, 2.75F, 13.0F)
          horizontalLineToRelative(3.5F)
          curveTo(7.216F, 13.0F, 8.0F, 12.216F, 8.0F, 11.25F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(6.0F)
          verticalLineToRelative(5.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(4.75F)
          curveTo(15.0F, 3.784F, 14.216F, 3.0F, 13.25F, 3.0F)
          horizontalLineTo(2.75F)
          close()
          moveTo(2.0F, 7.0F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(4.25F)
          curveTo(7.0F, 11.664F, 6.664F, 12.0F, 6.25F, 12.0F)
          horizontalLineToRelative(-3.5F)
          curveTo(2.336F, 12.0F, 2.0F, 11.664F, 2.0F, 11.25F)
          verticalLineTo(7.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          verticalLineTo(4.75F)
          curveTo(2.0F, 4.336F, 2.336F, 4.0F, 2.75F, 4.0F)
          horizontalLineToRelative(10.5F)
          curveTo(13.664F, 4.0F, 14.0F, 4.336F, 14.0F, 4.75F)
          verticalLineTo(6.0F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(1.5F, 2.0F)
          curveTo(3.224F, 8.0F, 3.0F, 8.224F, 3.0F, 8.5F)
          reflectiveCurveTo(3.224F, 9.0F, 3.5F, 9.0F)
          horizontalLineToRelative(2.0F)
          curveTo(5.776F, 9.0F, 6.0F, 8.776F, 6.0F, 8.5F)
          reflectiveCurveTo(5.776F, 8.0F, 5.5F, 8.0F)
          horizontalLineToRelative(-2.0F)
          close()        
      }
    }
    return _desk16!!
  }

private var _desk16: ImageVector? = null
