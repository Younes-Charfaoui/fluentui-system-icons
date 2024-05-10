package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Book48: ImageVector
  get() {
    if (_book48 != null) {
      return _book48!!
    }
    _book48 = fluentIcon(name = "Filled.Book48", 48f) {
      materialPath {
          moveTo(14.25F, 4.0F)
          curveTo(10.798F, 4.0F, 8.0F, 6.798F, 8.0F, 10.25F)
          verticalLineToRelative(27.5F)
          curveTo(8.0F, 41.202F, 10.798F, 44.0F, 14.25F, 44.0F)
          horizontalLineToRelative(24.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineToRelative(-24.5F)
          curveToRelative(-1.814F, 0.0F, -3.328F, -1.288F, -3.675F, -3.0F)
          horizontalLineTo(37.75F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineToRelative(-26.0F)
          curveTo(40.0F, 6.798F, 37.202F, 4.0F, 33.75F, 4.0F)
          horizontalLineToRelative(-19.5F)
          close()
          moveTo(14.0F, 12.25F)
          curveToRelative(0.0F, -1.243F, 1.007F, -2.25F, 2.25F, -2.25F)
          horizontalLineToRelative(15.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, 1.007F, 2.25F, 2.25F)
          verticalLineToRelative(2.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineToRelative(-15.5F)
          curveTo(15.007F, 17.0F, 14.0F, 15.993F, 14.0F, 14.75F)
          verticalLineToRelative(-2.5F)
          close()        
      }
    }
    return _book48!!
  }

private var _book48: ImageVector? = null
