package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Script20: ImageVector
  get() {
    if (_script20 != null) {
      return _script20!!
    }
    _script20 = fluentIcon(name = "Filled.Script20", 20f) {
      materialPath {
          moveTo(16.563F, 2.0F)
          horizontalLineTo(6.5F)
          curveTo(5.12F, 2.0F, 4.0F, 3.12F, 4.0F, 4.5F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(2.094F)
          curveTo(11.0F, 17.198F, 11.895F, 18.0F, 13.0F, 18.0F)
          curveToRelative(1.095F, 0.0F, 1.985F, -0.787F, 2.0F, -1.88F)
          verticalLineTo(4.376F)
          horizontalLineToRelative(0.003F)
          curveTo(15.06F, 3.221F, 15.898F, 2.274F, 17.0F, 2.05F)
          curveTo(16.858F, 2.021F, 16.712F, 2.004F, 16.562F, 2.0F)
          close()
          moveToRelative(-5.88F, 16.0F)
          curveTo(10.256F, 17.482F, 10.0F, 16.818F, 10.0F, 16.094F)
          verticalLineTo(14.0F)
          horizontalLineTo(1.5F)
          curveTo(1.224F, 14.0F, 1.0F, 14.224F, 1.0F, 14.5F)
          verticalLineToRelative(1.188F)
          curveTo(1.0F, 17.02F, 2.086F, 18.0F, 3.375F, 18.0F)
          horizontalLineToRelative(7.308F)
          close()
          moveTo(18.0F, 7.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.5F)
          curveTo(19.0F, 3.672F, 18.328F, 3.0F, 17.5F, 3.0F)
          reflectiveCurveTo(16.0F, 3.672F, 16.0F, 4.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(2.0F)
          close()        
      }
    }
    return _script20!!
  }

private var _script20: ImageVector? = null
