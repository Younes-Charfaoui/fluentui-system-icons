package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PaintBrush16: ImageVector
  get() {
    if (_paintBrush16 != null) {
      return _paintBrush16!!
    }
    _paintBrush16 = fluentIcon(name = "Regular.PaintBrush16", 16f) {
      materialPath {
          moveTo(3.5F, 1.0F)
          curveTo(3.224F, 1.0F, 3.0F, 1.224F, 3.0F, 1.5F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          reflectiveCurveToRelative(2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(1.5F)
          curveTo(13.0F, 1.224F, 12.776F, 1.0F, 12.5F, 1.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(4.0F, 7.0F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(1.5F)
          curveTo(8.0F, 3.776F, 8.224F, 4.0F, 8.5F, 4.0F)
          reflectiveCurveTo(9.0F, 3.776F, 9.0F, 3.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(2.5F)
          curveTo(10.0F, 4.776F, 10.224F, 5.0F, 10.5F, 5.0F)
          reflectiveCurveTo(11.0F, 4.776F, 11.0F, 4.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(5.0F)
          horizontalLineTo(4.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          horizontalLineToRelative(8.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(9.5F)
          curveTo(9.224F, 10.0F, 9.0F, 10.224F, 9.0F, 10.5F)
          verticalLineTo(13.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-2.5F)
          curveTo(7.0F, 10.224F, 6.776F, 10.0F, 6.5F, 10.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(8.0F)
          close()        
      }
    }
    return _paintBrush16!!
  }

private var _paintBrush16: ImageVector? = null
