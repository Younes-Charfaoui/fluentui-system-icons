package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Folder28: ImageVector
  get() {
    if (_folder28 != null) {
      return _folder28!!
    }
    _folder28 = fluentIcon(name = "Filled.Folder28", 28f) {
      materialPath {
          moveTo(2.0F, 6.75F)
          curveTo(2.0F, 4.679F, 3.679F, 3.0F, 5.75F, 3.0F)
          horizontalLineToRelative(3.672F)
          curveToRelative(0.729F, 0.0F, 1.428F, 0.29F, 1.944F, 0.805F)
          lineTo(13.25F, 5.69F)
          lineToRelative(-2.944F, 2.945F)
          curveTo(10.07F, 8.868F, 9.752F, 9.0F, 9.421F, 9.0F)
          horizontalLineTo(2.0F)
          verticalLineTo(6.75F)
          close()
          moveToRelative(0.004F, 3.75F)
          verticalLineToRelative(9.75F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineTo(22.25F)
          curveToRelative(2.07F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(9.75F)
          curveTo(26.0F, 7.679F, 24.32F, 6.0F, 22.25F, 6.0F)
          horizontalLineToRelative(-7.19F)
          lineToRelative(-3.695F, 3.694F)
          curveTo(10.85F, 10.21F, 10.151F, 10.5F, 9.422F, 10.5F)
          horizontalLineTo(2.004F)
          close()        
      }
    }
    return _folder28!!
  }

private var _folder28: ImageVector? = null
