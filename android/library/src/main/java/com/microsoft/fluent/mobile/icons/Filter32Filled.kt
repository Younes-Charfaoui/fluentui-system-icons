package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Filter32: ImageVector
  get() {
    if (_filter32 != null) {
      return _filter32!!
    }
    _filter32 = fluentIcon(name = "Filled.Filter32", 32f) {
      materialPath {
          moveTo(3.0F, 9.25F)
          curveTo(3.0F, 8.56F, 3.56F, 8.0F, 4.25F, 8.0F)
          horizontalLineToRelative(23.5F)
          curveTo(28.44F, 8.0F, 29.0F, 8.56F, 29.0F, 9.25F)
          reflectiveCurveToRelative(-0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineTo(4.25F)
          curveTo(3.56F, 10.5F, 3.0F, 9.94F, 3.0F, 9.25F)
          close()
          moveToRelative(4.0F, 7.0F)
          curveTo(7.0F, 15.56F, 7.56F, 15.0F, 8.25F, 15.0F)
          horizontalLineToRelative(15.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveToRelative(-0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineTo(8.25F)
          curveTo(7.56F, 17.5F, 7.0F, 16.94F, 7.0F, 16.25F)
          close()
          moveTo(12.25F, 22.0F)
          curveTo(11.56F, 22.0F, 11.0F, 22.56F, 11.0F, 23.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveTo(20.44F, 22.0F, 19.75F, 22.0F)
          horizontalLineToRelative(-7.5F)
          close()        
      }
    }
    return _filter32!!
  }

private var _filter32: ImageVector? = null
