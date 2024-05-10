package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Step24: ImageVector
  get() {
    if (_step24 != null) {
      return _step24!!
    }
    _step24 = fluentIcon(name = "Regular.Step24", 24f) {
      materialPath {
          moveTo(14.5F, 3.25F)
          curveTo(14.5F, 2.56F, 15.06F, 2.0F, 15.75F, 2.0F)
          horizontalLineToRelative(5.0F)
          curveTo(21.44F, 2.0F, 22.0F, 2.56F, 22.0F, 3.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(3.25F)
          curveTo(2.56F, 22.0F, 2.0F, 21.44F, 2.0F, 20.75F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineTo(8.0F)
          verticalLineTo(9.25F)
          curveTo(8.0F, 8.56F, 8.56F, 8.0F, 9.25F, 8.0F)
          horizontalLineToRelative(5.25F)
          verticalLineTo(3.25F)
          close()
          moveTo(16.0F, 3.5F)
          verticalLineToRelative(4.75F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineTo(9.5F)
          verticalLineToRelative(5.25F)
          curveTo(9.5F, 15.44F, 8.94F, 16.0F, 8.25F, 16.0F)
          horizontalLineTo(3.5F)
          verticalLineToRelative(4.5F)
          horizontalLineToRelative(15.25F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(3.5F)
          horizontalLineTo(16.0F)
          close()        
      }
    }
    return _step24!!
  }

private var _step24: ImageVector? = null
