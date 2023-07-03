package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DesktopCheckmark16: ImageVector
  get() {
    if (_desktopCheckmark16 != null) {
      return _desktopCheckmark16!!
    }
    _desktopCheckmark16 = fluentIcon(name = "Filled.DesktopCheckmark16", 16f) {
      materialPath {
          moveTo(15.0F, 5.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(6.0F, 7.985F, 6.0F, 5.5F)
          reflectiveCurveTo(8.015F, 1.0F, 10.5F, 1.0F)
          reflectiveCurveTo(15.0F, 3.015F, 15.0F, 5.5F)
          close()
          moveToRelative(-2.146F, -1.853F)
          curveToRelative(-0.196F, -0.196F, -0.512F, -0.196F, -0.708F, 0.0F)
          lineTo(9.5F, 6.293F)
          lineTo(8.854F, 5.646F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          curveToRelative(-0.196F, 0.196F, -0.196F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.0F, 1.0F)
          curveToRelative(0.195F, 0.195F, 0.511F, 0.195F, 0.707F, 0.0F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          close()
          moveTo(10.5F, 11.0F)
          curveToRelative(1.33F, 0.0F, 2.55F, -0.472F, 3.501F, -1.258F)
          verticalLineToRelative(0.755F)
          curveToRelative(0.0F, 0.829F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-2.5F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(0.275F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(11.775F, 14.0F, 11.5F, 14.0F)
          horizontalLineTo(4.495F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          reflectiveCurveTo(4.22F, 13.0F, 4.496F, 13.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(-1.003F)
          horizontalLineTo(3.501F)
          curveToRelative(-0.829F, 0.0F, -1.5F, -0.671F, -1.5F, -1.5F)
          verticalLineTo(3.5F)
          curveToRelative(0.0F, -0.828F, 0.671F, -1.5F, 1.5F, -1.5F)
          horizontalLineToRelative(2.756F)
          curveTo(5.472F, 2.95F, 5.0F, 4.17F, 5.0F, 5.5F)
          curveTo(5.0F, 8.538F, 7.462F, 11.0F, 10.5F, 11.0F)
          close()
          moveTo(9.0F, 11.997F)
          horizontalLineTo(7.0F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(-1.003F)
          close()        
      }
    }
    return _desktopCheckmark16!!
  }

private var _desktopCheckmark16: ImageVector? = null