package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DoubleTapSwipeDown16: ImageVector
  get() {
    if (_doubleTapSwipeDown16 != null) {
      return _doubleTapSwipeDown16!!
    }
    _doubleTapSwipeDown16 = fluentIcon(name = "Regular.DoubleTapSwipeDown16", 16f) {
      materialPath {
          moveTo(4.5F, 5.5F)
          curveTo(4.5F, 3.567F, 6.067F, 2.0F, 8.0F, 2.0F)
          reflectiveCurveToRelative(3.5F, 1.567F, 3.5F, 3.5F)
          curveToRelative(0.0F, 1.396F, -0.818F, 2.601F, -2.0F, 3.163F)
          verticalLineToRelative(1.08F)
          curveToRelative(1.748F, -0.617F, 3.0F, -2.284F, 3.0F, -4.243F)
          curveTo(12.5F, 3.015F, 10.485F, 1.0F, 8.0F, 1.0F)
          reflectiveCurveTo(3.5F, 3.015F, 3.5F, 5.5F)
          curveToRelative(0.0F, 1.96F, 1.252F, 3.626F, 3.0F, 4.244F)
          verticalLineToRelative(-1.08F)
          curveTo(5.317F, 8.1F, 4.5F, 6.895F, 4.5F, 5.5F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveToRelative(0.0F, 0.818F, -0.393F, 1.544F, -1.0F, 2.0F)
          verticalLineToRelative(-2.0F)
          curveTo(9.5F, 4.672F, 8.828F, 4.0F, 8.0F, 4.0F)
          reflectiveCurveTo(6.5F, 4.672F, 6.5F, 5.5F)
          verticalLineToRelative(2.0F)
          curveToRelative(-0.607F, -0.456F, -1.0F, -1.182F, -1.0F, -2.0F)
          curveTo(5.5F, 4.12F, 6.62F, 3.0F, 8.0F, 3.0F)
          reflectiveCurveToRelative(2.5F, 1.12F, 2.5F, 2.5F)
          close()
          moveToRelative(-2.0F, 0.0F)
          curveTo(8.5F, 5.224F, 8.276F, 5.0F, 8.0F, 5.0F)
          reflectiveCurveTo(7.5F, 5.224F, 7.5F, 5.5F)
          verticalLineToRelative(7.793F)
          lineToRelative(-1.646F, -1.647F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(2.5F, 2.5F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(2.5F, -2.5F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(8.5F, 13.293F)
          verticalLineTo(5.5F)
          close()        
      }
    }
    return _doubleTapSwipeDown16!!
  }

private var _doubleTapSwipeDown16: ImageVector? = null
