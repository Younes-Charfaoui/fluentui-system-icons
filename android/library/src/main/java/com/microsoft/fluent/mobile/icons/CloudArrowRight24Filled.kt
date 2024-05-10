package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CloudArrowRight24: ImageVector
  get() {
    if (_cloudArrowRight24 != null) {
      return _cloudArrowRight24!!
    }
    _cloudArrowRight24 = fluentIcon(name = "Filled.CloudArrowRight24", 24f) {
      materialPath {
          moveTo(12.0F, 3.0F)
          curveTo(9.02F, 3.0F, 6.548F, 5.172F, 6.08F, 8.02F)
          curveTo(3.792F, 8.23F, 2.0F, 10.155F, 2.0F, 12.5F)
          curveTo(2.0F, 14.985F, 4.015F, 17.0F, 6.5F, 17.0F)
          horizontalLineToRelative(3.519F)
          curveTo(10.006F, 16.835F, 10.0F, 16.668F, 10.0F, 16.5F)
          curveToRelative(0.0F, -3.59F, 2.91F, -6.5F, 6.5F, -6.5F)
          curveToRelative(2.298F, 0.0F, 4.317F, 1.193F, 5.473F, 2.992F)
          curveTo(21.991F, 12.832F, 22.0F, 12.666F, 22.0F, 12.5F)
          curveToRelative(0.0F, -2.344F, -1.791F, -4.269F, -4.08F, -4.48F)
          curveTo(17.452F, 5.171F, 14.98F, 3.0F, 12.0F, 3.0F)
          close()
          moveToRelative(4.5F, 8.0F)
          curveToRelative(3.038F, 0.0F, 5.5F, 2.462F, 5.5F, 5.5F)
          reflectiveCurveTo(19.538F, 22.0F, 16.5F, 22.0F)
          reflectiveCurveTo(11.0F, 19.538F, 11.0F, 16.5F)
          reflectiveCurveToRelative(2.462F, -5.5F, 5.5F, -5.5F)
          close()
          moveToRelative(-3.0F, 5.0F)
          curveToRelative(-0.276F, 0.0F, -0.5F, 0.224F, -0.5F, 0.5F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(4.793F)
          lineToRelative(-1.647F, 1.646F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(2.5F, -2.5F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-2.5F, -2.5F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(18.293F, 16.0F)
          horizontalLineTo(13.5F)
          close()        
      }
    }
    return _cloudArrowRight24!!
  }

private var _cloudArrowRight24: ImageVector? = null
