package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Compose12: ImageVector
  get() {
    if (_compose12 != null) {
      return _compose12!!
    }
    _compose12 = fluentIcon(name = "Regular.Compose12", 12f) {
      materialPath {
          moveTo(10.854F, 1.853F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.511F, 0.0F, -0.706F)
          curveToRelative(-0.196F, -0.196F, -0.512F, -0.196F, -0.708F, 0.0F)
          lineTo(5.293F, 6.0F)
          lineTo(5.0F, 7.0F)
          lineToRelative(1.0F, -0.293F)
          lineToRelative(4.854F, -4.853F)
          close()
          moveTo(6.5F, 2.0F)
          curveTo(6.776F, 2.0F, 7.0F, 2.224F, 7.0F, 2.5F)
          reflectiveCurveTo(6.776F, 3.0F, 6.5F, 3.0F)
          horizontalLineTo(4.0F)
          curveTo(3.448F, 3.0F, 3.0F, 3.448F, 3.0F, 4.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(5.5F)
          curveTo(9.0F, 5.224F, 9.224F, 5.0F, 9.5F, 5.0F)
          reflectiveCurveTo(10.0F, 5.224F, 10.0F, 5.5F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(4.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(2.5F)
          close()        
      }
    }
    return _compose12!!
  }

private var _compose12: ImageVector? = null
