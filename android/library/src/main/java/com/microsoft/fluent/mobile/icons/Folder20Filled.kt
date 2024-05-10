package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Folder20: ImageVector
  get() {
    if (_folder20 != null) {
      return _folder20!!
    }
    _folder20 = fluentIcon(name = "Filled.Folder20", 20f) {
      materialPath {
          moveTo(2.0F, 5.5F)
          curveTo(2.0F, 4.12F, 3.12F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(2.482F)
          curveToRelative(0.464F, 0.0F, 0.91F, 0.184F, 1.238F, 0.513F)
          lineToRelative(1.28F, 1.28F)
          lineToRelative(-2.06F, 2.06F)
          curveTo(7.345F, 6.948F, 7.217F, 7.0F, 7.085F, 7.0F)
          horizontalLineTo(2.0F)
          verticalLineTo(5.5F)
          close()
          moveTo(2.0F, 8.0F)
          verticalLineToRelative(6.5F)
          curveTo(2.0F, 15.88F, 3.12F, 17.0F, 4.5F, 17.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(18.0F, 6.12F, 16.88F, 5.0F, 15.5F, 5.0F)
          horizontalLineToRelative(-4.793F)
          lineToRelative(-2.56F, 2.56F)
          curveTo(7.864F, 7.843F, 7.483F, 8.0F, 7.085F, 8.0F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _folder20!!
  }

private var _folder20: ImageVector? = null
