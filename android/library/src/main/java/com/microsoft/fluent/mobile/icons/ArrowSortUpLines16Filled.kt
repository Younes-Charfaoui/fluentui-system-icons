package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowSortUpLines16: ImageVector
  get() {
    if (_arrowSortUpLines16 != null) {
      return _arrowSortUpLines16!!
    }
    _arrowSortUpLines16 = fluentIcon(name = "Filled.ArrowSortUpLines16", 16f) {
      materialPath {
          moveTo(13.0F, 14.25F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(3.56F)
          lineToRelative(-0.72F, 0.72F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(2.0F, -2.0F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineTo(13.0F, 3.56F)
          verticalLineToRelative(10.69F)
          close()
          moveTo(2.75F, 13.5F)
          curveTo(2.336F, 13.5F, 2.0F, 13.164F, 2.0F, 12.75F)
          reflectiveCurveTo(2.336F, 12.0F, 2.75F, 12.0F)
          horizontalLineToRelative(6.5F)
          curveTo(9.664F, 12.0F, 10.0F, 12.336F, 10.0F, 12.75F)
          reflectiveCurveTo(9.664F, 13.5F, 9.25F, 13.5F)
          horizontalLineToRelative(-6.5F)
          close()
          moveToRelative(2.0F, -3.0F)
          curveTo(4.336F, 10.5F, 4.0F, 10.164F, 4.0F, 9.75F)
          reflectiveCurveTo(4.336F, 9.0F, 4.75F, 9.0F)
          horizontalLineToRelative(4.5F)
          curveTo(9.664F, 9.0F, 10.0F, 9.336F, 10.0F, 9.75F)
          reflectiveCurveTo(9.664F, 10.5F, 9.25F, 10.5F)
          horizontalLineToRelative(-4.5F)
          close()
          moveTo(6.0F, 6.75F)
          curveTo(6.0F, 7.164F, 6.336F, 7.5F, 6.75F, 7.5F)
          horizontalLineToRelative(2.5F)
          curveTo(9.664F, 7.5F, 10.0F, 7.164F, 10.0F, 6.75F)
          reflectiveCurveTo(9.664F, 6.0F, 9.25F, 6.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(6.336F, 6.0F, 6.0F, 6.336F, 6.0F, 6.75F)
          close()        
      }
    }
    return _arrowSortUpLines16!!
  }

private var _arrowSortUpLines16: ImageVector? = null
