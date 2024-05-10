package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Triangle24: ImageVector
  get() {
    if (_triangle24 != null) {
      return _triangle24!!
    }
    _triangle24 = fluentIcon(name = "Regular.Triangle24", 24f) {
      materialPath {
          moveTo(2.302F, 16.63F)
          curveTo(1.442F, 18.13F, 2.524F, 20.0F, 4.253F, 20.0F)
          horizontalLineToRelative(15.49F)
          curveToRelative(1.729F, 0.0F, 2.812F, -1.87F, 1.951F, -3.37F)
          lineTo(13.95F, 3.129F)
          curveToRelative(-0.865F, -1.507F, -3.04F, -1.507F, -3.904F, 0.0F)
          lineTo(2.302F, 16.631F)
          close()
          moveToRelative(1.951F, 1.87F)
          curveToRelative(-0.576F, 0.0F, -0.937F, -0.623F, -0.65F, -1.123F)
          lineToRelative(7.744F, -13.502F)
          curveToRelative(0.289F, -0.503F, 1.013F, -0.503F, 1.301F, 0.0F)
          lineToRelative(7.745F, 13.502F)
          curveToRelative(0.287F, 0.5F, -0.074F, 1.123F, -0.65F, 1.123F)
          horizontalLineTo(4.252F)
          close()        
      }
    }
    return _triangle24!!
  }

private var _triangle24: ImageVector? = null
