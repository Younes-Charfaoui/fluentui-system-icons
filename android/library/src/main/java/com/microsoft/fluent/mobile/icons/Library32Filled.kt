package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Library32: ImageVector
  get() {
    if (_library32 != null) {
      return _library32!!
    }
    _library32 = fluentIcon(name = "Filled.Library32", 32f) {
      materialPath {
          moveTo(3.0F, 5.5F)
          curveTo(3.0F, 4.12F, 4.12F, 3.0F, 5.5F, 3.0F)
          horizontalLineToRelative(2.0F)
          curveTo(8.88F, 3.0F, 10.0F, 4.12F, 10.0F, 5.5F)
          verticalLineToRelative(21.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-2.0F)
          curveTo(4.12F, 29.0F, 3.0F, 27.88F, 3.0F, 26.5F)
          verticalLineToRelative(-21.0F)
          close()
          moveToRelative(9.0F, 0.0F)
          curveTo(12.0F, 4.12F, 13.12F, 3.0F, 14.5F, 3.0F)
          horizontalLineToRelative(2.0F)
          curveTo(17.88F, 3.0F, 19.0F, 4.12F, 19.0F, 5.5F)
          verticalLineToRelative(21.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-2.0F)
          curveToRelative(-1.38F, 0.0F, -2.5F, -1.12F, -2.5F, -2.5F)
          verticalLineToRelative(-21.0F)
          close()
          moveToRelative(9.8F, 2.105F)
          curveToRelative(-1.295F, 0.358F, -2.064F, 1.733F, -1.717F, 3.07F)
          lineToRelative(4.27F, 16.466F)
          curveToRelative(0.348F, 1.338F, 1.678F, 2.131F, 2.973F, 1.773F)
          lineToRelative(1.875F, -0.52F)
          curveToRelative(1.294F, -0.357F, 2.063F, -1.732F, 1.716F, -3.07F)
          lineTo(26.647F, 8.86F)
          curveToRelative(-0.348F, -1.338F, -1.678F, -2.131F, -2.973F, -1.773F)
          lineTo(21.8F, 7.606F)
          close()        
      }
    }
    return _library32!!
  }

private var _library32: ImageVector? = null
