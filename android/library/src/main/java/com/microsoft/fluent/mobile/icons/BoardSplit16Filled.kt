package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BoardSplit16: ImageVector
  get() {
    if (_boardSplit16 != null) {
      return _boardSplit16!!
    }
    _boardSplit16 = fluentIcon(name = "Filled.BoardSplit16", 16f) {
      materialPath {
          moveTo(4.5F, 2.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(7.0F)
          verticalLineTo(2.0F)
          horizontalLineTo(4.5F)
          close()
          moveToRelative(5.5F, 8.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineToRelative(4.0F)
          close()
          moveToRelative(4.0F, 1.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(1.5F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineTo(11.0F)
          close()
          moveToRelative(0.0F, -6.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(1.5F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          close()
          moveTo(9.0F, 8.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(3.5F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineTo(9.0F)
          verticalLineTo(8.0F)
          close()        
      }
    }
    return _boardSplit16!!
  }

private var _boardSplit16: ImageVector? = null
