package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TabGroup16: ImageVector
  get() {
    if (_tabGroup16 != null) {
      return _tabGroup16!!
    }
    _tabGroup16 = fluentIcon(name = "Regular.TabGroup16", 16f) {
      materialPath {
          moveTo(1.0F, 5.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(5.0F)
          close()
          moveToRelative(2.0F, -1.0F)
          curveTo(2.448F, 4.0F, 2.0F, 4.448F, 2.0F, 5.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(0.266F, 8.0F)
          curveToRelative(0.345F, 0.598F, 0.992F, 1.0F, 1.732F, 1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -0.74F, -0.402F, -1.387F, -1.0F, -1.732F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(3.266F)
          close()
          moveTo(4.5F, 6.5F)
          curveTo(4.224F, 6.5F, 4.0F, 6.724F, 4.0F, 7.0F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(5.0F)
          curveTo(9.776F, 7.5F, 10.0F, 7.276F, 10.0F, 7.0F)
          reflectiveCurveTo(9.776F, 6.5F, 9.5F, 6.5F)
          horizontalLineToRelative(-5.0F)
          close()        
      }
    }
    return _tabGroup16!!
  }

private var _tabGroup16: ImageVector? = null
