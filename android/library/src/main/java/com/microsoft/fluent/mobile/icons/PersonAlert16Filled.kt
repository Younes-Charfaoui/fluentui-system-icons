package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonAlert16: ImageVector
  get() {
    if (_personAlert16 != null) {
      return _personAlert16!!
    }
    _personAlert16 = fluentIcon(name = "Filled.PersonAlert16", 16f) {
      materialPath {
          moveTo(6.533F, 12.356F)
          curveToRelative(-0.507F, 0.43F, -0.628F, 1.05F, -0.465F, 1.581F)
          curveTo(3.495F, 13.581F, 2.0F, 11.767F, 2.0F, 10.0F)
          verticalLineTo(9.5F)
          curveTo(2.0F, 8.672F, 2.672F, 8.0F, 3.5F, 8.0F)
          horizontalLineToRelative(4.534F)
          curveTo(7.694F, 8.588F, 7.5F, 9.271F, 7.5F, 10.0F)
          verticalLineToRelative(1.537F)
          lineToRelative(-0.966F, 0.819F)
          close()
          moveTo(7.0F, 1.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          reflectiveCurveTo(8.519F, 7.0F, 7.0F, 7.0F)
          reflectiveCurveTo(4.25F, 5.769F, 4.25F, 4.25F)
          reflectiveCurveTo(5.481F, 1.5F, 7.0F, 1.5F)
          close()
          moveTo(8.5F, 10.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          curveToRelative(1.656F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(2.0F)
          lineToRelative(1.32F, 1.119F)
          curveToRelative(0.355F, 0.3F, 0.142F, 0.881F, -0.324F, 0.881F)
          horizontalLineTo(7.503F)
          curveToRelative(-0.466F, 0.0F, -0.678F, -0.58F, -0.324F, -0.881F)
          lineTo(8.5F, 12.0F)
          verticalLineToRelative(-2.0F)
          close()
          moveToRelative(3.0F, 6.0F)
          curveToRelative(-0.653F, 0.0F, -1.21F, -0.418F, -1.415F, -1.0F)
          horizontalLineToRelative(2.829F)
          curveToRelative(-0.206F, 0.582F, -0.761F, 1.0F, -1.415F, 1.0F)
          close()        
      }
    }
    return _personAlert16!!
  }

private var _personAlert16: ImageVector? = null
