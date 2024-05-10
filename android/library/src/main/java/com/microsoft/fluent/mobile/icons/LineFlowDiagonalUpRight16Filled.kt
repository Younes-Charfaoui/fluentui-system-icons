package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineFlowDiagonalUpRight16: ImageVector
  get() {
    if (_lineFlowDiagonalUpRight16 != null) {
      return _lineFlowDiagonalUpRight16!!
    }
    _lineFlowDiagonalUpRight16 = fluentIcon(name = "Filled.LineFlowDiagonalUpRight16", 16f) {
      materialPath {
          moveTo(12.854F, 3.853F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.511F, 0.0F, -0.707F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(5.88F, 9.415F)
          curveTo(5.484F, 9.152F, 5.009F, 9.0F, 4.5F, 9.0F)
          curveTo(3.12F, 9.0F, 2.0F, 10.12F, 2.0F, 11.5F)
          reflectiveCurveTo(3.12F, 14.0F, 4.5F, 14.0F)
          reflectiveCurveTo(7.0F, 12.88F, 7.0F, 11.5F)
          curveToRelative(0.0F, -0.51F, -0.152F, -0.983F, -0.414F, -1.379F)
          lineToRelative(6.268F, -6.268F)
          close()        
      }
    }
    return _lineFlowDiagonalUpRight16!!
  }

private var _lineFlowDiagonalUpRight16: ImageVector? = null
