package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextFirstLine20: ImageVector
  get() {
    if (_textFirstLine20 != null) {
      return _textFirstLine20!!
    }
    _textFirstLine20 = fluentIcon(name = "Filled.TextFirstLine20", 20f) {
      materialPath {
          moveTo(4.28F, 2.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(0.97F, 0.97F)
          lineToRelative(-0.97F, 0.97F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(1.5F, -1.5F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-1.5F, -1.5F)
          close()
          moveTo(16.25F, 3.5F)
          horizontalLineToRelative(-7.5F)
          curveTo(8.336F, 3.5F, 8.0F, 3.836F, 8.0F, 4.25F)
          reflectiveCurveTo(8.336F, 5.0F, 8.75F, 5.0F)
          horizontalLineToRelative(7.5F)
          curveTo(16.664F, 5.0F, 17.0F, 4.664F, 17.0F, 4.25F)
          reflectiveCurveTo(16.664F, 3.5F, 16.25F, 3.5F)
          close()
          moveToRelative(-12.5F, 10.0F)
          curveTo(3.336F, 13.5F, 3.0F, 13.836F, 3.0F, 14.25F)
          reflectiveCurveTo(3.336F, 15.0F, 3.75F, 15.0F)
          horizontalLineToRelative(12.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(3.75F)
          close()
          moveToRelative(12.5F, -3.5F)
          horizontalLineTo(3.75F)
          curveTo(3.336F, 10.0F, 3.0F, 9.664F, 3.0F, 9.25F)
          reflectiveCurveTo(3.336F, 8.5F, 3.75F, 8.5F)
          horizontalLineToRelative(12.5F)
          curveTo(16.664F, 8.5F, 17.0F, 8.836F, 17.0F, 9.25F)
          reflectiveCurveTo(16.664F, 10.0F, 16.25F, 10.0F)
          close()        
      }
    }
    return _textFirstLine20!!
  }

private var _textFirstLine20: ImageVector? = null
