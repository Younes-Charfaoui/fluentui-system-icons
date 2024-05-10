package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowFourFocusCenterTop24: ImageVector
  get() {
    if (_layoutRowFourFocusCenterTop24 != null) {
      return _layoutRowFourFocusCenterTop24!!
    }
    _layoutRowFourFocusCenterTop24 = fluentIcon(name = "Filled.LayoutRowFourFocusCenterTop24", 24f) {
      materialPath {
          moveTo(17.75F, 3.0F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          close()
          moveToRelative(1.75F, 3.25F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(6.25F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineTo(7.5F)
          horizontalLineToRelative(15.0F)
          verticalLineTo(6.25F)
          close()
          moveToRelative(0.0F, 5.75F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(15.0F)
          verticalLineToRelative(-3.0F)
          close()
          moveToRelative(-15.0F, 5.75F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(16.5F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(1.25F)
          close()        
      }
    }
    return _layoutRowFourFocusCenterTop24!!
  }

private var _layoutRowFourFocusCenterTop24: ImageVector? = null