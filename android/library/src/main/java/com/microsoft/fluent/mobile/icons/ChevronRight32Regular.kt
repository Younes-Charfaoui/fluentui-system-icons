package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChevronRight32: ImageVector
  get() {
    if (_chevronRight32 != null) {
      return _chevronRight32!!
    }
    _chevronRight32 = fluentIcon(name = "Regular.ChevronRight32", 32f) {
      materialPath {
          moveTo(11.293F, 26.707F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          lineTo(20.586F, 16.0F)
          lineToRelative(-9.293F, -9.293F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          lineToRelative(10.0F, 10.0F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineToRelative(-10.0F, 10.0F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          close()        
      }
    }
    return _chevronRight32!!
  }

private var _chevronRight32: ImageVector? = null
