package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Prohibited24: ImageVector
  get() {
    if (_prohibited24 != null) {
      return _prohibited24!!
    }
    _prohibited24 = fluentIcon(name = "Filled.Prohibited24", 24f) {
      materialPath {
          moveTo(16.906F, 5.68F)
          curveTo(13.768F, 3.237F, 9.228F, 3.458F, 6.343F, 6.343F)
          curveTo(3.458F, 9.228F, 3.237F, 13.768F, 5.68F, 16.906F)
          lineTo(16.906F, 5.68F)
          close()
          moveToRelative(1.414F, 1.414F)
          lineTo(7.094F, 18.32F)
          curveToRelative(3.138F, 2.443F, 7.678F, 2.222F, 10.563F, -0.663F)
          curveToRelative(2.885F, -2.885F, 3.106F, -7.425F, 0.663F, -10.563F)
          close()
          moveTo(4.93F, 4.929F)
          curveToRelative(3.905F, -3.905F, 10.237F, -3.905F, 14.142F, 0.0F)
          curveToRelative(3.905F, 3.905F, 3.905F, 10.237F, 0.0F, 14.142F)
          curveToRelative(-3.905F, 3.905F, -10.237F, 3.905F, -14.142F, 0.0F)
          curveToRelative(-3.905F, -3.905F, -3.905F, -10.237F, 0.0F, -14.142F)
          close()        
      }
    }
    return _prohibited24!!
  }

private var _prohibited24: ImageVector? = null
