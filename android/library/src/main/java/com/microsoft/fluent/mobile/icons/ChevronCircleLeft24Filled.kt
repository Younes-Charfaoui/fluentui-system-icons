package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronCircleLeft24: ImageVector
  get() {
    if (_chevronCircleLeft24 != null) {
      return _chevronCircleLeft24!!
    }
    _chevronCircleLeft24 = fluentIcon(name = "Filled.ChevronCircleLeft24", 24f) {
      materialPath {
          moveTo(22.0F, 12.0F)
          curveToRelative(0.0F, 5.523F, -4.477F, 10.0F, -10.0F, 10.0F)
          reflectiveCurveTo(2.0F, 17.523F, 2.0F, 12.0F)
          reflectiveCurveTo(6.477F, 2.0F, 12.0F, 2.0F)
          reflectiveCurveToRelative(10.0F, 4.477F, 10.0F, 10.0F)
          close()
          moveToRelative(-7.97F, -4.53F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-4.0F, 4.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(4.0F, 4.0F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(10.56F, 12.0F)
          lineToRelative(3.47F, -3.47F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          close()        
      }
    }
    return _chevronCircleLeft24!!
  }

private var _chevronCircleLeft24: ImageVector? = null
