package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal1Dashes16: ImageVector
  get() {
    if (_lineHorizontal1Dashes16 != null) {
      return _lineHorizontal1Dashes16!!
    }
    _lineHorizontal1Dashes16 = fluentIcon(name = "Regular.LineHorizontal1Dashes16", 116f) {
      materialPath {
          moveTo(2.0F, 7.5F)
          curveTo(2.0F, 7.224F, 2.224F, 7.0F, 2.5F, 7.0F)
          horizontalLineToRelative(2.0F)
          curveTo(4.776F, 7.0F, 5.0F, 7.224F, 5.0F, 7.5F)
          reflectiveCurveTo(4.776F, 8.0F, 4.5F, 8.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(2.224F, 8.0F, 2.0F, 7.776F, 2.0F, 7.5F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(6.5F, 7.224F, 6.724F, 7.0F, 7.0F, 7.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(9.276F, 8.0F, 9.0F, 8.0F)
          horizontalLineTo(7.0F)
          curveTo(6.724F, 8.0F, 6.5F, 7.776F, 6.5F, 7.5F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(11.0F, 7.224F, 11.224F, 7.0F, 11.5F, 7.0F)
          horizontalLineToRelative(2.0F)
          curveTo(13.776F, 7.0F, 14.0F, 7.224F, 14.0F, 7.5F)
          reflectiveCurveTo(13.776F, 8.0F, 13.5F, 8.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(11.224F, 8.0F, 11.0F, 7.776F, 11.0F, 7.5F)
          close()        
      }
    }
    return _lineHorizontal1Dashes16!!
  }

private var _lineHorizontal1Dashes16: ImageVector? = null
