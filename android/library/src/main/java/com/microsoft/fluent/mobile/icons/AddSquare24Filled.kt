package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.AddSquare24: ImageVector
  get() {
    if (_addSquare24 != null) {
      return _addSquare24!!
    }
    _addSquare24 = fluentIcon(name = "Filled.AddSquare24", 24f) {
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
          moveToRelative(9.75F, 1.5F)
          curveTo(12.75F, 7.336F, 12.414F, 7.0F, 12.0F, 7.0F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(-3.5F)
          curveTo(7.336F, 11.25F, 7.0F, 11.586F, 7.0F, 12.0F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(3.5F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(-3.5F)
          close()        
      }
    }
    return _addSquare24!!
  }

private var _addSquare24: ImageVector? = null
