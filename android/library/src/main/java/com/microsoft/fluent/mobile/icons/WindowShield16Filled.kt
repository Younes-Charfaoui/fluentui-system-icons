package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.WindowShield16: ImageVector
  get() {
    if (_windowShield16 != null) {
      return _windowShield16!!
    }
    _windowShield16 = fluentIcon(name = "Filled.WindowShield16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(3.007F)
          curveToRelative(-0.373F, -0.171F, -0.714F, -0.414F, -1.0F, -0.661F)
          verticalLineTo(6.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(5.5F)
          curveTo(3.0F, 12.328F, 3.672F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(2.691F)
          curveToRelative(0.098F, 0.362F, 0.23F, 0.695F, 0.385F, 1.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveToRelative(9.88F, 2.66F)
          curveToRelative(0.508F, 0.532F, 1.484F, 1.379F, 2.684F, 1.552F)
          curveTo(14.803F, 8.747F, 15.0F, 8.946F, 15.0F, 9.194F)
          verticalLineToRelative(2.323F)
          curveToRelative(0.0F, 3.122F, -2.784F, 4.255F, -3.386F, 4.463F)
          curveToRelative(-0.075F, 0.026F, -0.152F, 0.026F, -0.228F, 0.0F)
          curveTo(10.785F, 15.772F, 8.0F, 14.64F, 8.0F, 11.517F)
          verticalLineTo(9.194F)
          curveToRelative(0.0F, -0.248F, 0.197F, -0.447F, 0.436F, -0.482F)
          curveToRelative(1.2F, -0.173F, 2.175F, -1.02F, 2.683F, -1.553F)
          curveToRelative(0.202F, -0.212F, 0.56F, -0.212F, 0.762F, 0.0F)
          close()        
      }
    }
    return _windowShield16!!
  }

private var _windowShield16: ImageVector? = null
