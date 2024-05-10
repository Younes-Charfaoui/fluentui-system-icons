package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Folder20: ImageVector
  get() {
    if (_folder20 != null) {
      return _folder20!!
    }
    _folder20 = fluentIcon(name = "Regular.Folder20", 20f) {
      materialPath {
          moveTo(4.5F, 3.0F)
          curveTo(3.12F, 3.0F, 2.0F, 4.12F, 2.0F, 5.5F)
          verticalLineToRelative(9.0F)
          curveTo(2.0F, 15.88F, 3.12F, 17.0F, 4.5F, 17.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(18.0F, 6.12F, 16.88F, 5.0F, 15.5F, 5.0F)
          horizontalLineTo(9.707F)
          lineTo(8.22F, 3.513F)
          curveTo(7.89F, 3.184F, 7.446F, 3.0F, 6.982F, 3.0F)
          horizontalLineTo(4.5F)
          close()
          moveTo(3.0F, 5.5F)
          curveTo(3.0F, 4.672F, 3.672F, 4.0F, 4.5F, 4.0F)
          horizontalLineToRelative(2.482F)
          curveToRelative(0.2F, 0.0F, 0.39F, 0.079F, 0.53F, 0.22F)
          lineToRelative(1.28F, 1.28F)
          lineTo(7.44F, 6.854F)
          curveTo(7.346F, 6.947F, 7.22F, 7.0F, 7.086F, 7.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(5.5F)
          close()
          moveTo(3.0F, 8.0F)
          horizontalLineToRelative(4.086F)
          curveToRelative(0.398F, 0.0F, 0.78F, -0.158F, 1.06F, -0.44F)
          lineTo(9.707F, 6.0F)
          horizontalLineTo(15.5F)
          curveTo(16.328F, 6.0F, 17.0F, 6.672F, 17.0F, 7.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-11.0F)
          curveTo(3.672F, 16.0F, 3.0F, 15.328F, 3.0F, 14.5F)
          verticalLineTo(8.0F)
          close()        
      }
    }
    return _folder20!!
  }

private var _folder20: ImageVector? = null
