package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CommentEdit16: ImageVector
  get() {
    if (_commentEdit16 != null) {
      return _commentEdit16!!
    }
    _commentEdit16 = fluentIcon(name = "Filled.CommentEdit16", 16f) {
      materialPath {
          moveTo(3.5F, 2.0F)
          curveTo(2.12F, 2.0F, 1.0F, 3.12F, 1.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 10.88F, 2.12F, 12.0F, 3.5F, 12.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(1.942F)
          curveToRelative(0.0F, 0.842F, 0.992F, 1.292F, 1.625F, 0.738F)
          lineToRelative(0.387F, -0.339F)
          curveToRelative(-0.026F, -0.22F, -0.014F, -0.452F, 0.045F, -0.688F)
          lineToRelative(0.375F, -1.498F)
          curveToRelative(0.14F, -0.562F, 0.43F, -1.075F, 0.84F, -1.485F)
          lineToRelative(4.83F, -4.83F)
          curveToRelative(0.784F, -0.784F, 1.91F, -1.019F, 2.898F, -0.706F)
          verticalLineTo(4.5F)
          curveTo(15.0F, 3.12F, 13.88F, 2.0F, 12.5F, 2.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveToRelative(4.48F, 9.377F)
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
