package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Battery424: ImageVector
  get() {
    if (_battery424 != null) {
      return _battery424!!
    }
    _battery424 = fluentIcon(name = "Filled.Battery424", 424f) {
      materialPath {
          moveTo(17.0F, 6.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.182F, 0.0F, 0.353F, 0.049F, 0.5F, 0.134F)
          curveTo(21.8F, 10.307F, 22.0F, 10.63F, 22.0F, 11.0F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.37F, -0.2F, 0.693F, -0.5F, 0.866F)
          curveTo(21.353F, 13.951F, 21.182F, 14.0F, 21.0F, 14.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(12.0F)
          close()
          moveToRelative(-7.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-0.553F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, 0.447F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-4.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          close()        
      }
    }
    return _battery424!!
  }

private var _battery424: ImageVector? = null