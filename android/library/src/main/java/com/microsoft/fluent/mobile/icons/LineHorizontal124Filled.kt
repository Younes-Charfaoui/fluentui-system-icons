package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineHorizontal124: ImageVector
  get() {
    if (_lineHorizontal124 != null) {
      return _lineHorizontal124!!
    }
    _lineHorizontal124 = fluentIcon(name = "Filled.LineHorizontal124", 124f) {
      materialPath {
          moveTo(2.0F, 12.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(18.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          close()        
      }
    }
    return _lineHorizontal124!!
  }

private var _lineHorizontal124: ImageVector? = null
