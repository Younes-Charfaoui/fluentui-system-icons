package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Highway20: ImageVector
  get() {
    if (_highway20 != null) {
      return _highway20!!
    }
    _highway20 = fluentIcon(name = "Regular.Highway20", 20f) {
      materialPath {
          moveTo(5.996F, 2.566F)
          curveToRelative(0.036F, -0.274F, -0.156F, -0.525F, -0.43F, -0.562F)
          curveToRelative(-0.274F, -0.036F, -0.525F, 0.156F, -0.562F, 0.43F)
          lineToRelative(-2.0F, 15.0F)
          curveToRelative(-0.036F, 0.274F, 0.156F, 0.525F, 0.43F, 0.562F)
          curveToRelative(0.274F, 0.036F, 0.525F, -0.156F, 0.562F, -0.43F)
          lineToRelative(2.0F, -15.0F)
          close()
          moveToRelative(9.0F, -0.132F)
          curveToRelative(-0.037F, -0.274F, -0.288F, -0.466F, -0.562F, -0.43F)
          curveToRelative(-0.274F, 0.037F, -0.466F, 0.288F, -0.43F, 0.562F)
          lineToRelative(2.0F, 15.0F)
          curveToRelative(0.037F, 0.274F, 0.288F, 0.466F, 0.562F, 0.43F)
          curveToRelative(0.274F, -0.037F, 0.466F, -0.288F, 0.43F, -0.562F)
          lineToRelative(-2.0F, -15.0F)
          close()
          moveTo(10.5F, 2.5F)
          curveTo(10.5F, 2.224F, 10.276F, 2.0F, 10.0F, 2.0F)
          reflectiveCurveTo(9.5F, 2.224F, 9.5F, 2.5F)
          verticalLineToRelative(3.0F)
          curveTo(9.5F, 5.776F, 9.724F, 6.0F, 10.0F, 6.0F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          close()
          moveToRelative(-1.0F, 9.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveTo(10.5F, 8.224F, 10.276F, 8.0F, 10.0F, 8.0F)
          reflectiveCurveTo(9.5F, 8.224F, 9.5F, 8.5F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(0.0F, 3.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          reflectiveCurveToRelative(0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveToRelative(-0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _highway20!!
  }

private var _highway20: ImageVector? = null
