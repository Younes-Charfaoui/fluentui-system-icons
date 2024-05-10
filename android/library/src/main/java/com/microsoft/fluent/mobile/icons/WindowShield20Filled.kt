package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.WindowShield20: ImageVector
  get() {
    if (_windowShield20 != null) {
      return _windowShield20!!
    }
    _windowShield20 = fluentIcon(name = "Filled.WindowShield20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(3.507F)
          curveToRelative(-0.373F, -0.171F, -0.715F, -0.414F, -1.0F, -0.661F)
          verticalLineTo(7.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(4.576F)
          curveToRelative(0.19F, 0.374F, 0.416F, 0.706F, 0.66F, 1.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(11.88F, 3.16F)
          curveToRelative(0.508F, 0.532F, 1.484F, 1.379F, 2.684F, 1.552F)
          curveTo(17.803F, 10.747F, 18.0F, 10.946F, 18.0F, 11.194F)
          verticalLineToRelative(2.323F)
          curveToRelative(0.0F, 3.122F, -2.784F, 4.255F, -3.386F, 4.463F)
          curveToRelative(-0.075F, 0.026F, -0.152F, 0.026F, -0.228F, 0.0F)
          curveTo(13.785F, 17.772F, 11.0F, 16.64F, 11.0F, 13.517F)
          verticalLineToRelative(-2.323F)
          curveToRelative(0.0F, -0.248F, 0.197F, -0.447F, 0.436F, -0.482F)
          curveToRelative(1.2F, -0.173F, 2.175F, -1.02F, 2.683F, -1.553F)
          curveToRelative(0.202F, -0.212F, 0.56F, -0.212F, 0.762F, 0.0F)
          close()        
      }
    }
    return _windowShield20!!
  }

private var _windowShield20: ImageVector? = null
