package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TriangleDown24: ImageVector
  get() {
    if (_triangleDown24 != null) {
      return _triangleDown24!!
    }
    _triangleDown24 = fluentIcon(name = "Regular.TriangleDown24", 24f) {
      materialPath {
          moveTo(2.302F, 6.37F)
          curveTo(1.442F, 4.87F, 2.524F, 3.0F, 4.253F, 3.0F)
          horizontalLineToRelative(15.49F)
          curveToRelative(1.729F, 0.0F, 2.812F, 1.87F, 1.951F, 3.37F)
          lineTo(13.95F, 19.872F)
          curveToRelative(-0.865F, 1.507F, -3.04F, 1.507F, -3.904F, 0.0F)
          lineTo(2.302F, 6.37F)
          close()
          moveTo(4.253F, 4.5F)
          curveToRelative(-0.576F, 0.0F, -0.937F, 0.623F, -0.65F, 1.123F)
          lineToRelative(7.744F, 13.502F)
          curveToRelative(0.289F, 0.503F, 1.013F, 0.503F, 1.301F, 0.0F)
          lineToRelative(7.745F, -13.502F)
          curveToRelative(0.287F, -0.5F, -0.074F, -1.123F, -0.65F, -1.123F)
          horizontalLineTo(4.252F)
          close()        
      }
    }
    return _triangleDown24!!
  }

private var _triangleDown24: ImageVector? = null
