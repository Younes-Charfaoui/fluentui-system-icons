package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PanelTopGallery24: ImageVector
  get() {
    if (_panelTopGallery24 != null) {
      return _panelTopGallery24!!
    }
    _panelTopGallery24 = fluentIcon(name = "Regular.PanelTopGallery24", 24f) {
      materialPath {
          moveTo(5.25F, 4.0F)
          curveTo(3.455F, 4.0F, 2.0F, 5.455F, 2.0F, 7.25F)
          verticalLineToRelative(9.5F)
          curveTo(2.0F, 18.545F, 3.455F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.5F)
          curveTo(22.0F, 5.455F, 20.545F, 4.0F, 18.75F, 4.0F)
          horizontalLineTo(5.25F)
          close()
          moveTo(3.5F, 7.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(5.0F)
          horizontalLineTo(3.5F)
          verticalLineTo(7.25F)
          close()
          moveToRelative(0.0F, 4.75F)
          horizontalLineToRelative(17.0F)
          verticalLineToRelative(4.75F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(5.25F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineTo(12.0F)
          close()
          moveToRelative(17.0F, -1.5F)
          horizontalLineTo(16.0F)
          verticalLineToRelative(-5.0F)
          horizontalLineToRelative(2.75F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(3.25F)
          close()
          moveToRelative(-6.0F, -5.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(-5.0F)
          horizontalLineToRelative(5.0F)
          close()        
      }
    }
    return _panelTopGallery24!!
  }

private var _panelTopGallery24: ImageVector? = null
