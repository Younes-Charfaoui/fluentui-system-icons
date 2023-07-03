package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextAlignCenterRotate9020: ImageVector
  get() {
    if (_textAlignCenterRotate9020 != null) {
      return _textAlignCenterRotate9020!!
    }
    _textAlignCenterRotate9020 = fluentIcon(name = "Regular.TextAlignCenterRotate9020", 9020f) {
      materialPath {
          moveTo(15.5F, 4.0F)
          curveTo(15.776F, 4.0F, 16.0F, 4.224F, 16.0F, 4.5F)
          verticalLineToRelative(11.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(15.0F, 15.776F, 15.0F, 15.5F)
          verticalLineToRelative(-11.0F)
          curveTo(15.0F, 4.224F, 15.224F, 4.0F, 15.5F, 4.0F)
          close()
          moveToRelative(-5.0F, -2.0F)
          curveTo(10.776F, 2.0F, 11.0F, 2.224F, 11.0F, 2.5F)
          verticalLineToRelative(15.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(10.0F, 17.776F, 10.0F, 17.5F)
          verticalLineToRelative(-15.0F)
          curveTo(10.0F, 2.224F, 10.224F, 2.0F, 10.5F, 2.0F)
          close()
          moveTo(6.0F, 6.5F)
          curveTo(6.0F, 6.224F, 5.776F, 6.0F, 5.5F, 6.0F)
          reflectiveCurveTo(5.0F, 6.224F, 5.0F, 6.5F)
          verticalLineToRelative(7.0F)
          curveTo(5.0F, 13.776F, 5.224F, 14.0F, 5.5F, 14.0F)
          reflectiveCurveTo(6.0F, 13.776F, 6.0F, 13.5F)
          verticalLineToRelative(-7.0F)
          close()        
      }
    }
    return _textAlignCenterRotate9020!!
  }

private var _textAlignCenterRotate9020: ImageVector? = null
