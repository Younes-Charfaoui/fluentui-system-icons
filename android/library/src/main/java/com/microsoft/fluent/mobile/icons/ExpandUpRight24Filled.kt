package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ExpandUpRight24: ImageVector
  get() {
    if (_expandUpRight24 != null) {
      return _expandUpRight24!!
    }
    _expandUpRight24 = fluentIcon(name = "Filled.ExpandUpRight24", 24f) {
      materialPath {
          moveTo(6.25F, 4.5F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineTo(12.0F)
          horizontalLineToRelative(4.75F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          verticalLineToRelative(4.75F)
          horizontalLineToRelative(5.75F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineToRelative(-4.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          reflectiveCurveTo(21.0F, 13.336F, 21.0F, 13.75F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(4.0F)
          curveTo(10.664F, 3.0F, 11.0F, 3.336F, 11.0F, 3.75F)
          reflectiveCurveTo(10.664F, 4.5F, 10.25F, 4.5F)
          horizontalLineToRelative(-4.0F)
          close()
          moveTo(13.0F, 3.75F)
          curveTo(13.0F, 3.336F, 13.336F, 3.0F, 13.75F, 3.0F)
          horizontalLineToRelative(6.5F)
          curveTo(20.665F, 3.0F, 21.0F, 3.336F, 21.0F, 3.75F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 0.414F, -0.335F, 0.75F, -0.75F, 0.75F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(5.56F)
          lineToRelative(-5.22F, 5.22F)
          curveToRelative(-0.293F, 0.293F, -0.768F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.768F, 0.0F, -1.06F)
          lineToRelative(5.22F, -5.22F)
          horizontalLineToRelative(-4.69F)
          curveTo(13.336F, 4.5F, 13.0F, 4.164F, 13.0F, 3.75F)
          close()        
      }
    }
    return _expandUpRight24!!
  }

private var _expandUpRight24: ImageVector? = null