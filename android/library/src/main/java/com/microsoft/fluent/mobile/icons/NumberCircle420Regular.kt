package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle420: ImageVector
  get() {
    if (_numberCircle420 != null) {
      return _numberCircle420!!
    }
    _numberCircle420 = fluentIcon(name = "Regular.NumberCircle420", 420f) {
      materialPath {
          moveTo(3.0F, 10.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          reflectiveCurveToRelative(-3.134F, 7.0F, -7.0F, 7.0F)
          reflectiveCurveToRelative(-7.0F, -3.134F, -7.0F, -7.0F)
          close()
          moveToRelative(7.0F, -8.0F)
          curveToRelative(-4.418F, 0.0F, -8.0F, 3.582F, -8.0F, 8.0F)
          reflectiveCurveToRelative(3.582F, 8.0F, 8.0F, 8.0F)
          reflectiveCurveToRelative(8.0F, -3.582F, 8.0F, -8.0F)
          reflectiveCurveToRelative(-3.582F, -8.0F, -8.0F, -8.0F)
          close()
          moveToRelative(1.995F, 4.309F)
          curveToRelative(0.0F, -0.738F, -0.954F, -1.032F, -1.37F, -0.423F)
          lineToRelative(-3.533F, 5.176F)
          curveTo(6.82F, 11.46F, 7.106F, 12.0F, 7.588F, 12.0F)
          horizontalLineToRelative(3.41F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 0.276F, 0.225F, 0.5F, 0.5F, 0.5F)
          curveToRelative(0.277F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(12.0F)
          horizontalLineTo(13.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(13.276F, 11.0F, 13.0F, 11.0F)
          horizontalLineToRelative(-1.003F)
          lineToRelative(-0.002F, -4.691F)
          close()
          moveToRelative(-1.0F, 0.81F)
          lineTo(10.997F, 11.0F)
          horizontalLineTo(8.345F)
          lineToRelative(2.65F, -3.882F)
          close()        
      }
    }
    return _numberCircle420!!
  }

private var _numberCircle420: ImageVector? = null
