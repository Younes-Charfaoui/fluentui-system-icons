package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Folder48: ImageVector
  get() {
    if (_folder48 != null) {
      return _folder48!!
    }
    _folder48 = fluentIcon(name = "Filled.Folder48", 48f) {
      materialPath {
          moveTo(4.0F, 12.25F)
          curveTo(4.0F, 8.798F, 6.798F, 6.0F, 10.25F, 6.0F)
          horizontalLineToRelative(6.465F)
          curveToRelative(0.994F, 0.0F, 1.948F, 0.395F, 2.651F, 1.098F)
          lineToRelative(3.384F, 3.384F)
          lineToRelative(-5.152F, 5.152F)
          curveTo(17.364F, 15.868F, 17.046F, 16.0F, 16.715F, 16.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(-3.75F)
          close()
          moveToRelative(0.0F, 6.25F)
          verticalLineToRelative(16.25F)
          curveTo(4.0F, 38.202F, 6.798F, 41.0F, 10.25F, 41.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineToRelative(-17.5F)
          curveToRelative(0.0F, -3.452F, -2.798F, -6.25F, -6.25F, -6.25F)
          horizontalLineTo(25.768F)
          lineToRelative(-6.402F, 6.402F)
          curveToRelative(-0.703F, 0.703F, -1.657F, 1.098F, -2.651F, 1.098F)
          horizontalLineTo(4.0F)
          close()        
      }
    }
    return _folder48!!
  }

private var _folder48: ImageVector? = null
