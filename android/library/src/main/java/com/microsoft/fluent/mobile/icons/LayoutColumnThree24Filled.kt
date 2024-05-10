package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutColumnThree24: ImageVector
  get() {
    if (_layoutColumnThree24 != null) {
      return _layoutColumnThree24!!
    }
    _layoutColumnThree24 = fluentIcon(name = "Filled.LayoutColumnThree24", 24f) {
      materialPath {
          moveTo(9.5F, 21.0F)
          horizontalLineToRelative(5.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(18.0F)
          close()
          moveTo(8.0F, 3.0F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineTo(8.0F)
          verticalLineTo(3.0F)
          close()
          moveToRelative(9.75F, 18.0F)
          horizontalLineTo(16.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(1.75F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          close()        
      }
    }
    return _layoutColumnThree24!!
  }

private var _layoutColumnThree24: ImageVector? = null
