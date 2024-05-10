package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronRight32: ImageVector
  get() {
    if (_chevronRight32 != null) {
      return _chevronRight32!!
    }
    _chevronRight32 = fluentIcon(name = "Filled.ChevronRight32", 32f) {
      materialPath {
          moveTo(11.116F, 26.634F)
          curveToRelative(-0.488F, -0.488F, -0.488F, -1.28F, 0.0F, -1.768F)
          lineTo(19.982F, 16.0F)
          lineToRelative(-8.866F, -8.866F)
          curveToRelative(-0.488F, -0.488F, -0.488F, -1.28F, 0.0F, -1.768F)
          reflectiveCurveToRelative(1.28F, -0.488F, 1.768F, 0.0F)
          lineToRelative(9.75F, 9.75F)
          curveToRelative(0.488F, 0.488F, 0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(-9.75F, 9.75F)
          curveToRelative(-0.488F, 0.488F, -1.28F, 0.488F, -1.768F, 0.0F)
          close()        
      }
    }
    return _chevronRight32!!
  }

private var _chevronRight32: ImageVector? = null
