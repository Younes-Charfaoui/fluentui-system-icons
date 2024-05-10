package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Edit12: ImageVector
  get() {
    if (_edit12 != null) {
      return _edit12!!
    }
    _edit12 = fluentIcon(name = "Filled.Edit12", 12f) {
      materialPath {
          moveTo(7.736F, 1.56F)
          curveToRelative(0.748F, -0.747F, 1.96F, -0.747F, 2.707F, 0.0F)
          curveToRelative(0.748F, 0.748F, 0.748F, 1.96F, 0.0F, 2.708F)
          lineTo(10.21F, 4.502F)
          lineTo(7.502F, 1.795F)
          lineTo(7.736F, 1.56F)
          close()
          moveTo(6.795F, 2.503F)
          lineTo(1.65F, 7.646F)
          curveToRelative(-0.07F, 0.07F, -0.117F, 0.159F, -0.136F, 0.255F)
          lineToRelative(-0.504F, 2.5F)
          curveToRelative(-0.033F, 0.164F, 0.018F, 0.334F, 0.136F, 0.452F)
          curveToRelative(0.118F, 0.119F, 0.288F, 0.17F, 0.452F, 0.137F)
          lineToRelative(2.504F, -0.5F)
          curveToRelative(0.097F, -0.019F, 0.186F, -0.067F, 0.255F, -0.136F)
          lineToRelative(5.145F, -5.145F)
          lineToRelative(-2.707F, -2.707F)
          close()        
      }
    }
    return _edit12!!
  }

private var _edit12: ImageVector? = null
