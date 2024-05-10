package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Prohibited48: ImageVector
  get() {
    if (_prohibited48 != null) {
      return _prohibited48!!
    }
    _prohibited48 = fluentIcon(name = "Regular.Prohibited48", 48f) {
      materialPath {
          moveTo(35.46F, 10.773F)
          curveToRelative(-6.876F, -5.969F, -17.297F, -5.684F, -23.834F, 0.853F)
          curveToRelative(-6.537F, 6.537F, -6.822F, 16.959F, -0.853F, 23.833F)
          lineToRelative(24.686F, -24.686F)
          close()
          moveToRelative(1.767F, 1.768F)
          lineTo(12.541F, 37.227F)
          curveToRelative(6.875F, 5.969F, 17.296F, 5.684F, 23.833F, -0.853F)
          curveToRelative(6.537F, -6.537F, 6.822F, -16.959F, 0.853F, -23.833F)
          close()
          moveTo(9.857F, 9.858F)
          curveToRelative(7.811F, -7.81F, 20.475F, -7.81F, 28.285F, 0.0F)
          curveToRelative(7.81F, 7.81F, 7.81F, 20.474F, 0.0F, 28.284F)
          curveToRelative(-7.81F, 7.81F, -20.474F, 7.81F, -28.284F, 0.0F)
          curveToRelative(-7.81F, -7.81F, -7.81F, -20.474F, 0.0F, -28.284F)
          close()        
      }
    }
    return _prohibited48!!
  }

private var _prohibited48: ImageVector? = null
