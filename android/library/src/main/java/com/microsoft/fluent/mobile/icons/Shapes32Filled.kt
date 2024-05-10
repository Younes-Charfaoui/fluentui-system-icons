package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Shapes32: ImageVector
  get() {
    if (_shapes32 != null) {
      return _shapes32!!
    }
    _shapes32 = fluentIcon(name = "Filled.Shapes32", 32f) {
      materialPath {
          moveTo(3.0F, 12.0F)
          curveToRelative(0.0F, -4.97F, 4.03F, -9.0F, 9.0F, -9.0F)
          curveToRelative(4.46F, 0.0F, 8.161F, 3.243F, 8.876F, 7.5F)
          horizontalLineTo(16.5F)
          curveToRelative(-3.314F, 0.0F, -6.0F, 2.686F, -6.0F, 6.0F)
          verticalLineToRelative(4.376F)
          curveTo(6.243F, 20.16F, 3.0F, 16.459F, 3.0F, 12.0F)
          close()
          moveToRelative(9.0F, 4.5F)
          curveToRelative(0.0F, -2.485F, 2.015F, -4.5F, 4.5F, -4.5F)
          horizontalLineToRelative(8.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-8.0F)
          curveToRelative(-2.485F, 0.0F, -4.5F, -2.015F, -4.5F, -4.5F)
          verticalLineToRelative(-8.0F)
          close()        
      }
    }
    return _shapes32!!
  }

private var _shapes32: ImageVector? = null
