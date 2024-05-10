package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelTopGallery24: ImageVector
  get() {
    if (_panelTopGallery24 != null) {
      return _panelTopGallery24!!
    }
    _panelTopGallery24 = fluentIcon(name = "Filled.PanelTopGallery24", 24f) {
      materialPath {
          moveTo(7.5F, 4.0F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 4.0F, 2.0F, 5.455F, 2.0F, 7.25F)
          verticalLineToRelative(9.5F)
          curveTo(2.0F, 18.545F, 3.455F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.5F)
          curveTo(22.0F, 5.455F, 20.545F, 4.0F, 18.75F, 4.0F)
          horizontalLineTo(16.5F)
          verticalLineToRelative(7.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(5.75F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(5.25F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineTo(11.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(4.0F)
          close()
          moveTo(9.0F, 11.0F)
          horizontalLineToRelative(6.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(9.0F)
          verticalLineToRelative(7.0F)
          close()        
      }
    }
    return _panelTopGallery24!!
  }

private var _panelTopGallery24: ImageVector? = null
