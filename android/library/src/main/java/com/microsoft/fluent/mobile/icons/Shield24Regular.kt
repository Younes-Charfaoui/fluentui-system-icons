package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Shield24: ImageVector
  get() {
    if (_shield24 != null) {
      return _shield24!!
    }
    _shield24 = fluentIcon(name = "Regular.Shield24", 24f) {
      materialPath {
          moveTo(3.0F, 5.75F)
          curveTo(3.0F, 5.336F, 3.336F, 5.0F, 3.75F, 5.0F)
          curveToRelative(2.663F, 0.0F, 5.258F, -0.944F, 7.8F, -2.85F)
          curveToRelative(0.267F, -0.2F, 0.633F, -0.2F, 0.9F, 0.0F)
          curveTo(14.992F, 4.056F, 17.587F, 5.0F, 20.25F, 5.0F)
          curveTo(20.664F, 5.0F, 21.0F, 5.336F, 21.0F, 5.75F)
          verticalLineTo(11.0F)
          curveToRelative(0.0F, 5.001F, -2.958F, 8.676F, -8.725F, 10.948F)
          curveToRelative(-0.177F, 0.07F, -0.373F, 0.07F, -0.55F, 0.0F)
          curveTo(5.958F, 19.676F, 3.0F, 16.0F, 3.0F, 11.0F)
          verticalLineTo(5.75F)
          close()
          moveToRelative(1.5F, 0.728F)
          verticalLineTo(11.0F)
          curveToRelative(0.0F, 4.256F, 2.453F, 7.379F, 7.5F, 9.442F)
          curveToRelative(5.047F, -2.063F, 7.5F, -5.186F, 7.5F, -9.442F)
          verticalLineTo(6.478F)
          curveToRelative(-2.577F, -0.152F, -5.08F, -1.09F, -7.5F, -2.8F)
          curveToRelative(-2.42F, 1.71F, -4.923F, 2.648F, -7.5F, 2.8F)
          close()        
      }
    }
    return _shield24!!
  }

private var _shield24: ImageVector? = null