package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PreviousFrame20: ImageVector
  get() {
    if (_previousFrame20 != null) {
      return _previousFrame20!!
    }
    _previousFrame20 = fluentIcon(name = "Regular.PreviousFrame20", 20f) {
      materialPath {
          moveTo(15.5F, 3.0F)
          curveTo(15.224F, 3.0F, 15.0F, 3.224F, 15.0F, 3.5F)
          verticalLineToRelative(13.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-13.0F)
          curveTo(16.0F, 3.224F, 15.776F, 3.0F, 15.5F, 3.0F)
          close()
          moveToRelative(-5.447F, 0.214F)
          curveTo(10.883F, 2.657F, 12.0F, 3.252F, 12.0F, 4.252F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.004F, -1.124F, 1.598F, -1.954F, 1.033F)
          lineToRelative(-8.499F, -5.793F)
          curveToRelative(-0.731F, -0.498F, -0.727F, -1.577F, 0.007F, -2.07F)
          lineToRelative(8.5F, -5.708F)
          close()
          moveTo(11.0F, 4.252F)
          curveToRelative(0.0F, -0.2F, -0.223F, -0.319F, -0.39F, -0.207F)
          lineTo(2.113F, 9.752F)
          curveTo(1.965F, 9.85F, 1.964F, 10.066F, 2.11F, 10.166F)
          lineToRelative(8.5F, 5.793F)
          curveToRelative(0.165F, 0.113F, 0.39F, -0.006F, 0.39F, -0.207F)
          verticalLineToRelative(-11.5F)
          close()        
      }
    }
    return _previousFrame20!!
  }

private var _previousFrame20: ImageVector? = null
