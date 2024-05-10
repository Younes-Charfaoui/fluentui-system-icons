package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowFour24: ImageVector
  get() {
    if (_layoutRowFour24 != null) {
      return _layoutRowFour24!!
    }
    _layoutRowFour24 = fluentIcon(name = "Filled.LayoutRowFour24", 24f) {
      materialPath {
          moveTo(3.0F, 8.0F)
          verticalLineToRelative(3.25F)
          horizontalLineToRelative(18.0F)
          verticalLineTo(8.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(18.0F, -1.5F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineTo(6.5F)
          horizontalLineToRelative(18.0F)
          close()
          moveTo(3.0F, 16.0F)
          verticalLineToRelative(-3.25F)
          horizontalLineToRelative(18.0F)
          verticalLineTo(16.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(0.0F, 1.5F)
          verticalLineToRelative(0.25F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(17.5F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _layoutRowFour24!!
  }

private var _layoutRowFour24: ImageVector? = null
