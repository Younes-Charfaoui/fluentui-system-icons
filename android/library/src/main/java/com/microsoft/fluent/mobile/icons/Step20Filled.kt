package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Step20: ImageVector
  get() {
    if (_step20 != null) {
      return _step20!!
    }
    _step20 = fluentIcon(name = "Filled.Step20", 20f) {
      materialPath {
          moveTo(13.0F, 2.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(8.0F)
          curveTo(7.448F, 7.0F, 7.0F, 7.448F, 7.0F, 8.0F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-4.0F)
          close()        
      }
    }
    return _step20!!
  }

private var _step20: ImageVector? = null
