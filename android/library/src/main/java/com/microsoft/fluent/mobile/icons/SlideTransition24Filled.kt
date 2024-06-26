package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SlideTransition24: ImageVector
  get() {
    if (_slideTransition24 != null) {
      return _slideTransition24!!
    }
    _slideTransition24 = fluentIcon(name = "Filled.SlideTransition24", 24f) {
      materialPath {
          moveTo(4.75F, 4.0F)
          curveTo(3.231F, 4.0F, 2.0F, 5.231F, 2.0F, 6.75F)
          verticalLineToRelative(10.5F)
          curveTo(2.0F, 18.769F, 3.231F, 20.0F, 4.75F, 20.0F)
          horizontalLineToRelative(14.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineTo(6.75F)
          curveTo(22.0F, 5.231F, 20.769F, 4.0F, 19.25F, 4.0F)
          horizontalLineTo(4.75F)
          close()
          moveTo(6.5F, 5.5F)
          verticalLineToRelative(13.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(-13.0F)
          horizontalLineToRelative(1.5F)
          close()
          moveToRelative(4.0F, 13.0F)
          horizontalLineTo(9.0F)
          verticalLineToRelative(-13.0F)
          horizontalLineToRelative(1.5F)
          verticalLineToRelative(13.0F)
          close()
          moveToRelative(5.0F, 0.0F)
          horizontalLineTo(14.0F)
          verticalLineToRelative(-13.0F)
          horizontalLineToRelative(1.5F)
          verticalLineToRelative(13.0F)
          close()        
      }
    }
    return _slideTransition24!!
  }

private var _slideTransition24: ImageVector? = null
