package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.WindowAd24: ImageVector
  get() {
    if (_windowAd24 != null) {
      return _windowAd24!!
    }
    _windowAd24 = fluentIcon(name = "Regular.WindowAd24", 24f) {
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
          moveTo(4.5F, 7.0F)
          horizontalLineToRelative(15.0F)
          verticalLineTo(6.25F)
          curveToRelative(0.0F, -0.966F, -0.784F, -1.75F, -1.75F, -1.75F)
          horizontalLineTo(6.25F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineTo(7.0F)
          close()
          moveToRelative(15.0F, 1.5F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(9.25F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(8.5F)
          close()
          moveTo(6.75F, 10.0F)
          curveTo(6.336F, 10.0F, 6.0F, 10.336F, 6.0F, 10.75F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-5.0F)
          close()
          moveToRelative(0.75F, 5.0F)
          verticalLineToRelative(-3.5F)
          horizontalLineTo(11.0F)
          verticalLineTo(15.0F)
          horizontalLineTo(7.5F)
          close()        
      }
    }
    return _windowAd24!!
  }

private var _windowAd24: ImageVector? = null
