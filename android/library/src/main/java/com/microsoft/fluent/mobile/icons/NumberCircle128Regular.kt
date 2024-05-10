package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle128: ImageVector
  get() {
    if (_numberCircle128 != null) {
      return _numberCircle128!!
    }
    _numberCircle128 = fluentIcon(name = "Regular.NumberCircle128", 128f) {
      materialPath {
          moveTo(3.5F, 14.0F)
          curveTo(3.5F, 8.201F, 8.201F, 3.5F, 14.0F, 3.5F)
          reflectiveCurveTo(24.5F, 8.201F, 24.5F, 14.0F)
          reflectiveCurveTo(19.799F, 24.5F, 14.0F, 24.5F)
          reflectiveCurveTo(3.5F, 19.799F, 3.5F, 14.0F)
          close()
          moveTo(14.0F, 2.0F)
          curveTo(7.373F, 2.0F, 2.0F, 7.373F, 2.0F, 14.0F)
          reflectiveCurveToRelative(5.373F, 12.0F, 12.0F, 12.0F)
          reflectiveCurveToRelative(12.0F, -5.373F, 12.0F, -12.0F)
          reflectiveCurveTo(20.627F, 2.0F, 14.0F, 2.0F)
          close()
          moveToRelative(1.5F, 6.25F)
          curveToRelative(0.0F, -0.376F, -0.279F, -0.694F, -0.651F, -0.743F)
          curveToRelative(-0.372F, -0.05F, -0.723F, 0.183F, -0.823F, 0.544F)
          lineToRelative(-0.004F, 0.014F)
          lineTo(14.0F, 8.134F)
          curveToRelative(-0.02F, 0.063F, -0.055F, 0.16F, -0.105F, 0.282F)
          curveToRelative(-0.1F, 0.245F, -0.26F, 0.587F, -0.499F, 0.966F)
          curveToRelative(-0.477F, 0.758F, -1.251F, 1.638F, -2.456F, 2.185F)
          curveToRelative(-0.377F, 0.172F, -0.544F, 0.616F, -0.373F, 0.993F)
          curveToRelative(0.172F, 0.377F, 0.616F, 0.544F, 0.993F, 0.373F)
          curveToRelative(1.064F, -0.484F, 1.857F, -1.165F, 2.44F, -1.846F)
          verticalLineToRelative(8.163F)
          curveToRelative(0.0F, 0.414F, 0.335F, 0.75F, 0.75F, 0.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-11.0F)
          close()
          moveToRelative(-1.474F, -0.199F)
          close()        
      }
    }
    return _numberCircle128!!
  }

private var _numberCircle128: ImageVector? = null
