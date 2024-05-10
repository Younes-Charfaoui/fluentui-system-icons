package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PanelTopGallery20: ImageVector
  get() {
    if (_panelTopGallery20 != null) {
      return _panelTopGallery20!!
    }
    _panelTopGallery20 = fluentIcon(name = "Filled.PanelTopGallery20", 20f) {
      materialPath {
          moveTo(7.0F, 4.0F)
          horizontalLineTo(5.0F)
          curveTo(3.343F, 4.0F, 2.0F, 5.343F, 2.0F, 7.0F)
          verticalLineToRelative(6.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(9.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(4.0F)
          close()
          moveToRelative(1.0F, 5.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(4.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(5.0F)
          close()        
      }
    }
    return _panelTopGallery20!!
  }

private var _panelTopGallery20: ImageVector? = null
