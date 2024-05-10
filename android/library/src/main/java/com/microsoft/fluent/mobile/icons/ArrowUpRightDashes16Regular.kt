package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowUpRightDashes16: ImageVector
  get() {
    if (_arrowUpRightDashes16 != null) {
      return _arrowUpRightDashes16!!
    }
    _arrowUpRightDashes16 = fluentIcon(name = "Regular.ArrowUpRightDashes16", 16f) {
      materialPath {
          moveTo(7.5F, 2.0F)
          curveTo(7.224F, 2.0F, 7.0F, 2.224F, 7.0F, 2.5F)
          reflectiveCurveTo(7.224F, 3.0F, 7.5F, 3.0F)
          horizontalLineToRelative(4.793F)
          lineToRelative(-2.147F, 2.146F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineTo(13.0F, 3.707F)
          verticalLineTo(8.5F)
          curveTo(13.0F, 8.776F, 13.224F, 9.0F, 13.5F, 9.0F)
          reflectiveCurveTo(14.0F, 8.776F, 14.0F, 8.5F)
          verticalLineToRelative(-6.0F)
          curveTo(14.0F, 2.224F, 13.776F, 2.0F, 13.5F, 2.0F)
          horizontalLineToRelative(-6.0F)
          close()
          moveToRelative(1.354F, 5.854F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          lineToRelative(-2.0F, 2.0F)
          curveToRelative(-0.196F, 0.196F, -0.196F, 0.512F, 0.0F, 0.707F)
          curveToRelative(0.195F, 0.196F, 0.511F, 0.196F, 0.707F, 0.0F)
          lineToRelative(2.0F, -2.0F)
          close()
          moveToRelative(-4.0F, 4.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineToRelative(-2.0F, 2.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(2.0F, -2.0F)
          close()        
      }
    }
    return _arrowUpRightDashes16!!
  }

private var _arrowUpRightDashes16: ImageVector? = null
