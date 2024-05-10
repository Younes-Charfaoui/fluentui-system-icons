package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabDesktopMultiple16: ImageVector
  get() {
    if (_tabDesktopMultiple16 != null) {
      return _tabDesktopMultiple16!!
    }
    _tabDesktopMultiple16 = fluentIcon(name = "Filled.TabDesktopMultiple16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(1.5F)
          curveTo(5.0F, 4.328F, 5.672F, 5.0F, 6.5F, 5.0F)
          horizontalLineTo(12.0F)
          verticalLineToRelative(4.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(3.12F, 12.0F, 2.0F, 10.88F, 2.0F, 9.5F)
          verticalLineToRelative(-5.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          close()
          moveToRelative(5.0F, 0.0F)
          curveToRelative(1.21F, 0.0F, 2.218F, 0.859F, 2.45F, 2.0F)
          horizontalLineTo(6.5F)
          curveTo(6.224F, 4.0F, 6.0F, 3.776F, 6.0F, 3.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(3.5F)
          close()
          moveTo(4.498F, 13.0F)
          curveToRelative(0.456F, 0.608F, 1.183F, 1.0F, 2.0F, 1.0F)
          horizontalLineToRelative(3.5F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          verticalLineTo(6.5F)
          curveToRelative(0.0F, -0.816F, -0.391F, -1.542F, -0.997F, -1.998F)
          verticalLineTo(9.5F)
          lineToRelative(-0.002F, 0.114F)
          verticalLineTo(10.0F)
          curveToRelative(0.0F, 1.657F, -1.344F, 3.0F, -3.0F, 3.0F)
          horizontalLineToRelative(-5.5F)
          close()        
      }
    }
    return _tabDesktopMultiple16!!
  }

private var _tabDesktopMultiple16: ImageVector? = null
