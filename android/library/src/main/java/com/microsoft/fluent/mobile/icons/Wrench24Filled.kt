package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Wrench24: ImageVector
  get() {
    if (_wrench24 != null) {
      return _wrench24!!
    }
    _wrench24 = fluentIcon(name = "Filled.Wrench24", 24f) {
      materialPath {
          moveTo(16.5F, 2.0F)
          curveTo(13.463F, 2.0F, 11.0F, 4.462F, 11.0F, 7.5F)
          curveToRelative(0.0F, 0.443F, 0.053F, 0.875F, 0.152F, 1.289F)
          lineTo(2.841F, 17.1F)
          curveToRelative(-1.121F, 1.122F, -1.121F, 2.94F, 0.0F, 4.06F)
          curveToRelative(1.121F, 1.122F, 2.94F, 1.122F, 4.06F, 0.0F)
          lineToRelative(8.313F, -8.311F)
          curveTo(15.627F, 12.948F, 16.058F, 13.0F, 16.5F, 13.0F)
          curveToRelative(3.038F, 0.0F, 5.5F, -2.462F, 5.5F, -5.5F)
          curveToRelative(0.0F, -0.609F, -0.099F, -1.196F, -0.282F, -1.745F)
          curveToRelative(-0.083F, -0.246F, -0.287F, -0.433F, -0.54F, -0.492F)
          curveToRelative(-0.253F, -0.06F, -0.518F, 0.016F, -0.702F, 0.2F)
          lineToRelative(-2.444F, 2.444F)
          curveToRelative(-0.293F, 0.293F, -0.768F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-0.879F, -0.878F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(2.445F, -2.445F)
          curveToRelative(0.183F, -0.183F, 0.259F, -0.45F, 0.2F, -0.702F)
          curveToRelative(-0.06F, -0.253F, -0.247F, -0.457F, -0.493F, -0.54F)
          curveTo(17.695F, 2.1F, 17.109F, 2.0F, 16.5F, 2.0F)
          close()        
      }
    }
    return _wrench24!!
  }

private var _wrench24: ImageVector? = null
