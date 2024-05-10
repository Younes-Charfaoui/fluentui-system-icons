package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PanelRightGallery20: ImageVector
  get() {
    if (_panelRightGallery20 != null) {
      return _panelRightGallery20!!
    }
    _panelRightGallery20 = fluentIcon(name = "Regular.PanelRightGallery20", 20f) {
      materialPath {
          moveTo(18.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(5.0F)
          curveTo(3.343F, 3.0F, 2.0F, 4.343F, 2.0F, 6.0F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(-1.0F, 5.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineTo(8.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(-4.0F, 1.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(-3.0F)
          close()
          moveToRelative(4.0F, -6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineTo(4.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(-5.0F, -2.0F)
          verticalLineToRelative(11.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(7.0F)
          close()        
      }
    }
    return _panelRightGallery20!!
  }

private var _panelRightGallery20: ImageVector? = null
