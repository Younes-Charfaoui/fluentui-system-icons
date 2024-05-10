package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TeardropBottomRight48: ImageVector
  get() {
    if (_teardropBottomRight48 != null) {
      return _teardropBottomRight48!!
    }
    _teardropBottomRight48 = fluentIcon(name = "Regular.TeardropBottomRight48", 48f) {
      materialPath {
          moveTo(4.0F, 24.0F)
          curveTo(4.0F, 12.954F, 12.954F, 4.0F, 24.0F, 4.0F)
          reflectiveCurveToRelative(20.0F, 8.954F, 20.0F, 20.0F)
          verticalLineToRelative(15.75F)
          curveToRelative(0.0F, 2.347F, -1.903F, 4.25F, -4.25F, 4.25F)
          horizontalLineTo(24.0F)
          curveTo(12.954F, 44.0F, 4.0F, 35.046F, 4.0F, 24.0F)
          close()
          moveTo(24.0F, 6.5F)
          curveTo(14.335F, 6.5F, 6.5F, 14.335F, 6.5F, 24.0F)
          reflectiveCurveTo(14.335F, 41.5F, 24.0F, 41.5F)
          horizontalLineToRelative(15.75F)
          curveToRelative(0.967F, 0.0F, 1.75F, -0.783F, 1.75F, -1.75F)
          verticalLineTo(24.0F)
          curveToRelative(0.0F, -9.665F, -7.835F, -17.5F, -17.5F, -17.5F)
          close()        
      }
    }
    return _teardropBottomRight48!!
  }

private var _teardropBottomRight48: ImageVector? = null
