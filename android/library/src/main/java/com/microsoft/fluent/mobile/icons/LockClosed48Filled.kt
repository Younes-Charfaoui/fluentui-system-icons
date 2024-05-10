package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LockClosed48: ImageVector
  get() {
    if (_lockClosed48 != null) {
      return _lockClosed48!!
    }
    _lockClosed48 = fluentIcon(name = "Filled.LockClosed48", 48f) {
      materialPath {
          moveTo(16.0F, 12.0F)
          curveToRelative(0.0F, -4.418F, 3.582F, -8.0F, 8.0F, -8.0F)
          reflectiveCurveToRelative(8.0F, 3.582F, 8.0F, 8.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(1.75F)
          curveToRelative(3.452F, 0.0F, 6.25F, 2.798F, 6.25F, 6.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 3.452F, -2.798F, 6.25F, -6.25F, 6.25F)
          horizontalLineToRelative(-19.5F)
          curveTo(10.798F, 42.0F, 8.0F, 39.202F, 8.0F, 35.75F)
          verticalLineToRelative(-15.5F)
          curveTo(8.0F, 16.798F, 10.798F, 14.0F, 14.25F, 14.0F)
          horizontalLineTo(16.0F)
          verticalLineToRelative(-2.0F)
          close()
          moveToRelative(8.0F, -5.5F)
          curveToRelative(-3.038F, 0.0F, -5.5F, 2.462F, -5.5F, 5.5F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(11.0F)
          verticalLineToRelative(-2.0F)
          curveToRelative(0.0F, -3.038F, -2.462F, -5.5F, -5.5F, -5.5F)
          close()
          moveTo(24.0F, 31.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          reflectiveCurveToRelative(-1.343F, -3.0F, -3.0F, -3.0F)
          reflectiveCurveToRelative(-3.0F, 1.343F, -3.0F, 3.0F)
          reflectiveCurveToRelative(1.343F, 3.0F, 3.0F, 3.0F)
          close()        
      }
    }
    return _lockClosed48!!
  }

private var _lockClosed48: ImageVector? = null
