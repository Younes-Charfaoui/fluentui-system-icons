package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelTopGallery16: ImageVector
  get() {
    if (_panelTopGallery16 != null) {
      return _panelTopGallery16!!
    }
    _panelTopGallery16 = fluentIcon(name = "Filled.PanelTopGallery16", 16f) {
      materialPath {
          moveTo(5.0F, 3.0F)
          horizontalLineTo(4.5F)
          curveTo(3.12F, 3.0F, 2.0F, 4.12F, 2.0F, 5.5F)
          verticalLineToRelative(5.0F)
          curveTo(2.0F, 11.88F, 3.12F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-5.0F)
          curveTo(14.0F, 4.12F, 12.88F, 3.0F, 11.5F, 3.0F)
          horizontalLineTo(11.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.672F, 12.0F, 3.0F, 11.328F, 3.0F, 10.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(3.0F)
          close()
          moveToRelative(1.0F, 4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(3.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(4.0F)
          close()        
      }
    }
    return _panelTopGallery16!!
  }

private var _panelTopGallery16: ImageVector? = null
