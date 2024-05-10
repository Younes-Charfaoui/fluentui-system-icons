package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSortDownLines24: ImageVector
  get() {
    if (_arrowSortDownLines24 != null) {
      return _arrowSortDownLines24!!
    }
    _arrowSortDownLines24 = fluentIcon(name = "Regular.ArrowSortDownLines24", 24f) {
      materialPath {
          moveTo(18.0F, 2.75F)
          curveTo(18.0F, 2.336F, 17.664F, 2.0F, 17.25F, 2.0F)
          reflectiveCurveTo(16.5F, 2.336F, 16.5F, 2.75F)
          verticalLineToRelative(16.69F)
          lineToRelative(-2.22F, -2.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineTo(18.0F, 19.44F)
          verticalLineTo(2.75F)
          close()
          moveTo(2.75F, 4.5F)
          curveTo(2.336F, 4.5F, 2.0F, 4.836F, 2.0F, 5.25F)
          reflectiveCurveTo(2.336F, 6.0F, 2.75F, 6.0F)
          horizontalLineToRelative(10.5F)
          curveTo(13.664F, 6.0F, 14.0F, 5.664F, 14.0F, 5.25F)
          reflectiveCurveTo(13.664F, 4.5F, 13.25F, 4.5F)
          horizontalLineTo(2.75F)
          close()
          moveTo(6.0F, 9.25F)
          curveTo(6.0F, 8.836F, 6.336F, 8.5F, 6.75F, 8.5F)
          horizontalLineToRelative(6.5F)
          curveTo(13.664F, 8.5F, 14.0F, 8.836F, 14.0F, 9.25F)
          reflectiveCurveTo(13.664F, 10.0F, 13.25F, 10.0F)
          horizontalLineToRelative(-6.5F)
          curveTo(6.336F, 10.0F, 6.0F, 9.664F, 6.0F, 9.25F)
          close()
          moveToRelative(4.75F, 3.25F)
          curveToRelative(-0.414F, 0.0F, -0.75F, 0.336F, -0.75F, 0.75F)
          reflectiveCurveTo(10.336F, 14.0F, 10.75F, 14.0F)
          horizontalLineToRelative(2.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-2.5F)
          close()        
      }
    }
    return _arrowSortDownLines24!!
  }

private var _arrowSortDownLines24: ImageVector? = null
