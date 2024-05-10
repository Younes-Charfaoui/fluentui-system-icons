package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowFit24: ImageVector
  get() {
    if (_arrowFit24 != null) {
      return _arrowFit24!!
    }
    _arrowFit24 = fluentIcon(name = "Regular.ArrowFit24", 24f) {
      materialPath {
          moveTo(6.762F, 7.452F)
          curveToRelative(0.303F, 0.282F, 0.319F, 0.757F, 0.036F, 1.06F)
          lineTo(4.476F, 11.0F)
          horizontalLineToRelative(5.774F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(4.476F)
          lineToRelative(2.322F, 2.488F)
          curveToRelative(0.283F, 0.303F, 0.266F, 0.778F, -0.036F, 1.06F)
          curveToRelative(-0.303F, 0.283F, -0.778F, 0.267F, -1.06F, -0.036F)
          lineToRelative(-3.5F, -3.75F)
          curveToRelative(-0.27F, -0.288F, -0.27F, -0.736F, 0.0F, -1.024F)
          lineToRelative(3.5F, -3.75F)
          curveToRelative(0.282F, -0.303F, 0.757F, -0.319F, 1.06F, -0.036F)
          close()
          moveToRelative(10.476F, 0.0F)
          curveToRelative(-0.303F, 0.282F, -0.319F, 0.757F, -0.036F, 1.06F)
          lineTo(19.524F, 11.0F)
          horizontalLineTo(13.75F)
          curveTo(13.336F, 11.0F, 13.0F, 11.336F, 13.0F, 11.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(5.774F)
          lineToRelative(-2.322F, 2.488F)
          curveToRelative(-0.283F, 0.303F, -0.267F, 0.778F, 0.036F, 1.06F)
          curveToRelative(0.303F, 0.283F, 0.778F, 0.267F, 1.06F, -0.036F)
          lineToRelative(3.5F, -3.75F)
          curveToRelative(0.27F, -0.288F, 0.27F, -0.736F, 0.0F, -1.024F)
          lineToRelative(-3.5F, -3.75F)
          curveToRelative(-0.282F, -0.303F, -0.757F, -0.319F, -1.06F, -0.036F)
          close()        
      }
    }
    return _arrowFit24!!
  }

private var _arrowFit24: ImageVector? = null
