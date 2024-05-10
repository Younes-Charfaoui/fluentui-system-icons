package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Search24: ImageVector
  get() {
    if (_search24 != null) {
      return _search24!!
    }
    _search24 = fluentIcon(name = "Filled.Search24", 24f) {
      materialPath {
          moveTo(5.0F, 10.0F)
          curveToRelative(0.0F, -2.761F, 2.239F, -5.0F, 5.0F, -5.0F)
          reflectiveCurveToRelative(5.0F, 2.239F, 5.0F, 5.0F)
          reflectiveCurveToRelative(-2.239F, 5.0F, -5.0F, 5.0F)
          reflectiveCurveToRelative(-5.0F, -2.239F, -5.0F, -5.0F)
          close()
          moveToRelative(5.0F, -7.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          curveToRelative(1.572F, 0.0F, 3.024F, -0.518F, 4.192F, -1.394F)
          lineToRelative(5.1F, 5.101F)
          curveToRelative(0.391F, 0.39F, 1.025F, 0.39F, 1.415F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-5.1F, -5.1F)
          curveTo(16.481F, 13.022F, 17.0F, 11.572F, 17.0F, 10.0F)
          curveToRelative(0.0F, -3.866F, -3.134F, -7.0F, -7.0F, -7.0F)
          close()        
      }
    }
    return _search24!!
  }

private var _search24: ImageVector? = null
