package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Maximize24: ImageVector
  get() {
    if (_maximize24 != null) {
      return _maximize24!!
    }
    _maximize24 = fluentIcon(name = "Filled.Maximize24", 24f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          close()
          moveToRelative(0.0F, 2.0F)
          curveTo(5.448F, 5.0F, 5.0F, 5.448F, 5.0F, 6.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(6.0F)
          close()        
      }
    }
    return _maximize24!!
  }

private var _maximize24: ImageVector? = null
