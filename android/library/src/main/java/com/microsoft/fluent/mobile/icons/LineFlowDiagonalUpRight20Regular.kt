package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LineFlowDiagonalUpRight20: ImageVector
  get() {
    if (_lineFlowDiagonalUpRight20 != null) {
      return _lineFlowDiagonalUpRight20!!
    }
    _lineFlowDiagonalUpRight20 = fluentIcon(name = "Regular.LineFlowDiagonalUpRight20", 20f) {
      materialPath {
          moveTo(15.854F, 4.854F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineToRelative(-7.408F, 7.409F)
          curveTo(7.248F, 11.205F, 6.648F, 11.0F, 6.0F, 11.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, 1.343F, -3.0F, 3.0F)
          reflectiveCurveToRelative(1.343F, 3.0F, 3.0F, 3.0F)
          reflectiveCurveToRelative(3.0F, -1.343F, 3.0F, -3.0F)
          curveToRelative(0.0F, -0.648F, -0.205F, -1.248F, -0.555F, -1.738F)
          lineToRelative(7.409F, -7.409F)
          close()
          moveTo(4.0F, 14.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          reflectiveCurveToRelative(-0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          close()        
      }
    }
    return _lineFlowDiagonalUpRight20!!
  }

private var _lineFlowDiagonalUpRight20: ImageVector? = null
