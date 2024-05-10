package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Save32: ImageVector
  get() {
    if (_save32 != null) {
      return _save32!!
    }
    _save32 = fluentIcon(name = "Filled.Save32", 32f) {
      materialPath {
          moveTo(11.5F, 12.0F)
          curveTo(10.12F, 12.0F, 9.0F, 10.88F, 9.0F, 9.5F)
          verticalLineTo(3.0F)
          horizontalLineTo(7.5F)
          curveTo(5.015F, 3.0F, 3.0F, 5.015F, 3.0F, 7.5F)
          verticalLineToRelative(17.0F)
          curveToRelative(0.0F, 2.316F, 1.75F, 4.224F, 4.0F, 4.473F)
          verticalLineTo(18.5F)
          curveTo(7.0F, 17.12F, 8.12F, 16.0F, 9.5F, 16.0F)
          horizontalLineToRelative(13.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          verticalLineToRelative(10.473F)
          curveToRelative(2.25F, -0.25F, 4.0F, -2.157F, 4.0F, -4.473F)
          verticalLineTo(10.45F)
          curveToRelative(0.0F, -1.194F, -0.474F, -2.338F, -1.318F, -3.182F)
          lineToRelative(-2.95F, -2.95F)
          curveTo(23.995F, 3.581F, 23.028F, 3.126F, 22.0F, 3.023F)
          verticalLineTo(9.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-8.0F)
          close()
          moveTo(20.0F, 3.0F)
          horizontalLineToRelative(-9.0F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(8.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(3.0F)
          close()
          moveToRelative(3.0F, 26.0F)
          horizontalLineTo(9.0F)
          verticalLineTo(18.5F)
          curveTo(9.0F, 18.224F, 9.224F, 18.0F, 9.5F, 18.0F)
          horizontalLineToRelative(13.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineTo(29.0F)
          close()        
      }
    }
    return _save32!!
  }

private var _save32: ImageVector? = null
