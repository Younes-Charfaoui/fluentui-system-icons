package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineHorizontal128: ImageVector
  get() {
    if (_lineHorizontal128 != null) {
      return _lineHorizontal128!!
    }
    _lineHorizontal128 = fluentIcon(name = "Filled.LineHorizontal128", 128f) {
      materialPath {
          moveTo(2.0F, 14.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(22.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          close()        
      }
    }
    return _lineHorizontal128!!
  }

private var _lineHorizontal128: ImageVector? = null
