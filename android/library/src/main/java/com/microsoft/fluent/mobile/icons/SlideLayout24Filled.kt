package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SlideLayout24: ImageVector
  get() {
    if (_slideLayout24 != null) {
      return _slideLayout24!!
    }
    _slideLayout24 = fluentIcon(name = "Filled.SlideLayout24", 24f) {
      materialPath {
          moveTo(6.5F, 8.75F)
          curveToRelative(0.0F, -0.138F, 0.112F, -0.25F, 0.25F, -0.25F)
          horizontalLineToRelative(10.5F)
          curveToRelative(0.138F, 0.0F, 0.25F, 0.112F, 0.25F, 0.25F)
          verticalLineToRelative(1.75F)
          horizontalLineToRelative(-11.0F)
          verticalLineTo(8.75F)
          close()
          moveToRelative(0.0F, 3.25F)
          verticalLineToRelative(3.25F)
          curveToRelative(0.0F, 0.138F, 0.112F, 0.25F, 0.25F, 0.25F)
          horizontalLineTo(9.0F)
          verticalLineTo(12.0F)
          horizontalLineTo(6.5F)
          close()
          moveToRelative(10.75F, 3.5F)
          horizontalLineTo(10.5F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(7.0F)
          verticalLineToRelative(3.25F)
          curveToRelative(0.0F, 0.138F, -0.112F, 0.25F, -0.25F, 0.25F)
          close()
          moveTo(2.0F, 6.75F)
          curveTo(2.0F, 5.231F, 3.231F, 4.0F, 4.75F, 4.0F)
          horizontalLineToRelative(14.5F)
          curveTo(20.769F, 4.0F, 22.0F, 5.231F, 22.0F, 6.75F)
          verticalLineToRelative(10.5F)
          curveToRelative(0.0F, 1.519F, -1.231F, 2.75F, -2.75F, 2.75F)
          horizontalLineTo(4.75F)
          curveTo(3.231F, 20.0F, 2.0F, 18.769F, 2.0F, 17.25F)
          verticalLineTo(6.75F)
          close()
          moveTo(6.75F, 7.0F)
          curveTo(5.784F, 7.0F, 5.0F, 7.784F, 5.0F, 8.75F)
          verticalLineToRelative(6.5F)
          curveTo(5.0F, 16.216F, 5.784F, 17.0F, 6.75F, 17.0F)
          horizontalLineToRelative(10.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineToRelative(-6.5F)
          curveTo(19.0F, 7.784F, 18.216F, 7.0F, 17.25F, 7.0F)
          horizontalLineTo(6.75F)
          close()        
      }
    }
    return _slideLayout24!!
  }

private var _slideLayout24: ImageVector? = null
