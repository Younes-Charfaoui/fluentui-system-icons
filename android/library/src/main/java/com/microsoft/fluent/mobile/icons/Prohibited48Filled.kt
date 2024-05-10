package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Prohibited48: ImageVector
  get() {
    if (_prohibited48 != null) {
      return _prohibited48!!
    }
    _prohibited48 = fluentIcon(name = "Filled.Prohibited48", 48f) {
      materialPath {
          moveTo(34.914F, 10.965F)
          curveToRelative(-6.68F, -5.606F, -16.653F, -5.267F, -22.935F, 1.014F)
          curveToRelative(-6.281F, 6.282F, -6.62F, 16.256F, -1.014F, 22.935F)
          lineToRelative(23.949F, -23.95F)
          close()
          moveToRelative(2.121F, 2.121F)
          lineToRelative(-23.949F, 23.95F)
          curveToRelative(6.68F, 5.605F, 16.653F, 5.266F, 22.935F, -1.015F)
          curveToRelative(6.281F, -6.282F, 6.62F, -16.256F, 1.014F, -22.935F)
          close()
          moveTo(9.858F, 9.858F)
          curveToRelative(7.81F, -7.81F, 20.474F, -7.81F, 28.284F, 0.0F)
          curveToRelative(7.81F, 7.81F, 7.81F, 20.474F, 0.0F, 28.284F)
          curveToRelative(-7.81F, 7.81F, -20.474F, 7.81F, -28.284F, 0.0F)
          curveToRelative(-7.81F, -7.81F, -7.81F, -20.474F, 0.0F, -28.284F)
          close()        
      }
    }
    return _prohibited48!!
  }

private var _prohibited48: ImageVector? = null
