package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonPhone24: ImageVector
  get() {
    if (_personPhone24 != null) {
      return _personPhone24!!
    }
    _personPhone24 = fluentIcon(name = "Filled.PersonPhone24", 24f) {
      materialPath {
          moveTo(14.0F, 21.372F)
          verticalLineTo(14.0F)
          horizontalLineTo(4.253F)
          curveToRelative(-1.242F, 0.0F, -2.25F, 1.007F, -2.25F, 2.249F)
          verticalLineToRelative(0.92F)
          curveToRelative(0.0F, 0.572F, 0.18F, 1.13F, 0.511F, 1.596F)
          curveTo(4.056F, 20.929F, 6.58F, 22.0F, 10.0F, 22.0F)
          curveToRelative(1.51F, 0.0F, 2.847F, -0.209F, 4.0F, -0.629F)
          close()
          moveTo(10.0F, 2.005F)
          curveToRelative(2.762F, 0.0F, 5.0F, 2.238F, 5.0F, 5.0F)
          curveToRelative(0.0F, 2.761F, -2.238F, 5.0F, -5.0F, 5.0F)
          curveToRelative(-2.761F, 0.0F, -5.0F, -2.239F, -5.0F, -5.0F)
          curveToRelative(0.0F, -2.762F, 2.239F, -5.0F, 5.0F, -5.0F)
          close()
          moveTo(21.255F, 10.0F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 0.967F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(16.75F)
          curveTo(15.784F, 23.0F, 15.0F, 22.217F, 15.0F, 21.25F)
          verticalLineToRelative(-9.5F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(4.505F)
          close()
          moveToRelative(-2.002F, 8.997F)
          horizontalLineToRelative(-0.5F)
          lineToRelative(-0.102F, 0.007F)
          curveToRelative(-0.366F, 0.05F, -0.648F, 0.363F, -0.648F, 0.743F)
          curveToRelative(0.0F, 0.414F, 0.335F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(0.5F)
          lineToRelative(0.101F, -0.007F)
          curveToRelative(0.366F, -0.05F, 0.649F, -0.363F, 0.649F, -0.743F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          close()        
      }
    }
    return _personPhone24!!
  }

private var _personPhone24: ImageVector? = null
