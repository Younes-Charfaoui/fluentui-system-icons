package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TabGroup20: ImageVector
  get() {
    if (_tabGroup20 != null) {
      return _tabGroup20!!
    }
    _tabGroup20 = fluentIcon(name = "Regular.TabGroup20", 20f) {
      materialPath {
          moveTo(1.0F, 6.5F)
          curveTo(1.0F, 5.12F, 2.12F, 4.0F, 3.5F, 4.0F)
          horizontalLineToRelative(11.0F)
          curveTo(15.88F, 4.0F, 17.0F, 5.12F, 17.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-11.0F)
          curveTo(2.12F, 14.0F, 1.0F, 12.88F, 1.0F, 11.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveTo(3.5F, 5.0F)
          curveTo(2.672F, 5.0F, 2.0F, 5.672F, 2.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 12.328F, 2.672F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-5.0F)
          curveTo(16.0F, 5.672F, 15.328F, 5.0F, 14.5F, 5.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveToRelative(2.004F, 11.0F)
          curveToRelative(-0.818F, 0.0F, -1.544F, -0.393F, -2.0F, -1.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.933F, 0.0F, 3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.607F, 0.456F, 1.0F, 1.182F, 1.0F, 2.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(5.5F, 8.5F)
          curveTo(5.224F, 8.5F, 5.0F, 8.724F, 5.0F, 9.0F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(7.0F)
          curveTo(12.776F, 9.5F, 13.0F, 9.276F, 13.0F, 9.0F)
          reflectiveCurveToRelative(-0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineToRelative(-7.0F)
          close()        
      }
    }
    return _tabGroup20!!
  }

private var _tabGroup20: ImageVector? = null
