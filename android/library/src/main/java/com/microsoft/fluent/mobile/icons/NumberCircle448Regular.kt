package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.NumberCircle448: ImageVector
  get() {
    if (_numberCircle448 != null) {
      return _numberCircle448!!
    }
    _numberCircle448 = fluentIcon(name = "Regular.NumberCircle448", 448f) {
      materialPath {
          moveTo(6.5F, 24.0F)
          curveToRelative(0.0F, -9.665F, 7.835F, -17.5F, 17.5F, -17.5F)
          reflectiveCurveTo(41.5F, 14.335F, 41.5F, 24.0F)
          reflectiveCurveTo(33.665F, 41.5F, 24.0F, 41.5F)
          reflectiveCurveTo(6.5F, 33.665F, 6.5F, 24.0F)
          close()
          moveTo(24.0F, 4.0F)
          curveTo(12.954F, 4.0F, 4.0F, 12.954F, 4.0F, 24.0F)
          reflectiveCurveToRelative(8.954F, 20.0F, 20.0F, 20.0F)
          reflectiveCurveToRelative(20.0F, -8.954F, 20.0F, -20.0F)
          reflectiveCurveTo(35.046F, 4.0F, 24.0F, 4.0F)
          close()
          moveToRelative(3.5F, 10.58F)
          curveToRelative(0.0F, -1.636F, -2.124F, -2.274F, -3.026F, -0.91F)
          lineToRelative(-9.209F, 13.925F)
          curveTo(14.584F, 28.625F, 15.323F, 30.0F, 16.558F, 30.0F)
          horizontalLineTo(25.0F)
          verticalLineToRelative(2.75F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveToRelative(1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineTo(30.0F)
          horizontalLineToRelative(2.25F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineTo(27.5F)
          verticalLineTo(14.58F)
          close()
          moveTo(25.0F, 17.406F)
          verticalLineTo(27.5F)
          horizontalLineToRelative(-6.675F)
          lineTo(25.0F, 17.406F)
          close()        
      }
    }
    return _numberCircle448!!
  }

private var _numberCircle448: ImageVector? = null
