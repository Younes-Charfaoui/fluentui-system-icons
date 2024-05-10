package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineDownLeft16: ImageVector
  get() {
    if (_arrowOutlineDownLeft16 != null) {
      return _arrowOutlineDownLeft16!!
    }
    _arrowOutlineDownLeft16 = fluentIcon(name = "Filled.ArrowOutlineDownLeft16", 16f) {
      materialPath {
          moveTo(11.151F, 1.44F)
          curveToRelative(-0.586F, -0.586F, -1.535F, -0.586F, -2.121F, 0.0F)
          lineTo(5.004F, 5.464F)
          lineTo(3.907F, 4.368F)
          curveToRelative(-0.75F, -0.75F, -2.033F, -0.285F, -2.13F, 0.77F)
          lineToRelative(-0.772F, 8.5F)
          curveToRelative(-0.07F, 0.777F, 0.58F, 1.429F, 1.358F, 1.358F)
          lineToRelative(8.499F, -0.773F)
          curveToRelative(1.055F, -0.096F, 1.52F, -1.379F, 0.77F, -2.128F)
          lineToRelative(-1.098F, -1.099F)
          lineTo(14.56F, 6.97F)
          curveToRelative(0.586F, -0.586F, 0.586F, -1.535F, 0.0F, -2.121F)
          lineToRelative(-3.409F, -3.41F)
          close()        
      }
    }
    return _arrowOutlineDownLeft16!!
  }

private var _arrowOutlineDownLeft16: ImageVector? = null
