package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Battery1016: ImageVector
  get() {
    if (_battery1016 != null) {
      return _battery1016!!
    }
    _battery1016 = fluentIcon(name = "Filled.Battery1016", 1016f) {
      materialPath {
          moveTo(14.0F, 6.5F)
          horizontalLineToRelative(-0.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.103F, -0.897F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(4.0F)
          curveTo(2.897F, 4.0F, 2.0F, 4.897F, 2.0F, 6.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.103F, 0.897F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(1.103F, 0.0F, 2.0F, -0.897F, 2.0F, -2.0F)
          verticalLineTo(9.5F)
          horizontalLineTo(14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -0.276F, -0.224F, -0.5F, -0.5F, -0.5F)
          close()
          moveTo(12.0F, 10.0F)
          curveToRelative(0.0F, 0.276F, -0.225F, 0.5F, -0.5F, 0.5F)
          horizontalLineTo(4.0F)
          curveToRelative(-0.275F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -0.276F, 0.225F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(7.5F)
          curveTo(11.775F, 5.5F, 12.0F, 5.724F, 12.0F, 6.0F)
          verticalLineToRelative(4.0F)
          close()        
      }
    }
    return _battery1016!!
  }

private var _battery1016: ImageVector? = null
