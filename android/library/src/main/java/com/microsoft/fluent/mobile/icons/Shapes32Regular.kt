package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Shapes32: ImageVector
  get() {
    if (_shapes32 != null) {
      return _shapes32!!
    }
    _shapes32 = fluentIcon(name = "Regular.Shapes32", 32f) {
      materialPath {
          moveTo(5.0F, 12.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          curveToRelative(3.351F, 0.0F, 6.152F, 2.355F, 6.839F, 5.5F)
          horizontalLineToRelative(2.037F)
          curveTo(20.16F, 6.243F, 16.459F, 3.0F, 12.0F, 3.0F)
          curveToRelative(-4.97F, 0.0F, -9.0F, 4.03F, -9.0F, 9.0F)
          curveToRelative(0.0F, 4.46F, 3.243F, 8.161F, 7.5F, 8.876F)
          verticalLineToRelative(-2.037F)
          curveTo(7.355F, 18.152F, 5.0F, 15.35F, 5.0F, 12.0F)
          close()
          moveToRelative(11.5F, 0.0F)
          curveToRelative(-2.485F, 0.0F, -4.5F, 2.015F, -4.5F, 4.5F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 2.485F, 2.015F, 4.5F, 4.5F, 4.5F)
          horizontalLineToRelative(8.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-8.0F)
          curveToRelative(0.0F, -2.485F, -2.015F, -4.5F, -4.5F, -4.5F)
          horizontalLineToRelative(-8.0F)
          close()
          moveTo(14.0F, 16.5F)
          curveToRelative(0.0F, -1.38F, 1.12F, -2.5F, 2.5F, -2.5F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-8.0F)
          curveToRelative(-1.38F, 0.0F, -2.5F, -1.12F, -2.5F, -2.5F)
          verticalLineToRelative(-8.0F)
          close()        
      }
    }
    return _shapes32!!
  }

private var _shapes32: ImageVector? = null
