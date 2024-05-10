package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Video28: ImageVector
  get() {
    if (_video28 != null) {
      return _video28!!
    }
    _video28 = fluentIcon(name = "Filled.Video28", 28f) {
      materialPath {
          moveTo(2.0F, 9.75F)
          curveTo(2.0F, 7.679F, 3.679F, 6.0F, 5.75F, 6.0F)
          horizontalLineToRelative(8.5F)
          curveTo(16.321F, 6.0F, 18.0F, 7.679F, 18.0F, 9.75F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineToRelative(-8.5F)
          curveTo(3.679F, 22.0F, 2.0F, 20.321F, 2.0F, 18.25F)
          verticalLineToRelative(-8.5F)
          close()
          moveToRelative(21.252F, 10.933F)
          lineTo(19.0F, 17.747F)
          verticalLineTo(10.25F)
          lineToRelative(4.252F, -2.936F)
          curveToRelative(1.16F, -0.802F, 2.744F, 0.03F, 2.744F, 1.44F)
          verticalLineToRelative(10.49F)
          curveToRelative(0.0F, 1.41F, -1.583F, 2.241F, -2.744F, 1.44F)
          close()        
      }
    }
    return _video28!!
  }

private var _video28: ImageVector? = null
