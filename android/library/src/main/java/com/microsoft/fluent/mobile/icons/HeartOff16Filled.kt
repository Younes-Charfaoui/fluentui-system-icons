package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HeartOff16: ImageVector
  get() {
    if (_heartOff16 != null) {
      return _heartOff16!!
    }
    _heartOff16 = fluentIcon(name = "Filled.HeartOff16", 16f) {
      materialPath {
          moveTo(10.452F, 11.16F)
          lineToRelative(3.694F, 3.694F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.946F, 1.945F)
          curveToRelative(-0.05F, 0.044F, -0.099F, 0.09F, -0.146F, 0.137F)
          curveTo(1.68F, 5.202F, 1.686F, 7.259F, 2.958F, 8.53F)
          lineToRelative(4.707F, 4.708F)
          curveToRelative(0.195F, 0.195F, 0.512F, 0.195F, 0.707F, 0.0F)
          lineToRelative(2.08F, -2.08F)
          close()
          moveToRelative(2.603F, -2.602F)
          lineToRelative(-1.188F, 1.188F)
          lineToRelative(-6.754F, -6.754F)
          curveTo(5.987F, 2.96F, 6.873F, 3.28F, 7.542F, 3.948F)
          lineTo(7.995F, 4.4F)
          lineToRelative(0.447F, -0.448F)
          curveToRelative(1.268F, -1.269F, 3.327F, -1.262F, 4.6F, 0.012F)
          curveToRelative(1.272F, 1.271F, 1.276F, 3.323F, 0.013F, 4.593F)
          close()        
      }
    }
    return _heartOff16!!
  }

private var _heartOff16: ImageVector? = null
