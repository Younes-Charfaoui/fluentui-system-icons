package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Flag28: ImageVector
  get() {
    if (_flag28 != null) {
      return _flag28!!
    }
    _flag28 = fluentIcon(name = "Filled.Flag28", 28f) {
      materialPath {
          moveTo(5.5F, 18.0F)
          horizontalLineToRelative(17.75F)
          curveToRelative(0.59F, 0.0F, 0.95F, -0.65F, 0.635F, -1.15F)
          lineToRelative(-3.999F, -6.35F)
          lineToRelative(3.999F, -6.35F)
          curveTo(24.199F, 3.65F, 23.84F, 3.0F, 23.25F, 3.0F)
          horizontalLineTo(4.75F)
          curveTo(4.336F, 3.0F, 4.0F, 3.336F, 4.0F, 3.75F)
          verticalLineToRelative(20.5F)
          curveTo(4.0F, 24.664F, 4.336F, 25.0F, 4.75F, 25.0F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(18.0F)
          close()        
      }
    }
    return _flag28!!
  }

private var _flag28: ImageVector? = null
