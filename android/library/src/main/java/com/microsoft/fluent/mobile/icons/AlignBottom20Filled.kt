package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.AlignBottom20: ImageVector
  get() {
    if (_alignBottom20 != null) {
      return _alignBottom20!!
    }
    _alignBottom20 = fluentIcon(name = "Filled.AlignBottom20", 20f) {
      materialPath {
          moveTo(2.5F, 17.0F)
          curveTo(2.224F, 17.0F, 2.0F, 16.776F, 2.0F, 16.5F)
          reflectiveCurveTo(2.224F, 16.0F, 2.5F, 16.0F)
          horizontalLineToRelative(15.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(17.776F, 17.0F, 17.5F, 17.0F)
          horizontalLineToRelative(-15.0F)
          close()
          moveTo(4.0F, 13.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          curveTo(4.895F, 3.0F, 4.0F, 3.895F, 4.0F, 5.0F)
          verticalLineToRelative(8.0F)
          close()
          moveToRelative(7.0F, 0.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(1.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineToRelative(-1.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          close()        
      }
    }
    return _alignBottom20!!
  }

private var _alignBottom20: ImageVector? = null
