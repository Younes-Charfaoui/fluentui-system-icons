package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PersonSquare32: ImageVector
  get() {
    if (_personSquare32 != null) {
      return _personSquare32!!
    }
    _personSquare32 = fluentIcon(name = "Regular.PersonSquare32", 32f) {
      materialPath {
          moveTo(23.0F, 18.429F)
          curveToRelative(0.0F, 3.642F, -3.134F, 6.071F, -7.0F, 6.071F)
          reflectiveCurveToRelative(-7.0F, -2.429F, -7.0F, -6.071F)
          curveTo(9.0F, 17.087F, 10.087F, 16.0F, 11.429F, 16.0F)
          horizontalLineToRelative(9.142F)
          curveTo(21.913F, 16.0F, 23.0F, 17.087F, 23.0F, 18.429F)
          close()
          moveToRelative(-3.25F, -7.679F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          curveToRelative(-2.071F, 0.0F, -3.75F, -1.679F, -3.75F, -3.75F)
          curveTo(12.25F, 8.679F, 13.929F, 7.0F, 16.0F, 7.0F)
          curveToRelative(2.071F, 0.0F, 3.75F, 1.679F, 3.75F, 3.75F)
          close()
          moveTo(7.5F, 3.0F)
          curveTo(5.015F, 3.0F, 3.0F, 5.015F, 3.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveTo(3.0F, 26.985F, 5.015F, 29.0F, 7.5F, 29.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-17.0F)
          curveTo(29.0F, 5.015F, 26.985F, 3.0F, 24.5F, 3.0F)
          horizontalLineToRelative(-17.0F)
          close()
          moveTo(5.0F, 7.5F)
          curveTo(5.0F, 6.12F, 6.12F, 5.0F, 7.5F, 5.0F)
          horizontalLineToRelative(17.0F)
          curveTo(25.88F, 5.0F, 27.0F, 6.12F, 27.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-17.0F)
          curveTo(6.12F, 27.0F, 5.0F, 25.88F, 5.0F, 24.5F)
          verticalLineToRelative(-17.0F)
          close()        
      }
    }
    return _personSquare32!!
  }

private var _personSquare32: ImageVector? = null
