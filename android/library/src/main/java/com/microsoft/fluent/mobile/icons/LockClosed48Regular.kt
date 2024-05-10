package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LockClosed48: ImageVector
  get() {
    if (_lockClosed48 != null) {
      return _lockClosed48!!
    }
    _lockClosed48 = fluentIcon(name = "Regular.LockClosed48", 48f) {
      materialPath {
          moveTo(27.0F, 28.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          reflectiveCurveToRelative(-3.0F, -1.343F, -3.0F, -3.0F)
          reflectiveCurveToRelative(1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          close()
          moveTo(16.0F, 14.0F)
          verticalLineToRelative(-2.0F)
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
          close()
          moveToRelative(2.5F, -2.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(11.0F)
          verticalLineToRelative(-2.0F)
          curveToRelative(0.0F, -3.038F, -2.462F, -5.5F, -5.5F, -5.5F)
          reflectiveCurveToRelative(-5.5F, 2.462F, -5.5F, 5.5F)
          close()
          moveToRelative(-4.25F, 4.5F)
          curveToRelative(-2.071F, 0.0F, -3.75F, 1.679F, -3.75F, 3.75F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineToRelative(19.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineToRelative(-15.5F)
          curveToRelative(0.0F, -2.071F, -1.679F, -3.75F, -3.75F, -3.75F)
          horizontalLineToRelative(-19.5F)
          close()        
      }
    }
    return _lockClosed48!!
  }

private var _lockClosed48: ImageVector? = null
