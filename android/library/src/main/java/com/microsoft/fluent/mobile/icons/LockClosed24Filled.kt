package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockClosed24: ImageVector
  get() {
    if (_lockClosed24 != null) {
      return _lockClosed24!!
    }
    _lockClosed24 = fluentIcon(name = "Filled.LockClosed24", 24f) {
      materialPath {
          moveTo(16.0F, 6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(0.75F)
          curveTo(18.545F, 7.0F, 20.0F, 8.455F, 20.0F, 10.25F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineToRelative(-9.5F)
          curveTo(5.455F, 21.0F, 4.0F, 19.545F, 4.0F, 17.75F)
          verticalLineToRelative(-7.5F)
          curveTo(4.0F, 8.455F, 5.455F, 7.0F, 7.25F, 7.0F)
          horizontalLineTo(8.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -2.21F, 1.79F, -4.0F, 4.0F, -4.0F)
          reflectiveCurveToRelative(4.0F, 1.79F, 4.0F, 4.0F)
          close()
          moveTo(9.5F, 6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(5.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          reflectiveCurveTo(9.5F, 4.62F, 9.5F, 6.0F)
          close()
          moveToRelative(2.5F, 9.5F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          reflectiveCurveToRelative(-0.672F, -1.5F, -1.5F, -1.5F)
          reflectiveCurveToRelative(-1.5F, 0.672F, -1.5F, 1.5F)
          reflectiveCurveToRelative(0.672F, 1.5F, 1.5F, 1.5F)
          close()        
      }
    }
    return _lockClosed24!!
  }

private var _lockClosed24: ImageVector? = null
