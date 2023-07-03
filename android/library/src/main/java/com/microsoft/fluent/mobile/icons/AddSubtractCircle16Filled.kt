package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.AddSubtractCircle16: ImageVector
  get() {
    if (_addSubtractCircle16 != null) {
      return _addSubtractCircle16!!
    }
    _addSubtractCircle16 = fluentIcon(name = "Filled.AddSubtractCircle16", 16f) {
      materialPath {
          moveTo(9.5F, 10.0F)
          curveTo(9.224F, 10.0F, 9.0F, 10.224F, 9.0F, 10.5F)
          reflectiveCurveTo(9.224F, 11.0F, 9.5F, 11.0F)
          horizontalLineTo(12.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(12.276F, 10.0F, 12.0F, 10.0F)
          horizontalLineTo(9.5F)
          close()
          moveTo(8.0F, 15.0F)
          curveToRelative(3.866F, 0.0F, 7.0F, -3.134F, 7.0F, -7.0F)
          reflectiveCurveToRelative(-3.134F, -7.0F, -7.0F, -7.0F)
          reflectiveCurveToRelative(-7.0F, 3.134F, -7.0F, 7.0F)
          reflectiveCurveToRelative(3.134F, 7.0F, 7.0F, 7.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          curveToRelative(-1.477F, 0.0F, -2.83F, -0.534F, -3.874F, -1.418F)
          lineToRelative(8.456F, -8.456F)
          curveTo(13.466F, 5.17F, 14.0F, 6.523F, 14.0F, 8.0F)
          curveToRelative(0.0F, 3.314F, -2.686F, 6.0F, -6.0F, 6.0F)
          close()
          moveTo(3.5F, 6.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(-1.0F)
          curveTo(5.0F, 4.224F, 5.224F, 4.0F, 5.5F, 4.0F)
          reflectiveCurveTo(6.0F, 4.224F, 6.0F, 4.5F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(7.276F, 6.5F, 7.0F, 6.5F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(0.8F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(5.0F, 7.576F, 5.0F, 7.3F)
          verticalLineTo(6.5F)
          horizontalLineTo(4.0F)
          curveTo(3.724F, 6.5F, 3.5F, 6.276F, 3.5F, 6.0F)
          close()        
      }
    }
    return _addSubtractCircle16!!
  }

private var _addSubtractCircle16: ImageVector? = null