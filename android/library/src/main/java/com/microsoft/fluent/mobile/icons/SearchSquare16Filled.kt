package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SearchSquare16: ImageVector
  get() {
    if (_searchSquare16 != null) {
      return _searchSquare16!!
    }
    _searchSquare16 = fluentIcon(name = "Filled.SearchSquare16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(5.0F, 7.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          curveToRelative(0.0F, 0.552F, -0.223F, 1.052F, -0.586F, 1.414F)
          curveTo(8.052F, 8.777F, 7.552F, 9.0F, 7.0F, 9.0F)
          curveTo(5.895F, 9.0F, 5.0F, 8.105F, 5.0F, 7.0F)
          close()
          moveToRelative(2.0F, -3.0F)
          curveTo(5.343F, 4.0F, 4.0F, 5.343F, 4.0F, 7.0F)
          reflectiveCurveToRelative(1.343F, 3.0F, 3.0F, 3.0F)
          curveToRelative(0.648F, 0.0F, 1.248F, -0.206F, 1.738F, -0.555F)
          lineToRelative(2.408F, 2.409F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineTo(9.445F, 8.738F)
          curveTo(9.795F, 8.248F, 10.0F, 7.648F, 10.0F, 7.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          close()        
      }
    }
    return _searchSquare16!!
  }

private var _searchSquare16: ImageVector? = null
