package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ShareIos20: ImageVector
  get() {
    if (_shareIos20 != null) {
      return _shareIos20!!
    }
    _shareIos20 = fluentIcon(name = "Filled.ShareIos20", 20f) {
      materialPath {
          moveTo(10.287F, 2.057F)
          curveTo(10.2F, 2.02F, 10.102F, 2.0F, 10.0F, 2.0F)
          curveTo(9.898F, 2.0F, 9.801F, 2.02F, 9.713F, 2.057F)
          curveTo(9.624F, 2.094F, 9.542F, 2.147F, 9.47F, 2.22F)
          lineTo(5.22F, 6.47F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(2.97F, -2.97F)
          verticalLineToRelative(7.69F)
          curveTo(9.25F, 12.664F, 9.586F, 13.0F, 10.0F, 13.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(4.56F)
          lineToRelative(2.97F, 2.97F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-4.25F, -4.25F)
          curveToRelative(-0.072F, -0.072F, -0.154F, -0.127F, -0.243F, -0.163F)
          close()
          moveTo(3.75F, 9.0F)
          curveTo(4.164F, 9.0F, 4.5F, 9.336F, 4.5F, 9.75F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineToRelative(-4.0F)
          curveTo(15.5F, 9.336F, 15.836F, 9.0F, 16.25F, 9.0F)
          reflectiveCurveTo(17.0F, 9.336F, 17.0F, 9.75F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineToRelative(-7.5F)
          curveTo(4.455F, 17.0F, 3.0F, 15.545F, 3.0F, 13.75F)
          verticalLineToRelative(-4.0F)
          curveTo(3.0F, 9.336F, 3.336F, 9.0F, 3.75F, 9.0F)
          close()        
      }
    }
    return _shareIos20!!
  }

private var _shareIos20: ImageVector? = null
