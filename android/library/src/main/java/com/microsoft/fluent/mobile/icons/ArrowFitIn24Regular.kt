package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowFitIn24: ImageVector
  get() {
    if (_arrowFitIn24 != null) {
      return _arrowFitIn24!!
    }
    _arrowFitIn24 = fluentIcon(name = "Regular.ArrowFitIn24", 24f) {
      materialPath {
          moveTo(6.238F, 7.452F)
          curveTo(5.935F, 7.734F, 5.92F, 8.209F, 6.202F, 8.512F)
          lineTo(8.524F, 11.0F)
          horizontalLineTo(2.75F)
          curveTo(2.336F, 11.0F, 2.0F, 11.336F, 2.0F, 11.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(5.774F)
          lineToRelative(-2.322F, 2.488F)
          curveToRelative(-0.283F, 0.303F, -0.266F, 0.778F, 0.036F, 1.06F)
          curveToRelative(0.303F, 0.283F, 0.778F, 0.267F, 1.06F, -0.036F)
          lineToRelative(3.5F, -3.75F)
          curveToRelative(0.27F, -0.288F, 0.27F, -0.736F, 0.0F, -1.024F)
          lineToRelative(-3.5F, -3.75F)
          curveTo(7.016F, 7.185F, 6.541F, 7.17F, 6.238F, 7.452F)
          close()
          moveToRelative(11.524F, 0.0F)
          curveToRelative(0.303F, 0.282F, 0.319F, 0.757F, 0.036F, 1.06F)
          lineTo(15.476F, 11.0F)
          horizontalLineToRelative(5.774F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-5.774F)
          lineToRelative(2.322F, 2.488F)
          curveToRelative(0.283F, 0.303F, 0.267F, 0.778F, -0.036F, 1.06F)
          curveToRelative(-0.303F, 0.283F, -0.778F, 0.267F, -1.06F, -0.036F)
          lineToRelative(-3.5F, -3.75F)
          curveToRelative(-0.27F, -0.288F, -0.27F, -0.736F, 0.0F, -1.024F)
          lineToRelative(3.5F, -3.75F)
          curveToRelative(0.282F, -0.303F, 0.757F, -0.319F, 1.06F, -0.036F)
          close()        
      }
    }
    return _arrowFitIn24!!
  }

private var _arrowFitIn24: ImageVector? = null
