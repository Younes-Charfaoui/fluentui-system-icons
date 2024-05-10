package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChevronUp32: ImageVector
  get() {
    if (_chevronUp32 != null) {
      return _chevronUp32!!
    }
    _chevronUp32 = fluentIcon(name = "Regular.ChevronUp32", 32f) {
      materialPath {
          moveTo(5.293F, 20.707F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          lineTo(16.0F, 11.414F)
          lineToRelative(9.293F, 9.293F)
          curveToRelative(0.39F, 0.39F, 1.024F, 0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-10.0F, -10.0F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          lineToRelative(-10.0F, 10.0F)
          curveToRelative(-0.39F, 0.39F, -0.39F, 1.024F, 0.0F, 1.414F)
          close()        
      }
    }
    return _chevronUp32!!
  }

private var _chevronUp32: ImageVector? = null
