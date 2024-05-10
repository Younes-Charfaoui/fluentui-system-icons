package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal128: ImageVector
  get() {
    if (_lineHorizontal128 != null) {
      return _lineHorizontal128!!
    }
    _lineHorizontal128 = fluentIcon(name = "Regular.LineHorizontal128", 128f) {
      materialPath {
          moveTo(2.0F, 13.75F)
          curveTo(2.0F, 13.336F, 2.336F, 13.0F, 2.75F, 13.0F)
          horizontalLineToRelative(22.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(2.75F)
          curveTo(2.336F, 14.5F, 2.0F, 14.164F, 2.0F, 13.75F)
          close()        
      }
    }
    return _lineHorizontal128!!
  }

private var _lineHorizontal128: ImageVector? = null
