package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThree24: ImageVector
  get() {
    if (_layoutRowThree24 != null) {
      return _layoutRowThree24!!
    }
    _layoutRowThree24 = fluentIcon(name = "Filled.LayoutRowThree24", 24f) {
      materialPath {
          moveTo(21.0F, 14.5F)
          verticalLineToRelative(-5.0F)
          horizontalLineTo(3.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(18.0F)
          close()
          moveTo(3.0F, 16.0F)
          verticalLineToRelative(1.75F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(16.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(18.0F, -9.75F)
          verticalLineTo(8.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          close()        
      }
    }
    return _layoutRowThree24!!
  }

private var _layoutRowThree24: ImageVector? = null
