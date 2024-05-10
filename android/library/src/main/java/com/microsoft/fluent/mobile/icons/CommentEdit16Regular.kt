package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.CommentEdit16: ImageVector
  get() {
    if (_commentEdit16 != null) {
      return _commentEdit16!!
    }
    _commentEdit16 = fluentIcon(name = "Regular.CommentEdit16", 16f) {
      materialPath {
          moveTo(1.0F, 4.5F)
          curveTo(1.0F, 3.12F, 2.12F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(9.0F)
          curveTo(13.88F, 2.0F, 15.0F, 3.12F, 15.0F, 4.5F)
          verticalLineToRelative(0.634F)
          curveToRelative(-0.324F, -0.103F, -0.663F, -0.146F, -1.0F, -0.131F)
          verticalLineTo(4.5F)
          curveTo(14.0F, 3.672F, 13.328F, 3.0F, 12.5F, 3.0F)
          horizontalLineToRelative(-9.0F)
          curveTo(2.672F, 3.0F, 2.0F, 3.672F, 2.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 10.328F, 2.672F, 11.0F, 3.5F, 11.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(2.898F)
          lineToRelative(1.275F, -1.115F)
          lineToRelative(-0.218F, 0.87F)
          curveToRelative(-0.059F, 0.236F, -0.071F, 0.467F, -0.045F, 0.688F)
          lineTo(5.625F, 14.68F)
          curveTo(4.992F, 15.234F, 4.0F, 14.784F, 4.0F, 13.942F)
          verticalLineTo(12.0F)
          horizontalLineTo(3.5F)
          curveTo(2.12F, 12.0F, 1.0F, 10.88F, 1.0F, 9.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveToRelative(6.98F, 6.877F)
          lineToRelative(4.83F, -4.83F)
          curveToRelative(0.73F, -0.73F, 1.914F, -0.73F, 2.644F, 0.0F)
          curveToRelative(0.73F, 0.731F, 0.73F, 1.915F, 0.0F, 2.646F)
          lineToRelative(-4.83F, 4.829F)
          curveToRelative(-0.281F, 0.282F, -0.634F, 0.481F, -1.02F, 0.578F)
          lineToRelative(-1.498F, 0.374F)
          curveToRelative(-0.651F, 0.163F, -1.242F, -0.427F, -1.079F, -1.078F)
          lineToRelative(0.375F, -1.498F)
          curveToRelative(0.096F, -0.386F, 0.296F, -0.74F, 0.578F, -1.02F)
          close()        
      }
    }
    return _commentEdit16!!
  }

private var _commentEdit16: ImageVector? = null
