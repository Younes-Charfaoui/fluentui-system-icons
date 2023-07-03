package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SplitHorizontal16: ImageVector
  get() {
    if (_splitHorizontal16 != null) {
      return _splitHorizontal16!!
    }
    _splitHorizontal16 = fluentIcon(name = "Filled.SplitHorizontal16", 16f) {
      materialPath {
          moveTo(14.5F, 8.0F)
          curveTo(14.776F, 8.0F, 15.0F, 7.776F, 15.0F, 7.5F)
          reflectiveCurveTo(14.776F, 7.0F, 14.5F, 7.0F)
          horizontalLineToRelative(-13.0F)
          curveTo(1.224F, 7.0F, 1.0F, 7.224F, 1.0F, 7.5F)
          reflectiveCurveTo(1.224F, 8.0F, 1.5F, 8.0F)
          horizontalLineToRelative(13.0F)
          close()
          moveTo(11.0F, 1.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(3.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(6.0F)
          close()
          moveTo(3.0F, 9.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(9.0F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _splitHorizontal16!!
  }

private var _splitHorizontal16: ImageVector? = null
