package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowExportUp16: ImageVector
  get() {
    if (_arrowExportUp16 != null) {
      return _arrowExportUp16!!
    }
    _arrowExportUp16 = fluentIcon(name = "Regular.ArrowExportUp16", 16f) {
      materialPath {
          moveTo(3.0F, 14.5F)
          curveTo(3.0F, 14.224F, 3.224F, 14.0F, 3.5F, 14.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(12.776F, 15.0F, 12.5F, 15.0F)
          horizontalLineToRelative(-9.0F)
          curveTo(3.224F, 15.0F, 3.0F, 14.776F, 3.0F, 14.5F)
          close()
          moveToRelative(1.146F, -9.146F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineTo(8.5F, 2.707F)
          verticalLineTo(11.5F)
          curveTo(8.5F, 11.776F, 8.276F, 12.0F, 8.0F, 12.0F)
          reflectiveCurveToRelative(-0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineTo(2.707F)
          lineTo(4.854F, 5.354F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          close()        
      }
    }
    return _arrowExportUp16!!
  }

private var _arrowExportUp16: ImageVector? = null
