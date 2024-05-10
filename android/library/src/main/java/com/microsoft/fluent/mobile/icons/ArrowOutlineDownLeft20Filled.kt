package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineDownLeft20: ImageVector
  get() {
    if (_arrowOutlineDownLeft20 != null) {
      return _arrowOutlineDownLeft20!!
    }
    _arrowOutlineDownLeft20 = fluentIcon(name = "Filled.ArrowOutlineDownLeft20", 20f) {
      materialPath {
          moveTo(3.666F, 17.99F)
          curveToRelative(-0.955F, 0.106F, -1.763F, -0.701F, -1.657F, -1.657F)
          lineTo(3.088F, 6.63F)
          curveTo(3.227F, 5.38F, 4.75F, 4.846F, 5.639F, 5.735F)
          lineToRelative(1.067F, 1.067F)
          lineTo(11.07F, 2.44F)
          curveToRelative(0.586F, -0.585F, 1.536F, -0.585F, 2.122F, 0.0F)
          lineToRelative(4.37F, 4.37F)
          curveToRelative(0.585F, 0.586F, 0.585F, 1.535F, 0.0F, 2.121F)
          lineToRelative(-4.364F, 4.363F)
          lineToRelative(1.068F, 1.067F)
          curveToRelative(0.889F, 0.89F, 0.354F, 2.413F, -0.896F, 2.552F)
          lineTo(3.666F, 17.99F)
          close()        
      }
    }
    return _arrowOutlineDownLeft20!!
  }

private var _arrowOutlineDownLeft20: ImageVector? = null
