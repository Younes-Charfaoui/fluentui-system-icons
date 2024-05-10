package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextboxAlignBottomCenter16: ImageVector
  get() {
    if (_textboxAlignBottomCenter16 != null) {
      return _textboxAlignBottomCenter16!!
    }
    _textboxAlignBottomCenter16 = fluentIcon(name = "Regular.TextboxAlignBottomCenter16", 16f) {
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
          moveTo(3.0F, 4.5F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.328F, 3.0F, 13.0F, 3.672F, 13.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.672F, 13.0F, 3.0F, 12.328F, 3.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(5.5F, 7.0F)
          curveTo(5.224F, 7.0F, 5.0F, 7.224F, 5.0F, 7.5F)
          reflectiveCurveTo(5.224F, 8.0F, 5.5F, 8.0F)
          horizontalLineToRelative(5.0F)
          curveTo(10.776F, 8.0F, 11.0F, 7.776F, 11.0F, 7.5F)
          reflectiveCurveTo(10.776F, 7.0F, 10.5F, 7.0F)
          horizontalLineToRelative(-5.0F)
          close()
          moveToRelative(1.0F, 3.0F)
          curveTo(6.224F, 10.0F, 6.0F, 10.224F, 6.0F, 10.5F)
          reflectiveCurveTo(6.224F, 11.0F, 6.5F, 11.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(9.776F, 10.0F, 9.5F, 10.0F)
          horizontalLineToRelative(-3.0F)
          close()        
      }
    }
    return _textboxAlignBottomCenter16!!
  }

private var _textboxAlignBottomCenter16: ImageVector? = null
