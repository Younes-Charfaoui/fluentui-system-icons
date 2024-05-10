package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Cloud48: ImageVector
  get() {
    if (_cloud48 != null) {
      return _cloud48!!
    }
    _cloud48 = fluentIcon(name = "Filled.Cloud48", 48f) {
      materialPath {
          moveTo(24.0F, 9.0F)
          curveToRelative(-6.29F, 0.0F, -11.45F, 4.84F, -11.959F, 11.0F)
          horizontalLineTo(11.5F)
          curveTo(6.806F, 20.0F, 3.0F, 23.806F, 3.0F, 28.5F)
          reflectiveCurveTo(6.806F, 37.0F, 11.5F, 37.0F)
          horizontalLineToRelative(25.0F)
          curveToRelative(4.694F, 0.0F, 8.5F, -3.806F, 8.5F, -8.5F)
          reflectiveCurveTo(41.194F, 20.0F, 36.5F, 20.0F)
          horizontalLineToRelative(-0.541F)
          curveTo(35.45F, 13.84F, 30.29F, 9.0F, 24.0F, 9.0F)
          close()        
      }
    }
    return _cloud48!!
  }

private var _cloud48: ImageVector? = null
