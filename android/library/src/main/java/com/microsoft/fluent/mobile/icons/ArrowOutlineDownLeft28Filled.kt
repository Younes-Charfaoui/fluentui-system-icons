package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineDownLeft28: ImageVector
  get() {
    if (_arrowOutlineDownLeft28 != null) {
      return _arrowOutlineDownLeft28!!
    }
    _arrowOutlineDownLeft28 = fluentIcon(name = "Filled.ArrowOutlineDownLeft28", 28f) {
      materialPath {
          moveTo(18.544F, 2.659F)
          curveToRelative(-0.879F, -0.879F, -2.303F, -0.879F, -3.182F, 0.0F)
          lineTo(8.76F, 9.262F)
          lineToRelative(-1.6F, -1.6F)
          curveTo(5.81F, 6.313F, 3.5F, 7.149F, 3.328F, 9.049F)
          lineTo(2.01F, 23.546F)
          curveToRelative(-0.128F, 1.4F, 1.045F, 2.572F, 2.444F, 2.445F)
          lineToRelative(14.5F, -1.318F)
          curveToRelative(1.9F, -0.173F, 2.736F, -2.483F, 1.387F, -3.832F)
          lineToRelative(-1.602F, -1.601F)
          lineToRelative(6.602F, -6.602F)
          curveToRelative(0.879F, -0.879F, 0.879F, -2.303F, 0.0F, -3.182F)
          lineTo(18.544F, 2.66F)
          close()        
      }
    }
    return _arrowOutlineDownLeft28!!
  }

private var _arrowOutlineDownLeft28: ImageVector? = null
