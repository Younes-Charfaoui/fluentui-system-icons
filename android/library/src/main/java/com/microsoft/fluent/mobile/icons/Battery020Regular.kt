package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Battery020: ImageVector
  get() {
    if (_battery020 != null) {
      return _battery020!!
    }
    _battery020 = fluentIcon(name = "Regular.Battery020", 020f) {
      materialPath {
          moveTo(13.5F, 5.0F)
          curveTo(14.88F, 5.0F, 16.0F, 6.12F, 16.0F, 7.5F)
          verticalLineToRelative(0.833F)
          lineToRelative(1.167F, 0.003F)
          curveToRelative(0.151F, 0.0F, 0.294F, 0.04F, 0.416F, 0.111F)
          curveTo(17.833F, 8.591F, 18.0F, 8.861F, 18.0F, 9.17F)
          verticalLineToRelative(1.667F)
          curveToRelative(0.0F, 0.308F, -0.168F, 0.577F, -0.417F, 0.721F)
          curveToRelative(-0.122F, 0.071F, -0.265F, 0.112F, -0.416F, 0.112F)
          lineTo(16.0F, 11.667F)
          verticalLineTo(12.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-9.0F)
          curveTo(3.12F, 15.0F, 2.0F, 13.88F, 2.0F, 12.5F)
          verticalLineToRelative(-5.0F)
          curveTo(2.0F, 6.12F, 3.12F, 5.0F, 4.5F, 5.0F)
          horizontalLineToRelative(9.0F)
          close()
          moveToRelative(0.25F, 0.946F)
          horizontalLineTo(4.5F)
          curveToRelative(-0.65F, 0.0F, -1.405F, 0.496F, -1.492F, 1.13F)
          lineTo(3.0F, 7.196F)
          verticalLineToRelative(5.495F)
          curveToRelative(0.0F, 0.647F, 0.492F, 1.18F, 1.122F, 1.244F)
          lineTo(4.25F, 13.94F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.647F, 0.0F, 1.18F, -0.492F, 1.243F, -1.122F)
          lineTo(15.0F, 12.691F)
          verticalLineTo(7.196F)
          curveToRelative(0.0F, -0.647F, -0.492F, -1.18F, -1.122F, -1.244F)
          lineTo(13.75F, 5.946F)
          close()        
      }
    }
    return _battery020!!
  }

private var _battery020: ImageVector? = null
