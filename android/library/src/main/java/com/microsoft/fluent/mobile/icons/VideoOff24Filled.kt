package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoOff24: ImageVector
  get() {
    if (_videoOff24 != null) {
      return _videoOff24!!
    }
    _videoOff24 = fluentIcon(name = "Filled.VideoOff24", 24f) {
      materialPath {
          moveTo(3.28F, 2.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(1.915F, 1.916F)
          curveTo(2.89F, 5.651F, 2.0F, 6.846F, 2.0F, 8.25F)
          verticalLineToRelative(7.5F)
          curveTo(2.0F, 17.545F, 3.455F, 19.0F, 5.25F, 19.0F)
          horizontalLineToRelative(6.5F)
          curveToRelative(1.695F, 0.0F, 3.086F, -1.297F, 3.237F, -2.953F)
          lineToRelative(5.732F, 5.733F)
          curveToRelative(0.293F, 0.293F, 0.768F, 0.293F, 1.061F, 0.0F)
          curveToRelative(0.293F, -0.292F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(3.28F, 2.22F)
          close()
          moveTo(16.0F, 12.818F)
          lineToRelative(5.008F, 5.008F)
          curveToRelative(0.57F, -0.274F, 0.994F, -0.848F, 0.994F, -1.578F)
          verticalLineTo(7.753F)
          curveToRelative(0.0F, -1.41F, -1.584F, -2.242F, -2.745F, -1.44F)
          lineTo(16.0F, 8.563F)
          verticalLineToRelative(4.255F)
          close()
          moveTo(8.182F, 5.0F)
          lineTo(15.0F, 11.818F)
          verticalLineTo(8.25F)
          curveTo(15.0F, 6.455F, 13.545F, 5.0F, 11.75F, 5.0F)
          horizontalLineTo(8.182F)
          close()        
      }
    }
    return _videoOff24!!
  }

private var _videoOff24: ImageVector? = null
