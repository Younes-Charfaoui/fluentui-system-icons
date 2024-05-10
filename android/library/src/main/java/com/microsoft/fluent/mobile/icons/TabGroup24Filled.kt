package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabGroup24: ImageVector
  get() {
    if (_tabGroup24 != null) {
      return _tabGroup24!!
    }
    _tabGroup24 = fluentIcon(name = "Filled.TabGroup24", 24f) {
      materialPath {
          moveTo(4.75F, 5.0F)
          curveTo(3.231F, 5.0F, 2.0F, 6.231F, 2.0F, 7.75F)
          verticalLineToRelative(5.5F)
          curveTo(2.0F, 14.769F, 3.231F, 16.0F, 4.75F, 16.0F)
          horizontalLineToRelative(12.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineToRelative(-5.5F)
          curveTo(20.0F, 6.231F, 18.769F, 5.0F, 17.25F, 5.0F)
          horizontalLineTo(4.75F)
          close()
          moveToRelative(1.75F, 5.5F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-7.5F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          close()
          moveToRelative(0.747F, 8.0F)
          curveToRelative(-1.069F, 0.0F, -1.995F, -0.61F, -2.45F, -1.5F)
          horizontalLineTo(17.25F)
          curveToRelative(2.07F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(7.8F)
          curveToRelative(0.889F, 0.457F, 1.497F, 1.382F, 1.497F, 2.45F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 2.899F, -2.35F, 5.25F, -5.25F, 5.25F)
          horizontalLineToRelative(-10.0F)
          close()        
      }
    }
    return _tabGroup24!!
  }

private var _tabGroup24: ImageVector? = null
