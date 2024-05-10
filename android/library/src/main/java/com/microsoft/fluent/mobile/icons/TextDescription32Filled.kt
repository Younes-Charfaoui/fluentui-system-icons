package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextDescription32: ImageVector
  get() {
    if (_textDescription32 != null) {
      return _textDescription32!!
    }
    _textDescription32 = fluentIcon(name = "Filled.TextDescription32", 32f) {
      materialPath {
          moveTo(3.25F, 6.0F)
          curveTo(2.56F, 6.0F, 2.0F, 6.56F, 2.0F, 7.25F)
          reflectiveCurveTo(2.56F, 8.5F, 3.25F, 8.5F)
          horizontalLineToRelative(25.5F)
          curveTo(29.44F, 8.5F, 30.0F, 7.94F, 30.0F, 7.25F)
          reflectiveCurveTo(29.44F, 6.0F, 28.75F, 6.0F)
          horizontalLineTo(3.25F)
          close()
          moveToRelative(0.0F, 6.0F)
          curveTo(2.56F, 12.0F, 2.0F, 12.56F, 2.0F, 13.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(25.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveTo(29.44F, 12.0F, 28.75F, 12.0F)
          horizontalLineTo(3.25F)
          close()
          moveTo(2.0F, 19.25F)
          curveTo(2.0F, 18.56F, 2.56F, 18.0F, 3.25F, 18.0F)
          horizontalLineToRelative(25.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          reflectiveCurveToRelative(-0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineTo(3.25F)
          curveTo(2.56F, 20.5F, 2.0F, 19.94F, 2.0F, 19.25F)
          close()
          moveTo(3.25F, 24.0F)
          curveTo(2.56F, 24.0F, 2.0F, 24.56F, 2.0F, 25.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          horizontalLineToRelative(16.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveTo(20.44F, 24.0F, 19.75F, 24.0F)
          horizontalLineTo(3.25F)
          close()        
      }
    }
    return _textDescription32!!
  }

private var _textDescription32: ImageVector? = null
