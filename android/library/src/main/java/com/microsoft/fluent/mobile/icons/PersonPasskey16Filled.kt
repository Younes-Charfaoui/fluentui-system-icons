package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonPasskey16: ImageVector
  get() {
    if (_personPasskey16 != null) {
      return _personPasskey16!!
    }
    _personPasskey16 = fluentIcon(name = "Filled.PersonPasskey16", 16f) {
      materialPath {
          moveTo(4.5F, 8.0F)
          horizontalLineToRelative(5.825F)
          curveToRelative(0.112F, 0.716F, 0.46F, 1.353F, 0.961F, 1.83F)
          verticalLineToRelative(3.217F)
          curveTo(10.456F, 13.627F, 9.346F, 14.0F, 8.0F, 14.0F)
          curveToRelative(-3.14F, 0.0F, -5.0F, -2.029F, -5.0F, -4.0F)
          verticalLineTo(9.5F)
          curveTo(3.0F, 8.672F, 3.672F, 8.0F, 4.5F, 8.0F)
          close()
          moveTo(8.0F, 1.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          reflectiveCurveTo(9.519F, 7.0F, 8.0F, 7.0F)
          reflectiveCurveTo(5.25F, 5.769F, 5.25F, 4.25F)
          reflectiveCurveTo(6.481F, 1.5F, 8.0F, 1.5F)
          close()
          moveToRelative(6.241F, 8.388F)
          curveTo(15.26F, 9.572F, 16.0F, 8.622F, 16.0F, 7.5F)
          curveTo(16.0F, 6.12F, 14.88F, 5.0F, 13.5F, 5.0F)
          reflectiveCurveTo(11.0F, 6.12F, 11.0F, 7.5F)
          curveToRelative(0.0F, 0.818F, 0.393F, 1.544F, 1.0F, 2.0F)
          verticalLineToRelative(3.858F)
          curveToRelative(0.0F, 0.091F, 0.035F, 0.179F, 0.097F, 0.245F)
          lineToRelative(1.166F, 1.24F)
          curveToRelative(0.137F, 0.144F, 0.366F, 0.15F, 0.509F, 0.01F)
          lineToRelative(1.166F, -1.13F)
          curveToRelative(0.13F, -0.127F, 0.145F, -0.332F, 0.033F, -0.476F)
          lineTo(14.0F, 12.0F)
          lineToRelative(0.9F, -0.77F)
          curveToRelative(0.149F, -0.128F, 0.167F, -0.35F, 0.042F, -0.5F)
          lineToRelative(-0.7F, -0.842F)
          close()
          moveTo(14.25F, 6.75F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          reflectiveCurveTo(13.086F, 6.0F, 13.5F, 6.0F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          close()        
      }
    }
    return _personPasskey16!!
  }

private var _personPasskey16: ImageVector? = null
