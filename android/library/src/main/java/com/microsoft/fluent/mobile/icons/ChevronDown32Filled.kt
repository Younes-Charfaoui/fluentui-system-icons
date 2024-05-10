package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronDown32: ImageVector
  get() {
    if (_chevronDown32 != null) {
      return _chevronDown32!!
    }
    _chevronDown32 = fluentIcon(name = "Filled.ChevronDown32", 32f) {
      materialPath {
          moveTo(5.366F, 11.116F)
          curveToRelative(0.488F, -0.488F, 1.28F, -0.488F, 1.768F, 0.0F)
          lineTo(16.0F, 19.982F)
          lineToRelative(8.866F, -8.866F)
          curveToRelative(0.488F, -0.488F, 1.28F, -0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(-9.75F, 9.75F)
          curveToRelative(-0.488F, 0.488F, -1.28F, 0.488F, -1.768F, 0.0F)
          lineToRelative(-9.75F, -9.75F)
          curveToRelative(-0.488F, -0.488F, -0.488F, -1.28F, 0.0F, -1.768F)
          close()        
      }
    }
    return _chevronDown32!!
  }

private var _chevronDown32: ImageVector? = null
