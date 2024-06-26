package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabDesktop28: ImageVector
  get() {
    if (_tabDesktop28 != null) {
      return _tabDesktop28!!
    }
    _tabDesktop28 = fluentIcon(name = "Filled.TabDesktop28", 28f) {
      materialPath {
          moveTo(13.0F, 3.0F)
          verticalLineToRelative(3.25F)
          curveTo(13.0F, 7.769F, 14.231F, 9.0F, 15.75F, 9.0F)
          horizontalLineTo(25.0F)
          verticalLineToRelative(12.25F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineTo(6.75F)
          curveTo(4.679F, 25.0F, 3.0F, 23.321F, 3.0F, 21.25F)
          verticalLineTo(6.75F)
          curveTo(3.0F, 4.679F, 4.679F, 3.0F, 6.75F, 3.0F)
          horizontalLineTo(13.0F)
          close()
          moveToRelative(1.5F, 0.0F)
          verticalLineToRelative(3.25F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineTo(25.0F)
          verticalLineTo(6.75F)
          curveTo(25.0F, 4.679F, 23.321F, 3.0F, 21.25F, 3.0F)
          horizontalLineTo(14.5F)
          close()        
      }
    }
    return _tabDesktop28!!
  }

private var _tabDesktop28: ImageVector? = null
