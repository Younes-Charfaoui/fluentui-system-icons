package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Step24: ImageVector
  get() {
    if (_step24 != null) {
      return _step24!!
    }
    _step24 = fluentIcon(name = "Filled.Step24", 24f) {
      materialPath {
          moveTo(15.75F, 2.0F)
          curveToRelative(-0.69F, 0.0F, -1.25F, 0.56F, -1.25F, 1.25F)
          verticalLineTo(8.0F)
          horizontalLineTo(9.25F)
          curveTo(8.56F, 8.0F, 8.0F, 8.56F, 8.0F, 9.25F)
          verticalLineToRelative(5.25F)
          horizontalLineTo(3.25F)
          curveTo(2.56F, 14.5F, 2.0F, 15.06F, 2.0F, 15.75F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 21.44F, 2.56F, 22.0F, 3.25F, 22.0F)
          horizontalLineToRelative(15.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(3.25F)
          curveTo(22.0F, 2.56F, 21.44F, 2.0F, 20.75F, 2.0F)
          horizontalLineToRelative(-5.0F)
          close()        
      }
    }
    return _step24!!
  }

private var _step24: ImageVector? = null
