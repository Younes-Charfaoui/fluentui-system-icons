package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TabDesktop28: ImageVector
  get() {
    if (_tabDesktop28 != null) {
      return _tabDesktop28!!
    }
    _tabDesktop28 = fluentIcon(name = "Regular.TabDesktop28", 28f) {
      materialPath {
          moveTo(6.75F, 3.0F)
          curveTo(4.679F, 3.0F, 3.0F, 4.679F, 3.0F, 6.75F)
          verticalLineToRelative(14.5F)
          curveTo(3.0F, 23.321F, 4.679F, 25.0F, 6.75F, 25.0F)
          horizontalLineToRelative(14.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(6.75F)
          curveTo(25.0F, 4.679F, 23.321F, 3.0F, 21.25F, 3.0F)
          horizontalLineTo(6.75F)
          close()
          moveTo(4.5F, 6.75F)
          curveToRelative(0.0F, -1.243F, 1.007F, -2.25F, 2.25F, -2.25F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(1.75F)
          curveTo(13.0F, 7.769F, 14.231F, 9.0F, 15.75F, 9.0F)
          horizontalLineToRelative(7.75F)
          verticalLineToRelative(12.25F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(6.75F)
          curveToRelative(-1.243F, 0.0F, -2.25F, -1.007F, -2.25F, -2.25F)
          verticalLineTo(6.75F)
          close()
          moveToRelative(19.0F, 0.75F)
          horizontalLineToRelative(-7.75F)
          curveToRelative(-0.69F, 0.0F, -1.25F, -0.56F, -1.25F, -1.25F)
          verticalLineTo(4.5F)
          horizontalLineToRelative(6.75F)
          curveToRelative(1.243F, 0.0F, 2.25F, 1.007F, 2.25F, 2.25F)
          verticalLineTo(7.5F)
          close()        
      }
    }
    return _tabDesktop28!!
  }

private var _tabDesktop28: ImageVector? = null
