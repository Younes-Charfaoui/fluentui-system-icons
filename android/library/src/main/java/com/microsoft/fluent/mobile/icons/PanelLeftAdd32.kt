package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelLeftAdd32: ImageVector
  get() {
    if (_panelLeftAdd32 != null) {
      return _panelLeftAdd32!!
    }
    _panelLeftAdd32 = fluentIcon(name = "Filled.PanelLeftAdd32", 32f) {
      materialPath {
          moveTo(6.5F, 28.0F)
          horizontalLineToRelative(9.015F)
          curveToRelative(-0.413F, -0.617F, -0.751F, -1.288F, -1.003F, -2.0F)
          horizontalLineTo(12.0F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(13.5F)
          curveTo(26.88F, 6.0F, 28.0F, 7.12F, 28.0F, 8.5F)
          verticalLineToRelative(7.015F)
          curveToRelative(0.755F, 0.506F, 1.43F, 1.123F, 2.0F, 1.828F)
          verticalLineTo(8.5F)
          curveTo(30.0F, 6.015F, 27.985F, 4.0F, 25.5F, 4.0F)
          horizontalLineToRelative(-19.0F)
          curveTo(4.015F, 4.0F, 2.0F, 6.015F, 2.0F, 8.5F)
          verticalLineToRelative(15.0F)
          curveTo(2.0F, 25.985F, 4.015F, 28.0F, 6.5F, 28.0F)
          close()
          moveTo(23.0F, 30.5F)
          curveToRelative(4.142F, 0.0F, 7.5F, -3.358F, 7.5F, -7.5F)
          curveToRelative(0.0F, -4.142F, -3.358F, -7.5F, -7.5F, -7.5F)
          curveToRelative(-4.142F, 0.0F, -7.5F, 3.358F, -7.5F, 7.5F)
          curveToRelative(0.0F, 4.142F, 3.358F, 7.5F, 7.5F, 7.5F)
          close()
          moveToRelative(1.0F, -12.25F)
          verticalLineTo(22.0F)
          horizontalLineToRelative(3.75F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(24.0F)
          verticalLineToRelative(3.75F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(23.5F)
          horizontalLineToRelative(-3.75F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          reflectiveCurveTo(18.336F, 22.0F, 18.75F, 22.0F)
          horizontalLineToRelative(3.75F)
          verticalLineToRelative(-3.75F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          reflectiveCurveTo(24.0F, 17.836F, 24.0F, 18.25F)
          close()        
      }
    }
    return _panelLeftAdd32!!
  }

private var _panelLeftAdd32: ImageVector? = null
