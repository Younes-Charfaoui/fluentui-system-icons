package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChevronLeft32: ImageVector
  get() {
    if (_chevronLeft32 != null) {
      return _chevronLeft32!!
    }
    _chevronLeft32 = fluentIcon(name = "Regular.ChevronLeft32", 32f) {
      materialPath {
          moveTo(20.707F, 5.293F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineTo(11.414F, 16.0F)
          lineToRelative(9.293F, 9.293F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          lineToRelative(-10.0F, -10.0F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(10.0F, -10.0F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          close()        
      }
    }
    return _chevronLeft32!!
  }

private var _chevronLeft32: ImageVector? = null
