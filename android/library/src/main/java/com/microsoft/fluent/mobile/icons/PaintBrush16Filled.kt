package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PaintBrush16: ImageVector
  get() {
    if (_paintBrush16 != null) {
      return _paintBrush16!!
    }
    _paintBrush16 = fluentIcon(name = "Filled.PaintBrush16", 16f) {
      materialPath {
          moveTo(10.0F, 4.5F)
          verticalLineTo(1.0F)
          horizontalLineTo(9.0F)
          verticalLineToRelative(2.5F)
          curveTo(9.0F, 3.776F, 8.776F, 4.0F, 8.5F, 4.0F)
          reflectiveCurveTo(8.0F, 3.776F, 8.0F, 3.5F)
          verticalLineTo(1.0F)
          horizontalLineTo(3.5F)
          curveTo(3.224F, 1.0F, 3.0F, 1.224F, 3.0F, 1.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(10.0F)
          verticalLineTo(1.5F)
          curveTo(13.0F, 1.224F, 12.776F, 1.0F, 12.5F, 1.0F)
          horizontalLineTo(11.0F)
          verticalLineToRelative(3.5F)
          curveTo(11.0F, 4.776F, 10.776F, 5.0F, 10.5F, 5.0F)
          reflectiveCurveTo(10.0F, 4.776F, 10.0F, 4.5F)
          close()
          moveTo(13.0F, 8.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(1.5F)
          verticalLineToRelative(2.5F)
          curveTo(6.5F, 14.328F, 7.172F, 15.0F, 8.0F, 15.0F)
          reflectiveCurveToRelative(1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineTo(11.0F)
          horizontalLineTo(11.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(8.0F)
          close()        
      }
    }
    return _paintBrush16!!
  }

private var _paintBrush16: ImageVector? = null
