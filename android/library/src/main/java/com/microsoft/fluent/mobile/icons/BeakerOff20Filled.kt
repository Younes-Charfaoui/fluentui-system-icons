package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BeakerOff20: ImageVector
  get() {
    if (_beakerOff20 != null) {
      return _beakerOff20!!
    }
    _beakerOff20 = fluentIcon(name = "Filled.BeakerOff20", 20f) {
      materialPath {
          moveTo(2.853F, 2.147F)
          curveToRelative(-0.195F, -0.196F, -0.511F, -0.196F, -0.707F, 0.0F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.511F, 0.0F, 0.707F)
          lineToRelative(4.848F, 4.848F)
          verticalLineToRelative(0.985F)
          curveToRelative(0.0F, 0.579F, -0.143F, 1.15F, -0.418F, 1.66F)
          lineTo(5.685F, 12.0F)
          horizontalLineToRelative(5.608F)
          lineToRelative(1.0F, 1.0F)
          horizontalLineTo(5.146F)
          lineToRelative(-0.964F, 1.79F)
          curveToRelative(-0.539F, 1.0F, 0.184F, 2.212F, 1.32F, 2.212F)
          horizontalLineToRelative(8.997F)
          curveToRelative(0.506F, 0.0F, 0.93F, -0.242F, 1.198F, -0.598F)
          lineToRelative(1.45F, 1.45F)
          curveToRelative(0.195F, 0.195F, 0.511F, 0.195F, 0.707F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-15.0F, -15.0F)
          close()
          moveToRelative(4.141F, 2.726F)
          lineTo(14.121F, 12.0F)
          horizontalLineToRelative(0.194F)
          lineToRelative(-0.892F, -1.656F)
          curveToRelative(-0.275F, -0.51F, -0.419F, -1.08F, -0.419F, -1.66F)
          verticalLineTo(4.0F)
          horizontalLineTo(14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(14.276F, 3.0F, 14.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveTo(5.761F, 3.0F, 5.562F, 3.167F, 5.512F, 3.39F)
          lineTo(6.122F, 4.0F)
          horizontalLineToRelative(0.872F)
          verticalLineToRelative(0.873F)
          close()        
      }
    }
    return _beakerOff20!!
  }

private var _beakerOff20: ImageVector? = null
