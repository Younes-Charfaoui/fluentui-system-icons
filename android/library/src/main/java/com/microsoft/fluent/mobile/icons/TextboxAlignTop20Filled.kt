package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextboxAlignTop20: ImageVector
  get() {
    if (_textboxAlignTop20 != null) {
      return _textboxAlignTop20!!
    }
    _textboxAlignTop20 = fluentIcon(name = "Filled.TextboxAlignTop20", 20f) {
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
          moveToRelative(1.0F, 3.0F)
          horizontalLineToRelative(7.0F)
          curveTo(13.776F, 6.0F, 14.0F, 6.224F, 14.0F, 6.5F)
          reflectiveCurveTo(13.776F, 7.0F, 13.5F, 7.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(6.224F, 7.0F, 6.0F, 6.776F, 6.0F, 6.5F)
          reflectiveCurveTo(6.224F, 6.0F, 6.5F, 6.0F)
          close()
          moveToRelative(0.0F, 3.0F)
          horizontalLineToRelative(7.0F)
          curveTo(13.776F, 9.0F, 14.0F, 9.224F, 14.0F, 9.5F)
          reflectiveCurveTo(13.776F, 10.0F, 13.5F, 10.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(6.224F, 10.0F, 6.0F, 9.776F, 6.0F, 9.5F)
          reflectiveCurveTo(6.224F, 9.0F, 6.5F, 9.0F)
          close()        
      }
    }
    return _textboxAlignTop20!!
  }

private var _textboxAlignTop20: ImageVector? = null
