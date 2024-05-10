package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowFourFocusBottom24: ImageVector
  get() {
    if (_layoutRowFourFocusBottom24 != null) {
      return _layoutRowFourFocusBottom24!!
    }
    _layoutRowFourFocusBottom24 = fluentIcon(name = "Filled.LayoutRowFourFocusBottom24", 24f) {
      materialPath {
          moveTo(21.0F, 17.75F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(11.5F)
          close()
          moveTo(4.5F, 16.0F)
          horizontalLineToRelative(15.0F)
          verticalLineToRelative(-3.0F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(3.0F)
          close()
          moveToRelative(0.0F, -4.5F)
          horizontalLineToRelative(15.0F)
          verticalLineTo(9.0F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(2.5F)
          close()
          moveToRelative(0.0F, -4.0F)
          horizontalLineToRelative(15.0F)
          verticalLineTo(6.25F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(6.25F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineTo(7.5F)
          close()        
      }
    }
    return _layoutRowFourFocusBottom24!!
  }

private var _layoutRowFourFocusBottom24: ImageVector? = null
