package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SearchInfo24: ImageVector
  get() {
    if (_searchInfo24 != null) {
      return _searchInfo24!!
    }
    _searchInfo24 = fluentIcon(name = "Regular.SearchInfo24", 24f) {
      materialPath {
          moveTo(10.0F, 4.5F)
          curveToRelative(-3.038F, 0.0F, -5.5F, 2.462F, -5.5F, 5.5F)
          reflectiveCurveToRelative(2.462F, 5.5F, 5.5F, 5.5F)
          reflectiveCurveToRelative(5.5F, -2.462F, 5.5F, -5.5F)
          reflectiveCurveToRelative(-2.462F, -5.5F, -5.5F, -5.5F)
          close()
          moveTo(3.0F, 10.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          curveToRelative(0.0F, 1.663F, -0.58F, 3.19F, -1.548F, 4.391F)
          lineToRelative(5.328F, 5.329F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-5.329F, -5.328F)
          curveTo(13.191F, 16.42F, 11.663F, 17.0F, 10.0F, 17.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, -3.134F, -7.0F, -7.0F)
          close()
          moveToRelative(7.0F, -1.0F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          curveTo(9.25F, 9.336F, 9.586F, 9.0F, 10.0F, 9.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          close()        
      }
    }
    return _searchInfo24!!
  }

private var _searchInfo24: ImageVector? = null
