package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextboxAlignMiddleLeft20: ImageVector
  get() {
    if (_textboxAlignMiddleLeft20 != null) {
      return _textboxAlignMiddleLeft20!!
    }
    _textboxAlignMiddleLeft20 = fluentIcon(name = "Regular.TextboxAlignMiddleLeft20", 20f) {
      materialPath {
          moveTo(5.5F, 3.0F)
          curveTo(4.12F, 3.0F, 3.0F, 4.12F, 3.0F, 5.5F)
          verticalLineToRelative(9.0F)
          curveTo(3.0F, 15.88F, 4.12F, 17.0F, 5.5F, 17.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-9.0F)
          curveTo(17.0F, 4.12F, 15.88F, 3.0F, 14.5F, 3.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(4.0F, 5.5F)
          curveTo(4.0F, 4.672F, 4.672F, 4.0F, 5.5F, 4.0F)
          horizontalLineToRelative(9.0F)
          curveTo(15.328F, 4.0F, 16.0F, 4.672F, 16.0F, 5.5F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-9.0F)
          curveTo(4.672F, 16.0F, 4.0F, 15.328F, 4.0F, 14.5F)
          verticalLineToRelative(-9.0F)
          close()
          moveTo(6.5F, 8.0F)
          curveTo(6.224F, 8.0F, 6.0F, 8.224F, 6.0F, 8.5F)
          reflectiveCurveTo(6.224F, 9.0F, 6.5F, 9.0F)
          horizontalLineToRelative(7.0F)
          curveTo(13.776F, 9.0F, 14.0F, 8.776F, 14.0F, 8.5F)
          reflectiveCurveTo(13.776F, 8.0F, 13.5F, 8.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveToRelative(0.0F, 3.0F)
          curveTo(6.224F, 11.0F, 6.0F, 11.224F, 6.0F, 11.5F)
          reflectiveCurveTo(6.224F, 12.0F, 6.5F, 12.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(11.776F, 11.0F, 11.5F, 11.0F)
          horizontalLineToRelative(-5.0F)
          close()        
      }
    }
    return _textboxAlignMiddleLeft20!!
  }

private var _textboxAlignMiddleLeft20: ImageVector? = null
