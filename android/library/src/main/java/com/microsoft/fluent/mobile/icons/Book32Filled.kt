package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Book32: ImageVector
  get() {
    if (_book32 != null) {
      return _book32!!
    }
    _book32 = fluentIcon(name = "Filled.Book32", 32f) {
      materialPath {
          moveTo(5.0F, 26.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -2.21F, 1.79F, -4.0F, 4.0F, -4.0F)
          horizontalLineToRelative(14.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, 1.79F, 4.0F, 4.0F)
          verticalLineToRelative(18.25F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(7.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(9.0F)
          curveToRelative(-2.21F, 0.0F, -4.0F, -1.79F, -4.0F, -4.0F)
          close()
          moveToRelative(5.75F, -20.0F)
          curveTo(9.784F, 6.0F, 9.0F, 6.784F, 9.0F, 7.75F)
          verticalLineToRelative(1.5F)
          curveTo(9.0F, 10.216F, 9.784F, 11.0F, 10.75F, 11.0F)
          horizontalLineToRelative(10.5F)
          curveTo(22.216F, 11.0F, 23.0F, 10.216F, 23.0F, 9.25F)
          verticalLineToRelative(-1.5F)
          curveTo(23.0F, 6.784F, 22.216F, 6.0F, 21.25F, 6.0F)
          horizontalLineToRelative(-10.5F)
          close()        
      }
    }
    return _book32!!
  }

private var _book32: ImageVector? = null
