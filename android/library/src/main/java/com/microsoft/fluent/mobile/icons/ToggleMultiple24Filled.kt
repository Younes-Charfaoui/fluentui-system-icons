package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ToggleMultiple24: ImageVector
  get() {
    if (_toggleMultiple24 != null) {
      return _toggleMultiple24!!
    }
    _toggleMultiple24 = fluentIcon(name = "Filled.ToggleMultiple24", 24f) {
      materialPath {
          moveTo(2.0F, 6.5F)
          curveTo(2.0F, 4.015F, 4.015F, 2.0F, 6.5F, 2.0F)
          horizontalLineToRelative(11.0F)
          curveTo(19.985F, 2.0F, 22.0F, 4.015F, 22.0F, 6.5F)
          reflectiveCurveTo(19.985F, 11.0F, 17.5F, 11.0F)
          horizontalLineToRelative(-11.0F)
          curveTo(4.015F, 11.0F, 2.0F, 8.985F, 2.0F, 6.5F)
          close()
          moveToRelative(4.5F, 2.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          reflectiveCurveToRelative(-2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          close()
          moveToRelative(0.0F, 4.5F)
          curveTo(4.015F, 13.0F, 2.0F, 15.015F, 2.0F, 17.5F)
          reflectiveCurveTo(4.015F, 22.0F, 6.5F, 22.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          reflectiveCurveTo(19.985F, 13.0F, 17.5F, 13.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveToRelative(13.0F, 4.5F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()        
      }
    }
    return _toggleMultiple24!!
  }

private var _toggleMultiple24: ImageVector? = null
