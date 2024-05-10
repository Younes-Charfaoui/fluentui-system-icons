package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.NumberCircle116: ImageVector
  get() {
    if (_numberCircle116 != null) {
      return _numberCircle116!!
    }
    _numberCircle116 = fluentIcon(name = "Filled.NumberCircle116", 116f) {
      materialPath {
          moveTo(8.0F, 1.0F)
          curveTo(4.134F, 1.0F, 1.0F, 4.134F, 1.0F, 8.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          reflectiveCurveToRelative(7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          close()
          moveToRelative(1.0F, 4.25F)
          verticalLineToRelative(5.25F)
          curveTo(9.0F, 10.776F, 8.776F, 11.0F, 8.5F, 11.0F)
          reflectiveCurveTo(8.0F, 10.776F, 8.0F, 10.5F)
          verticalLineTo(6.986F)
          curveTo(7.727F, 7.255F, 7.384F, 7.51F, 6.957F, 7.706F)
          curveToRelative(-0.252F, 0.113F, -0.548F, 0.002F, -0.662F, -0.25F)
          curveTo(6.18F, 7.207F, 6.292F, 6.91F, 6.543F, 6.796F)
          curveToRelative(0.574F, -0.261F, 0.944F, -0.68F, 1.174F, -1.046F)
          curveToRelative(0.115F, -0.182F, 0.192F, -0.346F, 0.24F, -0.463F)
          curveToRelative(0.024F, -0.059F, 0.04F, -0.104F, 0.05F, -0.134F)
          lineToRelative(0.01F, -0.03F)
          verticalLineTo(5.115F)
          curveToRelative(0.067F, -0.24F, 0.297F, -0.39F, 0.537F, -0.363F)
          curveTo(8.804F, 4.78F, 9.0F, 4.993F, 9.0F, 5.25F)
          close()        
      }
    }
    return _numberCircle116!!
  }

private var _numberCircle116: ImageVector? = null
