package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SquareShadow12: ImageVector
  get() {
    if (_squareShadow12 != null) {
      return _squareShadow12!!
    }
    _squareShadow12 = fluentIcon(name = "Regular.SquareShadow12", 12f) {
      materialPath {
          moveTo(3.0F, 1.0F)
          curveTo(1.895F, 1.0F, 1.0F, 1.895F, 1.0F, 3.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(3.5F)
          curveTo(9.88F, 11.0F, 11.0F, 9.88F, 11.0F, 8.5F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(5.0F, 2.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(3.0F)
          curveTo(2.448F, 8.0F, 2.0F, 7.552F, 2.0F, 7.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          close()        
      }
    }
    return _squareShadow12!!
  }

private var _squareShadow12: ImageVector? = null
