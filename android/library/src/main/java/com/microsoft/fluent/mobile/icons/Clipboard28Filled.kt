package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Clipboard28: ImageVector
  get() {
    if (_clipboard28 != null) {
      return _clipboard28!!
    }
    _clipboard28 = fluentIcon(name = "Filled.Clipboard28", 28f) {
      materialPath {
          moveTo(18.45F, 4.0F)
          horizontalLineToRelative(1.8F)
          curveTo(21.769F, 4.0F, 23.0F, 5.231F, 23.0F, 6.75F)
          verticalLineToRelative(16.5F)
          curveToRelative(0.0F, 1.519F, -1.231F, 2.75F, -2.75F, 2.75F)
          horizontalLineTo(7.75F)
          curveTo(6.231F, 26.0F, 5.0F, 24.769F, 5.0F, 23.25F)
          verticalLineTo(6.75F)
          curveTo(5.0F, 5.231F, 6.231F, 4.0F, 7.75F, 4.0F)
          horizontalLineToRelative(1.8F)
          curveTo(9.782F, 2.859F, 10.79F, 2.0F, 12.0F, 2.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(1.21F, 0.0F, 2.218F, 0.859F, 2.45F, 2.0F)
          close()
          moveTo(11.0F, 4.5F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-4.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          close()        
      }
    }
    return _clipboard28!!
  }

private var _clipboard28: ImageVector? = null
