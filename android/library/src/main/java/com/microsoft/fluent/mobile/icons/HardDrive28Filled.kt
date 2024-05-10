package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HardDrive28: ImageVector
  get() {
    if (_hardDrive28 != null) {
      return _hardDrive28!!
    }
    _hardDrive28 = fluentIcon(name = "Filled.HardDrive28", 28f) {
      materialPath {
          moveTo(6.527F, 6.442F)
          curveTo(7.007F, 5.554F, 7.937F, 5.0F, 8.947F, 5.0F)
          horizontalLineToRelative(10.111F)
          curveToRelative(1.01F, 0.0F, 1.939F, 0.554F, 2.42F, 1.442F)
          lineToRelative(3.463F, 6.408F)
          curveToRelative(-0.518F, -0.225F, -1.09F, -0.35F, -1.691F, -0.35F)
          horizontalLineTo(4.75F)
          curveToRelative(-0.599F, 0.0F, -1.168F, 0.124F, -1.685F, 0.347F)
          lineToRelative(3.462F, -6.405F)
          close()
          moveTo(23.25F, 23.0F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineToRelative(-3.5F)
          curveToRelative(0.0F, -1.519F, -1.231F, -2.75F, -2.75F, -2.75F)
          horizontalLineTo(4.75F)
          curveTo(3.231F, 14.0F, 2.0F, 15.231F, 2.0F, 16.75F)
          verticalLineToRelative(3.5F)
          curveTo(2.0F, 21.769F, 3.231F, 23.0F, 4.75F, 23.0F)
          horizontalLineToRelative(18.5F)
          close()
          moveToRelative(-3.0F, -4.5F)
          curveToRelative(0.0F, -0.686F, 0.553F, -1.243F, 1.238F, -1.25F)
          horizontalLineToRelative(0.024F)
          curveToRelative(0.685F, 0.007F, 1.238F, 0.564F, 1.238F, 1.25F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          reflectiveCurveToRelative(-1.25F, -0.56F, -1.25F, -1.25F)
          close()        
      }
    }
    return _hardDrive28!!
  }

private var _hardDrive28: ImageVector? = null
