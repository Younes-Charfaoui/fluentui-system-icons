package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Flow24: ImageVector
  get() {
    if (_flow24 != null) {
      return _flow24!!
    }
    _flow24 = fluentIcon(name = "Regular.Flow24", 24f) {
      materialPath {
          moveTo(18.0F, 5.5F)
          curveToRelative(-1.38F, 0.0F, -2.5F, 1.12F, -2.5F, 2.5F)
          reflectiveCurveToRelative(1.12F, 2.5F, 2.5F, 2.5F)
          reflectiveCurveToRelative(2.5F, -1.12F, 2.5F, -2.5F)
          reflectiveCurveToRelative(-1.12F, -2.5F, -2.5F, -2.5F)
          close()
          moveToRelative(-3.935F, 1.779F)
          curveTo(14.405F, 5.414F, 16.037F, 4.0F, 18.0F, 4.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, 1.79F, 4.0F, 4.0F)
          reflectiveCurveToRelative(-1.79F, 4.0F, -4.0F, 4.0F)
          curveToRelative(-1.935F, 0.0F, -3.549F, -1.374F, -3.92F, -3.2F)
          curveToRelative(-0.764F, 0.189F, -1.33F, 0.878F, -1.33F, 1.7F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 1.647F, -1.226F, 3.009F, -2.815F, 3.221F)
          curveTo(9.595F, 18.586F, 7.963F, 20.0F, 6.0F, 20.0F)
          curveToRelative(-2.21F, 0.0F, -4.0F, -1.79F, -4.0F, -4.0F)
          reflectiveCurveToRelative(1.79F, -4.0F, 4.0F, -4.0F)
          curveToRelative(1.935F, 0.0F, 3.549F, 1.374F, 3.92F, 3.2F)
          curveToRelative(0.764F, -0.189F, 1.33F, -0.878F, 1.33F, -1.7F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -1.647F, 1.226F, -3.008F, 2.815F, -3.221F)
          close()
          moveTo(6.0F, 13.5F)
          curveToRelative(-1.38F, 0.0F, -2.5F, 1.12F, -2.5F, 2.5F)
          reflectiveCurveToRelative(1.12F, 2.5F, 2.5F, 2.5F)
          reflectiveCurveToRelative(2.5F, -1.12F, 2.5F, -2.5F)
          reflectiveCurveToRelative(-1.12F, -2.5F, -2.5F, -2.5F)
          close()        
      }
    }
    return _flow24!!
  }

private var _flow24: ImageVector? = null
