package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Mail48: ImageVector
  get() {
    if (_mail48 != null) {
      return _mail48!!
    }
    _mail48 = fluentIcon(name = "Regular.Mail48", 48f) {
      materialPath {
          moveTo(10.25F, 8.0F)
          curveTo(6.798F, 8.0F, 4.0F, 10.798F, 4.0F, 14.25F)
          verticalLineToRelative(19.5F)
          curveTo(4.0F, 37.202F, 6.798F, 40.0F, 10.25F, 40.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineToRelative(-19.5F)
          curveTo(44.0F, 10.798F, 41.202F, 8.0F, 37.75F, 8.0F)
          horizontalLineToRelative(-27.5F)
          close()
          moveTo(6.5F, 14.25F)
          curveToRelative(0.0F, -2.071F, 1.679F, -3.75F, 3.75F, -3.75F)
          horizontalLineToRelative(27.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, 1.679F, 3.75F, 3.75F)
          verticalLineToRelative(0.89F)
          lineToRelative(-17.498F, 9.21F)
          lineTo(6.5F, 15.063F)
          verticalLineTo(14.25F)
          close()
          moveToRelative(0.0F, 3.644F)
          lineToRelative(16.914F, 8.974F)
          curveToRelative(0.365F, 0.194F, 0.802F, 0.194F, 1.168F, 0.002F)
          lineTo(41.5F, 17.965F)
          verticalLineTo(33.75F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineToRelative(-27.5F)
          curveToRelative(-2.071F, 0.0F, -3.75F, -1.679F, -3.75F, -3.75F)
          verticalLineTo(17.894F)
          close()        
      }
    }
    return _mail48!!
  }

private var _mail48: ImageVector? = null
