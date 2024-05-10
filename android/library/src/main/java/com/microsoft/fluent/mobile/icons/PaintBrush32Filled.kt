package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PaintBrush32: ImageVector
  get() {
    if (_paintBrush32 != null) {
      return _paintBrush32!!
    }
    _paintBrush32 = fluentIcon(name = "Filled.PaintBrush32", 32f) {
      materialPath {
          moveTo(17.0F, 7.0F)
          verticalLineTo(2.0F)
          horizontalLineTo(7.0F)
          curveTo(6.448F, 2.0F, 6.0F, 2.448F, 6.0F, 3.0F)
          verticalLineToRelative(11.0F)
          horizontalLineToRelative(20.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          close()
          moveToRelative(9.0F, 9.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(2.75F)
          curveTo(6.0F, 20.545F, 7.455F, 22.0F, 9.25F, 22.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          reflectiveCurveToRelative(3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineToRelative(-5.0F)
          horizontalLineToRelative(3.75F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(16.0F)
          close()        
      }
    }
    return _paintBrush32!!
  }

private var _paintBrush32: ImageVector? = null
