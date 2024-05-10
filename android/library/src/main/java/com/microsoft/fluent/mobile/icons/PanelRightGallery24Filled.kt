package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelRightGallery24: ImageVector
  get() {
    if (_panelRightGallery24 != null) {
      return _panelRightGallery24!!
    }
    _panelRightGallery24 = fluentIcon(name = "Filled.PanelRightGallery24", 24f) {
      materialPath {
          moveTo(18.75F, 4.0F)
          curveTo(20.545F, 4.0F, 22.0F, 5.455F, 22.0F, 7.25F)
          verticalLineTo(8.5F)
          horizontalLineToRelative(-6.0F)
          verticalLineToRelative(-3.0F)
          horizontalLineTo(5.25F)
          curveTo(4.284F, 5.5F, 3.5F, 6.284F, 3.5F, 7.25F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineTo(16.0F)
          verticalLineToRelative(-3.0F)
          horizontalLineToRelative(6.0F)
          verticalLineToRelative(1.25F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 20.0F, 2.0F, 18.545F, 2.0F, 16.75F)
          verticalLineToRelative(-9.5F)
          curveTo(2.0F, 5.455F, 3.455F, 4.0F, 5.25F, 4.0F)
          horizontalLineToRelative(13.5F)
          close()
          moveTo(22.0F, 14.0F)
          verticalLineToRelative(-4.0F)
          horizontalLineToRelative(-6.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(6.0F)
          close()        
      }
    }
    return _panelRightGallery24!!
  }

private var _panelRightGallery24: ImageVector? = null
