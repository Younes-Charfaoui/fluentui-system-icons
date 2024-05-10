package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PanelRightGallery24: ImageVector
  get() {
    if (_panelRightGallery24 != null) {
      return _panelRightGallery24!!
    }
    _panelRightGallery24 = fluentIcon(name = "Regular.PanelRightGallery24", 24f) {
      materialPath {
          moveTo(22.0F, 7.25F)
          curveTo(22.0F, 5.455F, 20.545F, 4.0F, 18.75F, 4.0F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 4.0F, 2.0F, 5.455F, 2.0F, 7.25F)
          verticalLineToRelative(9.5F)
          curveTo(2.0F, 18.545F, 3.455F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.5F)
          close()
          moveToRelative(-1.5F, 6.25F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(-3.0F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(-5.0F, 1.5F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(1.75F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(15.5F)
          verticalLineTo(15.0F)
          close()
          moveToRelative(5.0F, -7.75F)
          verticalLineTo(9.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineTo(5.5F)
          horizontalLineToRelative(3.25F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          close()
          moveTo(14.0F, 5.5F)
          verticalLineToRelative(13.0F)
          horizontalLineTo(5.25F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineToRelative(-9.5F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineTo(14.0F)
          close()        
      }
    }
    return _panelRightGallery24!!
  }

private var _panelRightGallery24: ImageVector? = null
