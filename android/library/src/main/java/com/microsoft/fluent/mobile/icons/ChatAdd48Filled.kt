package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChatAdd48: ImageVector
  get() {
    if (_chatAdd48 != null) {
      return _chatAdd48!!
    }
    _chatAdd48 = fluentIcon(name = "Filled.ChatAdd48", 48f) {
      materialPath {
          moveTo(24.0F, 4.0F)
          curveToRelative(11.046F, 0.0F, 20.0F, 8.954F, 20.0F, 20.0F)
          reflectiveCurveToRelative(-8.954F, 20.0F, -20.0F, 20.0F)
          curveToRelative(-3.45F, 0.0F, -6.698F, -0.874F, -9.534F, -2.414F)
          lineToRelative(-8.235F, 2.342F)
          curveToRelative(-1.319F, 0.375F, -2.537F, -0.844F, -2.162F, -2.162F)
          lineToRelative(2.343F, -8.238F)
          curveTo(4.873F, 30.695F, 4.0F, 27.448F, 4.0F, 24.0F)
          curveTo(4.0F, 12.954F, 12.954F, 4.0F, 24.0F, 4.0F)
          close()
          moveToRelative(1.25F, 11.25F)
          curveToRelative(0.0F, -0.69F, -0.56F, -1.25F, -1.25F, -1.25F)
          reflectiveCurveToRelative(-1.25F, 0.56F, -1.25F, 1.25F)
          verticalLineToRelative(7.5F)
          horizontalLineToRelative(-7.5F)
          curveTo(14.56F, 22.75F, 14.0F, 23.31F, 14.0F, 24.0F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(7.5F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveToRelative(1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-7.5F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineToRelative(-7.5F)
          verticalLineToRelative(-7.5F)
          close()        
      }
    }
    return _chatAdd48!!
  }

private var _chatAdd48: ImageVector? = null
