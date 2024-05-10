package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Folder16: ImageVector
  get() {
    if (_folder16 != null) {
      return _folder16!!
    }
    _folder16 = fluentIcon(name = "Regular.Folder16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(3.586F)
          curveToRelative(0.132F, 0.0F, 0.26F, -0.053F, 0.353F, -0.146F)
          lineTo(7.293F, 4.5F)
          lineTo(5.939F, 3.147F)
          curveTo(5.846F, 3.053F, 5.72F, 3.0F, 5.586F, 3.0F)
          horizontalLineTo(3.5F)
          curveTo(2.672F, 3.0F, 2.0F, 3.672F, 2.0F, 4.5F)
          close()
          moveToRelative(-1.0F, 0.0F)
          curveTo(1.0F, 3.12F, 2.12F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(2.086F)
          curveToRelative(0.398F, 0.0F, 0.78F, 0.158F, 1.06F, 0.44F)
          lineTo(8.207F, 4.0F)
          horizontalLineTo(12.5F)
          curveTo(13.88F, 4.0F, 15.0F, 5.12F, 15.0F, 6.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-9.0F)
          curveTo(2.12F, 14.0F, 1.0F, 12.88F, 1.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(2.0F, 7.0F)
          verticalLineToRelative(4.5F)
          curveTo(2.0F, 12.328F, 2.672F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-5.0F)
          curveTo(14.0F, 5.672F, 13.328F, 5.0F, 12.5F, 5.0F)
          horizontalLineTo(8.207F)
          lineToRelative(-1.56F, 1.56F)
          curveTo(6.364F, 6.843F, 5.983F, 7.0F, 5.585F, 7.0F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _folder16!!
  }

private var _folder16: ImageVector? = null
