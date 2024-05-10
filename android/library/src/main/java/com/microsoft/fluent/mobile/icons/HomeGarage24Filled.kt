package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HomeGarage24: ImageVector
  get() {
    if (_homeGarage24 != null) {
      return _homeGarage24!!
    }
    _homeGarage24 = fluentIcon(name = "Filled.HomeGarage24", 24f) {
      materialPath {
          moveTo(13.456F, 2.534F)
          curveToRelative(-0.84F, -0.712F, -2.072F, -0.712F, -2.912F, 0.0F)
          lineToRelative(-6.75F, 5.728F)
          curveTo(3.291F, 8.689F, 3.0F, 9.316F, 3.0F, 9.977F)
          verticalLineToRelative(9.273F)
          curveTo(3.0F, 20.216F, 3.784F, 21.0F, 4.75F, 21.0F)
          horizontalLineTo(6.5F)
          verticalLineToRelative(-6.25F)
          curveTo(6.5F, 13.784F, 7.284F, 13.0F, 8.25F, 13.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineTo(21.0F)
          horizontalLineToRelative(1.75F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(9.977F)
          curveToRelative(0.0F, -0.66F, -0.29F, -1.288F, -0.794F, -1.715F)
          lineToRelative(-6.75F, -5.728F)
          close()
          moveTo(16.0F, 21.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(-2.5F)
          horizontalLineToRelative(8.0F)
          verticalLineTo(21.0F)
          close()
          moveToRelative(0.0F, -4.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(-2.25F)
          curveToRelative(0.0F, -0.138F, 0.112F, -0.25F, 0.25F, -0.25F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.138F, 0.0F, 0.25F, 0.112F, 0.25F, 0.25F)
          verticalLineTo(17.0F)
          close()        
      }
    }
    return _homeGarage24!!
  }

private var _homeGarage24: ImageVector? = null
