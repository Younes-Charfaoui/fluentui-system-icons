package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonAlert32: ImageVector
  get() {
    if (_personAlert32 != null) {
      return _personAlert32!!
    }
    _personAlert32 = fluentIcon(name = "Filled.PersonAlert32", 32f) {
      materialPath {
          moveTo(15.0F, 16.0F)
          curveToRelative(3.866F, 0.0F, 7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          reflectiveCurveToRelative(-7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          close()
          moveToRelative(-8.5F, 2.0F)
          curveTo(4.567F, 18.0F, 3.0F, 19.567F, 3.0F, 21.5F)
          verticalLineTo(22.0F)
          curveToRelative(0.0F, 2.393F, 1.523F, 4.417F, 3.685F, 5.793F)
          curveTo(8.859F, 29.177F, 11.802F, 30.0F, 15.0F, 30.0F)
          curveToRelative(1.69F, 0.0F, 3.31F, -0.23F, 4.782F, -0.651F)
          curveToRelative(-0.011F, -0.081F, -0.02F, -0.163F, -0.025F, -0.246F)
          lineTo(19.749F, 29.0F)
          horizontalLineToRelative(-3.098F)
          lineToRelative(-0.048F, -0.003F)
          curveToRelative(-1.845F, -0.118F, -2.791F, -2.325F, -1.534F, -3.74F)
          lineTo(17.0F, 23.085F)
          verticalLineTo(21.0F)
          curveToRelative(0.0F, -1.082F, 0.264F, -2.102F, 0.732F, -3.0F)
          horizontalLineTo(6.5F)
          close()
          moveToRelative(17.0F, -2.0F)
          curveToRelative(-2.761F, 0.0F, -5.0F, 2.239F, -5.0F, 5.0F)
          verticalLineToRelative(2.656F)
          lineToRelative(-2.31F, 2.597F)
          curveToRelative(-0.418F, 0.471F, -0.104F, 1.208F, 0.51F, 1.247F)
          horizontalLineToRelative(13.599F)
          curveToRelative(0.614F, -0.04F, 0.927F, -0.776F, 0.509F, -1.247F)
          lineTo(28.5F, 23.657F)
          verticalLineTo(21.0F)
          curveToRelative(0.0F, -2.761F, -2.238F, -5.0F, -5.0F, -5.0F)
          close()
          moveToRelative(0.0F, 15.0F)
          curveToRelative(-1.192F, 0.0F, -2.168F, -0.883F, -2.245F, -2.0F)
          horizontalLineToRelative(4.49F)
          curveToRelative(-0.077F, 1.117F, -1.053F, 2.0F, -2.245F, 2.0F)
          close()        
      }
    }
    return _personAlert32!!
  }

private var _personAlert32: ImageVector? = null
