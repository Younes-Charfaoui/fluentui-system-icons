package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowUpRightDashes16: ImageVector
  get() {
    if (_arrowUpRightDashes16 != null) {
      return _arrowUpRightDashes16!!
    }
    _arrowUpRightDashes16 = fluentIcon(name = "Filled.ArrowUpRightDashes16", 16f) {
      materialPath {
          moveTo(7.75F, 2.0F)
          curveTo(7.336F, 2.0F, 7.0F, 2.336F, 7.0F, 2.75F)
          reflectiveCurveTo(7.336F, 3.5F, 7.75F, 3.5F)
          horizontalLineToRelative(3.69F)
          lineToRelative(-1.22F, 1.22F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(1.22F, -1.22F)
          verticalLineToRelative(3.69F)
          curveTo(12.5F, 8.664F, 12.836F, 9.0F, 13.25F, 9.0F)
          reflectiveCurveTo(14.0F, 8.664F, 14.0F, 8.25F)
          verticalLineToRelative(-5.5F)
          curveTo(14.0F, 2.336F, 13.664F, 2.0F, 13.25F, 2.0F)
          horizontalLineToRelative(-5.5F)
          close()
          moveToRelative(1.03F, 6.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-1.5F, 1.5F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(1.5F, -1.5F)
          close()
          moveToRelative(-4.0F, 4.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-1.5F, 1.5F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(1.5F, -1.5F)
          close()        
      }
    }
    return _arrowUpRightDashes16!!
  }

private var _arrowUpRightDashes16: ImageVector? = null
