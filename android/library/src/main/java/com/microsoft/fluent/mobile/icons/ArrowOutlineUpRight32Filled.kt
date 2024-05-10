package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineUpRight32: ImageVector
  get() {
    if (_arrowOutlineUpRight32 != null) {
      return _arrowOutlineUpRight32!!
    }
    _arrowOutlineUpRight32 = fluentIcon(name = "Filled.ArrowOutlineUpRight32", 32f) {
      materialPath {
          moveTo(9.969F, 29.125F)
          curveToRelative(1.171F, 1.171F, 3.07F, 1.171F, 4.242F, 0.0F)
          lineToRelative(6.904F, -6.904F)
          lineToRelative(1.749F, 1.75F)
          curveToRelative(2.122F, 2.12F, 5.755F, 0.763F, 5.966F, -2.23F)
          lineToRelative(1.167F, -16.53F)
          curveToRelative(0.128F, -1.82F, -1.384F, -3.332F, -3.204F, -3.203F)
          lineTo(10.26F, 3.175F)
          curveTo(7.266F, 3.387F, 5.91F, 7.02F, 8.032F, 9.142F)
          lineTo(9.78F, 10.89F)
          lineToRelative(-6.9F, 6.902F)
          curveToRelative(-1.172F, 1.171F, -1.172F, 3.071F, 0.0F, 4.243F)
          lineToRelative(7.09F, 7.09F)
          close()        
      }
    }
    return _arrowOutlineUpRight32!!
  }

private var _arrowOutlineUpRight32: ImageVector? = null
