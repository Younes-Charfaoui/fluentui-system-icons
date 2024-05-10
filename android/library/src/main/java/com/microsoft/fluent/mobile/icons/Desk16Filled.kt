package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Desk16: ImageVector
  get() {
    if (_desk16 != null) {
      return _desk16!!
    }
    _desk16 = fluentIcon(name = "Filled.Desk16", 16f) {
      materialPath {
          moveTo(2.75F, 3.0F)
          curveTo(1.784F, 3.0F, 1.0F, 3.784F, 1.0F, 4.75F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(13.0F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(4.75F)
          curveTo(15.0F, 3.784F, 14.216F, 3.0F, 13.25F, 3.0F)
          horizontalLineTo(2.75F)
          close()
          moveTo(8.0F, 7.0F)
          horizontalLineTo(1.0F)
          verticalLineToRelative(4.25F)
          curveTo(1.0F, 12.216F, 1.784F, 13.0F, 2.75F, 13.0F)
          horizontalLineToRelative(3.5F)
          curveTo(7.216F, 13.0F, 8.0F, 12.216F, 8.0F, 11.25F)
          verticalLineTo(7.0F)
          close()
          moveTo(3.0F, 9.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(2.0F)
          curveTo(5.776F, 8.5F, 6.0F, 8.724F, 6.0F, 9.0F)
          reflectiveCurveTo(5.776F, 9.5F, 5.5F, 9.5F)
          horizontalLineToRelative(-2.0F)
          curveTo(3.224F, 9.5F, 3.0F, 9.276F, 3.0F, 9.0F)
          close()        
      }
    }
    return _desk16!!
  }

private var _desk16: ImageVector? = null
