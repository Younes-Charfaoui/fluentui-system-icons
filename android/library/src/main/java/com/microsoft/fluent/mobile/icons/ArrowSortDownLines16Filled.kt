package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowSortDownLines16: ImageVector
  get() {
    if (_arrowSortDownLines16 != null) {
      return _arrowSortDownLines16!!
    }
    _arrowSortDownLines16 = fluentIcon(name = "Filled.ArrowSortDownLines16", 16f) {
      materialPath {
          moveTo(13.0F, 1.75F)
          curveTo(13.0F, 1.336F, 12.664F, 1.0F, 12.25F, 1.0F)
          reflectiveCurveTo(11.5F, 1.336F, 11.5F, 1.75F)
          verticalLineToRelative(10.69F)
          lineToRelative(-0.72F, -0.72F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(2.0F, -2.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineTo(13.0F, 12.44F)
          verticalLineTo(1.75F)
          close()
          moveTo(2.75F, 2.5F)
          curveTo(2.336F, 2.5F, 2.0F, 2.836F, 2.0F, 3.25F)
          reflectiveCurveTo(2.336F, 4.0F, 2.75F, 4.0F)
          horizontalLineToRelative(6.5F)
          curveTo(9.664F, 4.0F, 10.0F, 3.664F, 10.0F, 3.25F)
          reflectiveCurveTo(9.664F, 2.5F, 9.25F, 2.5F)
          horizontalLineToRelative(-6.5F)
          close()
          moveToRelative(2.0F, 3.0F)
          curveTo(4.336F, 5.5F, 4.0F, 5.836F, 4.0F, 6.25F)
          reflectiveCurveTo(4.336F, 7.0F, 4.75F, 7.0F)
          horizontalLineToRelative(4.5F)
          curveTo(9.664F, 7.0F, 10.0F, 6.664F, 10.0F, 6.25F)
          reflectiveCurveTo(9.664F, 5.5F, 9.25F, 5.5F)
          horizontalLineToRelative(-4.5F)
          close()
          moveTo(6.0F, 9.25F)
          curveTo(6.0F, 8.836F, 6.336F, 8.5F, 6.75F, 8.5F)
          horizontalLineToRelative(2.5F)
          curveTo(9.664F, 8.5F, 10.0F, 8.836F, 10.0F, 9.25F)
          reflectiveCurveTo(9.664F, 10.0F, 9.25F, 10.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(6.336F, 10.0F, 6.0F, 9.664F, 6.0F, 9.25F)
          close()        
      }
    }
    return _arrowSortDownLines16!!
  }

private var _arrowSortDownLines16: ImageVector? = null
