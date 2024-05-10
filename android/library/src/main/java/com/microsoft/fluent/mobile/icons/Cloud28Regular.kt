package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Cloud28: ImageVector
  get() {
    if (_cloud28 != null) {
      return _cloud28!!
    }
    _cloud28 = fluentIcon(name = "Regular.Cloud28", 28f) {
      materialPath {
          moveTo(14.0F, 6.5F)
          curveToRelative(-2.964F, 0.0F, -5.38F, 2.344F, -5.496F, 5.28F)
          curveToRelative(-0.015F, 0.402F, -0.346F, 0.72F, -0.75F, 0.72F)
          horizontalLineTo(7.5F)
          curveToRelative(-2.21F, 0.0F, -4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          horizontalLineToRelative(13.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          horizontalLineToRelative(-0.255F)
          curveToRelative(-0.403F, 0.0F, -0.733F, -0.318F, -0.75F, -0.72F)
          curveTo(19.38F, 8.844F, 16.965F, 6.5F, 14.0F, 6.5F)
          close()
          moveToRelative(-6.931F, 4.517F)
          curveTo(7.547F, 7.616F, 10.468F, 5.0F, 14.0F, 5.0F)
          reflectiveCurveToRelative(6.453F, 2.616F, 6.931F, 6.017F)
          curveTo(23.767F, 11.237F, 26.0F, 13.607F, 26.0F, 16.5F)
          curveToRelative(0.0F, 3.038F, -2.462F, 5.5F, -5.5F, 5.5F)
          horizontalLineToRelative(-13.0F)
          curveTo(4.462F, 22.0F, 2.0F, 19.538F, 2.0F, 16.5F)
          curveToRelative(0.0F, -2.892F, 2.233F, -5.263F, 5.069F, -5.483F)
          close()        
      }
    }
    return _cloud28!!
  }

private var _cloud28: ImageVector? = null
