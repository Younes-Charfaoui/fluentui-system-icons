package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Search24: ImageVector
  get() {
    if (_search24 != null) {
      return _search24!!
    }
    _search24 = fluentIcon(name = "Regular.Search24", 24f) {
      materialPath {
          moveTo(4.5F, 10.0F)
          curveToRelative(0.0F, -3.038F, 2.462F, -5.5F, 5.5F, -5.5F)
          reflectiveCurveToRelative(5.5F, 2.462F, 5.5F, 5.5F)
          reflectiveCurveToRelative(-2.462F, 5.5F, -5.5F, 5.5F)
          reflectiveCurveToRelative(-5.5F, -2.462F, -5.5F, -5.5F)
          close()
          moveTo(10.0F, 3.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          curveToRelative(1.663F, 0.0F, 3.19F, -0.58F, 4.391F, -1.548F)
          lineToRelative(5.329F, 5.328F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-5.328F, -5.329F)
          curveTo(16.42F, 13.191F, 17.0F, 11.663F, 17.0F, 10.0F)
          curveToRelative(0.0F, -3.866F, -3.134F, -7.0F, -7.0F, -7.0F)
          close()        
      }
    }
    return _search24!!
  }

private var _search24: ImageVector? = null
