package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Save20: ImageVector
  get() {
    if (_save20 != null) {
      return _save20!!
    }
    _save20 = fluentIcon(name = "Filled.Save20", 20f) {
      materialPath {
          moveTo(3.0F, 5.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(3.5F)
          curveTo(6.0F, 7.328F, 6.672F, 8.0F, 7.5F, 8.0F)
          horizontalLineToRelative(4.0F)
          curveTo(12.328F, 8.0F, 13.0F, 7.328F, 13.0F, 6.5F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(0.379F)
          curveToRelative(0.53F, 0.0F, 1.039F, 0.21F, 1.414F, 0.586F)
          lineToRelative(1.621F, 1.621F)
          curveTo(16.79F, 5.582F, 17.0F, 6.091F, 17.0F, 6.621F)
          verticalLineTo(15.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          verticalLineToRelative(-5.5F)
          curveToRelative(0.0F, -0.828F, -0.672F, -1.5F, -1.5F, -1.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(5.672F, 10.0F, 5.0F, 10.672F, 5.0F, 11.5F)
          verticalLineTo(17.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(5.0F)
          close()
          moveToRelative(9.0F, -2.0F)
          horizontalLineTo(7.0F)
          verticalLineToRelative(3.5F)
          curveTo(7.0F, 6.776F, 7.224F, 7.0F, 7.5F, 7.0F)
          horizontalLineToRelative(4.0F)
          curveTo(11.776F, 7.0F, 12.0F, 6.776F, 12.0F, 6.5F)
          verticalLineTo(3.0F)
          close()
          moveToRelative(2.0F, 8.5F)
          verticalLineTo(17.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(-5.5F)
          curveTo(6.0F, 11.224F, 6.224F, 11.0F, 6.5F, 11.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          close()        
      }
    }
    return _save20!!
  }

private var _save20: ImageVector? = null
