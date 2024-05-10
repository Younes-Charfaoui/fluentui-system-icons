package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Emoji20: ImageVector
  get() {
    if (_emoji20 != null) {
      return _emoji20!!
    }
    _emoji20 = fluentIcon(name = "Filled.Emoji20", 20f) {
      materialPath {
          moveTo(18.0F, 10.0F)
          curveToRelative(0.0F, -4.418F, -3.582F, -8.0F, -8.0F, -8.0F)
          reflectiveCurveToRelative(-8.0F, 3.582F, -8.0F, 8.0F)
          reflectiveCurveToRelative(3.582F, 8.0F, 8.0F, 8.0F)
          reflectiveCurveToRelative(8.0F, -3.582F, 8.0F, -8.0F)
          close()
          moveToRelative(-6.5F, -1.5F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          close()
          moveToRelative(-5.0F, 0.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          reflectiveCurveToRelative(1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.448F, 1.0F, -1.0F, 1.0F)
          reflectiveCurveToRelative(-1.0F, -0.448F, -1.0F, -1.0F)
          close()
          moveToRelative(0.389F, 4.015F)
          curveTo(7.623F, 13.422F, 8.744F, 14.0F, 10.0F, 14.0F)
          curveToRelative(1.256F, 0.0F, 2.377F, -0.578F, 3.111F, -1.485F)
          curveToRelative(0.174F, -0.215F, 0.489F, -0.248F, 0.704F, -0.075F)
          curveToRelative(0.214F, 0.174F, 0.247F, 0.489F, 0.074F, 0.704F)
          curveTo(12.973F, 14.275F, 11.57F, 15.0F, 10.0F, 15.0F)
          curveToRelative(-1.57F, 0.0F, -2.973F, -0.725F, -3.889F, -1.856F)
          curveToRelative(-0.173F, -0.215F, -0.14F, -0.53F, 0.075F, -0.704F)
          curveToRelative(0.214F, -0.173F, 0.529F, -0.14F, 0.703F, 0.075F)
          close()        
      }
    }
    return _emoji20!!
  }

private var _emoji20: ImageVector? = null
