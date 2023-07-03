package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ImageMultiple20: ImageVector
  get() {
    if (_imageMultiple20 != null) {
      return _imageMultiple20!!
    }
    _imageMultiple20 = fluentIcon(name = "Filled.ImageMultiple20", 20f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 0.648F, 0.205F, 1.248F, 0.555F, 1.738F)
          lineToRelative(4.03F, -4.03F)
          curveToRelative(0.782F, -0.782F, 2.048F, -0.782F, 2.83F, 0.0F)
          lineToRelative(4.03F, 4.03F)
          curveTo(14.795F, 13.248F, 15.0F, 12.648F, 15.0F, 12.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(6.5F, 3.5F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          reflectiveCurveToRelative(0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          close()
          moveToRelative(1.238F, 7.945F)
          lineToRelative(-4.03F, -4.03F)
          curveToRelative(-0.391F, -0.391F, -1.025F, -0.391F, -1.415F, 0.0F)
          lineToRelative(-4.031F, 4.03F)
          curveTo(4.752F, 14.795F, 5.352F, 15.0F, 6.0F, 15.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.648F, 0.0F, 1.248F, -0.205F, 1.738F, -0.555F)
          close()
          moveTo(5.764F, 16.0F)
          curveToRelative(0.55F, 0.614F, 1.348F, 1.0F, 2.236F, 1.0F)
          horizontalLineToRelative(4.5F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, -0.888F, -0.386F, -1.687F, -1.0F, -2.236F)
          verticalLineTo(12.5F)
          curveToRelative(0.0F, 0.12F, -0.006F, 0.24F, -0.018F, 0.358F)
          curveTo(15.802F, 14.623F, 14.312F, 16.0F, 12.5F, 16.0F)
          horizontalLineTo(5.764F)
          close()        
      }
    }
    return _imageMultiple20!!
  }

private var _imageMultiple20: ImageVector? = null
