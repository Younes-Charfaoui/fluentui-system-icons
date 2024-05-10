package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Video48: ImageVector
  get() {
    if (_video48 != null) {
      return _video48!!
    }
    _video48 = fluentIcon(name = "Filled.Video48", 48f) {
      materialPath {
          moveTo(4.0F, 16.25F)
          curveTo(4.0F, 12.798F, 6.798F, 10.0F, 10.25F, 10.0F)
          horizontalLineToRelative(14.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, 2.798F, 6.25F, 6.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 3.452F, -2.798F, 6.25F, -6.25F, 6.25F)
          horizontalLineToRelative(-14.5F)
          curveTo(6.798F, 38.0F, 4.0F, 35.202F, 4.0F, 31.75F)
          verticalLineToRelative(-15.5F)
          close()
          moveToRelative(34.907F, 19.168F)
          lineTo(33.0F, 31.339F)
          verticalLineToRelative(-14.68F)
          lineToRelative(5.907F, -4.078F)
          curveToRelative(2.156F, -1.488F, 5.097F, 0.055F, 5.097F, 2.675F)
          verticalLineToRelative(17.487F)
          curveToRelative(0.0F, 2.62F, -2.941F, 4.163F, -5.097F, 2.675F)
          close()        
      }
    }
    return _video48!!
  }

private var _video48: ImageVector? = null
