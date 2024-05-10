package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.HeartOff16: ImageVector
  get() {
    if (_heartOff16 != null) {
      return _heartOff16!!
    }
    _heartOff16 = fluentIcon(name = "Regular.HeartOff16", 16f) {
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
          moveToRelative(-0.707F, -0.708F)
          lineTo(8.02F, 12.178F)
          lineTo(3.665F, 7.824F)
          curveTo(2.783F, 6.942F, 2.778F, 5.518F, 3.653F, 4.643F)
          curveTo(3.701F, 4.595F, 3.75F, 4.55F, 3.801F, 4.508F)
          lineToRelative(5.944F, 5.944F)
          close()
          moveToRelative(2.601F, -2.599F)
          lineTo(11.16F, 9.04F)
          lineToRelative(0.707F, 0.707F)
          lineToRelative(1.188F, -1.188F)
          curveToRelative(1.263F, -1.27F, 1.26F, -3.322F, -0.012F, -4.593F)
          curveToRelative(-1.274F, -1.274F, -3.333F, -1.28F, -4.601F, -0.012F)
          lineTo(7.995F, 4.4F)
          lineTo(7.54F, 3.948F)
          curveTo(6.873F, 3.279F, 5.987F, 2.96F, 5.113F, 2.992F)
          lineTo(6.5F, 4.378F)
          curveToRelative(0.118F, 0.08F, 0.23F, 0.172F, 0.335F, 0.277F)
          lineToRelative(0.81F, 0.809F)
          curveTo(7.843F, 5.663F, 8.166F, 5.659F, 8.36F, 5.455F)
          lineTo(9.15F, 4.66F)
          curveToRelative(0.877F, -0.877F, 2.302F, -0.873F, 3.186F, 0.012F)
          curveToRelative(0.883F, 0.882F, 0.885F, 2.302F, 0.011F, 3.181F)
          close()        
      }
    }
    return _heartOff16!!
  }

private var _heartOff16: ImageVector? = null
