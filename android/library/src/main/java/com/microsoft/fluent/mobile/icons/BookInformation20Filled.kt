package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BookInformation20: ImageVector
  get() {
    if (_bookInformation20 != null) {
      return _bookInformation20!!
    }
    _bookInformation20 = fluentIcon(name = "Filled.BookInformation20", 20f) {
      materialPath {
          moveTo(6.0F, 2.0F)
          curveTo(4.895F, 2.0F, 4.0F, 2.895F, 4.0F, 4.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(15.776F, 17.0F, 15.5F, 17.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(4.75F, 3.75F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveTo(9.25F, 6.164F, 9.25F, 5.75F)
          reflectiveCurveTo(9.586F, 5.0F, 10.0F, 5.0F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          close()
          moveTo(10.5F, 12.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveToRelative(-0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-4.0F)
          curveTo(9.5F, 8.224F, 9.724F, 8.0F, 10.0F, 8.0F)
          reflectiveCurveToRelative(0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineToRelative(4.0F)
          close()        
      }
    }
    return _bookInformation20!!
  }

private var _bookInformation20: ImageVector? = null
