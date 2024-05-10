package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowFourFocusBottom20: ImageVector
  get() {
    if (_layoutRowFourFocusBottom20 != null) {
      return _layoutRowFourFocusBottom20!!
    }
    _layoutRowFourFocusBottom20 = fluentIcon(name = "Filled.LayoutRowFourFocusBottom20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(3.0F, -2.0F)
          curveTo(4.895F, 4.0F, 4.0F, 4.895F, 4.0F, 6.0F)
          verticalLineToRelative(0.5F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(10.0F, 3.5F)
          horizontalLineTo(4.0F)
          verticalLineTo(10.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(7.5F)
          close()
          moveToRelative(0.0F, 6.0F)
          verticalLineTo(11.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(2.5F)
          horizontalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutRowFourFocusBottom20!!
  }

private var _layoutRowFourFocusBottom20: ImageVector? = null
