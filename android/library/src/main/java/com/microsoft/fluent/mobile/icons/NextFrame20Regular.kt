package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NextFrame20: ImageVector
  get() {
    if (_nextFrame20 != null) {
      return _nextFrame20!!
    }
    _nextFrame20 = fluentIcon(name = "Regular.NextFrame20", 20f) {
      materialPath {
          moveTo(4.5F, 3.0F)
          curveTo(4.776F, 3.0F, 5.0F, 3.224F, 5.0F, 3.5F)
          verticalLineToRelative(13.0F)
          curveTo(5.0F, 16.776F, 4.776F, 17.0F, 4.5F, 17.0F)
          reflectiveCurveTo(4.0F, 16.776F, 4.0F, 16.5F)
          verticalLineToRelative(-13.0F)
          curveTo(4.0F, 3.224F, 4.224F, 3.0F, 4.5F, 3.0F)
          close()
          moveToRelative(5.447F, 0.214F)
          curveTo(9.117F, 2.657F, 8.0F, 3.252F, 8.0F, 4.252F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.004F, 1.124F, 1.598F, 1.954F, 1.033F)
          lineToRelative(8.5F, -5.793F)
          curveToRelative(0.73F, -0.498F, 0.727F, -1.577F, -0.008F, -2.07F)
          lineToRelative(-8.5F, -5.708F)
          close()
          moveTo(9.0F, 4.252F)
          curveToRelative(0.0F, -0.2F, 0.223F, -0.319F, 0.39F, -0.207F)
          lineToRelative(8.499F, 5.707F)
          curveToRelative(0.146F, 0.098F, 0.147F, 0.314F, 0.001F, 0.414F)
          lineToRelative(-8.5F, 5.793F)
          curveTo(9.226F, 16.072F, 9.0F, 15.953F, 9.0F, 15.752F)
          verticalLineToRelative(-11.5F)
          close()        
      }
    }
    return _nextFrame20!!
  }

private var _nextFrame20: ImageVector? = null
