package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DoubleTapSwipeUp16: ImageVector
  get() {
    if (_doubleTapSwipeUp16 != null) {
      return _doubleTapSwipeUp16!!
    }
    _doubleTapSwipeUp16 = fluentIcon(name = "Regular.DoubleTapSwipeUp16", 16f) {
      materialPath {
          moveTo(4.5F, 10.5F)
          curveTo(4.5F, 12.433F, 6.067F, 14.0F, 8.0F, 14.0F)
          reflectiveCurveToRelative(3.5F, -1.567F, 3.5F, -3.5F)
          curveToRelative(0.0F, -1.396F, -0.818F, -2.601F, -2.0F, -3.163F)
          verticalLineToRelative(-1.08F)
          curveToRelative(1.748F, 0.617F, 3.0F, 2.284F, 3.0F, 4.243F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveToRelative(-4.5F, -2.015F, -4.5F, -4.5F)
          curveToRelative(0.0F, -1.96F, 1.252F, -3.626F, 3.0F, -4.244F)
          verticalLineToRelative(1.08F)
          curveToRelative(-1.183F, 0.563F, -2.0F, 1.768F, -2.0F, 3.164F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveToRelative(0.0F, -0.818F, -0.393F, -1.544F, -1.0F, -2.0F)
          verticalLineToRelative(2.0F)
          curveTo(9.5F, 11.328F, 8.828F, 12.0F, 8.0F, 12.0F)
          reflectiveCurveToRelative(-1.5F, -0.672F, -1.5F, -1.5F)
          verticalLineToRelative(-2.0F)
          curveToRelative(-0.607F, 0.456F, -1.0F, 1.182F, -1.0F, 2.0F)
          curveTo(5.5F, 11.88F, 6.62F, 13.0F, 8.0F, 13.0F)
          reflectiveCurveToRelative(2.5F, -1.12F, 2.5F, -2.5F)
          close()
          moveToRelative(-2.0F, 0.0F)
          curveTo(8.5F, 10.776F, 8.276F, 11.0F, 8.0F, 11.0F)
          reflectiveCurveToRelative(-0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineTo(2.707F)
          lineTo(5.854F, 4.354F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(2.5F, -2.5F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(2.5F, 2.5F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineTo(8.5F, 2.707F)
          verticalLineTo(10.5F)
          close()        
      }
    }
    return _doubleTapSwipeUp16!!
  }

private var _doubleTapSwipeUp16: ImageVector? = null
