package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal1Dashes20: ImageVector
  get() {
    if (_lineHorizontal1Dashes20 != null) {
      return _lineHorizontal1Dashes20!!
    }
    _lineHorizontal1Dashes20 = fluentIcon(name = "Regular.LineHorizontal1Dashes20", 120f) {
      materialPath {
          moveTo(2.0F, 9.5F)
          curveTo(2.0F, 9.224F, 2.224F, 9.0F, 2.5F, 9.0F)
          horizontalLineToRelative(3.0F)
          curveTo(5.776F, 9.0F, 6.0F, 9.224F, 6.0F, 9.5F)
          reflectiveCurveTo(5.776F, 10.0F, 5.5F, 10.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(2.224F, 10.0F, 2.0F, 9.776F, 2.0F, 9.5F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveTo(8.0F, 9.224F, 8.224F, 9.0F, 8.5F, 9.0F)
          horizontalLineToRelative(3.0F)
          curveTo(11.776F, 9.0F, 12.0F, 9.224F, 12.0F, 9.5F)
          reflectiveCurveTo(11.776F, 10.0F, 11.5F, 10.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(8.224F, 10.0F, 8.0F, 9.776F, 8.0F, 9.5F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveTo(14.0F, 9.224F, 14.224F, 9.0F, 14.5F, 9.0F)
          horizontalLineToRelative(3.0F)
          curveTo(17.776F, 9.0F, 18.0F, 9.224F, 18.0F, 9.5F)
          reflectiveCurveTo(17.776F, 10.0F, 17.5F, 10.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(14.224F, 10.0F, 14.0F, 9.776F, 14.0F, 9.5F)
          close()        
      }
    }
    return _lineHorizontal1Dashes20!!
  }

private var _lineHorizontal1Dashes20: ImageVector? = null
