package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.LayoutColumnThree24: ImageVector
  get() {
    if (_layoutColumnThree24 != null) {
      return _layoutColumnThree24!!
    }
    _layoutColumnThree24 = fluentIcon(name = "Regular.LayoutColumnThree24", 24f) {
      materialPath {
          moveTo(3.0F, 6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          close()
          moveTo(6.25F, 4.5F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineTo(8.5F)
          verticalLineToRelative(-15.0F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(3.75F, 0.0F)
          verticalLineToRelative(15.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(-15.0F)
          horizontalLineToRelative(-4.0F)
          close()
          moveToRelative(7.75F, 15.0F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(6.25F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(15.5F)
          verticalLineToRelative(15.0F)
          horizontalLineToRelative(2.25F)
          close()        
      }
    }
    return _layoutColumnThree24!!
  }

private var _layoutColumnThree24: ImageVector? = null