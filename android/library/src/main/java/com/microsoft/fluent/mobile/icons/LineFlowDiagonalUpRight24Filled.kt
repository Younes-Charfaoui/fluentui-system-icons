package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineFlowDiagonalUpRight24: ImageVector
  get() {
    if (_lineFlowDiagonalUpRight24 != null) {
      return _lineFlowDiagonalUpRight24!!
    }
    _lineFlowDiagonalUpRight24 = fluentIcon(name = "Filled.LineFlowDiagonalUpRight24", 24f) {
      materialPath {
          moveTo(19.78F, 5.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-9.472F, 9.47F)
          curveTo(8.608F, 13.255F, 7.834F, 13.0F, 7.0F, 13.0F)
          curveToRelative(-2.21F, 0.0F, -4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          reflectiveCurveToRelative(4.0F, -1.79F, 4.0F, -4.0F)
          curveToRelative(0.0F, -0.834F, -0.255F, -1.607F, -0.691F, -2.248F)
          lineTo(19.78F, 5.28F)
          close()        
      }
    }
    return _lineFlowDiagonalUpRight24!!
  }

private var _lineFlowDiagonalUpRight24: ImageVector? = null
