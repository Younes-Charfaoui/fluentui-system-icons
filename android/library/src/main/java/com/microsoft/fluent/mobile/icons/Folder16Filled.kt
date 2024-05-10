package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Folder16: ImageVector
  get() {
    if (_folder16 != null) {
      return _folder16!!
    }
    _folder16 = fluentIcon(name = "Filled.Folder16", 16f) {
      materialPath {
          moveTo(1.0F, 4.5F)
          curveTo(1.0F, 3.12F, 2.12F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(2.086F)
          curveToRelative(0.398F, 0.0F, 0.78F, 0.158F, 1.06F, 0.44F)
          lineTo(8.0F, 3.792F)
          lineToRelative(-2.06F, 2.06F)
          curveTo(5.845F, 5.948F, 5.717F, 6.0F, 5.585F, 6.0F)
          horizontalLineTo(1.0F)
          verticalLineTo(4.5F)
          close()
          moveTo(1.0F, 7.0F)
          verticalLineToRelative(4.5F)
          curveTo(1.0F, 12.88F, 2.12F, 14.0F, 3.5F, 14.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-5.0F)
          curveTo(15.0F, 5.12F, 13.88F, 4.0F, 12.5F, 4.0F)
          horizontalLineTo(9.207F)
          lineToRelative(-2.56F, 2.56F)
          curveTo(6.364F, 6.843F, 5.983F, 7.0F, 5.585F, 7.0F)
          horizontalLineTo(1.0F)
          close()        
      }
    }
    return _folder16!!
  }

private var _folder16: ImageVector? = null
