package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelLeftAdd16: ImageVector
  get() {
    if (_panelLeftAdd16 != null) {
      return _panelLeftAdd16!!
    }
    _panelLeftAdd16 = fluentIcon(name = "Filled.PanelLeftAdd16", 16f) {
      materialPath {
          moveTo(3.5F, 2.0F)
          curveTo(2.12F, 2.0F, 1.0F, 3.12F, 1.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 10.88F, 2.12F, 12.0F, 3.5F, 12.0F)
          horizontalLineToRelative(2.522F)
          curveTo(6.008F, 11.835F, 6.0F, 11.668F, 6.0F, 11.5F)
          curveToRelative(0.0F, -0.168F, 0.008F, -0.335F, 0.022F, -0.5F)
          horizontalLineTo(6.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(4.5F)
          curveTo(11.328F, 3.0F, 12.0F, 3.672F, 12.0F, 4.5F)
          verticalLineToRelative(1.522F)
          curveToRelative(0.343F, 0.031F, 0.678F, 0.094F, 1.0F, 0.185F)
          verticalLineTo(4.5F)
          curveTo(13.0F, 3.12F, 11.88F, 2.0F, 10.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(16.0F, 11.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(7.0F, 13.985F, 7.0F, 11.5F)
          reflectiveCurveTo(9.015F, 7.0F, 11.5F, 7.0F)
          reflectiveCurveTo(16.0F, 9.015F, 16.0F, 11.5F)
          close()
          moveToRelative(-4.0F, -2.0F)
          curveTo(12.0F, 9.224F, 11.776F, 9.0F, 11.5F, 9.0F)
          reflectiveCurveTo(11.0F, 9.224F, 11.0F, 9.5F)
          verticalLineTo(11.0F)
          horizontalLineTo(9.5F)
          curveTo(9.224F, 11.0F, 9.0F, 11.224F, 9.0F, 11.5F)
          reflectiveCurveTo(9.224F, 12.0F, 9.5F, 12.0F)
          horizontalLineTo(11.0F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(13.776F, 11.0F, 13.5F, 11.0F)
          horizontalLineTo(12.0F)
          verticalLineTo(9.5F)
          close()        
      }
    }
    return _panelLeftAdd16!!
  }

private var _panelLeftAdd16: ImageVector? = null
