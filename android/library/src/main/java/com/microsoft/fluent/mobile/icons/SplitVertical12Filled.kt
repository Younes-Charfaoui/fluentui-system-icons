package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SplitVertical12: ImageVector
  get() {
    if (_splitVertical12 != null) {
      return _splitVertical12!!
    }
    _splitVertical12 = fluentIcon(name = "Filled.SplitVertical12", 12f) {
      materialPath {
          moveTo(6.0F, 1.5F)
          curveTo(6.0F, 1.224F, 5.776F, 1.0F, 5.5F, 1.0F)
          reflectiveCurveTo(5.0F, 1.224F, 5.0F, 1.5F)
          verticalLineToRelative(9.0F)
          curveTo(5.0F, 10.776F, 5.224F, 11.0F, 5.5F, 11.0F)
          reflectiveCurveTo(6.0F, 10.776F, 6.0F, 10.5F)
          verticalLineToRelative(-9.0F)
          close()
          moveToRelative(-5.0F, 2.0F)
          curveTo(1.0F, 2.672F, 1.672F, 2.0F, 2.5F, 2.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(8.0F)
          horizontalLineTo(2.5F)
          curveTo(1.672F, 10.0F, 1.0F, 9.328F, 1.0F, 8.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveTo(7.0F, 10.0F)
          horizontalLineToRelative(1.5F)
          curveTo(9.328F, 10.0F, 10.0F, 9.328F, 10.0F, 8.5F)
          verticalLineToRelative(-5.0F)
          curveTo(10.0F, 2.672F, 9.328F, 2.0F, 8.5F, 2.0F)
          horizontalLineTo(7.0F)
          verticalLineToRelative(8.0F)
          close()        
      }
    }
    return _splitVertical12!!
  }

private var _splitVertical12: ImageVector? = null
