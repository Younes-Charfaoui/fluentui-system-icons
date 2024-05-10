package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockOpen24: ImageVector
  get() {
    if (_lockOpen24 != null) {
      return _lockOpen24!!
    }
    _lockOpen24 = fluentIcon(name = "Filled.LockOpen24", 24f) {
      materialPath {
          moveTo(16.0F, 5.0F)
          curveToRelative(0.0F, -1.38F, 1.12F, -2.5F, 2.5F, -2.5F)
          reflectiveCurveTo(21.0F, 3.62F, 21.0F, 5.0F)
          verticalLineToRelative(0.25F)
          curveTo(21.0F, 5.664F, 21.336F, 6.0F, 21.75F, 6.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -2.21F, -1.79F, -4.0F, -4.0F, -4.0F)
          reflectiveCurveToRelative(-4.0F, 1.79F, -4.0F, 4.0F)
          verticalLineToRelative(2.0F)
          horizontalLineTo(7.25F)
          curveTo(5.455F, 7.0F, 4.0F, 8.455F, 4.0F, 10.25F)
          verticalLineToRelative(7.5F)
          curveTo(4.0F, 19.545F, 5.455F, 21.0F, 7.25F, 21.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-7.5F)
          curveTo(20.0F, 8.455F, 18.545F, 7.0F, 16.75F, 7.0F)
          horizontalLineTo(16.0F)
          verticalLineTo(5.0F)
          close()
          moveToRelative(-4.0F, 10.5F)
          curveToRelative(-0.828F, 0.0F, -1.5F, -0.672F, -1.5F, -1.5F)
          reflectiveCurveToRelative(0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveToRelative(-0.672F, 1.5F, -1.5F, 1.5F)
          close()        
      }
    }
    return _lockOpen24!!
  }

private var _lockOpen24: ImageVector? = null
