package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Prohibited16: ImageVector
  get() {
    if (_prohibited16 != null) {
      return _prohibited16!!
    }
    _prohibited16 = fluentIcon(name = "Filled.Prohibited16", 16f) {
      materialPath {
          moveTo(11.323F, 3.616F)
          curveTo(9.167F, 1.978F, 6.079F, 2.143F, 4.11F, 4.111F)
          reflectiveCurveToRelative(-2.133F, 5.056F, -0.495F, 7.212F)
          lineToRelative(7.707F, -7.707F)
          close()
          moveToRelative(1.06F, 1.061F)
          lineToRelative(-7.706F, 7.707F)
          curveToRelative(2.156F, 1.638F, 5.244F, 1.473F, 7.212F, -0.495F)
          reflectiveCurveToRelative(2.133F, -5.056F, 0.495F, -7.212F)
          close()
          moveTo(3.05F, 3.05F)
          curveToRelative(2.734F, -2.733F, 7.166F, -2.733F, 9.9F, 0.0F)
          curveToRelative(2.733F, 2.734F, 2.733F, 7.166F, 0.0F, 9.9F)
          curveToRelative(-2.734F, 2.733F, -7.166F, 2.733F, -9.9F, 0.0F)
          curveToRelative(-2.733F, -2.734F, -2.733F, -7.166F, 0.0F, -9.9F)
          close()        
      }
    }
    return _prohibited16!!
  }

private var _prohibited16: ImageVector? = null
