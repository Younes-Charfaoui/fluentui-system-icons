package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Battery1016: ImageVector
  get() {
    if (_battery1016 != null) {
      return _battery1016!!
    }
    _battery1016 = fluentIcon(name = "Regular.Battery1016", 1016f) {
      materialPath {
          moveTo(4.0F, 6.0F)
          horizontalLineToRelative(7.5F)
          verticalLineToRelative(4.0F)
          horizontalLineTo(4.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(9.5F, 0.5F)
          horizontalLineTo(14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          horizontalLineToRelative(-0.5F)
          verticalLineTo(10.0F)
          curveToRelative(0.0F, 1.103F, -0.897F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(4.0F)
          curveToRelative(-1.103F, 0.0F, -2.0F, -0.897F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.103F, 0.897F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(1.103F, 0.0F, 2.0F, 0.897F, 2.0F, 2.0F)
          verticalLineToRelative(0.5F)
          close()
          moveToRelative(-2.0F, 4.5F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(4.0F)
          curveTo(3.448F, 5.0F, 3.0F, 5.448F, 3.0F, 6.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(7.5F)
          close()        
      }
    }
    return _battery1016!!
  }

private var _battery1016: ImageVector? = null
