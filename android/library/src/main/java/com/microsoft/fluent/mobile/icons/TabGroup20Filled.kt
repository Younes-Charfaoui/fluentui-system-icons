package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabGroup20: ImageVector
  get() {
    if (_tabGroup20 != null) {
      return _tabGroup20!!
    }
    _tabGroup20 = fluentIcon(name = "Filled.TabGroup20", 20f) {
      materialPath {
          moveTo(3.5F, 4.0F)
          curveTo(2.12F, 4.0F, 1.0F, 5.12F, 1.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 12.88F, 2.12F, 14.0F, 3.5F, 14.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-5.0F)
          curveTo(17.0F, 5.12F, 15.88F, 4.0F, 14.5F, 4.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveTo(5.0F, 9.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(7.0F)
          curveTo(12.776F, 8.5F, 13.0F, 8.724F, 13.0F, 9.0F)
          reflectiveCurveToRelative(-0.224F, 0.5F, -0.5F, 0.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(5.224F, 9.5F, 5.0F, 9.276F, 5.0F, 9.0F)
          close()
          moveToRelative(-1.496F, 6.0F)
          curveToRelative(0.456F, 0.607F, 1.182F, 1.0F, 2.0F, 1.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.818F, -0.393F, -1.544F, -1.0F, -2.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          horizontalLineToRelative(-11.0F)
          close()        
      }
    }
    return _tabGroup20!!
  }

private var _tabGroup20: ImageVector? = null
