package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal2DashesSolid16: ImageVector
  get() {
    if (_lineHorizontal2DashesSolid16 != null) {
      return _lineHorizontal2DashesSolid16!!
    }
    _lineHorizontal2DashesSolid16 = fluentIcon(name = "Regular.LineHorizontal2DashesSolid16", 216f) {
      materialPath {
          moveTo(2.5F, 5.0F)
          curveTo(2.224F, 5.0F, 2.0F, 5.224F, 2.0F, 5.5F)
          reflectiveCurveTo(2.224F, 6.0F, 2.5F, 6.0F)
          horizontalLineToRelative(2.0F)
          curveTo(4.776F, 6.0F, 5.0F, 5.776F, 5.0F, 5.5F)
          reflectiveCurveTo(4.776F, 5.0F, 4.5F, 5.0F)
          horizontalLineToRelative(-2.0F)
          close()
          moveTo(7.0F, 5.0F)
          curveTo(6.724F, 5.0F, 6.5F, 5.224F, 6.5F, 5.5F)
          reflectiveCurveTo(6.724F, 6.0F, 7.0F, 6.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(9.276F, 5.0F, 9.0F, 5.0F)
          horizontalLineTo(7.0F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(11.224F, 5.0F, 11.0F, 5.224F, 11.0F, 5.5F)
          reflectiveCurveTo(11.224F, 6.0F, 11.5F, 6.0F)
          horizontalLineToRelative(2.0F)
          curveTo(13.776F, 6.0F, 14.0F, 5.776F, 14.0F, 5.5F)
          reflectiveCurveTo(13.776F, 5.0F, 13.5F, 5.0F)
          horizontalLineToRelative(-2.0F)
          close()
          moveToRelative(-9.0F, 5.0F)
          curveTo(2.224F, 10.0F, 2.0F, 10.224F, 2.0F, 10.5F)
          reflectiveCurveTo(2.224F, 11.0F, 2.5F, 11.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(13.776F, 10.0F, 13.5F, 10.0F)
          horizontalLineToRelative(-11.0F)
          close()        
      }
    }
    return _lineHorizontal2DashesSolid16!!
  }

private var _lineHorizontal2DashesSolid16: ImageVector? = null
