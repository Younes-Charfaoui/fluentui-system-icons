package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineDownLeft32: ImageVector
  get() {
    if (_arrowOutlineDownLeft32 != null) {
      return _arrowOutlineDownLeft32!!
    }
    _arrowOutlineDownLeft32 = fluentIcon(name = "Filled.ArrowOutlineDownLeft32", 32f) {
      materialPath {
          moveTo(22.036F, 2.879F)
          curveToRelative(-1.172F, -1.172F, -3.071F, -1.172F, -4.243F, 0.0F)
          lineTo(10.89F, 9.782F)
          lineTo(9.14F, 8.033F)
          curveTo(7.02F, 5.912F, 3.386F, 7.27F, 3.175F, 10.262F)
          lineToRelative(-1.167F, 16.53F)
          curveToRelative(-0.129F, 1.82F, 1.384F, 3.332F, 3.204F, 3.204F)
          lineToRelative(16.533F, -1.168F)
          curveToRelative(2.993F, -0.212F, 4.35F, -3.845F, 2.228F, -5.967F)
          lineToRelative(-1.75F, -1.748F)
          lineToRelative(6.903F, -6.902F)
          curveToRelative(1.171F, -1.171F, 1.171F, -3.07F, 0.0F, -4.242F)
          lineToRelative(-7.09F, -7.09F)
          close()        
      }
    }
    return _arrowOutlineDownLeft32!!
  }

private var _arrowOutlineDownLeft32: ImageVector? = null
