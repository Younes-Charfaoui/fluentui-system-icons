package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ShareAndroid16: ImageVector
  get() {
    if (_shareAndroid16 != null) {
      return _shareAndroid16!!
    }
    _shareAndroid16 = fluentIcon(name = "Filled.ShareAndroid16", 16f) {
      materialPath {
          moveTo(10.0F, 4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          reflectiveCurveToRelative(-0.895F, 2.0F, -2.0F, 2.0F)
          curveToRelative(-0.602F, 0.0F, -1.142F, -0.266F, -1.508F, -0.687F)
          lineTo(5.956F, 7.581F)
          curveTo(5.985F, 7.716F, 6.0F, 7.856F, 6.0F, 8.0F)
          curveToRelative(0.0F, 0.144F, -0.015F, 0.284F, -0.044F, 0.419F)
          lineToRelative(4.535F, 2.268F)
          curveTo(10.858F, 10.266F, 11.399F, 10.0F, 12.0F, 10.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          reflectiveCurveToRelative(-0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          curveToRelative(0.0F, -0.144F, 0.015F, -0.284F, 0.044F, -0.419F)
          lineTo(5.508F, 9.313F)
          curveTo(5.143F, 9.734F, 4.603F, 10.0F, 4.0F, 10.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          curveToRelative(0.602F, 0.0F, 1.142F, 0.266F, 1.508F, 0.687F)
          lineToRelative(4.536F, -2.268F)
          curveTo(10.015F, 4.284F, 10.0F, 4.144F, 10.0F, 4.0F)
          close()        
      }
    }
    return _shareAndroid16!!
  }

private var _shareAndroid16: ImageVector? = null
