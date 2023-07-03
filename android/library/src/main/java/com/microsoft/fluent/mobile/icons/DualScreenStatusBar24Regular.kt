package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DualScreenStatusBar24: ImageVector
  get() {
    if (_dualScreenStatusBar24 != null) {
      return _dualScreenStatusBar24!!
    }
    _dualScreenStatusBar24 = fluentIcon(name = "Regular.DualScreenStatusBar24", 24f) {
      materialPath {
          moveTo(12.748F, 4.002F)
          lineToRelative(-0.001F, 0.002F)
          horizontalLineToRelative(7.498F)
          curveToRelative(0.967F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineTo(18.25F)
          curveToRelative(0.0F, 0.966F, -0.783F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-8.997F)
          lineToRelative(-0.001F, -0.003F)
          horizontalLineTo(3.75F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.783F, -1.75F, -1.75F)
          verticalLineTo(5.752F)
          curveToRelative(0.0F, -0.967F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(8.998F)
          close()
          moveToRelative(7.497F, 1.502F)
          horizontalLineToRelative(-7.497F)
          verticalLineTo(18.5F)
          horizontalLineToRelative(7.497F)
          curveToRelative(0.138F, 0.0F, 0.25F, -0.112F, 0.25F, -0.25F)
          verticalLineTo(5.754F)
          curveToRelative(0.0F, -0.138F, -0.112F, -0.25F, -0.25F, -0.25F)
          close()
          moveToRelative(-8.997F, -0.002F)
          horizontalLineTo(3.75F)
          curveToRelative(-0.138F, 0.0F, -0.25F, 0.112F, -0.25F, 0.25F)
          verticalLineToRelative(12.495F)
          curveToRelative(0.0F, 0.138F, 0.112F, 0.25F, 0.25F, 0.25F)
          horizontalLineToRelative(7.498F)
          verticalLineTo(5.502F)
          close()
          moveTo(18.75F, 6.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.335F, 0.75F, 0.75F)
          reflectiveCurveTo(19.164F, 8.0F, 18.75F, 8.0F)
          horizontalLineToRelative(-4.502F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          curveToRelative(0.0F, -0.415F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(4.502F)
          close()        
      }
    }
    return _dualScreenStatusBar24!!
  }

private var _dualScreenStatusBar24: ImageVector? = null
