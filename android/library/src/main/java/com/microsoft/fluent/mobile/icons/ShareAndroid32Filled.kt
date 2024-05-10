package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ShareAndroid32: ImageVector
  get() {
    if (_shareAndroid32 != null) {
      return _shareAndroid32!!
    }
    _shareAndroid32 = fluentIcon(name = "Filled.ShareAndroid32", 32f) {
      materialPath {
          moveTo(20.0F, 7.5F)
          curveToRelative(0.0F, 0.368F, 0.044F, 0.726F, 0.128F, 1.068F)
          lineToRelative(-9.15F, 4.575F)
          curveTo(10.151F, 12.14F, 8.9F, 11.5F, 7.5F, 11.5F)
          curveTo(5.015F, 11.5F, 3.0F, 13.515F, 3.0F, 16.0F)
          reflectiveCurveToRelative(2.015F, 4.5F, 4.5F, 4.5F)
          curveToRelative(1.4F, 0.0F, 2.652F, -0.64F, 3.477F, -1.643F)
          lineToRelative(9.15F, 4.575F)
          curveTo(20.045F, 23.774F, 20.0F, 24.132F, 20.0F, 24.5F)
          curveToRelative(0.0F, 2.485F, 2.015F, 4.5F, 4.5F, 4.5F)
          reflectiveCurveToRelative(4.5F, -2.015F, 4.5F, -4.5F)
          reflectiveCurveToRelative(-2.015F, -4.5F, -4.5F, -4.5F)
          curveToRelative(-1.4F, 0.0F, -2.652F, 0.64F, -3.477F, 1.643F)
          lineToRelative(-9.15F, -4.575F)
          curveTo(11.956F, 16.726F, 12.0F, 16.368F, 12.0F, 16.0F)
          curveToRelative(0.0F, -0.368F, -0.044F, -0.726F, -0.127F, -1.068F)
          lineToRelative(9.15F, -4.575F)
          curveTo(21.848F, 11.36F, 23.099F, 12.0F, 24.5F, 12.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          reflectiveCurveTo(26.985F, 3.0F, 24.5F, 3.0F)
          reflectiveCurveTo(20.0F, 5.015F, 20.0F, 7.5F)
          close()        
      }
    }
    return _shareAndroid32!!
  }

private var _shareAndroid32: ImageVector? = null
