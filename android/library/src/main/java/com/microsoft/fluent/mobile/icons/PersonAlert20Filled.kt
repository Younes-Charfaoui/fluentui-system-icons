package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonAlert20: ImageVector
  get() {
    if (_personAlert20 != null) {
      return _personAlert20!!
    }
    _personAlert20 = fluentIcon(name = "Filled.PersonAlert20", 20f) {
      materialPath {
          moveTo(9.0F, 2.0F)
          curveTo(6.79F, 2.0F, 5.0F, 3.79F, 5.0F, 6.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          reflectiveCurveToRelative(4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          close()
          moveToRelative(-4.991F, 9.0F)
          curveTo(2.903F, 11.0F, 2.0F, 11.887F, 2.0F, 13.0F)
          curveToRelative(0.0F, 1.691F, 0.833F, 2.966F, 2.135F, 3.797F)
          curveTo(5.417F, 17.614F, 7.145F, 18.0F, 9.0F, 18.0F)
          curveToRelative(0.377F, 0.0F, 0.749F, -0.016F, 1.113F, -0.048F)
          curveToRelative(-1.116F, -0.287F, -1.54F, -1.782F, -0.58F, -2.596F)
          lineToRelative(0.966F, -0.82F)
          verticalLineTo(13.0F)
          curveToRelative(0.0F, -0.729F, 0.195F, -1.412F, 0.535F, -2.0F)
          horizontalLineTo(4.01F)
          close()
          moveToRelative(7.49F, 2.0F)
          curveToRelative(0.0F, -1.657F, 1.344F, -3.0F, 3.0F, -3.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(2.0F)
          lineToRelative(1.32F, 1.119F)
          curveToRelative(0.356F, 0.3F, 0.143F, 0.881F, -0.323F, 0.881F)
          horizontalLineToRelative(-7.993F)
          curveToRelative(-0.466F, 0.0F, -0.678F, -0.58F, -0.323F, -0.881F)
          lineTo(11.5F, 15.0F)
          verticalLineToRelative(-2.0F)
          close()
          moveToRelative(3.0F, 6.0F)
          curveToRelative(-0.652F, 0.0F, -1.208F, -0.418F, -1.414F, -1.0F)
          horizontalLineToRelative(2.829F)
          curveToRelative(-0.206F, 0.582F, -0.761F, 1.0F, -1.415F, 1.0F)
          close()        
      }
    }
    return _personAlert20!!
  }

private var _personAlert20: ImageVector? = null
