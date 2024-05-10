package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowFourFocusCenterBottom20: ImageVector
  get() {
    if (_layoutRowFourFocusCenterBottom20 != null) {
      return _layoutRowFourFocusCenterBottom20!!
    }
    _layoutRowFourFocusCenterBottom20 = fluentIcon(name = "Filled.LayoutRowFourFocusCenterBottom20", 20f) {
      materialPath {
          moveTo(14.0F, 17.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          close()
          moveToRelative(2.0F, -3.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineToRelative(-1.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(1.0F)
          close()
          moveToRelative(0.0F, -4.0F)
          horizontalLineTo(4.0F)
          verticalLineTo(7.5F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(10.0F)
          close()
          moveTo(4.0F, 6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(0.5F)
          horizontalLineTo(4.0F)
          verticalLineTo(6.0F)
          close()        
      }
    }
    return _layoutRowFourFocusCenterBottom20!!
  }

private var _layoutRowFourFocusCenterBottom20: ImageVector? = null
