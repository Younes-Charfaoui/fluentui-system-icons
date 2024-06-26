package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineStyle24: ImageVector
  get() {
    if (_lineStyle24 != null) {
      return _lineStyle24!!
    }
    _lineStyle24 = fluentIcon(name = "Regular.LineStyle24", 24f) {
      materialPath {
          moveTo(2.75F, 5.0F)
          curveTo(2.336F, 5.0F, 2.0F, 5.336F, 2.0F, 5.75F)
          reflectiveCurveTo(2.336F, 6.5F, 2.75F, 6.5F)
          horizontalLineToRelative(3.5F)
          curveTo(6.664F, 6.5F, 7.0F, 6.164F, 7.0F, 5.75F)
          reflectiveCurveTo(6.664F, 5.0F, 6.25F, 5.0F)
          horizontalLineToRelative(-3.5F)
          close()
          moveToRelative(7.5F, 0.0F)
          curveTo(9.836F, 5.0F, 9.5F, 5.336F, 9.5F, 5.75F)
          reflectiveCurveTo(9.836F, 6.5F, 10.25F, 6.5F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(14.164F, 5.0F, 13.75F, 5.0F)
          horizontalLineToRelative(-3.5F)
          close()
          moveToRelative(7.5F, 0.0F)
          curveTo(17.336F, 5.0F, 17.0F, 5.336F, 17.0F, 5.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(3.5F)
          curveTo(21.664F, 6.5F, 22.0F, 6.164F, 22.0F, 5.75F)
          reflectiveCurveTo(21.664F, 5.0F, 21.25F, 5.0F)
          horizontalLineToRelative(-3.5F)
          close()
          moveToRelative(3.502F, 6.503F)
          horizontalLineToRelative(-18.5F)
          lineTo(2.651F, 11.51F)
          curveToRelative(-0.366F, 0.05F, -0.649F, 0.363F, -0.649F, 0.743F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(18.5F)
          lineToRelative(0.102F, -0.007F)
          curveToRelative(0.366F, -0.05F, 0.648F, -0.363F, 0.648F, -0.743F)
          curveToRelative(0.0F, -0.414F, -0.335F, -0.75F, -0.75F, -0.75F)
          close()
          moveTo(3.25F, 17.0F)
          curveTo(2.56F, 17.0F, 2.0F, 17.56F, 2.0F, 18.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(17.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveTo(21.44F, 17.0F, 20.75F, 17.0F)
          horizontalLineTo(3.25F)
          close()        
      }
    }
    return _lineStyle24!!
  }

private var _lineStyle24: ImageVector? = null
