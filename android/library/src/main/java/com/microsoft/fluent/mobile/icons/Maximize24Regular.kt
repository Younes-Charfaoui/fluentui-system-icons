package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Maximize24: ImageVector
  get() {
    if (_maximize24 != null) {
      return _maximize24!!
    }
    _maximize24 = fluentIcon(name = "Regular.Maximize24", 24f) {
      materialPath {
          moveTo(5.75F, 3.0F)
          horizontalLineToRelative(12.5F)
          curveTo(19.769F, 3.0F, 21.0F, 4.231F, 21.0F, 5.75F)
          verticalLineToRelative(12.5F)
          curveToRelative(0.0F, 1.519F, -1.231F, 2.75F, -2.75F, 2.75F)
          horizontalLineTo(5.75F)
          curveTo(4.231F, 21.0F, 3.0F, 19.769F, 3.0F, 18.25F)
          verticalLineTo(5.75F)
          curveTo(3.0F, 4.231F, 4.231F, 3.0F, 5.75F, 3.0F)
          close()
          moveToRelative(0.0F, 1.5F)
          curveTo(5.06F, 4.5F, 4.5F, 5.06F, 4.5F, 5.75F)
          verticalLineToRelative(12.5F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(12.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineTo(5.75F)
          curveToRelative(0.0F, -0.69F, -0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineTo(5.75F)
          close()        
      }
    }
    return _maximize24!!
  }

private var _maximize24: ImageVector? = null
