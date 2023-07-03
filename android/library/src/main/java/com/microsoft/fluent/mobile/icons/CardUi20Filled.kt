package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CardUi20: ImageVector
  get() {
    if (_cardUi20 != null) {
      return _cardUi20!!
    }
    _cardUi20 = fluentIcon(name = "Filled.CardUi20", 20f) {
      materialPath {
          moveTo(2.0F, 6.5F)
          curveTo(2.0F, 5.12F, 3.12F, 4.0F, 4.5F, 4.0F)
          horizontalLineToRelative(11.0F)
          curveTo(16.88F, 4.0F, 18.0F, 5.12F, 18.0F, 6.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-11.0F)
          curveTo(3.12F, 16.0F, 2.0F, 14.88F, 2.0F, 13.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(9.5F, 6.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(4.224F, 6.0F, 4.0F, 6.224F, 4.0F, 6.5F)
          reflectiveCurveTo(4.224F, 7.0F, 4.5F, 7.0F)
          horizontalLineToRelative(5.0F)
          curveTo(9.776F, 7.0F, 10.0F, 6.776F, 10.0F, 6.5F)
          reflectiveCurveTo(9.776F, 6.0F, 9.5F, 6.0F)
          close()
          moveToRelative(3.0F, 2.0F)
          horizontalLineToRelative(-8.0F)
          curveTo(4.224F, 8.0F, 4.0F, 8.224F, 4.0F, 8.5F)
          reflectiveCurveTo(4.224F, 9.0F, 4.5F, 9.0F)
          horizontalLineToRelative(8.0F)
          curveTo(12.776F, 9.0F, 13.0F, 8.776F, 13.0F, 8.5F)
          reflectiveCurveTo(12.776F, 8.0F, 12.5F, 8.0F)
          close()
          moveTo(5.0F, 11.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-1.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(5.0F)
          close()        
      }
    }
    return _cardUi20!!
  }

private var _cardUi20: ImageVector? = null
