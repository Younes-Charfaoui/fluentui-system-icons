package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.NumberCircle448: ImageVector
  get() {
    if (_numberCircle448 != null) {
      return _numberCircle448!!
    }
    _numberCircle448 = fluentIcon(name = "Filled.NumberCircle448", 448f) {
      materialPath {
          moveTo(24.0F, 44.0F)
          curveToRelative(11.046F, 0.0F, 20.0F, -8.954F, 20.0F, -20.0F)
          reflectiveCurveTo(35.046F, 4.0F, 24.0F, 4.0F)
          reflectiveCurveTo(4.0F, 12.954F, 4.0F, 24.0F)
          reflectiveCurveToRelative(8.954F, 20.0F, 20.0F, 20.0F)
          close()
          moveToRelative(3.5F, -29.42F)
          verticalLineTo(27.5F)
          horizontalLineToRelative(2.25F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveTo(30.44F, 30.0F, 29.75F, 30.0F)
          horizontalLineTo(27.5F)
          verticalLineToRelative(2.75F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          reflectiveCurveTo(25.0F, 33.44F, 25.0F, 32.75F)
          verticalLineTo(30.0F)
          horizontalLineToRelative(-8.442F)
          curveToRelative(-1.235F, 0.0F, -1.974F, -1.375F, -1.293F, -2.405F)
          lineToRelative(9.209F, -13.925F)
          curveToRelative(0.902F, -1.364F, 3.026F, -0.726F, 3.026F, 0.91F)
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
