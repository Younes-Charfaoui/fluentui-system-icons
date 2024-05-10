package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TabDesktopMultiple16: ImageVector
  get() {
    if (_tabDesktopMultiple16 != null) {
      return _tabDesktopMultiple16!!
    }
    _tabDesktopMultiple16 = fluentIcon(name = "Regular.TabDesktopMultiple16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(5.0F)
          curveTo(10.88F, 2.0F, 12.0F, 3.12F, 12.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(3.12F, 12.0F, 2.0F, 10.88F, 2.0F, 9.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveTo(4.5F, 3.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveTo(3.0F, 10.328F, 3.672F, 11.0F, 4.5F, 11.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineTo(5.0F)
          horizontalLineTo(6.5F)
          curveTo(5.672F, 5.0F, 5.0F, 4.328F, 5.0F, 3.5F)
          verticalLineTo(3.0F)
          horizontalLineTo(4.5F)
          close()
          moveTo(6.0F, 3.0F)
          verticalLineToRelative(0.5F)
          curveTo(6.0F, 3.776F, 6.224F, 4.0F, 6.5F, 4.0F)
          horizontalLineToRelative(4.415F)
          curveTo(10.709F, 3.417F, 10.153F, 3.0F, 9.5F, 3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(0.499F, 11.0F)
          curveToRelative(-0.818F, 0.0F, -1.545F, -0.392F, -2.0F, -1.0F)
          horizontalLineToRelative(5.5F)
          curveToRelative(1.656F, 0.0F, 3.0F, -1.342F, 3.0F, -3.0F)
          verticalLineTo(9.615F)
          lineTo(13.0F, 9.5F)
          verticalLineTo(4.502F)
          curveToRelative(0.606F, 0.456F, 0.998F, 1.182F, 0.998F, 1.999F)
          verticalLineTo(10.0F)
          curveToRelative(0.0F, 2.209F, -1.791F, 4.0F, -4.0F, 4.0F)
          horizontalLineToRelative(-3.5F)
          close()        
      }
    }
    return _tabDesktopMultiple16!!
  }

private var _tabDesktopMultiple16: ImageVector? = null
