package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowOutlineDownLeft48: ImageVector
  get() {
    if (_arrowOutlineDownLeft48 != null) {
      return _arrowOutlineDownLeft48!!
    }
    _arrowOutlineDownLeft48 = fluentIcon(name = "Filled.ArrowOutlineDownLeft48", 48f) {
      materialPath {
          moveTo(4.038F, 38.156F)
          curveToRelative(-0.382F, 3.36F, 2.465F, 6.2F, 5.823F, 5.81F)
          lineToRelative(23.386F, -2.721F)
          curveToRelative(3.529F, -0.41F, 5.026F, -4.712F, 2.516F, -7.226F)
          lineToRelative(-2.75F, -2.751F)
          lineToRelative(9.453F, -9.452F)
          curveToRelative(2.048F, -2.049F, 2.05F, -5.37F, 0.003F, -7.421F)
          lineToRelative(-8.833F, -8.85F)
          curveToRelative(-2.05F, -2.052F, -5.376F, -2.054F, -7.427F, -0.003F)
          lineToRelative(-9.465F, 9.46F)
          lineToRelative(-2.843F, -2.787F)
          curveToRelative(-2.526F, -2.477F, -6.797F, -0.963F, -7.198F, 2.553F)
          lineTo(4.038F, 38.157F)
          close()        
      }
    }
    return _arrowOutlineDownLeft48!!
  }

private var _arrowOutlineDownLeft48: ImageVector? = null
