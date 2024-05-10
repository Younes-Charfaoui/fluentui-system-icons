package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CommentMultiple16: ImageVector
  get() {
    if (_commentMultiple16 != null) {
      return _commentMultiple16!!
    }
    _commentMultiple16 = fluentIcon(name = "Filled.CommentMultiple16", 16f) {
      materialPath {
          moveTo(14.0F, 10.732F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.06F, -0.55F, -1.992F, -1.38F, -2.526F)
          curveTo(12.151F, 3.174F, 11.595F, 3.0F, 11.0F, 3.0F)
          horizontalLineTo(3.268F)
          curveTo(3.613F, 2.402F, 4.26F, 2.0F, 5.0F, 2.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, 1.79F, 4.0F, 4.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.74F, -0.402F, 1.387F, -1.0F, 1.732F)
          close()
          moveTo(1.0F, 6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(7.073F)
          lineToRelative(-2.485F, 1.807F)
          curveTo(3.928F, 15.287F, 3.0F, 14.815F, 3.0F, 13.998F)
          verticalLineTo(13.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          close()        
      }
    }
    return _commentMultiple16!!
  }

private var _commentMultiple16: ImageVector? = null
