package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TriangleDown24: ImageVector
  get() {
    if (_triangleDown24 != null) {
      return _triangleDown24!!
    }
    _triangleDown24 = fluentIcon(name = "Filled.TriangleDown24", 24f) {
      materialPath {
          moveTo(4.253F, 3.0F)
          curveTo(2.524F, 3.0F, 1.441F, 4.87F, 2.302F, 6.37F)
          lineToRelative(7.744F, 13.502F)
          curveToRelative(0.865F, 1.507F, 3.039F, 1.507F, 3.904F, 0.0F)
          lineTo(21.694F, 6.37F)
          curveTo(22.554F, 4.87F, 21.472F, 3.0F, 19.742F, 3.0F)
          horizontalLineTo(4.253F)
          close()        
      }
    }
    return _triangleDown24!!
  }

private var _triangleDown24: ImageVector? = null
