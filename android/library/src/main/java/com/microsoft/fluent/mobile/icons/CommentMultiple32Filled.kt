package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CommentMultiple32: ImageVector
  get() {
    if (_commentMultiple32 != null) {
      return _commentMultiple32!!
    }
    _commentMultiple32 = fluentIcon(name = "Filled.CommentMultiple32", 32f) {
      materialPath {
          moveTo(27.5F, 20.5F)
          verticalLineToRelative(-9.0F)
          curveToRelative(0.0F, -2.96F, -2.144F, -5.42F, -4.964F, -5.91F)
          curveTo(22.199F, 5.53F, 21.853F, 5.5F, 21.5F, 5.5F)
          horizontalLineToRelative(-14.0F)
          curveToRelative(-0.082F, 0.0F, -0.164F, 0.002F, -0.246F, 0.005F)
          curveTo(8.061F, 4.296F, 9.438F, 3.5F, 11.0F, 3.5F)
          horizontalLineToRelative(10.5F)
          curveToRelative(4.418F, 0.0F, 8.0F, 3.582F, 8.0F, 8.0F)
          verticalLineTo(17.0F)
          curveToRelative(0.0F, 1.562F, -0.796F, 2.939F, -2.005F, 3.746F)
          curveToRelative(0.003F, -0.082F, 0.005F, -0.164F, 0.005F, -0.246F)
          close()
          moveTo(3.0F, 11.5F)
          curveTo(3.0F, 9.015F, 5.015F, 7.0F, 7.5F, 7.0F)
          horizontalLineToRelative(14.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-4.89F)
          lineToRelative(-6.205F, 4.692F)
          curveTo(9.416F, 30.439F, 8.0F, 29.734F, 8.0F, 28.495F)
          verticalLineTo(25.0F)
          horizontalLineTo(7.5F)
          curveTo(5.015F, 25.0F, 3.0F, 22.985F, 3.0F, 20.5F)
          verticalLineToRelative(-9.0F)
          close()        
      }
    }
    return _commentMultiple32!!
  }

private var _commentMultiple32: ImageVector? = null
