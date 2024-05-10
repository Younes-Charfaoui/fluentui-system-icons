package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineHorizontal116: ImageVector
  get() {
    if (_lineHorizontal116 != null) {
      return _lineHorizontal116!!
    }
    _lineHorizontal116 = fluentIcon(name = "Filled.LineHorizontal116", 116f) {
      materialPath {
          moveTo(2.0F, 7.75F)
          curveTo(2.0F, 7.336F, 2.336F, 7.0F, 2.75F, 7.0F)
          horizontalLineToRelative(10.5F)
          curveTo(13.664F, 7.0F, 14.0F, 7.336F, 14.0F, 7.75F)
          reflectiveCurveTo(13.664F, 8.5F, 13.25F, 8.5F)
          horizontalLineTo(2.75F)
          curveTo(2.336F, 8.5F, 2.0F, 8.164F, 2.0F, 7.75F)
          close()        
      }
    }
    return _lineHorizontal116!!
  }

private var _lineHorizontal116: ImageVector? = null
