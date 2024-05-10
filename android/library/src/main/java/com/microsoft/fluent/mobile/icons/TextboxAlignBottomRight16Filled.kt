package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextboxAlignBottomRight16: ImageVector
  get() {
    if (_textboxAlignBottomRight16 != null) {
      return _textboxAlignBottomRight16!!
    }
    _textboxAlignBottomRight16 = fluentIcon(name = "Filled.TextboxAlignBottomRight16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveToRelative(6.0F, 5.0F)
          curveTo(10.776F, 7.0F, 11.0F, 7.224F, 11.0F, 7.5F)
          reflectiveCurveTo(10.776F, 8.0F, 10.5F, 8.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(5.224F, 8.0F, 5.0F, 7.776F, 5.0F, 7.5F)
          reflectiveCurveTo(5.224F, 7.0F, 5.5F, 7.0F)
          horizontalLineToRelative(5.0F)
          close()
          moveToRelative(0.0F, 3.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(10.776F, 11.0F, 10.5F, 11.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(7.224F, 11.0F, 7.0F, 10.776F, 7.0F, 10.5F)
          reflectiveCurveTo(7.224F, 10.0F, 7.5F, 10.0F)
          horizontalLineToRelative(3.0F)
          close()        
      }
    }
    return _textboxAlignBottomRight16!!
  }

private var _textboxAlignBottomRight16: ImageVector? = null
