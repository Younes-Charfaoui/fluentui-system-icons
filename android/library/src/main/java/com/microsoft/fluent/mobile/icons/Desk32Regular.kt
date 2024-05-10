package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Desk32: ImageVector
  get() {
    if (_desk32 != null) {
      return _desk32!!
    }
    _desk32 = fluentIcon(name = "Regular.Desk32", 32f) {
      materialPath {
          moveTo(5.25F, 4.0F)
          curveTo(3.455F, 4.0F, 2.0F, 5.455F, 2.0F, 7.25F)
          verticalLineTo(23.5F)
          curveTo(2.0F, 25.985F, 4.015F, 28.0F, 6.5F, 28.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(15.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(7.25F)
          curveTo(30.0F, 5.455F, 28.545F, 4.0F, 26.75F, 4.0F)
          horizontalLineTo(5.25F)
          close()
          moveTo(4.0F, 12.0F)
          horizontalLineToRelative(10.0F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(5.12F, 26.0F, 4.0F, 24.88F, 4.0F, 23.5F)
          verticalLineTo(12.0F)
          close()
          moveToRelative(0.0F, -2.0F)
          verticalLineTo(7.25F)
          curveTo(4.0F, 6.56F, 4.56F, 6.0F, 5.25F, 6.0F)
          horizontalLineToRelative(21.5F)
          curveTo(27.44F, 6.0F, 28.0F, 6.56F, 28.0F, 7.25F)
          verticalLineTo(10.0F)
          horizontalLineTo(4.0F)
          close()
          moveToRelative(3.0F, 5.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(7.0F)
          close()        
      }
    }
    return _desk32!!
  }

private var _desk32: ImageVector? = null
