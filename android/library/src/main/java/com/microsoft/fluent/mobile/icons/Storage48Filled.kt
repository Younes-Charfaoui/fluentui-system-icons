package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Storage48: ImageVector
  get() {
    if (_storage48 != null) {
      return _storage48!!
    }
    _storage48 = fluentIcon(name = "Filled.Storage48", 48f) {
      materialPath {
          moveTo(10.25F, 14.0F)
          curveTo(6.798F, 14.0F, 4.0F, 16.798F, 4.0F, 20.25F)
          verticalLineToRelative(7.5F)
          curveTo(4.0F, 31.202F, 6.798F, 34.0F, 10.25F, 34.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineToRelative(-7.5F)
          curveToRelative(0.0F, -3.452F, -2.798F, -6.25F, -6.25F, -6.25F)
          horizontalLineToRelative(-27.5F)
          close()
          moveTo(32.0F, 21.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(5.0F, 2.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          reflectiveCurveToRelative(-0.895F, 2.0F, -2.0F, 2.0F)
          close()        
      }
    }
    return _storage48!!
  }

private var _storage48: ImageVector? = null
