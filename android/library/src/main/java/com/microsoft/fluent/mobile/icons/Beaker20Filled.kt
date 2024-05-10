package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Beaker20: ImageVector
  get() {
    if (_beaker20 != null) {
      return _beaker20!!
    }
    _beaker20 = fluentIcon(name = "Filled.Beaker20", 20f) {
      materialPath {
          moveTo(5.5F, 3.5F)
          curveTo(5.5F, 3.224F, 5.724F, 3.0F, 6.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(14.276F, 4.0F, 14.0F, 4.0F)
          horizontalLineToRelative(-0.996F)
          verticalLineToRelative(4.684F)
          curveToRelative(0.0F, 0.58F, 0.144F, 1.15F, 0.42F, 1.66F)
          lineTo(14.315F, 12.0F)
          horizontalLineTo(5.684F)
          lineToRelative(0.89F, -1.653F)
          curveToRelative(0.276F, -0.51F, 0.42F, -1.081F, 0.42F, -1.66F)
          verticalLineTo(4.0F)
          horizontalLineTo(6.0F)
          curveTo(5.724F, 4.0F, 5.5F, 3.776F, 5.5F, 3.5F)
          close()
          moveTo(5.146F, 13.0F)
          lineToRelative(-0.964F, 1.79F)
          curveToRelative(-0.539F, 1.0F, 0.184F, 2.212F, 1.32F, 2.212F)
          horizontalLineToRelative(8.997F)
          curveToRelative(1.135F, 0.0F, 1.858F, -1.213F, 1.32F, -2.212F)
          lineTo(14.854F, 13.0F)
          horizontalLineTo(5.146F)
          close()        
      }
    }
    return _beaker20!!
  }

private var _beaker20: ImageVector? = null
