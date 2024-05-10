package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ProhibitedMultiple20: ImageVector
  get() {
    if (_prohibitedMultiple20 != null) {
      return _prohibitedMultiple20!!
    }
    _prohibitedMultiple20 = fluentIcon(name = "Filled.ProhibitedMultiple20", 20f) {
      materialPath {
          moveTo(5.11F, 5.11F)
          curveToRelative(1.969F, -1.967F, 5.057F, -2.132F, 7.213F, -0.494F)
          lineToRelative(-7.707F, 7.707F)
          curveTo(2.978F, 10.167F, 3.143F, 7.079F, 5.111F, 5.11F)
          close()
          moveToRelative(0.567F, 8.274F)
          lineToRelative(7.707F, -7.707F)
          curveToRelative(1.638F, 2.156F, 1.473F, 5.244F, -0.495F, 7.212F)
          reflectiveCurveToRelative(-5.056F, 2.133F, -7.212F, 0.495F)
          close()
          moveTo(13.95F, 4.05F)
          curveToRelative(-2.734F, -2.733F, -7.166F, -2.733F, -9.9F, 0.0F)
          curveToRelative(-2.733F, 2.734F, -2.733F, 7.166F, 0.0F, 9.9F)
          curveToRelative(2.734F, 2.733F, 7.166F, 2.733F, 9.9F, 0.0F)
          curveToRelative(2.733F, -2.734F, 2.733F, -7.166F, 0.0F, -9.9F)
          close()
          moveTo(17.0F, 9.0F)
          curveToRelative(0.0F, 4.418F, -3.582F, 8.0F, -8.0F, 8.0F)
          curveToRelative(-0.607F, 0.0F, -1.197F, -0.068F, -1.765F, -0.195F)
          curveToRelative(1.033F, 0.6F, 2.234F, 0.945F, 3.515F, 0.945F)
          curveToRelative(3.866F, 0.0F, 7.0F, -3.134F, 7.0F, -7.0F)
          curveToRelative(0.0F, -1.281F, -0.344F, -2.482F, -0.945F, -3.516F)
          curveTo(16.933F, 7.802F, 17.0F, 8.394F, 17.0F, 9.0F)
          close()        
      }
    }
    return _prohibitedMultiple20!!
  }

private var _prohibitedMultiple20: ImageVector? = null
