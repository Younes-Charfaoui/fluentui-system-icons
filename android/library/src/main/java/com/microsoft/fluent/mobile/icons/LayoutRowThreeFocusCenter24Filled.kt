package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThreeFocusCenter24: ImageVector
  get() {
    if (_layoutRowThreeFocusCenter24 != null) {
      return _layoutRowThreeFocusCenter24!!
    }
    _layoutRowThreeFocusCenter24 = fluentIcon(name = "Filled.LayoutRowThreeFocusCenter24", 24f) {
      materialPath {
          moveTo(3.0F, 17.75F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          close()
          moveToRelative(3.25F, 1.75F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineTo(15.0F)
          horizontalLineToRelative(15.0F)
          verticalLineToRelative(2.75F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(6.25F)
          close()
          moveTo(19.5F, 9.0F)
          horizontalLineToRelative(-15.0F)
          verticalLineTo(6.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineTo(9.0F)
          close()        
      }
    }
    return _layoutRowThreeFocusCenter24!!
  }

private var _layoutRowThreeFocusCenter24: ImageVector? = null
