package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailCheckmark16: ImageVector
  get() {
    if (_mailCheckmark16 != null) {
      return _mailCheckmark16!!
    }
    _mailCheckmark16 = fluentIcon(name = "Filled.MailCheckmark16", 16f) {
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
          curveToRelative(0.9F, 0.0F, 1.75F, -0.216F, 2.5F, -0.6F)
          verticalLineTo(13.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(8.337F)
          lineToRelative(5.763F, 3.103F)
          curveToRelative(0.148F, 0.08F, 0.326F, 0.08F, 0.474F, 0.0F)
          lineToRelative(1.411F, -0.76F)
          curveTo(9.227F, 10.888F, 9.85F, 11.0F, 10.5F, 11.0F)
          close()
          moveTo(3.0F, 5.0F)
          horizontalLineToRelative(2.022F)
          curveTo(5.008F, 5.165F, 5.0F, 5.332F, 5.0F, 5.5F)
          curveToRelative(0.0F, 1.95F, 1.014F, 3.662F, 2.544F, 4.64F)
          lineTo(7.0F, 10.431F)
          lineToRelative(-6.0F, -3.23F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          close()        
      }
    }
    return _mailCheckmark16!!
  }

private var _mailCheckmark16: ImageVector? = null
