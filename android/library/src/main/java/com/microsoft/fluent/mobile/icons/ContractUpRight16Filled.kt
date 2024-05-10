package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ContractUpRight16: ImageVector
  get() {
    if (_contractUpRight16 != null) {
      return _contractUpRight16!!
    }
    _contractUpRight16 = fluentIcon(name = "Filled.ContractUpRight16", 16f) {
      materialPath {
          moveTo(3.0F, 4.5F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(3.5F)
          curveTo(8.0F, 7.328F, 8.672F, 8.0F, 9.5F, 8.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-2.0F)
          curveTo(9.224F, 13.0F, 9.0F, 13.224F, 9.0F, 13.5F)
          reflectiveCurveTo(9.224F, 14.0F, 9.5F, 14.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(2.0F)
          curveTo(2.0F, 6.776F, 2.224F, 7.0F, 2.5F, 7.0F)
          reflectiveCurveTo(3.0F, 6.776F, 3.0F, 6.5F)
          verticalLineToRelative(-2.0F)
          close()
          moveToRelative(-1.0F, 5.0F)
          curveTo(2.0F, 9.776F, 2.224F, 10.0F, 2.5F, 10.0F)
          horizontalLineToRelative(2.793F)
          lineToRelative(-3.147F, 3.146F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineTo(6.0F, 10.707F)
          verticalLineTo(13.5F)
          curveTo(6.0F, 13.776F, 6.224F, 14.0F, 6.5F, 14.0F)
          reflectiveCurveTo(7.0F, 13.776F, 7.0F, 13.5F)
          verticalLineToRelative(-4.0F)
          curveTo(7.0F, 9.224F, 6.776F, 9.0F, 6.5F, 9.0F)
          horizontalLineToRelative(-4.0F)
          curveTo(2.224F, 9.0F, 2.0F, 9.224F, 2.0F, 9.5F)
          close()        
      }
    }
    return _contractUpRight16!!
  }

private var _contractUpRight16: ImageVector? = null
