package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MatchAppLayout20: ImageVector
  get() {
    if (_matchAppLayout20 != null) {
      return _matchAppLayout20!!
    }
    _matchAppLayout20 = fluentIcon(name = "Filled.MatchAppLayout20", 20f) {
      materialPath {
          moveTo(3.5F, 7.0F)
          curveTo(2.672F, 7.0F, 2.0F, 7.672F, 2.0F, 8.5F)
          verticalLineToRelative(3.0F)
          curveTo(2.0F, 12.328F, 2.672F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(4.0F)
          curveTo(8.328F, 13.0F, 9.0F, 12.328F, 9.0F, 11.5F)
          verticalLineToRelative(-3.0F)
          curveTo(9.0F, 7.672F, 8.328F, 7.0F, 7.5F, 7.0F)
          horizontalLineToRelative(-4.0F)
          close()
          moveToRelative(9.0F, 0.0F)
          curveTo(11.672F, 7.0F, 11.0F, 7.672F, 11.0F, 8.5F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.828F, 0.672F, 1.5F, 1.5F, 1.5F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-3.0F)
          curveTo(18.0F, 7.672F, 17.328F, 7.0F, 16.5F, 7.0F)
          horizontalLineToRelative(-4.0F)
          close()        
      }
    }
    return _matchAppLayout20!!
  }

private var _matchAppLayout20: ImageVector? = null
