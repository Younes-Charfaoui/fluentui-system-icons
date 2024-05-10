package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineHorizontal124: ImageVector
  get() {
    if (_lineHorizontal124 != null) {
      return _lineHorizontal124!!
    }
    _lineHorizontal124 = fluentIcon(name = "Regular.LineHorizontal124", 124f) {
      materialPath {
          moveTo(2.0F, 11.75F)
          curveTo(2.0F, 11.336F, 2.336F, 11.0F, 2.75F, 11.0F)
          horizontalLineToRelative(18.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(2.75F)
          curveTo(2.336F, 12.5F, 2.0F, 12.164F, 2.0F, 11.75F)
          close()        
      }
    }
    return _lineHorizontal124!!
  }

private var _lineHorizontal124: ImageVector? = null
