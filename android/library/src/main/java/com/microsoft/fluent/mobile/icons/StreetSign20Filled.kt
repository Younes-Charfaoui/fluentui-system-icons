package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.StreetSign20: ImageVector
  get() {
    if (_streetSign20 != null) {
      return _streetSign20!!
    }
    _streetSign20 = fluentIcon(name = "Filled.StreetSign20", 20f) {
      materialPath {
          moveTo(7.0F, 4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(2.379F)
          curveToRelative(0.53F, 0.0F, 1.039F, 0.21F, 1.414F, 0.586F)
          lineToRelative(2.06F, 2.06F)
          curveTo(16.948F, 7.74F, 17.0F, 7.867F, 17.0F, 8.0F)
          curveToRelative(0.0F, 0.133F, -0.053F, 0.26F, -0.146F, 0.354F)
          lineToRelative(-2.061F, 2.06F)
          curveTo(14.418F, 10.79F, 13.909F, 11.0F, 13.379F, 11.0F)
          horizontalLineTo(11.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(8.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-6.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(4.0F)
          close()
          moveToRelative(3.0F, 0.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveTo(8.0F, 3.448F, 8.0F, 4.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(4.0F)
          close()
          moveTo(8.0F, 17.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(-6.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(6.0F)
          close()        
      }
    }
    return _streetSign20!!
  }

private var _streetSign20: ImageVector? = null
