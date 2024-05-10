package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabDesktopSearch16: ImageVector
  get() {
    if (_tabDesktopSearch16 != null) {
      return _tabDesktopSearch16!!
    }
    _tabDesktopSearch16 = fluentIcon(name = "Filled.TabDesktopSearch16", 16f) {
      materialPath {
          moveTo(4.0F, 2.0F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(1.5F)
          curveTo(7.0F, 4.328F, 7.672F, 5.0F, 8.5F, 5.0F)
          horizontalLineTo(14.0F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineToRelative(-1.085F)
          curveToRelative(-0.073F, -0.205F, -0.19F, -0.397F, -0.354F, -0.56F)
          lineToRelative(-2.0F, -2.0F)
          curveTo(8.843F, 10.853F, 9.0F, 10.195F, 9.0F, 9.5F)
          curveTo(9.0F, 7.015F, 6.985F, 5.0F, 4.5F, 5.0F)
          curveTo(3.575F, 5.0F, 2.715F, 5.28F, 2.0F, 5.758F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          close()
          moveToRelative(8.0F, 0.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          horizontalLineTo(8.5F)
          curveTo(8.224F, 4.0F, 8.0F, 3.776F, 8.0F, 3.5F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(4.0F)
          close()
          moveTo(4.5F, 13.0F)
          curveToRelative(0.786F, 0.0F, 1.512F, -0.26F, 2.096F, -0.697F)
          lineToRelative(2.55F, 2.55F)
          curveToRelative(0.196F, 0.196F, 0.512F, 0.196F, 0.707F, 0.0F)
          curveToRelative(0.196F, -0.195F, 0.196F, -0.511F, 0.0F, -0.707F)
          lineToRelative(-2.55F, -2.55F)
          curveTo(7.741F, 11.012F, 8.0F, 10.286F, 8.0F, 9.5F)
          curveTo(8.0F, 7.567F, 6.433F, 6.0F, 4.5F, 6.0F)
          reflectiveCurveTo(1.0F, 7.567F, 1.0F, 9.5F)
          reflectiveCurveTo(2.567F, 13.0F, 4.5F, 13.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          curveTo(3.12F, 12.0F, 2.0F, 10.88F, 2.0F, 9.5F)
          reflectiveCurveTo(3.12F, 7.0F, 4.5F, 7.0F)
          reflectiveCurveTo(7.0F, 8.12F, 7.0F, 9.5F)
          reflectiveCurveTo(5.88F, 12.0F, 4.5F, 12.0F)
          close()        
      }
    }
    return _tabDesktopSearch16!!
  }

private var _tabDesktopSearch16: ImageVector? = null
