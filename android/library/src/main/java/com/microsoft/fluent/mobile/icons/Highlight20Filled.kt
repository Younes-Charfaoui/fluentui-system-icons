package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Highlight20: ImageVector
  get() {
    if (_highlight20 != null) {
      return _highlight20!!
    }
    _highlight20 = fluentIcon(name = "Filled.Highlight20", 20f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.672F, 2.0F, 3.0F, 2.672F, 3.0F, 3.5F)
          verticalLineToRelative(3.0F)
          curveTo(3.0F, 7.328F, 3.672F, 8.0F, 4.5F, 8.0F)
          horizontalLineToRelative(11.0F)
          curveTo(16.328F, 8.0F, 17.0F, 7.328F, 17.0F, 6.5F)
          verticalLineToRelative(-3.0F)
          curveTo(17.0F, 2.672F, 16.328F, 2.0F, 15.5F, 2.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveTo(6.0F, 11.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          horizontalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          horizontalLineToRelative(8.0F)
          verticalLineToRelative(1.074F)
          curveToRelative(0.0F, 0.758F, -0.428F, 1.45F, -1.106F, 1.789F)
          lineToRelative(-6.17F, 3.085F)
          curveTo(6.39F, 18.114F, 6.0F, 17.873F, 6.0F, 17.501F)
          verticalLineTo(12.0F)
          close()        
      }
    }
    return _highlight20!!
  }

private var _highlight20: ImageVector? = null
