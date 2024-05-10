package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Attach32: ImageVector
  get() {
    if (_attach32 != null) {
      return _attach32!!
    }
    _attach32 = fluentIcon(name = "Regular.Attach32", 32f) {
      materialPath {
          moveTo(16.223F, 4.364F)
          curveToRelative(3.152F, -3.152F, 8.262F, -3.152F, 11.414F, 0.0F)
          curveToRelative(3.152F, 3.152F, 3.152F, 8.262F, 0.0F, 11.414F)
          lineToRelative(-12.79F, 12.79F)
          curveToRelative(-1.91F, 1.909F, -5.005F, 1.909F, -6.914F, 0.0F)
          curveToRelative(-1.91F, -1.91F, -1.91F, -5.006F, 0.0F, -6.915F)
          lineToRelative(11.36F, -11.36F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.024F, 0.0F, 1.414F)
          lineToRelative(-11.36F, 11.36F)
          curveToRelative(-1.128F, 1.128F, -1.128F, 2.958F, 0.0F, 4.086F)
          curveToRelative(1.128F, 1.128F, 2.958F, 1.128F, 4.086F, 0.0F)
          lineToRelative(12.79F, -12.79F)
          curveToRelative(2.37F, -2.37F, 2.37F, -6.214F, 0.0F, -8.585F)
          curveToRelative(-2.371F, -2.37F, -6.215F, -2.37F, -8.586F, 0.0F)
          lineToRelative(-13.93F, 13.93F)
          curveToRelative(-0.39F, 0.39F, -1.024F, 0.39F, -1.414F, 0.0F)
          curveToRelative(-0.39F, -0.39F, -0.39F, -1.023F, 0.0F, -1.414F)
          lineToRelative(13.93F, -13.93F)
          close()        
      }
    }
    return _attach32!!
  }

private var _attach32: ImageVector? = null
