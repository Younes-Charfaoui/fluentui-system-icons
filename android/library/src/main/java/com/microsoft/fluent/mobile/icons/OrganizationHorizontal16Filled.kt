package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.OrganizationHorizontal16: ImageVector
  get() {
    if (_organizationHorizontal16 != null) {
      return _organizationHorizontal16!!
    }
    _organizationHorizontal16 = fluentIcon(name = "Filled.OrganizationHorizontal16", 16f) {
      materialPath {
          moveTo(3.5F, 10.5F)
          curveTo(2.12F, 10.5F, 1.0F, 9.38F, 1.0F, 8.0F)
          reflectiveCurveToRelative(1.12F, -2.5F, 2.5F, -2.5F)
          curveToRelative(1.21F, 0.0F, 2.219F, 0.86F, 2.45F, 2.0F)
          horizontalLineTo(7.0F)
          verticalLineTo(5.367F)
          curveTo(7.0F, 4.612F, 7.612F, 4.0F, 8.367F, 4.0F)
          horizontalLineToRelative(1.683F)
          curveToRelative(0.232F, -1.141F, 1.24F, -2.0F, 2.45F, -2.0F)
          curveTo(13.88F, 2.0F, 15.0F, 3.12F, 15.0F, 4.5F)
          reflectiveCurveTo(13.88F, 7.0F, 12.5F, 7.0F)
          curveToRelative(-1.21F, 0.0F, -2.219F, -0.859F, -2.45F, -2.0F)
          horizontalLineTo(8.366F)
          curveTo(8.165F, 5.0F, 8.0F, 5.164F, 8.0F, 5.366F)
          verticalLineToRelative(5.267F)
          curveTo(8.0F, 10.836F, 8.164F, 11.0F, 8.367F, 11.0F)
          horizontalLineToRelative(1.683F)
          curveToRelative(0.232F, -1.141F, 1.24F, -2.0F, 2.45F, -2.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          reflectiveCurveTo(13.88F, 14.0F, 12.5F, 14.0F)
          curveToRelative(-1.21F, 0.0F, -2.219F, -0.859F, -2.45F, -2.0F)
          horizontalLineTo(8.366F)
          curveTo(7.613F, 12.0F, 7.0F, 11.388F, 7.0F, 10.633F)
          verticalLineTo(8.501F)
          horizontalLineTo(5.95F)
          curveTo(5.718F, 9.64F, 4.71F, 10.5F, 3.5F, 10.5F)
          close()        
      }
    }
    return _organizationHorizontal16!!
  }

private var _organizationHorizontal16: ImageVector? = null
