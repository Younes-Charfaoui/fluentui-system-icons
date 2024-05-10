package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Laptop32: ImageVector
  get() {
    if (_laptop32 != null) {
      return _laptop32!!
    }
    _laptop32 = fluentIcon(name = "Filled.Laptop32", 32f) {
      materialPath {
          moveTo(4.0F, 9.25F)
          curveTo(4.0F, 7.455F, 5.455F, 6.0F, 7.25F, 6.0F)
          horizontalLineToRelative(17.5F)
          curveTo(26.545F, 6.0F, 28.0F, 7.455F, 28.0F, 9.25F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(7.25F)
          curveTo(5.455F, 22.0F, 4.0F, 20.545F, 4.0F, 18.75F)
          verticalLineToRelative(-9.5F)
          close()
          moveTo(3.0F, 24.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(26.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _laptop32!!
  }

private var _laptop32: ImageVector? = null
