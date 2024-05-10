package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal116: ImageVector
  get() {
    if (_lineHorizontal116 != null) {
      return _lineHorizontal116!!
    }
    _lineHorizontal116 = fluentIcon(name = "Regular.LineHorizontal116", 116f) {
      materialPath {
          moveTo(2.0F, 7.5F)
          curveTo(2.0F, 7.224F, 2.224F, 7.0F, 2.5F, 7.0F)
          horizontalLineToRelative(11.0F)
          curveTo(13.776F, 7.0F, 14.0F, 7.224F, 14.0F, 7.5F)
          reflectiveCurveTo(13.776F, 8.0F, 13.5F, 8.0F)
          horizontalLineToRelative(-11.0F)
          curveTo(2.224F, 8.0F, 2.0F, 7.776F, 2.0F, 7.5F)
          close()        
      }
    }
    return _lineHorizontal116!!
  }

private var _lineHorizontal116: ImageVector? = null
