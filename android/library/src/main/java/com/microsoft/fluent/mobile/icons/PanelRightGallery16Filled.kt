package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelRightGallery16: ImageVector
  get() {
    if (_panelRightGallery16 != null) {
      return _panelRightGallery16!!
    }
    _panelRightGallery16 = fluentIcon(name = "Filled.PanelRightGallery16", 16f) {
      materialPath {
          moveTo(14.0F, 5.5F)
          curveTo(14.0F, 4.12F, 12.88F, 3.0F, 11.5F, 3.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 3.0F, 2.0F, 4.12F, 2.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 11.88F, 3.12F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineTo(10.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineToRelative(2.0F)
          horizontalLineTo(4.5F)
          curveTo(3.672F, 12.0F, 3.0F, 11.328F, 3.0F, 10.5F)
          verticalLineToRelative(-5.0F)
          curveTo(3.0F, 4.672F, 3.672F, 4.0F, 4.5F, 4.0F)
          horizontalLineTo(10.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(5.5F)
          close()
          moveTo(14.0F, 7.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(7.0F)
          close()        
      }
    }
    return _panelRightGallery16!!
  }

private var _panelRightGallery16: ImageVector? = null
