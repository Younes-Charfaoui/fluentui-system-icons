package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HomeGarage20: ImageVector
  get() {
    if (_homeGarage20 != null) {
      return _homeGarage20!!
    }
    _homeGarage20 = fluentIcon(name = "Filled.HomeGarage20", 20f) {
      materialPath {
          moveTo(11.005F, 2.386F)
          curveToRelative(-0.571F, -0.515F, -1.439F, -0.515F, -2.01F, 0.0F)
          lineToRelative(-5.5F, 4.96F)
          curveTo(3.18F, 7.63F, 3.0F, 8.033F, 3.0F, 8.458F)
          verticalLineToRelative(7.04F)
          curveTo(3.0F, 16.33F, 3.672F, 17.0F, 4.5F, 17.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(-4.5F)
          curveTo(6.0F, 11.672F, 6.672F, 11.0F, 7.5F, 11.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, 0.672F, 1.5F, 1.5F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineTo(8.46F)
          curveToRelative(0.0F, -0.426F, -0.18F, -0.83F, -0.495F, -1.115F)
          lineToRelative(-5.5F, -4.959F)
          close()
          moveTo(13.0F, 14.0F)
          verticalLineToRelative(-1.5F)
          curveToRelative(0.0F, -0.276F, -0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(7.224F, 12.0F, 7.0F, 12.224F, 7.0F, 12.5F)
          verticalLineTo(14.0F)
          horizontalLineToRelative(6.0F)
          close()
          moveToRelative(-6.0F, 1.0F)
          horizontalLineToRelative(6.0F)
          verticalLineToRelative(2.0F)
          horizontalLineTo(7.0F)
          verticalLineToRelative(-2.0F)
          close()        
      }
    }
    return _homeGarage20!!
  }

private var _homeGarage20: ImageVector? = null
