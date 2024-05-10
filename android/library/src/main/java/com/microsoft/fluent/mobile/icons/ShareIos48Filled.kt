package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ShareIos48: ImageVector
  get() {
    if (_shareIos48 != null) {
      return _shareIos48!!
    }
    _shareIos48 = fluentIcon(name = "Filled.ShareIos48", 48f) {
      materialPath {
          moveTo(25.06F, 4.44F)
          curveToRelative(-0.585F, -0.587F, -1.535F, -0.587F, -2.12F, 0.0F)
          lineToRelative(-11.5F, 11.5F)
          curveToRelative(-0.586F, 0.585F, -0.586F, 1.535F, 0.0F, 2.12F)
          curveToRelative(0.585F, 0.586F, 1.535F, 0.586F, 2.12F, 0.0F)
          lineToRelative(8.94F, -8.939F)
          verticalLineTo(30.5F)
          curveToRelative(0.0F, 0.828F, 0.672F, 1.5F, 1.5F, 1.5F)
          reflectiveCurveToRelative(1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineTo(9.121F)
          lineToRelative(8.94F, 8.94F)
          curveToRelative(0.585F, 0.585F, 1.535F, 0.585F, 2.12F, 0.0F)
          curveToRelative(0.586F, -0.586F, 0.586F, -1.536F, 0.0F, -2.122F)
          lineToRelative(-11.5F, -11.5F)
          close()
          moveTo(7.5F, 22.0F)
          curveTo(8.328F, 22.0F, 9.0F, 22.672F, 9.0F, 23.5F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.933F, 1.567F, 3.5F, 3.5F, 3.5F)
          horizontalLineToRelative(23.0F)
          curveToRelative(1.933F, 0.0F, 3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineToRelative(-12.0F)
          curveToRelative(0.0F, -0.828F, 0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 3.59F, -2.91F, 6.5F, -6.5F, 6.5F)
          horizontalLineToRelative(-23.0F)
          curveTo(8.91F, 42.0F, 6.0F, 39.09F, 6.0F, 35.5F)
          verticalLineToRelative(-12.0F)
          curveTo(6.0F, 22.672F, 6.672F, 22.0F, 7.5F, 22.0F)
          close()        
      }
    }
    return _shareIos48!!
  }

private var _shareIos48: ImageVector? = null
