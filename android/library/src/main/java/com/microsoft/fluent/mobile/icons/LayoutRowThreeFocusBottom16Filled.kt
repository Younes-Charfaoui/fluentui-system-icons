package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThreeFocusBottom16: ImageVector
  get() {
    if (_layoutRowThreeFocusBottom16 != null) {
      return _layoutRowThreeFocusBottom16!!
    }
    _layoutRowThreeFocusBottom16 = fluentIcon(name = "Filled.LayoutRowThreeFocusBottom16", 16f) {
      materialPath {
          moveTo(4.5F, 14.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(13.0F, 7.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(10.0F)
          verticalLineTo(7.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          verticalLineTo(4.5F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(10.0F)
          close()        
      }
    }
    return _layoutRowThreeFocusBottom16!!
  }

private var _layoutRowThreeFocusBottom16: ImageVector? = null
