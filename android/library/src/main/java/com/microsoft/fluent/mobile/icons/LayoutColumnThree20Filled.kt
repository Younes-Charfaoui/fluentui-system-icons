package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThree20: ImageVector
  get() {
    if (_layoutColumnThree20 != null) {
      return _layoutColumnThree20!!
    }
    _layoutColumnThree20 = fluentIcon(name = "Filled.LayoutColumnThree20", 20f) {
      materialPath {
          moveTo(13.0F, 17.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineToRelative(-1.0F)
          verticalLineToRelative(14.0F)
          close()
          moveTo(12.0F, 3.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(14.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(3.0F)
          close()
          moveTo(6.0F, 3.0F)
          horizontalLineToRelative(1.0F)
          verticalLineToRelative(14.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          close()        
      }
    }
    return _layoutColumnThree20!!
  }

private var _layoutColumnThree20: ImageVector? = null
