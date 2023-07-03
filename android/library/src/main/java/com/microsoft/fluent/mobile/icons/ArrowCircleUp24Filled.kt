package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowCircleUp24: ImageVector
  get() {
    if (_arrowCircleUp24 != null) {
      return _arrowCircleUp24!!
    }
    _arrowCircleUp24 = fluentIcon(name = "Filled.ArrowCircleUp24", 24f) {
      materialPath {
          moveTo(22.001F, 12.0F)
          curveToRelative(0.0F, -5.523F, -4.477F, -10.0F, -10.0F, -10.0F)
          reflectiveCurveToRelative(-10.0F, 4.477F, -10.0F, 10.0F)
          reflectiveCurveToRelative(4.477F, 10.0F, 10.0F, 10.0F)
          reflectiveCurveToRelative(10.0F, -4.477F, 10.0F, -10.0F)
          close()
          moveToRelative(-14.53F, 0.28F)
          curveToRelative(-0.267F, -0.266F, -0.291F, -0.683F, -0.073F, -0.976F)
          lineToRelative(0.072F, -0.085F)
          lineToRelative(4.001F, -4.0F)
          curveToRelative(0.266F, -0.267F, 0.683F, -0.29F, 0.977F, -0.073F)
          lineToRelative(0.084F, 0.073F)
          lineToRelative(4.0F, 4.001F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.768F, 0.0F, 1.06F)
          curveToRelative(-0.267F, 0.267F, -0.683F, 0.291F, -0.977F, 0.073F)
          lineToRelative(-0.084F, -0.072F)
          lineToRelative(-2.72F, -2.722F)
          verticalLineToRelative(6.691F)
          curveToRelative(0.0F, 0.38F, -0.282F, 0.694F, -0.649F, 0.744F)
          lineTo(12.001F, 17.0F)
          curveToRelative(-0.38F, 0.0F, -0.694F, -0.282F, -0.743F, -0.648F)
          lineTo(11.25F, 16.25F)
          verticalLineTo(9.56F)
          lineToRelative(-2.72F, 2.72F)
          curveToRelative(-0.266F, 0.266F, -0.683F, 0.29F, -0.977F, 0.073F)
          lineTo(7.47F, 12.28F)
          close()        
      }
    }
    return _arrowCircleUp24!!
  }

private var _arrowCircleUp24: ImageVector? = null
