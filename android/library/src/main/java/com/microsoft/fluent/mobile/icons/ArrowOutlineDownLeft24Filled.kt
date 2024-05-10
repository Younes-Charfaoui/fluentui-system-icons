package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineDownLeft24: ImageVector
  get() {
    if (_arrowOutlineDownLeft24 != null) {
      return _arrowOutlineDownLeft24!!
    }
    _arrowOutlineDownLeft24 = fluentIcon(name = "Filled.ArrowOutlineDownLeft24", 24f) {
      materialPath {
          moveTo(4.166F, 21.986F)
          curveToRelative(-1.242F, 0.138F, -2.292F, -0.911F, -2.154F, -2.153F)
          lineTo(3.352F, 7.77F)
          curveToRelative(0.181F, -1.625F, 2.161F, -2.32F, 3.317F, -1.163F)
          lineToRelative(1.268F, 1.267F)
          lineTo(13.24F, 2.57F)
          curveToRelative(0.762F, -0.761F, 1.996F, -0.761F, 2.758F, 0.0F)
          lineTo(21.427F, 8.0F)
          curveToRelative(0.762F, 0.76F, 0.762F, 1.995F, 0.0F, 2.757F)
          lineToRelative(-5.304F, 5.304F)
          lineToRelative(1.268F, 1.267F)
          curveToRelative(1.156F, 1.156F, 0.461F, 3.136F, -1.164F, 3.317F)
          lineToRelative(-12.061F, 1.34F)
          close()        
      }
    }
    return _arrowOutlineDownLeft24!!
  }

private var _arrowOutlineDownLeft24: ImageVector? = null
