package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonClock24: ImageVector
  get() {
    if (_personClock24 != null) {
      return _personClock24!!
    }
    _personClock24 = fluentIcon(name = "Filled.PersonClock24", 24f) {
      materialPath {
          moveTo(12.022F, 14.0F)
          curveTo(11.375F, 15.01F, 11.0F, 16.21F, 11.0F, 17.5F)
          curveToRelative(0.0F, 1.63F, 0.6F, 3.121F, 1.593F, 4.263F)
          curveTo(11.796F, 21.922F, 10.93F, 22.0F, 10.0F, 22.0F)
          curveToRelative(-3.146F, 0.0F, -5.532F, -0.905F, -7.098F, -2.74F)
          curveToRelative(-0.58F, -0.678F, -0.898F, -1.542F, -0.898F, -2.434F)
          verticalLineToRelative(-0.578F)
          curveToRelative(0.0F, -1.242F, 1.007F, -2.25F, 2.249F, -2.25F)
          horizontalLineToRelative(7.769F)
          close()
          moveTo(15.0F, 7.005F)
          curveToRelative(0.0F, -2.762F, -2.238F, -5.0F, -5.0F, -5.0F)
          curveToRelative(-2.761F, 0.0F, -5.0F, 2.238F, -5.0F, 5.0F)
          curveToRelative(0.0F, 2.761F, 2.239F, 5.0F, 5.0F, 5.0F)
          curveToRelative(2.762F, 0.0F, 5.0F, -2.239F, 5.0F, -5.0F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, -3.038F, -2.462F, -5.5F, -5.5F, -5.5F)
          reflectiveCurveTo(12.0F, 14.462F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, 5.5F, 5.5F, 5.5F)
          reflectiveCurveToRelative(5.5F, -2.462F, 5.5F, -5.5F)
          close()
          moveTo(17.5F, 14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(20.276F, 18.0F, 20.0F, 18.0F)
          horizontalLineToRelative(-2.5F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          close()        
      }
    }
    return _personClock24!!
  }

private var _personClock24: ImageVector? = null
