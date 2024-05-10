package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Video24: ImageVector
  get() {
    if (_video24 != null) {
      return _video24!!
    }
    _video24 = fluentIcon(name = "Regular.Video24", 24f) {
      materialPath {
          moveTo(5.25F, 5.0F)
          curveTo(3.455F, 5.0F, 2.0F, 6.455F, 2.0F, 8.25F)
          verticalLineToRelative(7.5F)
          curveTo(2.0F, 17.545F, 3.455F, 19.0F, 5.25F, 19.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-0.312F)
          lineToRelative(3.258F, 2.25F)
          curveToRelative(1.16F, 0.8F, 2.744F, -0.03F, 2.744F, -1.44F)
          verticalLineTo(7.751F)
          curveToRelative(0.0F, -1.41F, -1.584F, -2.242F, -2.744F, -1.44F)
          lineTo(16.0F, 8.562F)
          verticalLineTo(8.25F)
          curveTo(16.0F, 6.455F, 14.545F, 5.0F, 12.75F, 5.0F)
          horizontalLineToRelative(-7.5F)
          close()
          moveTo(16.0F, 10.384F)
          lineToRelative(4.11F, -2.838F)
          curveToRelative(0.166F, -0.114F, 0.392F, 0.005F, 0.392F, 0.206F)
          verticalLineToRelative(8.495F)
          curveToRelative(0.0F, 0.202F, -0.226F, 0.32F, -0.392F, 0.206F)
          lineTo(16.0F, 13.615F)
          verticalLineToRelative(-3.231F)
          close()
          moveTo(3.5F, 8.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(7.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-7.5F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineToRelative(-7.5F)
          close()        
      }
    }
    return _video24!!
  }

private var _video24: ImageVector? = null
