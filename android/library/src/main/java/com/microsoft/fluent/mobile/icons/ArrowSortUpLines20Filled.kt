package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowSortUpLines20: ImageVector
  get() {
    if (_arrowSortUpLines20 != null) {
      return _arrowSortUpLines20!!
    }
    _arrowSortUpLines20 = fluentIcon(name = "Filled.ArrowSortUpLines20", 20f) {
      materialPath {
          moveTo(15.0F, 17.25F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(4.678F)
          lineToRelative(-1.447F, 1.579F)
          curveToRelative(-0.28F, 0.305F, -0.755F, 0.326F, -1.06F, 0.046F)
          curveToRelative(-0.305F, -0.28F, -0.326F, -0.754F, -0.046F, -1.06F)
          lineToRelative(2.75F, -3.0F)
          curveTo(13.84F, 2.088F, 14.04F, 2.0F, 14.25F, 2.0F)
          curveToRelative(0.21F, 0.0F, 0.41F, 0.088F, 0.553F, 0.243F)
          lineToRelative(2.75F, 3.0F)
          curveToRelative(0.28F, 0.306F, 0.26F, 0.78F, -0.046F, 1.06F)
          reflectiveCurveToRelative(-0.78F, 0.26F, -1.06F, -0.046F)
          lineTo(15.0F, 4.678F)
          verticalLineTo(17.25F)
          close()
          moveTo(2.75F, 16.5F)
          curveTo(2.336F, 16.5F, 2.0F, 16.164F, 2.0F, 15.75F)
          reflectiveCurveTo(2.336F, 15.0F, 2.75F, 15.0F)
          horizontalLineToRelative(8.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-8.5F)
          close()
          moveTo(5.0F, 12.75F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(5.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(11.664F, 12.0F, 11.25F, 12.0F)
          horizontalLineToRelative(-5.5F)
          curveTo(5.336F, 12.0F, 5.0F, 12.336F, 5.0F, 12.75F)
          close()
          moveToRelative(3.75F, -2.25F)
          curveTo(8.336F, 10.5F, 8.0F, 10.164F, 8.0F, 9.75F)
          reflectiveCurveTo(8.336F, 9.0F, 8.75F, 9.0F)
          horizontalLineToRelative(2.5F)
          curveTo(11.664F, 9.0F, 12.0F, 9.336F, 12.0F, 9.75F)
          reflectiveCurveToRelative(-0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-2.5F)
          close()        
      }
    }
    return _arrowSortUpLines20!!
  }

private var _arrowSortUpLines20: ImageVector? = null
