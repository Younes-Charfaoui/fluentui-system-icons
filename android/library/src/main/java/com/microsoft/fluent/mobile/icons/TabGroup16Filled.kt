package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabGroup16: ImageVector
  get() {
    if (_tabGroup16 != null) {
      return _tabGroup16!!
    }
    _tabGroup16 = fluentIcon(name = "Filled.TabGroup16", 16f) {
      materialPath {
          moveTo(3.0F, 3.0F)
          curveTo(1.895F, 3.0F, 1.0F, 3.895F, 1.0F, 5.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(1.0F, 4.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(5.0F)
          curveTo(9.776F, 6.5F, 10.0F, 6.724F, 10.0F, 7.0F)
          reflectiveCurveTo(9.776F, 7.5F, 9.5F, 7.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(4.224F, 7.5F, 4.0F, 7.276F, 4.0F, 7.0F)
          close()
          moveToRelative(0.998F, 6.0F)
          curveToRelative(-0.74F, 0.0F, -1.387F, -0.402F, -1.732F, -1.0F)
          horizontalLineToRelative(7.732F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(5.268F)
          curveToRelative(0.598F, 0.345F, 1.0F, 0.992F, 1.0F, 1.732F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 2.21F, -1.79F, 4.0F, -4.0F, 4.0F)
          horizontalLineToRelative(-6.0F)
          close()        
      }
    }
    return _tabGroup16!!
  }

private var _tabGroup16: ImageVector? = null
