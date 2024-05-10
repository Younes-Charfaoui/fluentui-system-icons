package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Flag20: ImageVector
  get() {
    if (_flag20 != null) {
      return _flag20!!
    }
    _flag20 = fluentIcon(name = "Regular.Flag20", 20f) {
      materialPath {
          moveTo(5.0F, 13.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.4F, 0.0F, 0.637F, -0.445F, 0.416F, -0.777F)
          lineTo(14.101F, 8.0F)
          lineToRelative(2.815F, -4.223F)
          curveTo(17.137F, 3.445F, 16.899F, 3.0F, 16.5F, 3.0F)
          horizontalLineToRelative(-12.0F)
          curveTo(4.224F, 3.0F, 4.0F, 3.224F, 4.0F, 3.5F)
          verticalLineToRelative(14.0F)
          curveTo(4.0F, 17.776F, 4.224F, 18.0F, 4.5F, 18.0F)
          reflectiveCurveTo(5.0F, 17.776F, 5.0F, 17.5F)
          verticalLineTo(13.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(10.566F)
          lineToRelative(-2.482F, 3.723F)
          curveToRelative(-0.112F, 0.168F, -0.112F, 0.386F, 0.0F, 0.554F)
          lineTo(15.566F, 12.0F)
          horizontalLineTo(5.0F)
          close()        
      }
    }
    return _flag20!!
  }

private var _flag20: ImageVector? = null
