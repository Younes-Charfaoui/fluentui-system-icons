package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Prohibited28: ImageVector
  get() {
    if (_prohibited28 != null) {
      return _prohibited28!!
    }
    _prohibited28 = fluentIcon(name = "Filled.Prohibited28", 28f) {
      materialPath {
          moveTo(20.329F, 6.257F)
          curveToRelative(-3.928F, -3.219F, -9.734F, -2.995F, -13.4F, 0.672F)
          curveToRelative(-3.667F, 3.666F, -3.89F, 9.472F, -0.672F, 13.4F)
          lineTo(20.329F, 6.257F)
          close()
          moveToRelative(1.414F, 1.414F)
          lineTo(7.671F, 21.743F)
          curveToRelative(3.928F, 3.219F, 9.733F, 2.995F, 13.4F, -0.672F)
          curveToRelative(3.667F, -3.667F, 3.89F, -9.472F, 0.672F, -13.4F)
          close()
          moveTo(5.515F, 5.515F)
          curveToRelative(4.686F, -4.687F, 12.284F, -4.687F, 16.97F, 0.0F)
          curveToRelative(4.687F, 4.686F, 4.687F, 12.284F, 0.0F, 16.97F)
          curveToRelative(-4.686F, 4.687F, -12.284F, 4.687F, -16.97F, 0.0F)
          curveToRelative(-4.687F, -4.686F, -4.687F, -12.284F, 0.0F, -16.97F)
          close()        
      }
    }
    return _prohibited28!!
  }

private var _prohibited28: ImageVector? = null
