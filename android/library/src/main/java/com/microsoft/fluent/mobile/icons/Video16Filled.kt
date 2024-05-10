package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Video16: ImageVector
  get() {
    if (_video16 != null) {
      return _video16!!
    }
    _video16 = fluentIcon(name = "Filled.Video16", 16f) {
      materialPath {
          moveTo(1.0F, 5.5F)
          curveTo(1.0F, 4.12F, 2.12F, 3.0F, 3.5F, 3.0F)
          horizontalLineToRelative(4.0F)
          curveTo(8.88F, 3.0F, 10.0F, 4.12F, 10.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-4.0F)
          curveTo(2.12F, 13.0F, 1.0F, 11.88F, 1.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(12.036F, 6.278F)
          lineTo(10.9F, 10.304F)
          curveToRelative(0.013F, -0.093F, 0.02F, -0.187F, 0.02F, -0.283F)
          verticalLineToRelative(-4.04F)
          curveToRelative(0.0F, -0.096F, -0.007F, -0.19F, -0.02F, -0.283F)
          lineToRelative(2.136F, -1.475F)
          curveToRelative(0.829F, -0.572F, 1.96F, 0.022F, 1.96F, 1.03F)
          verticalLineToRelative(5.497F)
          curveToRelative(0.0F, 1.007F, -1.131F, 1.6F, -1.96F, 1.028F)
          close()        
      }
    }
    return _video16!!
  }

private var _video16: ImageVector? = null
