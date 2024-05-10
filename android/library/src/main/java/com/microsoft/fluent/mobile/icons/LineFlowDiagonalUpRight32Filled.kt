package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineFlowDiagonalUpRight32: ImageVector
  get() {
    if (_lineFlowDiagonalUpRight32 != null) {
      return _lineFlowDiagonalUpRight32!!
    }
    _lineFlowDiagonalUpRight32 = fluentIcon(name = "Filled.LineFlowDiagonalUpRight32", 32f) {
      materialPath {
          moveTo(26.707F, 6.707F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          curveToRelative(-0.39F, -0.39F, -1.024F, -0.39F, -1.414F, 0.0F)
          lineTo(11.618F, 18.968F)
          curveTo(10.732F, 18.358F, 9.657F, 18.0F, 8.5F, 18.0F)
          curveTo(5.462F, 18.0F, 3.0F, 20.462F, 3.0F, 23.5F)
          reflectiveCurveTo(5.462F, 29.0F, 8.5F, 29.0F)
          reflectiveCurveToRelative(5.5F, -2.462F, 5.5F, -5.5F)
          curveToRelative(0.0F, -1.157F, -0.358F, -2.232F, -0.968F, -3.117F)
          lineTo(26.707F, 6.707F)
          close()        
      }
    }
    return _lineFlowDiagonalUpRight32!!
  }

private var _lineFlowDiagonalUpRight32: ImageVector? = null
