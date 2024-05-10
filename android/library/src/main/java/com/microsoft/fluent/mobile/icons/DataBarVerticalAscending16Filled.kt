package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DataBarVerticalAscending16: ImageVector
  get() {
    if (_dataBarVerticalAscending16 != null) {
      return _dataBarVerticalAscending16!!
    }
    _dataBarVerticalAscending16 = fluentIcon(name = "Filled.DataBarVerticalAscending16", 16f) {
      materialPath {
          moveTo(12.5F, 2.0F)
          curveTo(13.328F, 2.0F, 14.0F, 2.672F, 14.0F, 3.5F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          reflectiveCurveTo(11.0F, 13.328F, 11.0F, 12.5F)
          verticalLineToRelative(-9.0F)
          curveTo(11.0F, 2.672F, 11.672F, 2.0F, 12.5F, 2.0F)
          close()
          moveToRelative(-4.0F, 3.0F)
          curveTo(9.328F, 5.0F, 10.0F, 5.672F, 10.0F, 6.5F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          reflectiveCurveTo(7.0F, 13.328F, 7.0F, 12.5F)
          verticalLineToRelative(-6.0F)
          curveTo(7.0F, 5.672F, 7.672F, 5.0F, 8.5F, 5.0F)
          close()
          moveToRelative(-4.0F, 3.0F)
          curveTo(5.328F, 8.0F, 6.0F, 8.672F, 6.0F, 9.5F)
          verticalLineToRelative(3.0F)
          curveTo(6.0F, 13.328F, 5.328F, 14.0F, 4.5F, 14.0F)
          reflectiveCurveTo(3.0F, 13.328F, 3.0F, 12.5F)
          verticalLineToRelative(-3.0F)
          curveTo(3.0F, 8.672F, 3.672F, 8.0F, 4.5F, 8.0F)
          close()        
      }
    }
    return _dataBarVerticalAscending16!!
  }

private var _dataBarVerticalAscending16: ImageVector? = null
