package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextDescription16: ImageVector
  get() {
    if (_textDescription16 != null) {
      return _textDescription16!!
    }
    _textDescription16 = fluentIcon(name = "Regular.TextDescription16", 16f) {
      materialPath {
          moveTo(1.5F, 3.0F)
          curveTo(1.224F, 3.0F, 1.0F, 3.224F, 1.0F, 3.5F)
          reflectiveCurveTo(1.224F, 4.0F, 1.5F, 4.0F)
          horizontalLineToRelative(13.0F)
          curveTo(14.776F, 4.0F, 15.0F, 3.776F, 15.0F, 3.5F)
          reflectiveCurveTo(14.776F, 3.0F, 14.5F, 3.0F)
          horizontalLineToRelative(-13.0F)
          close()
          moveToRelative(0.0F, 3.0F)
          curveTo(1.224F, 6.0F, 1.0F, 6.224F, 1.0F, 6.5F)
          reflectiveCurveTo(1.224F, 7.0F, 1.5F, 7.0F)
          horizontalLineToRelative(13.0F)
          curveTo(14.776F, 7.0F, 15.0F, 6.776F, 15.0F, 6.5F)
          reflectiveCurveTo(14.776F, 6.0F, 14.5F, 6.0F)
          horizontalLineToRelative(-13.0F)
          close()
          moveTo(1.0F, 9.5F)
          curveTo(1.0F, 9.224F, 1.224F, 9.0F, 1.5F, 9.0F)
          horizontalLineToRelative(13.0F)
          curveTo(14.776F, 9.0F, 15.0F, 9.224F, 15.0F, 9.5F)
          reflectiveCurveTo(14.776F, 10.0F, 14.5F, 10.0F)
          horizontalLineToRelative(-13.0F)
          curveTo(1.224F, 10.0F, 1.0F, 9.776F, 1.0F, 9.5F)
          close()
          moveTo(1.5F, 12.0F)
          curveTo(1.224F, 12.0F, 1.0F, 12.224F, 1.0F, 12.5F)
          reflectiveCurveTo(1.224F, 13.0F, 1.5F, 13.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(10.776F, 12.0F, 10.5F, 12.0F)
          horizontalLineToRelative(-9.0F)
          close()        
      }
    }
    return _textDescription16!!
  }

private var _textDescription16: ImageVector? = null
