package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Book28: ImageVector
  get() {
    if (_book28 != null) {
      return _book28!!
    }
    _book28 = fluentIcon(name = "Filled.Book28", 28f) {
      materialPath {
          moveTo(8.75F, 2.0F)
          curveTo(6.679F, 2.0F, 5.0F, 3.679F, 5.0F, 5.75F)
          verticalLineToRelative(16.5F)
          curveTo(5.0F, 24.32F, 6.679F, 26.0F, 8.75F, 26.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          curveToRelative(0.0F, -0.415F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(8.75F)
          curveToRelative(-1.158F, 0.0F, -2.112F, -0.875F, -2.236F, -2.0F)
          horizontalLineTo(21.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineTo(5.75F)
          curveTo(23.0F, 3.679F, 21.321F, 2.0F, 19.25F, 2.0F)
          horizontalLineTo(8.75F)
          close()
          moveTo(8.5F, 6.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineToRelative(-8.5F)
          curveTo(9.06F, 9.5F, 8.5F, 8.94F, 8.5F, 8.25F)
          verticalLineToRelative(-1.5F)
          close()        
      }
    }
    return _book28!!
  }

private var _book28: ImageVector? = null
