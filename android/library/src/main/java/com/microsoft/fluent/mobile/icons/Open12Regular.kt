package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Open12: ImageVector
  get() {
    if (_open12 != null) {
      return _open12!!
    }
    _open12 = fluentIcon(name = "Regular.Open12", 12f) {
      materialPath {
          moveTo(4.0F, 3.0F)
          curveTo(3.448F, 3.0F, 3.0F, 3.448F, 3.0F, 4.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          reflectiveCurveTo(10.0F, 6.724F, 10.0F, 7.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(4.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(5.276F, 3.0F, 5.0F, 3.0F)
          horizontalLineTo(4.0F)
          close()
          moveToRelative(3.0F, 0.0F)
          curveTo(6.724F, 3.0F, 6.5F, 2.776F, 6.5F, 2.5F)
          reflectiveCurveTo(6.724F, 2.0F, 7.0F, 2.0F)
          horizontalLineToRelative(2.5F)
          curveTo(9.776F, 2.0F, 10.0F, 2.224F, 10.0F, 2.5F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(9.0F, 5.276F, 9.0F, 5.0F)
          verticalLineTo(3.707F)
          lineTo(7.354F, 5.354F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineTo(8.293F, 3.0F)
          horizontalLineTo(7.0F)
          close()        
      }
    }
    return _open12!!
  }

private var _open12: ImageVector? = null
