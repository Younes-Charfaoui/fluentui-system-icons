package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CommentMultiple20: ImageVector
  get() {
    if (_commentMultiple20 != null) {
      return _commentMultiple20!!
    }
    _commentMultiple20 = fluentIcon(name = "Filled.CommentMultiple20", 20f) {
      materialPath {
          moveTo(17.0F, 7.5F)
          curveToRelative(0.0F, -1.626F, -1.108F, -2.992F, -2.61F, -3.386F)
          curveToRelative(-0.173F, -0.045F, -0.35F, -0.077F, -0.532F, -0.096F)
          curveTo(13.74F, 4.006F, 13.62F, 4.0F, 13.5F, 4.0F)
          horizontalLineToRelative(-9.0F)
          curveToRelative(0.456F, -0.607F, 1.182F, -1.0F, 2.0F, -1.0F)
          horizontalLineToRelative(7.0F)
          curveTo(15.985F, 3.0F, 18.0F, 5.015F, 18.0F, 7.5F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.818F, -0.393F, 1.544F, -1.0F, 2.0F)
          verticalLineToRelative(-6.0F)
          close()
          moveToRelative(-15.0F, 0.0F)
          curveTo(2.0F, 6.12F, 3.12F, 5.0F, 4.5F, 5.0F)
          horizontalLineToRelative(9.0F)
          curveTo(14.88F, 5.0F, 16.0F, 6.12F, 16.0F, 7.5F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineTo(9.057F)
          lineTo(6.59F, 17.803F)
          curveTo(5.93F, 18.286F, 5.0F, 17.813F, 5.0F, 16.995F)
          verticalLineTo(16.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 16.0F, 2.0F, 14.88F, 2.0F, 13.5F)
          verticalLineToRelative(-6.0F)
          close()        
      }
    }
    return _commentMultiple20!!
  }

private var _commentMultiple20: ImageVector? = null
