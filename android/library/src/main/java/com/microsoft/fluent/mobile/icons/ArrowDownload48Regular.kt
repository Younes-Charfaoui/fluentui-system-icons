package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowDownload48: ImageVector
  get() {
    if (_arrowDownload48 != null) {
      return _arrowDownload48!!
    }
    _arrowDownload48 = fluentIcon(name = "Regular.ArrowDownload48", 48f) {
      materialPath {
          moveTo(25.25F, 6.25F)
          curveTo(25.25F, 5.56F, 24.69F, 5.0F, 24.0F, 5.0F)
          reflectiveCurveToRelative(-1.25F, 0.56F, -1.25F, 1.25F)
          verticalLineToRelative(26.482F)
          lineToRelative(-8.366F, -8.366F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(10.5F, 10.5F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          lineToRelative(10.5F, -10.5F)
          curveToRelative(0.488F, -0.488F, 0.488F, -1.28F, 0.0F, -1.768F)
          reflectiveCurveToRelative(-1.28F, -0.488F, -1.768F, 0.0F)
          lineToRelative(-8.366F, 8.366F)
          verticalLineTo(6.25F)
          close()
          moveToRelative(-14.0F, 34.25F)
          curveToRelative(-0.69F, 0.0F, -1.25F, 0.56F, -1.25F, 1.25F)
          reflectiveCurveTo(10.56F, 43.0F, 11.25F, 43.0F)
          horizontalLineToRelative(25.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineToRelative(-25.5F)
          close()        
      }
    }
    return _arrowDownload48!!
  }

private var _arrowDownload48: ImageVector? = null
