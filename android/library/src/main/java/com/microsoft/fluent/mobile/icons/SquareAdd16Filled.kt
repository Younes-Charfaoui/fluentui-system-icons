package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SquareAdd16: ImageVector
  get() {
    if (_squareAdd16 != null) {
      return _squareAdd16!!
    }
    _squareAdd16 = fluentIcon(name = "Filled.SquareAdd16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(1.757F)
          curveTo(5.472F, 13.05F, 5.0F, 11.83F, 5.0F, 10.5F)
          curveTo(5.0F, 7.462F, 7.462F, 5.0F, 10.5F, 5.0F)
          curveToRelative(1.33F, 0.0F, 2.55F, 0.472F, 3.5F, 1.257F)
          verticalLineTo(4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveToRelative(6.0F, 13.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          reflectiveCurveTo(12.985F, 6.0F, 10.5F, 6.0F)
          reflectiveCurveTo(6.0F, 8.015F, 6.0F, 10.5F)
          reflectiveCurveTo(8.015F, 15.0F, 10.5F, 15.0F)
          close()
          moveToRelative(0.0F, -7.0F)
          curveTo(10.776F, 8.0F, 11.0F, 8.224F, 11.0F, 8.5F)
          verticalLineTo(10.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(12.776F, 11.0F, 12.5F, 11.0F)
          horizontalLineTo(11.0F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(10.0F, 12.776F, 10.0F, 12.5F)
          verticalLineTo(11.0F)
          horizontalLineTo(8.5F)
          curveTo(8.224F, 11.0F, 8.0F, 10.776F, 8.0F, 10.5F)
          reflectiveCurveTo(8.224F, 10.0F, 8.5F, 10.0F)
          horizontalLineTo(10.0F)
          verticalLineTo(8.5F)
          curveTo(10.0F, 8.224F, 10.224F, 8.0F, 10.5F, 8.0F)
          close()        
      }
    }
    return _squareAdd16!!
  }

private var _squareAdd16: ImageVector? = null
