package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BoardSplit28: ImageVector
  get() {
    if (_boardSplit28 != null) {
      return _boardSplit28!!
    }
    _boardSplit28 = fluentIcon(name = "Filled.BoardSplit28", 28f) {
      materialPath {
          moveTo(6.75F, 3.0F)
          curveTo(4.679F, 3.0F, 3.0F, 4.679F, 3.0F, 6.75F)
          verticalLineTo(13.0F)
          horizontalLineToRelative(13.0F)
          verticalLineTo(3.0F)
          horizontalLineTo(6.75F)
          close()
          moveTo(16.0F, 14.5F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(6.75F)
          curveTo(3.0F, 23.321F, 4.679F, 25.0F, 6.75F, 25.0F)
          horizontalLineTo(16.0F)
          verticalLineTo(14.5F)
          close()
          moveTo(21.25F, 25.0F)
          horizontalLineTo(17.5F)
          verticalLineToRelative(-7.0F)
          horizontalLineTo(25.0F)
          verticalLineToRelative(3.25F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          close()
          moveTo(25.0F, 16.5F)
          horizontalLineToRelative(-7.5F)
          verticalLineToRelative(-5.0F)
          horizontalLineTo(25.0F)
          verticalLineToRelative(5.0F)
          close()
          moveTo(17.5F, 3.0F)
          verticalLineToRelative(7.0F)
          horizontalLineTo(25.0F)
          verticalLineTo(6.75F)
          curveTo(25.0F, 4.679F, 23.321F, 3.0F, 21.25F, 3.0F)
          horizontalLineTo(17.5F)
          close()        
      }
    }
    return _boardSplit28!!
  }

private var _boardSplit28: ImageVector? = null
