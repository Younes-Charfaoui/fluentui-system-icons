package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Video24: ImageVector
  get() {
    if (_video24 != null) {
      return _video24!!
    }
    _video24 = fluentIcon(name = "Filled.Video24", 24f) {
      materialPath {
          moveTo(2.0F, 8.25F)
          curveTo(2.0F, 6.455F, 3.455F, 5.0F, 5.25F, 5.0F)
          horizontalLineToRelative(6.5F)
          curveTo(13.545F, 5.0F, 15.0F, 6.455F, 15.0F, 8.25F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineToRelative(-6.5F)
          curveTo(3.455F, 19.0F, 2.0F, 17.545F, 2.0F, 15.75F)
          verticalLineToRelative(-7.5F)
          close()
          moveToRelative(17.257F, 9.438F)
          lineTo(16.0F, 15.44F)
          verticalLineTo(8.562F)
          lineToRelative(3.257F, -2.249F)
          curveToRelative(1.161F, -0.802F, 2.745F, 0.03F, 2.745F, 1.44F)
          verticalLineToRelative(8.495F)
          curveToRelative(0.0F, 1.41F, -1.584F, 2.242F, -2.745F, 1.44F)
          close()        
      }
    }
    return _video24!!
  }

private var _video24: ImageVector? = null
