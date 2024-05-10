package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronLeft32: ImageVector
  get() {
    if (_chevronLeft32 != null) {
      return _chevronLeft32!!
    }
    _chevronLeft32 = fluentIcon(name = "Filled.ChevronLeft32", 32f) {
      materialPath {
          moveTo(20.884F, 5.366F)
          curveToRelative(0.488F, 0.488F, 0.488F, 1.28F, 0.0F, 1.768F)
          lineTo(12.018F, 16.0F)
          lineToRelative(8.866F, 8.866F)
          curveToRelative(0.488F, 0.488F, 0.488F, 1.28F, 0.0F, 1.768F)
          reflectiveCurveToRelative(-1.28F, 0.488F, -1.768F, 0.0F)
          lineToRelative(-9.75F, -9.75F)
          curveToRelative(-0.488F, -0.488F, -0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(9.75F, -9.75F)
          curveToRelative(0.488F, -0.488F, 1.28F, -0.488F, 1.768F, 0.0F)
          close()        
      }
    }
    return _chevronLeft32!!
  }

private var _chevronLeft32: ImageVector? = null
