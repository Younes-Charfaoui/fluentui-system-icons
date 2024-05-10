package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Storage16: ImageVector
  get() {
    if (_storage16 != null) {
      return _storage16!!
    }
    _storage16 = fluentIcon(name = "Regular.Storage16", 16f) {
      materialPath {
          moveTo(1.0F, 6.5F)
          curveTo(1.0F, 5.12F, 2.12F, 4.0F, 3.5F, 4.0F)
          horizontalLineToRelative(9.0F)
          curveTo(13.88F, 4.0F, 15.0F, 5.12F, 15.0F, 6.5F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-9.0F)
          curveTo(2.12F, 11.0F, 1.0F, 9.88F, 1.0F, 8.5F)
          verticalLineToRelative(-2.0F)
          close()
          moveTo(3.5F, 5.0F)
          curveTo(2.672F, 5.0F, 2.0F, 5.672F, 2.0F, 6.5F)
          verticalLineToRelative(2.0F)
          curveTo(2.0F, 9.328F, 2.672F, 10.0F, 3.5F, 10.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-2.0F)
          curveTo(14.0F, 5.672F, 13.328F, 5.0F, 12.5F, 5.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(10.0F, 7.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveTo(8.0F, 7.552F, 8.0F, 7.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          close()
          moveToRelative(2.0F, 1.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          close()        
      }
    }
    return _storage16!!
  }

private var _storage16: ImageVector? = null
